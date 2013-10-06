import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

class MainWindow {
        public static void main(String[] args) {
                JFrame frame = new JFrame("Test");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // get the screen size as a java dimension
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

                // get 2/3 of the height, and 2/3 of the width
                int height = screenSize.height * 2 / 3;
                int width = screenSize.width * 2 / 3;

                // set the jframe height and width
                frame.setPreferredSize(new Dimension(width, height));

                frame.pack();
                frame.setVisible(true);
        }
}
