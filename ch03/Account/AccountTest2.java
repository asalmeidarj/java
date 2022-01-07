// AccountTest.java
// Programa cria e manipula um objeto Account.
package ch03.Account;

import ch03.Dialogs.Dialog1;

public class AccountTest2 {
    
    public static void main(String[] args) {
        
        String msg; // variável utilizada para mensagens na caixa de diálogo
        double balance; // variável utilizada para armazenar saldo da conta

        // Criar uma instância de Account.
        Account account = new Account();

        account.setName("Joaquim");

        balance = Dialog1.inputNumber("Insira o saldo da conta: ");

        // Variável recebe mensagem a ser exibida
        msg = "Nome da conta: " + account.getName() + "\n";
        msg += "O saldo na conta é: " + balance;


        Dialog1.show(msg); // exibir mensagem.

    }
}
