import java.util.Arrays;

public class Es1 {

    public static void main(String[] args) {
        int result = moltiplica(15, 5);
        System.out.println(result);

        String contatenedResultByString = concatena("Welcome to", "Java");
        System.out.println(contatenedResultByString);

        String[] resultArray = arraydistringhe("Ciao");
        System.out.println(Arrays.toString(resultArray));

    }


    public static int moltiplica(int num1, int num2) {
        return (num1 * num2);
    }

    public static String concatena(String text1, String text2) {
        return text1 + " " + text2;
    }

    public static String[] arraydistringhe(String text1) {

        String[] arraydistrighe = new String[5];

        arraydistrighe[3] = text1;

        return arraydistrighe;
    }
}