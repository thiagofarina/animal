import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class MainWindow extends JFrame {
        Animal[] mAnimaisCadastrados = new Animal[5];

        public MainWindow() {
                CriarUI();
        }

        private void CriarUI() {
           JPanel panel = new JPanel();
           getContentPane().add(panel);

           panel.setLayout(null);

           JLabel label = new JLabel("<html>Menu de opcoes: <br><br>" +
                           "<p>1- Cadastrar animal" +
                           "<p>2- Remover animal" +
                           "<p>3- Listar animais" +
                           "<p>4- Sair" +
                           "</html>");
           label.setBounds(10, 10, 300, 100);

           panel.add(label);

           setTitle("Controle de Animais");
           setSize(300, 200);
           setLocationRelativeTo(null);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

        public static void main(String[] args) {
          SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
              MainWindow window = new MainWindow();
              window.setVisible(true);
            }
          });
        }
}
