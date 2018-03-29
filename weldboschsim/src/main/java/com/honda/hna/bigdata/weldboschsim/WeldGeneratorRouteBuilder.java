package com.honda.hna.bigdata.weldboschsim;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.CompositeRegistry;
import org.apache.camel.impl.SimpleRegistry;
import org.apache.camel.model.dataformat.JsonDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * NOTE :  
 * 
 * Install the following feature in Fuse via the fuse console.
 * features:install camel-jackson
 *
 */

public class WeldGeneratorRouteBuilder extends RouteBuilder {
	
	private static final Logger LOG = LoggerFactory.getLogger(WeldGeneratorRouteBuilder.class);
	
	private int maxRoute;
	private int dataSize;

	private AuditEventNotifier aen;

	public void setMaxRoute(int maxRoute) {
		LOG.info(String.format("maxroute=%d", maxRoute));
		this.maxRoute = maxRoute;
	}
	
	public void setDataSize(int dataSize) {
		LOG.info(String.format("datasize=%d", dataSize));
		this.dataSize = dataSize;
	}
	
	
	@Override
	public void configure() throws Exception {
		
		aen = new AuditEventNotifier();
		getContext().getManagementStrategy().addEventNotifier(aen);

		// Setup Registry - the cleaner solution is to add a bean definition for the DataSet in the blueprint.xml
		final SimpleRegistry registry = new SimpleRegistry();
	    final CompositeRegistry compositeRegistry = new CompositeRegistry();
        compositeRegistry.addRegistry(getContext().getRegistry());
        compositeRegistry.addRegistry(registry);
        ((org.apache.camel.impl.DefaultCamelContext) getContext()).setRegistry(compositeRegistry);
        
		// Setup Dataformat
		JsonDataFormat wbDataFormat;
		wbDataFormat = new JsonDataFormat(JsonLibrary.Jackson);
		wbDataFormat.setUnmarshalType(WeldBosch.class);
		
		// Create routes
		for (int i=0; i< maxRoute; i++) {
			String timerName = String.format("L1FLRC_%04dA", i);
			WeldBoschDataSet wbDataSet = new WeldBoschDataSet(timerName);
			wbDataSet.setSize(dataSize);
	        registry.put(timerName, wbDataSet);
	        makeRoute(timerName,wbDataFormat);
		}
	}  
	
	private void makeRoute(String timerName, JsonDataFormat dataFormat) {
        from(String.format("dataset:%s?produceDelay=-1", timerName))
    	   .marshal(dataFormat)
    	   .convertBodyTo(String.class)
    	   //.log("converted ${body}")
    	   .to("activemq:topic:VirtualTopic.weldBoschtest4");
	}

}

