package pl.iogreen.scala.vaadin.components

import com.google.inject.Inject
import pl.iogreen.scala.services.BookService
import com.vaadin.ui._

/**
 * @author Błażej Bucko
 */

class SecondPanel extends Panel {

  @Inject val bookService: BookService = null

  override def attach() {
    super.attach()

    val textArea = new TextArea("Something")
    val button = new SpecialButton("Click me", _ => bookService.makeSomething("second panel"))

    addComponent(textArea)
    addComponent(button)
  }

}