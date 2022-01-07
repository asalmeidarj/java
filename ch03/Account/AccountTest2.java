// AccountTest.java
// Programa cria e manipula um objeto Account.
package ch03.Account;

import ch03.Dialogs.Dialog1;

public class AccountTest2 {
    
    public static void main(String[] args) {
        
        String msg; // variável utilizada para mensagens na caixa de diálogo
        String name; // variável utilizada para armazenar nome da conta
        double balance; // variável utilizada para armazenar saldo da conta

        // Criar uma instância de Account.
        Account account = new Account();

        // lê nome e saldo da conta inserido pelo usuário
        name = Dialog1.input("Insira o nome da conta: ");
        balance = Dialog1.inputNumber("Insira o saldo da conta: ");

        // Settar instância de Account
        account.setName(name);
        account.setBalance(balance);

        // Variável recebe mensagem a ser exibida
        msg = "Nome da conta: " + account.getName() + "\n";
        msg += "O saldo na conta é: " + account.getBalance();


        Dialog1.show(msg); // exibir mensagem.

    }
}
