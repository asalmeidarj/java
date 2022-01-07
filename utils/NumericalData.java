// NumericalData
// Classe de utilitários para números

package utils;

public class NumericalData {

    public static boolean isNumber(String numberString){

        boolean isNumeric = numberString.matches("[+-]?\\d+(.?\\d+)?");
        
        return isNumeric;
    }

    public static String commaToPoint(String text) {
        return text.replace(",", ".");
    }
}