import javax.swing.JOptionPane;

class Cria_JOptionPane {
 public static void main(String[] args) {
    int cond = 1;
    int pos = 0;
    int op;
    String exibe = "";
    Animal[] cadastro = new Animal[5];

    String[] animais = {"Cao", "Gato"};

    do {
      op = Integer.parseInt(JOptionPane.showInputDialog(
          "Controle de Animais\n\n" +
          "1 - Cadastrar animal\n" +
          "2 - Listar animais\n" +
          "3 - Sair\n"));

      switch (op) {
        case 1:
          String animalEscolhido = (String)JOptionPane.showInputDialog(
              null,
              "Qual animal voce deseja cadastrar?",
              "Animal",
              JOptionPane.QUESTION_MESSAGE,
              null,
              animais,
              animais[0]);
          if (animalEscolhido == "Cao") {
            if (pos < 5) {
              cadastro[pos] = new Cao(
                  JOptionPane.showInputDialog("Digite a data de nascimento:"),
                  Integer.parseInt(
                      JOptionPane.showInputDialog("Digite a identidade:")),
                  JOptionPane.showInputDialog("Digite a raca:"));
              pos++;

            } else {
              JOptionPane.showMessageDialog(
                  null, "Nao posso mais adicionar registros.");
            }
          } else {
          if (pos < 5) {
            cadastro[pos] = new Gato(
                JOptionPane.showInputDialog("Digite a data de nascimento:"),
                Integer.parseInt(
                    JOptionPane.showInputDialog("Digite a identidade:")),
                JOptionPane.showInputDialog("Digite a raca:"));
            pos++;
          } else {
            JOptionPane.showMessageDialog(null, "Nao posso mais adicionar registros.");
          }
          }
          break;

        case 2:
          exibe = "";
          for (int i = 0; i < pos; i++) {
            exibe += "Raca: " + cadastro[i].getRaca() +
                    "\nData de nascimento: " + cadastro[i].getDataNascimento() +
                     "\nIdentidade: " + cadastro[i].getIdentidade() +
                     "\nSom emitido: " + cadastro[i].exibeSom() +
                     "\n______________________________\n";
          }
          JOptionPane.showMessageDialog(null, exibe);
          break;

        case 3:
          cond = 0;
          break;

        default:
            JOptionPane.showMessageDialog(null, "Opcao invalida.");
      }
    } while (cond == 1);
  }
}
