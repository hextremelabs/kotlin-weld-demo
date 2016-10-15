package com.hextremelabs.demo.kotlinweld.beans

import com.hextremelabs.demo.kotlinweld.config.Config
import com.hextremelabs.demo.kotlinweld.config.Key
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder
import javax.annotation.PostConstruct
import javax.inject.Inject
import javax.ws.rs.client.Client

/**
 *
 * @author oladeji
 */
open class AbstractDemo {

  // This should ideally be private but private doesn't work with "open" and "open" is needed to make the class proxyable
  @Inject
  @Config
  @Key("connection.pool.size")
  open var connectionPoolSize: Int = 10 // No lateinit for primitives

  @Inject
  open lateinit var rh: ResponseHelper

  @Transient
  protected open lateinit var restClient: Client

  @PostConstruct open fun setup() {
    restClient = ResteasyClientBuilder().connectionPoolSize(connectionPoolSize).build()
  }
}