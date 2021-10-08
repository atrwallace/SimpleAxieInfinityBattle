package axieinfinity;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        Axies axie1 = new Axies();
        Axies axie2 = new Axies();
        int dec = 0;

       // Definindo as entradas dos axies
        System.out.println("Digite o tipo do seu axie: ");
       axie1.tipoaxie = teclado.nextLine();
        System.out.println("Digite a quantidade de vida do seu axie: (Max 500)");
       axie1.qtvida = teclado.nextInt();
       teclado.nextLine();

       // Definindo o axie inimigo
        System.out.println("Digite o tipo do axie inimigo: ");
        axie2.tipoaxie = teclado.nextLine();

        // Perguntando ações
        System.out.println("O que deseja fazer agora? Digite 1 para atacar e 2 para não atacar");
        dec = teclado.nextInt();
            if (dec==1) {
                axie1.atacar(axie2);
            } else {

            }
            if (dec==2) {
                axie1.naoatacar();
            } else {

            }
    }
}
