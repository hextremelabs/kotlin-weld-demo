package com.hextremelabs.demo.kotlinweld.beans;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author oladeji
 */
@ApplicationScoped
public class ResponseHelper {

  public String respond(String input) {
    return "stuff_" + input + "_stuff";
  }
}
