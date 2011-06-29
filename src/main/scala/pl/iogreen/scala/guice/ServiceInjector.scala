package pl.iogreen.scala.guice

import com.google.inject.Guice
import pl.iogreen.scala.services.configuration.ServicesModule

/**
 * @author Błażej Bucko
 */

object ServiceInjector {

  private val injector = Guice.createInjector(new ServicesModule)

  def inject(obj: AnyRef) {
    injector.injectMembers(obj)
  }

}

trait ServiceInjector {
  ServiceInjector.inject(this)
}
