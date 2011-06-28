package pl.iogreen.scala.vaadin.application

import com.vaadin.Application
import com.google.inject.{Injector, Inject}
import com.vaadin.Application.WindowAttachListener
import pl.iogreen.scala.vaadin.components.MainPanel
import com.vaadin.ui.Window
import com.vaadin.ui.ComponentContainer.{ComponentAttachEvent, ComponentAttachListener}

/**
 * @author Błażej Bucko
 */

class ScaadinApplication extends Application {

  @Inject val injector: Injector = null

  def init() {
    addListener(new WindowAttachListener {
      def windowAttached(windowAttachedEvent: Application#WindowAttachEvent) {
        windowAttachedEvent.getWindow.addListener(new ComponentAttachListener {
          def componentAttachedToContainer(componentAttachedEvent: ComponentAttachEvent) {
            injector.injectMembers(componentAttachedEvent.getAttachedComponent)
          }
        })
      }
    })

    val panel = new MainPanel
    injector.injectMembers(panel)

    val mainWindow = new Window("ScaadinApp!")
    mainWindow.addComponent(panel)

    setMainWindow(mainWindow)
  }
}
