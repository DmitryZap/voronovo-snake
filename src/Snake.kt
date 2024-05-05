import java.awt.Graphics
import java.awt.Rectangle
import java.util.*

class Snake : LinkedList<Rectangle>() {
    var d: Direction = Direction.RIGHT

    init {
        add(Rectangle(0, 0, 50, 50))
        add(Rectangle(0, 50, 50, 50))
        add(Rectangle(0, 100, 50, 50))
    }

    fun draw(g: Graphics) {
        for (rect in this) {
            g.drawRect(rect.x, rect.y, rect.width, rect.height)
        }
    }

    fun setDirection(d: Direction) {
        this.d = d
    }

    fun move() {
        var rect: Rectangle = removeLast()

        rect.x = first().x
        rect.y = first().y

        when (d) {
            Direction.RIGHT -> { rect.x += 50 }
            Direction.LEFT -> { rect.x -= 50 }
            Direction.UP -> { rect.y -= 50 }
            Direction.DOWN -> { rect.y += 50 }
        }

        addFirst(rect)
    }
}