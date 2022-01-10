/**
 * Programa de simulação de lançamentos de dados
 * 
 */
package ch07;

import java.security.SecureRandom;

public class RollDied {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int [] frequency = new int[7];

        // lança o dado 6.000.000 de vezes usa o valor do dado como índice de frequência
        for(int i = 1; i <= 6000000; i++)
            ++frequency[1 + random.nextInt(6)];

        System.out.printf("%4s%16s%n", "Face", "Frequencia");

        // imprime no prompt a frequência de cada face do dado.
        for(int face = 1; face <= 6; face++)
            System.out.printf("%4d%16d%n", face, frequency[face]);
    }
}

/**
 * Obs.: Utilizamos um array com 7 posições para ficar mais legível pois
 * cada índice da array frequency corresponde ao valor da face do dado.
 */
