package user.totekp.threejs

import org.scalajs.dom
import user.totekp.threejs.THREE._

import scala.scalajs.js
import scala.scalajs.js.JSApp

object ExampleApp extends JSApp {

  def main(): Unit = {

    val scene = new Scene()
    val camera = new PerspectiveCamera(75, dom.window.innerWidth.toDouble / dom.window.innerHeight, 0.1, 1000)
    val renderer = new WebGLRenderer(js.Dynamic.literal())
    dom.document.body.appendChild(renderer.domElement)
    renderer.setSize(dom.window.innerWidth, dom.window.innerHeight)
    camera.position.z = 5


    def createCube(side: Double): Mesh = {
      val geometry = new BoxGeometry(side, side, side)
      val material = new MeshBasicMaterial(js.Dynamic.literal(color = 0x00ff00, wireframe=true))
      val cube = new Mesh(geometry, material)
      cube
    }

    val cube = createCube(3)
    scene.add(cube)

    def renderLoop(timestamp: Double): Unit = {
      dom.requestAnimationFrame(renderLoop _)
      cube.rotation.x += .1
      cube.rotation.y += .1
      renderer.render(scene, camera)
    }
    renderLoop(System.currentTimeMillis())
  }

}
