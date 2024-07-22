import java.util.Arrays;

public class Es1 {

    public static void main(String[] args) {
        int result = moltiplica(15, 5);
        System.out.println(result);

        String concatenatedResultByString = concatena("Welcome to", "Java");
        System.out.println(concatenatedResultByString);

        String[] resultArray = {"uno", "due", "tre", "quattro", "cinque"};
        String[] newArray = inserisciInArray("nuovo", resultArray);
        System.out.println(Arrays.toString(newArray));
    }

    public static int moltiplica(int num1, int num2) {
        return num1 * num2;
    }

    public static String concatena(String text1, String text2) {
        return text1 + " " + text2;
    }

    public static String[] inserisciInArray(String text, String[] array) {
        // Creare un nuovo array con una dimensione maggiore di 1
        String[] newArray = new String[array.length + 1];

        // Copiare gli elementi prima della posizione desiderata
        for (int i = 0; i < 2; i++) {
            newArray[i] = array[i];
        }

        // Inserire il nuovo elemento nella posizione 3 (indice 2)
        newArray[2] = text;

        // Copiare gli elementi dopo la posizione desiderata
        for (int i = 2; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        return newArray;
    }
}