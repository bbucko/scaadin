package pl.iogreen.scala.vaadin.application

import com.vaadin.Application
import java.util.Date
import pl.iogreen.scala.vaadin.components.SpecialButton
import com.vaadin.ui.{TextField, Window}
import com.vaadin.terminal.UserError

/**
 * @author Błażej Bucko
 */

class ScaadinApplication extends Application {
  def init() {
    val textField = new TextField("Input something")

    val mainWindow = new Window("ScaadinApp!")
    mainWindow.addComponent(new SpecialButton("What is the time?", _ => {
      mainWindow.showNotification("The time is " + new Date, Window.Notification.TYPE_ERROR_MESSAGE)
      if (textField.getComponentError == null) {
        textField.setComponentError(new UserError("Something went wrong"))
      } else {
        textField.setComponentError(null)
      }
    }))
    mainWindow.addComponent(textField)

    setMainWindow(mainWindow)
  }

  def terminalError() {
    println("error")
  }
}