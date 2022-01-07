// NumericalData
// Classe de utilitários para números

package ch03.Utils;

public class NumericalData {

    public static boolean isNumber(String numberString){

        numberString = commaToPoint(numberString);

        boolean isNumeric = numberString.matches("[+-]?\\d+.?\\d+");
        
        return isNumeric;
    }

    private static String commaToPoint(String text) {
        return text.replace(",", ".");
    }
}