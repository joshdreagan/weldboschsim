package com.honda.hna.bigdata.weldboschsim;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.pool.PooledConnectionFactory;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.main.Main;

public class MainApp {

	public static void main(String[] args) throws Exception {
		Main main = new Main();
	    
		ActiveMQConnectionFactory activemqfactory = new ActiveMQConnectionFactory("redhat","redhat123!","tcp://10.44.248.57:61616");
		PooledConnectionFactory activemqpool = new PooledConnectionFactory(activemqfactory);
		JmsComponent activemq = new JmsComponent();
		activemq.setConnectionFactory(activemqpool);
		main.bind("activemq", activemq);
		
		WeldGeneratorRouteBuilder wgrb = new WeldGeneratorRouteBuilder();
		wgrb.setMaxRoute(300);
		wgrb.setDataSize(5000000);
		main.addRouteBuilder(wgrb);
		
		main.run(args);

	}

}