// Adicao.java
// Programa de adição que insere dois números, então exibe a soma deles.
package ch01.ex01;

import java.util.Scanner;

public class Adicao {
    public static void main(String[] args) {
        // cria um Scanner para obter entrada a partir da janela de comando
        try(Scanner input = new Scanner(System.in)) {

            int number1;
            int number2;
            int sum;

            System.out.print("Insira o primeiro número: "); // prompt
            number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário

            System.out.print("Insira o segundo número: "); // prompt
            number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário

            sum = number1 + number2; // soma os números, depois armazena o total em sum

            System.out.printf("A Soma é %d%n", sum);
        }
    }
}
