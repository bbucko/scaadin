package pl.iogreen.scala.vaadin.application

import com.vaadin.Application
import pl.iogreen.scala.vaadin.components.SpecialPanel
import com.google.inject.Inject
import com.vaadin.ui.{Panel, Window}

/**
 * @author Błażej Bucko
 */

class ScaadinApplication extends Application {

  def init() {
    val panel = new SpecialPanel();
    val mainWindow = new Window("ScaadinApp!")
    mainWindow.addComponent(panel)

    setMainWindow(mainWindow)
  }

  def terminalError() {
    println("error")
  }
}