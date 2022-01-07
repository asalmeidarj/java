// Account.java
// Classe Account que contém uma variável de instância name 
// e métodos para configurar e obter seu valor

package ch03.Account;

public class Account {

    private String name; // variável de instância (nome)
    private double balance; // variável de instância (saldo)

    // método para definir o nome do objeto.
    public void setName(String name){
        this.name = name;
    }

    // método para recuperar o nome do objeto.
    public String getName(){
        return this.name;
    }

    // método para definir saldo do objeto
    public void setBalance(int balance){
        this.balance = balance;
    }

    // método para recuperar o saldo do objeto
    public double getBalance() {
        return this.balance;
    }

}