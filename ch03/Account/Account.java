// Account.java
// Classe Account que contém uma variável de instância name 
// e métodos para configurar e obter seu valor

package ch03.Account;

public class Account {

    private String name; //variável de instância

    //método para definir o nome objeto.
    public void setName(String name){
        this.name = name;
    }

    //método para recuperar o nome do objeto.
    public String getName(){
        return this.name;
    }

}