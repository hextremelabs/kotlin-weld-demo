package com.hextremelabs.demo.kotlinweld.rest

import javax.ws.rs.ApplicationPath
import javax.ws.rs.core.Application

/**
 *
 * @author oladeji
 */
@ApplicationPath("rpc")
class ApplicationConfig : Application() {

  override fun getClasses(): Set<Class<*>> {
    return setOf(com.hextremelabs.demo.kotlinweld.rest.Endpoint::class.java)
  }
}