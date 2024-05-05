import javax.swing.JFrame

class GameFrame() : JFrame() {
    init {
        setBounds(100, 100, 600, 600)
        add(GamePanel())

        isVisible = true
    }
}