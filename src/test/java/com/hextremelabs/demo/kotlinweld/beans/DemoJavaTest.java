package com.hextremelabs.demo.kotlinweld.beans;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 *
 * @author oladeji
 */
public class DemoJavaTest {

  private static final DemoJava sut = new DemoJava();

  @BeforeClass
  public static void setUpClass() {
    sut.serviceBaseUrl = "http://jsonplaceholder.typicode.com/posts/1";
    sut.setConnectionPoolSize(5);
    sut.setRh(new ResponseHelper());
    sut.setup();
  }

  @Test
  public void testTestApi() {
    System.out.println("testApi");
    assertNotNull(sut.testApi());
  }
}
