import javax.swing.JOptionPane;

class Cria_JOptionPane {
 public static void main(String[] args) {
    int cond = 1;
    int pos = 0;
    Animal[] cadastro = new Animal[5];
    String[] animais = {"Cao", "Gato"};

    do {
      Integer opcaoEscolhida = Integer.parseInt(JOptionPane.showInputDialog(
          "Controle de Animais\n\n" +
          "1 - Cadastrar animal\n" +
          "2 - Remover animal\n" +
          "3 - Listar animais\n" +
          "4 - Sair\n"));

      switch (opcaoEscolhida) {
        case 1:
          if (pos < 5) {
            String animalEscolhido = (String)JOptionPane.showInputDialog(
                null,
                "Qual animal voce deseja cadastrar?",
                "Animal",
                JOptionPane.QUESTION_MESSAGE,
                null,
                animais,
                animais[0]);
            String dataNascimento =
                JOptionPane.showInputDialog("Digite a data de nascimento:");
            Integer identidade = Integer.parseInt(
                JOptionPane.showInputDialog("Digite a identidade:"));
            String raca = JOptionPane.showInputDialog("Digite a raca:");
            if (animalEscolhido == "Cao") {
              cadastro[pos] = new Cao(dataNascimento, identidade, raca);
            } else {
              cadastro[pos] = new Gato(dataNascimento, identidade, raca);
            }
            pos++;
          } else {
            JOptionPane.showMessageDialog(
                null, "Nao posso mais adicionar registros.");
          }
          break;

        case 2:
          Integer index = Integer.parseInt(
              JOptionPane.showInputDialog(null,
                                          "Qual animal voce deseja remove?",
                                          "Animal",
                                          JOptionPane.QUESTION_MESSAGE));
          // Implement me!

          break;
        case 3:
          String exibe = "";
          for (int i = 0; i < pos; i++) {
            exibe += "Data de nascimento: " + cadastro[i].getDataNascimento() + "\n" +
                     "Identidade: " + cadastro[i].getIdentidade() + "\n" +
                     "Raca: " + cadastro[i].getRaca() + "\n" +
                     "Som emitido: " + cadastro[i].exibeSom() + "\n" +
                     "______________________________\n";
          }
          if (pos == 0) {
            JOptionPane.showMessageDialog(
                null, "Nenhum animal foi cadastrado ainda.");
          } else {
            JOptionPane.showMessageDialog(null, exibe);
          }
          break;

        case 4:
          cond = 0;
          break;

        default:
            JOptionPane.showMessageDialog(null, "Opcao invalida.");
      }
    } while (cond == 1);
  }
}
