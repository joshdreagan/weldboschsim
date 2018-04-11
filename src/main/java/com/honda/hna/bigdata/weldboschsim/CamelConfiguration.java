package com.honda.hna.bigdata.weldboschsim;

import java.util.concurrent.atomic.AtomicInteger;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CamelConfiguration extends RouteBuilder {

  private static final Logger log = LoggerFactory.getLogger(CamelConfiguration.class);
  
  @Bean
  AtomicInteger protRecordIdSequence() {
    return new AtomicInteger(0);
  }
  
  @Override
  public void configure() throws Exception {
    
    from("timer:sim?period={{application.timer.period}}")
      .routeId("sim")
      .setHeader("protRecordId", simple("bean:protRecordIdSequence?method=addAndGet(1)"))
      .transform().groovy("resource:classpath:/groovy/TestMessage.groovy")
      .log(LoggingLevel.INFO, log, "Sending Sim Message:\\n${body}")
      .to(ExchangePattern.InOnly, "jms:topic:VirtualTopic.weldBoschtest2?connectionFactory=#pooledJmsConnectionFactory")
    ;
  }
}
