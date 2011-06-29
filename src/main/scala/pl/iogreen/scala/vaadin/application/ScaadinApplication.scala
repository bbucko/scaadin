package pl.iogreen.scala.vaadin.application

import com.vaadin.Application
import com.vaadin.ui.Window
import pl.iogreen.scala.vaadin.components.{SecondPanelToBeInjected, MainPanel}
import pl.iogreen.scala.guice.ServiceInjector

/**
 * @author Błażej Bucko
 */
class ScaadinApplication extends Application {

  def init() {

    val panel = new MainPanel with ServiceInjector

    val panel2 = new SecondPanelToBeInjected with ServiceInjector

    val mainWindow = new Window("ScaadinApp!")
    mainWindow.addComponent(panel)
    mainWindow.addComponent(panel2)

    setMainWindow(mainWindow)
  }
}
