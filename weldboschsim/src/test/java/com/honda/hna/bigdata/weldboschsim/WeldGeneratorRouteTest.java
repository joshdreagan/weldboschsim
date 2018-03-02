package com.honda.hna.bigdata.weldboschsim;

import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.junit.Test;

public class WeldGeneratorRouteTest extends CamelBlueprintTestSupport {


	@Override
	protected String[] loadConfigAdminConfigurationFile() {
		String filename [] = new String[] {"src/test/resources/etc/weldboschsim.cfg","weldboschsim"} ;
		return filename;
	}

    @Override
    protected String getBlueprintDescriptor() {
        return "/OSGI-INF/blueprint/blueprint.xml";
    }


    @Test
    public void testRoute() throws Exception {
    	
    	// Usually the test would attach to the route and start issuing messages, in this case the data is being
    	// generated from the route itself all we need do for now is make the test sleep for 
    	// enough time for all messages to complete. We could also attach to the end of the route and make assertions about the messages that
    	// have arrived.

       Thread.sleep(1000 * 60 * 30);
        
    }
	
}
