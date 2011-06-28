package pl.iogreen.scala.vaadin.application

import com.vaadin.Application
import pl.iogreen.scala.vaadin.components.SpecialPanel
import com.vaadin.ui.Window
import com.google.inject.{Injector, Inject}

/**
 * @author Błażej Bucko
 */

class ScaadinApplication extends Application {

  @Inject val injector: Injector = null

  def init() {
    val panel = new SpecialPanel();
    injector.injectMembers(panel)

    val mainWindow = new Window("ScaadinApp!")
    mainWindow.addComponent(panel)

    setMainWindow(mainWindow)
  }
}
