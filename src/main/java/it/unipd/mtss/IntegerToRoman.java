////////////////////////////////////////////////////////////////////
// Luca Brunetta 2147982
// Riccardo Pozzato 2147988
////////////////////////////////////////////////////////////////////


package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 1000) {
            throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 1000");
        }

        // Per ora ci basta solo la "I" per gestire i numeri fino a 3
        String[] romanLetters = {"I"};
        int[] values = {1};

        StringBuilder romanNumber = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                romanNumber.append(romanLetters[i]);
            }
        }

        return romanNumber.toString();
    }
}