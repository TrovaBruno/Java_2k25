
import javax.swing.JOptionPane;

public class Calculadora{ //Declara a classe Calculadora
  public static void main(String[] args) { // Metodo principal que o programa começa a ser executado
    String[] opcoes = {"Soma", "Subtracao", "Multiplicacao", "Divisao"}; // Cria um array (lista) de strings contendo opções de operações
    //Exibe uma caixa de diálogo para o usuário escolher uma das operações
    // O método showInputDialog retorna a opção selecionada pelo usuário

    //O primeiro argumento é o componente pai (null significa que é independente).
    // O segundo arumento é a mensagem exibida 
    // Titulo da janela

    String operacaoEscolhida = (String) JOptionPane.showInputDialog(null, "Escolha a operação: ", "Calculadora",

    //Verifica se uma operação foi selecionada (se não for null)
    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

    if (operacaoEscolhida != null){
      try {
        String num1Str = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String num2Str = JOptionPane.showInputDialog("Digite o segundo número: ");

        // Converte as entradas de string para números decimais (double).
        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        // Declara uma variável para armazenar o resultado da operação.
        double resultado = 0;

        /// Determina qual operação matemática foi escolhida pelo usuário.
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
              JOptionPane.showMessageDialog(null, "Erro: Não é possível dividir por 0");
              return;
            }
            break;
          default:
            JOptionPane.showMessageDialog(null, "Operação inválida.");
            return;
        }

        //Exibe o resultado na tela
        JOptionPane.showMessageDialog(null, "Resultado da " + operacaoEscolhida + ":" + resultado);

         // Captura erros de conversão (caso o usuário insira algo que não seja um número).
      }catch (NumberFormatException e) {        
        JOptionPane.showMessageDialog(null, "Erro, Entrada inválida. Por favor, insira números validos.");
      }

       // Exibe uma mensagem se o usuário não selecionar nenhuma operação.
      } else {
        JOptionPane.showMessageDialog(null, "Nenhuma operacao foi selecionada.");
      }
    }
  }
