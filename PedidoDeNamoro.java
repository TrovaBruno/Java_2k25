
import javax.swing.JOptionPane;

public class PedidoDeNamoro{
    public static void main(String[] args) {
        boolean aceitou = false;

        while (!aceitou){
            int resposta = JOptionPane.showConfirmDialog(null, "Você quer namorar comigo? 💖", "Pedido de Namoro", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION){
                aceitou = true;
                JOptionPane.showMessageDialog(
                    null, 
                    "Eu te amo, minha princesa,(Geovana Melissa dos Santos Trova)",
                    "Amor",
                     JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(
                    null, 
                    "Acho que vc se confundiu, tente novamente! 💔",
                    "Tente novamente",
                     JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }
}