package com.hextremelabs.demo.kotlinweld.beans

import org.junit.Test
import kotlin.test.assertNotNull

/**
 * @author oladeji
 */
class DemoKotlinTest {

  companion object {
    var sut = DemoKotlin().apply {
      serviceBaseUrl = "http://jsonplaceholder.typicode.com/posts/1"
      connectionPoolSize = 5
      rh = ResponseHelper()
      setup()
    }
  }

  @Test
  fun testApi() {
    println("testApi")
    assertNotNull(sut.testApi())
  }
}