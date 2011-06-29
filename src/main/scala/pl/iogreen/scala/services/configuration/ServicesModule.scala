package pl.iogreen.scala.services.configuration

import com.google.inject.{Binder, Module}
import pl.iogreen.scala.services.BookService

/**
 * @author Błażej Bucko
 */

class ServicesModule extends Module {
  def configure(binder: Binder) {
    binder.bind[BookService](classOf[BookService])
  }
}