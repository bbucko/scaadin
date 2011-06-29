package pl.iogreen.scala.vaadin

import com.vaadin.Application
import pl.iogreen.scala.vaadin.application.ScaadinApplication
import com.google.inject.servlet.{ServletScopes, ServletModule, GuiceServletContextListener}
import pl.iogreen.scala.scalatra.ServicesServlet
import com.google.inject.Guice
import pl.iogreen.scala.guice.ScaadinApplicationServlet

/**
 * @author Błażej Bucko
 */

class ScaadinServletContext extends GuiceServletContextListener {

  def getInjector = Guice.createInjector(new ServletModule {
    override def configureServlets() {
      serve("/services/*").`with`(classOf[ServicesServlet])
      serve("/*").`with`(classOf[ScaadinApplicationServlet])

      bind[Application](classOf[Application]).to(classOf[ScaadinApplication]).in(ServletScopes.SESSION)
    }
  });
}