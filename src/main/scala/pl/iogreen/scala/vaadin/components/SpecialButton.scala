package pl.iogreen.scala.vaadin.components

import com.vaadin.ui.Button

class SpecialButton(text: String, action: Button#ClickEvent => Unit) extends Button(text, new SpecialButtonClickListener(action))

class SpecialButtonClickListener(action: Button#ClickEvent => Unit) extends Button.ClickListener {
  def buttonClick(event: Button#ClickEvent) {
    action(event)
  }
}
