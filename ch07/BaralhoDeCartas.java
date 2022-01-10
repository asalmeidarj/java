// BaralhoDeCartas.java
// Classe BaralhoDeCartas representa um baralho de cartas

package ch07;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaralhoDeCartas {

    private List<Carta> baralho; // array de objetos cartas
    private int cartaAtual; // índice da próxima carta a ser distribuída (0 - 51);
    private static final int NUMERO_DE_CARTAS = 52;
    private static final SecureRandom random = new SecureRandom();

    // construtor preenche baralho de cartas
    public BaralhoDeCartas(){
        String[] valores = {
            "A", "2", "3", "4", "5", "6",
            "7", "8", "9", "10", "J", "Q", "K"
        };
        String[] naipes = {"Copas", "Espadas", "Ouros", "Paus"};

        baralho = new ArrayList<>(); // cria a lista de objetos cartas
        cartaAtual = 0; // a primeira carta a ser distribuída será baralho[0];

        // preencher o baralho com as cartas
        for(int contador = 0; contador < NUMERO_DE_CARTAS; contador++)
            baralho.add(new Carta(valores[contador % 13], naipes[contador / 13]));
    }

    public Carta distribuiCarta(){
        // distribui carta caso ainda haja carta no baralho e incrementa cartaAtual.
        if(cartaAtual < NUMERO_DE_CARTAS)
            return baralho.get(cartaAtual++);
        
        return null; // retorna null caso todas as cartas tenham sido distribuídas.
    }

    public void embaralhar(){
        // zerar o marcador de distribuição, próxima carta distribuída será baralho[0];
        cartaAtual = 0;

        // percorre cada carta do baralho e troca de posição com uma carta aleatória
        for(int posicao = 0; posicao < NUMERO_DE_CARTAS; posicao++)
            Collections.swap(baralho, posicao, random.nextInt(NUMERO_DE_CARTAS));
    }
}
