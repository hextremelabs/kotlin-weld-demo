package com.hextremelabs.demo.kotlinweld.beans;

import com.hextremelabs.demo.kotlinweld.config.Config;
import com.hextremelabs.demo.kotlinweld.config.Key;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * @author oladeji
 */
@ApplicationScoped
public class DemoJava extends AbstractDemo {

  @Inject
  @Config
  @Key("service.base.url")
//  @VisibleForTesting
  String serviceBaseUrl;

  public String testApi() {
    return rh.respond(restClient.target(serviceBaseUrl).request().get(String.class));
  }
}
