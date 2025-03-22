
import javax.swing.JOptionPane;

public class Calculadora{
  public static void main(String[] args) {
    String[] opcoes = {"Soma", "Subtracao", "Multiplicacao", "Divisao"};
    String operacaoEscolhida = (String) JOptionPane.showInputDialog(null, "Escolha a operação: ", "Calculadora",
    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

    if (operacaoEscolhida != null){
      try {
        String num1Str = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String num2Str = JOptionPane.showInputDialog("Digite o segundo número: ");

        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        double resultado = 0;

        switch (operacaoEscolhida){
          case "Soma":
            resultado = num1 + num2;
            break;
          case "Subtracao":
            resultado = num1 - num2;
            break;
          case "Multiplicacao":
            resultado = num1 * num2;
            break;
          case "Divisao":
            if (num2 !=0){
              resultado = num1 / num2;
            } else {
              JOptionPane.showMessageDialog(null, "Erro: Divisão por zero é sempre 0");
              return;
            }
            break;
          default:
            JOptionPane.showMessageDialog(null, "Operação inválida.");
            return;
        }
        JOptionPane.showMessageDialog(null, "Resultado da " + operacaoEscolhida + ":" + resultado);
      }catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Erro, Entrada inválida. Por favor, insira números validos.");
      }
      } else {
        JOptionPane.showMessageDialog(null, "Nenhuma operacao foi selecionada.");
      }
    }
  }
