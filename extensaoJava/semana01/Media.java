import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma = 0;

        for(int i = 0; i < 4; i++){
            System.out.println("Digite um número:");
            soma += scan.nextInt();
        }
        scan.close();
        soma = soma /4;
        System.out.println("A média é: " + soma);


    }
}
