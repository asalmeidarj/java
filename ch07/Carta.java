// Carta.java
// Classe carta reprenta uma carta

package ch07;

public class Carta {

    private final String valor; // {A, 2, 3, ... , 9, 10, J, Q, K}
    private final String naipe; // {Copas, Espadas, Ouros, Paus}

    // construtor de dois argumentos inicia o valor e o naipe
    Carta(String cartaValor, String cartaNaipe){
        this.valor = cartaValor; // inicia o valor da carta
        this.naipe = cartaNaipe; // inicia o naipe da carta
    }

    // retorna a representação String da carta.
    public String toString(){
        return valor + " de " + naipe;
    }
}
