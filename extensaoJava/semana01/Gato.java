public class Gato {

    boolean mia = true;
    String nome;
    int idade;

    Gato(String nome){
        this.nome = nome;
    }
    public static void main(String[] args) {
        Gato bidu = new Gato("Bidu");
        Gato miau = new Gato("Miau");
        miau.idade = 2;
        System.out.println(bidu.idade);
        System.out.println(miau.idade);
    }
}
