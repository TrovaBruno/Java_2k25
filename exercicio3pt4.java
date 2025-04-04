import java.util.Scanner;

public class exercicio3pt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a hora que começou o jogo");
        int comecou = sc.nextInt();

        System.out.println("Digite a hora que terminou o jogo");
        int terminou = sc.nextInt();

        int duracao;

        if (comecou < terminou){
            duracao = terminou - comecou;
        }
        else {
            duracao = 24 - comecou + terminou;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
