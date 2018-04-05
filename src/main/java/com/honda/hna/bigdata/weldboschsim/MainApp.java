package com.honda.hna.bigdata.weldboschsim;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.pool.PooledConnectionFactory;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.main.Main;
import org.apache.commons.lang3.StringUtils;

public class MainApp {

	public static void main(String[] args) throws Exception {
		Main main = new Main();
	    
		ActiveMQConnectionFactory activemqfactory = new ActiveMQConnectionFactory("redhat","redhat123!","tcp://10.44.248.57:61616");
		PooledConnectionFactory activemqpool = new PooledConnectionFactory(activemqfactory);
		JmsComponent activemq = new JmsComponent();
		activemq.setConnectionFactory(activemqpool);
		main.bind("activemq", activemq);
		
		for (Integer i=1; i<500 ; i++){
			String timerName = "L1FLRC_"+StringUtils.leftPad(i.toString(),4,"0")+"A";
			WeldBoschDataSet weldBoschDataSet = new WeldBoschDataSet(timerName);
			weldBoschDataSet.setSize(1000000);
	        main.bind(timerName, weldBoschDataSet);			
	        main.addRouteBuilder(new WeldGeneratorRouteBuilder(timerName));
		}
        main.run(args);

	}

}
