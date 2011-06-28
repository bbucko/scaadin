package pl.iogreen.scala.varia

import com.vaadin.Application
import pl.iogreen.scala.vaadin.application.ScaadinApplication
import com.google.inject.servlet.{ServletScopes, ServletModule, GuiceServletContextListener}
import pl.iogreen.scala.scalatra.ServicesServlet
import pl.iogreen.scala.services.BookService
import com.google.inject.Guice
/**
 * @author Błażej Bucko
 */

class ScaadinServletContext extends GuiceServletContextListener {

  def getInjector = Guice.createInjector(new ServletModule {
    override def configureServlets() {
      serve("/services/*").`with`(classOf[ServicesServlet])
      serve("/*").`with`(classOf[ScaadinApplicationServlet])

      bind[Application](classOf[Application]).to(classOf[ScaadinApplication]).in(ServletScopes.SESSION)
      bind[BookService](classOf[BookService])
    }
  });
}