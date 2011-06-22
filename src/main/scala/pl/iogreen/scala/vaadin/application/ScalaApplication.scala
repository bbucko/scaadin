package pl.iogreen.scala.vaadin.application

import com.vaadin.Application
import com.vaadin.ui.{Label, Window}

/**
 * @author Błażej Bucko
 */

class ScalaApplication extends Application {
  def init() {
    val mainWindow = new Window("My first scala Application!!!")
    val label = new Label("Hello World 2nd... ")
    mainWindow.addComponent(label)
    setMainWindow(mainWindow)
  }
}