package ch07;

public class BaralhoDeCartasTeste {

    public static void main(String[] args) {

        BaralhoDeCartas baralho = new BaralhoDeCartas();
        baralho.embaralhar();

        for(int i = 1; i <= 52; i++){
            Carta carta = baralho.distribuiCarta();
            System.out.printf("%-16s", carta.toString());

            if(i % 4 == 0)
                System.out.println();
        }

    }
    
}
