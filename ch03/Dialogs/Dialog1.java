// Dialog1.java
// Classe Responsável pela exibição de caixas de diálogo
package ch03.Dialogs;

import javax.swing.JOptionPane;

import ch03.Utils.NumericalData;

public class Dialog1 {
    
    public static void welcome(){
        JOptionPane.showMessageDialog(null, "Seja bem vindo!");
    }

    public static void show(String message){
        JOptionPane.showMessageDialog(null, message);
    }

    public static double inputNumber(String messageShow){

        // lê o valor inserido pelo usuário na caixa de diálogo e guarda em input
        String input = JOptionPane.showInputDialog(messageShow);
        
        // variável isNumeric is True para input Numérico e false caso contrário.
        boolean isNumeric = NumericalData.isNumber(input);

        while (!isNumeric) {
            JOptionPane.showMessageDialog(null, "Por favor insira um número válido!");
            input = JOptionPane.showInputDialog(messageShow);
            isNumeric = NumericalData.isNumber(input);
        }

        return Double.parseDouble(input); // retorna o valor convertido para double
    }

}
