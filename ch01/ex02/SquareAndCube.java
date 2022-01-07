// SquareAndCube.java
// Programa exibi uma tabela com quadrados e cubos de números de 0 a 10.
package ch01.ex02;


public class SquareAndCube {
    public static void main(String[] args) {

        int number = 0;

        System.out.println("Numero\tQuadrado\tCubo");

        System.out.printf("%d\t%d\t\t%d\n", number, number*number, number*number*number);
        System.out.printf("%d\t%d\t\t%d\n", ++number, number*number, number*number*number);
        System.out.printf("%d\t%d\t\t%d\n", ++number, number*number, number*number*number);
        System.out.printf("%d\t%d\t\t%d\n", ++number, number*number, number*number*number);
        System.out.printf("%d\t%d\t\t%d\n", ++number, number*number, number*number*number);
        System.out.printf("%d\t%d\t\t%d\n", ++number, number*number, number*number*number);
        System.out.printf("%d\t%d\t\t%d\n", ++number, number*number, number*number*number);
        System.out.printf("%d\t%d\t\t%d\n", ++number, number*number, number*number*number);
        System.out.printf("%d\t%d\t\t%d\n", ++number, number*number, number*number*number);
        System.out.printf("%d\t%d\t\t%d\n", ++number, number*number, number*number*number);
        System.out.printf("%d\t%d\t\t%d\n", ++number, number*number, number*number*number);

    }
}


/**
 * Exercício resolvido sem a utilização das estruturas de repetição.
 */