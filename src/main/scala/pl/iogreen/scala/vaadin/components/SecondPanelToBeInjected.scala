package pl.iogreen.scala.vaadin.components

import pl.iogreen.scala.services.BookService
import com.vaadin.ui._
import com.google.inject.{Injector, Inject}

/**
 * @author Błażej Bucko
 */

class SecondPanelToBeInjected extends Panel {

  @Inject val bookService: BookService = null
  @Inject val injector: Injector = null

  override def attach() {
    super.attach()

    val button = new SpecialButton("Drink me", _ => bookService.makeSomething("second panel to be injected"))
    addComponent(button)
  }

}