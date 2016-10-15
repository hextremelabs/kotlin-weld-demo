package com.hextremelabs.demo.kotlinweld.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.util.HashMap;
import java.util.Map;

/**
 * @author oladeji
 */
@ApplicationScoped
public class CustomProducer {

  private static final Logger L = LoggerFactory.getLogger(CustomProducer.class);

  // TODO(oluwasayo): Of course this is bad.
  private static final Map<String, String> map = new HashMap<String, String>(){{
    put("service.base.url", "https://jsonplaceholder.typicode.com/posts/1");
    put("connection.pool.size", "10");
  }};

  @Produces
  @Config
  public String produceString(InjectionPoint ip) {
    L.info("Performing CDI config injection for: {}.{}", ip.getMember().getDeclaringClass(), ip.getMember().getName());
    return map.get(ip.getAnnotated().getAnnotation(Key.class).value());
  }

  @Produces
  @Config
  public Integer produceInteger(InjectionPoint ip) {
    return Integer.valueOf(produceString(ip));
  }
}
