// AccountTest.java
// Programa cria e manipula um objeto Account.
package ch03.Account;

import java.util.Scanner;

public class AccountTest {
    
    public static void main(String[] args) {
        
        //Criar uma instância de Account.
        Account account = new Account();

        //Exibir o nome da conta.
        System.out.printf("Nome da conta: %s \n", account.getName());

        System.out.print("Insira o nome da conta: ");

        try(Scanner input = new Scanner(System.in)) {
            account.setName(input.nextLine()); // lê o nome da conta fornecido pelo usuário
            System.out.print("Nome adicionado com sucesso! \n");
        }

        System.out.printf("Nome da conta após input: %s \n", account.getName());

    }
}
