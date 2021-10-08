package axieinfinity;

public class Axies {
    String tipoaxie;
    int qtvida;
    int dano = (int) ((Math.random() * ((300 - 700))) + 300);


    void atacar(Axies axie) {
        System.out.println("Você está prestes a atacar!");
        qtvida -= dano;
        if (this.qtvida <= 100) {
            System.out.println("Você perdeu a batalha contra " + axie.tipoaxie);
        } else {
            System.out.println("Você ganhou a batalha contra " + axie.tipoaxie);
        }
    }


    void naoatacar () {
        if (this.qtvida > dano) {
            System.out.println("Você ficou vivo, por sorte! Parabéns! ");
        } else {
            System.out.println("Infelizmente você morreu! ");
        }
    }

}