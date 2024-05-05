import java.awt.Graphics
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.KeyEvent
import java.awt.event.KeyListener
import javax.swing.JPanel
import javax.swing.Timer

class GamePanel() : JPanel(), KeyListener, ActionListener {
    var snake: Snake = Snake()
    var timer: Timer = Timer(250, this)

    init {
        isFocusable = true
        addKeyListener(this)
        timer.start()
    }

    override fun paintComponent(g: Graphics) {
        snake.draw(g)
    }

    override fun keyTyped(e: KeyEvent?) {
    }

    override fun keyPressed(e: KeyEvent?) {
        when(e!!.keyChar) {
            'w' -> { snake.setDirection(Direction.UP) }
            'a' -> { snake.setDirection(Direction.LEFT) }
            's' -> { snake.setDirection(Direction.DOWN) }
            'd' -> { snake.setDirection(Direction.RIGHT) }
        }
    }

    override fun keyReleased(e: KeyEvent?) {
    }

    override fun actionPerformed(e: ActionEvent?) {
        snake.move()
        repaint()
    }
}