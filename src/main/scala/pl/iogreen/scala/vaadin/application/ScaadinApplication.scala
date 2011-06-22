package pl.iogreen.scala.vaadin.application

import com.vaadin.Application
import com.vaadin.ui.Window

/**
 * @author Błażej Bucko
 */

class ScaadinApplication extends Application {
  def init() {
    val mainWindow = new Window("Scaadin!")
    setMainWindow(mainWindow)
  }
}