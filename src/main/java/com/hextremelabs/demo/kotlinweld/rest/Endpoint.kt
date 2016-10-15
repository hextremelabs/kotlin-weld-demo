package com.hextremelabs.demo.kotlinweld.rest

import com.hextremelabs.demo.kotlinweld.beans.DemoJava
import com.hextremelabs.demo.kotlinweld.beans.DemoKotlin
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces

/**
 *
 * @author oladeji
 */
// Everything has to be open to make them proxyable by CDI, can we have a "proxyable" keyword or something?
@Path("endpoint")
open class Endpoint {

  // This would idealy be declared private in Java or package-private with @VisibleForTesting
  @Inject
  open lateinit var kotlinBean : DemoKotlin

  @Inject
  open lateinit var javaBean : DemoJava

  @GET
  @Path("java")
  @Produces("text/plain")
  open fun testJava() = javaBean.testApi()

  @GET
  @Path("kotlin")
  @Produces("text/plain")
  open fun testKotlin() = kotlinBean.testApi()
}