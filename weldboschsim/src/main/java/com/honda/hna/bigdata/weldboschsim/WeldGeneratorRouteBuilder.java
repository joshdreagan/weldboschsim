package com.honda.hna.bigdata.weldboschsim;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;

public class WeldGeneratorRouteBuilder extends RouteBuilder {

	private String timerName;
	private JsonDataFormat weldBoschcb;

	public WeldGeneratorRouteBuilder(String timerName) {
		this.timerName = timerName;
	}

	@Override
	public void configure() throws Exception {
		weldBoschcb = new JsonDataFormat(JsonLibrary.Jackson);
		weldBoschcb.setUnmarshalType(WeldBosch.class);
		
        from("dataset:"+timerName+"?produceDelay=-1")
        	.marshal(weldBoschcb)
        	.convertBodyTo(String.class)
        	.log("converted ${body}")
        	.to("activemq:topic:VirtualTopic.weldBoschvt");
	}

}

