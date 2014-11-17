package user.totekp.threejs

import org.scalajs.dom.Node

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

object THREE {

  @JSName("THREE.Vector3")
  class Vector3(var x: js.Number, var y: js.Number, var z: js.Number) extends js.Object

  @JSName("THREE.Scene")
  class Scene extends js.Object {
    def add(obj: js.Object): Unit = ???
  }

  @JSName("THREE.Camera")
  class Camera extends js.Object

  @JSName("THREE.PerspectiveCamera")
  class PerspectiveCamera(a: js.Number, b: js.Number, c: js.Number, d: js.Number) extends Camera {
    var position: Vector3 = _
  }

  @JSName("THREE.WebGLRenderer")
  class WebGLRenderer(params: js.Dynamic) extends js.Object {
    var gammaInput: Boolean = ???
    var gammaOutput: Boolean = ???

    def render(scene: Scene, camera: Camera, renderTarget: RenderTarget = ???, forceClear: Boolean = ???): Unit = ???

    def setSize(width: Double, height: Double, updateStyle: Boolean = ???): Unit = ???

    var domElement: Node = _
  }

  trait RenderTarget extends js.Object {
  }

  class SimpleWebGLRenderer() extends WebGLRenderer(null)

  class Geometry extends js.Object

  @JSName("THREE.BoxGeometry")
  class BoxGeometry  extends Geometry {
    def this(width: Double, height: Double, depth: Double, widthSegments: Double = ???, heightSegments: Double = ???, depthSegments: Double = ???) = this()
    var parameters: js.Any = ???
    var widthSegments: Double = ???
    var heightSegments: Double = ???
    var depthSegments: Double = ???
  }

  @JSName("THREE.PolyhedronGeometry")
  class PolyhedronGeometry(vertices: Array[Float], faces: Array[Int]) extends Geometry

  class Material extends js.Object

  @JSName("THREE.MeshBasicMaterial")
  class MeshBasicMaterial(params: js.Dynamic) extends Material

  class SimpleMeshBasicMaterial() extends MeshBasicMaterial(null)

  @JSName("THREE.Mesh")
  class Mesh(geometry: Geometry, material: Material) extends js.Object {
    var rotation: Euler = ???
    var position: Vector3 = ???
  }

  @JSName("THREE.Euler")
  class Euler  extends js.Object {
    def this(x: Double = ???, y: Double = ???, z: Double = ???, order: String = ???) = this()
    var x: Double = ???
    var y: Double = ???
    var z: Double = ???
    var order: String = ???
    def set(x: Double, y: Double, z: Double, order: String = ???): Euler = ???
    def copy(euler: Euler): Euler = ???
    def reorder(newOrder: String): Euler = ???
    def equals(euler: Euler): Boolean = ???
    def fromArray(xyzo: js.Array[js.Any]): Euler = ???
    def toArray: js.Array[js.Any] = ???
    var onChange: js.Function0[Unit] = ???
    override def clone(): Euler = ???
  }

  @JSName("THREE.Clock")
  class Clock extends js.Object

  @JSName("THREE.AmbientLight")
  class AmbientLight(hex: Int) extends js.Object {

  }

}
