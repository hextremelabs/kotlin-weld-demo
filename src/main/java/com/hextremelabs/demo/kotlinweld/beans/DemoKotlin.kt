package com.hextremelabs.demo.kotlinweld.beans

import com.hextremelabs.demo.kotlinweld.config.Config
import com.hextremelabs.demo.kotlinweld.config.Key
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject

/**
 *
 * @author oladeji
 */
@ApplicationScoped
open class DemoKotlin : AbstractDemo() {

  @Inject
  @Config
  @Key("service.base.url")
  // Should ideally be package private
  open lateinit var serviceBaseUrl: String

  open fun testApi(): String {
    return rh.respond(restClient.target(serviceBaseUrl).request().get(String::class.java))
  }
}