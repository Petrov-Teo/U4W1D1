import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci la prima stringa");
        String text1 = scanner.nextLine();
        System.out.println("inserisci la seconda stringa");
        String text2 = scanner.nextLine();

        System.out.println(concatena(text1, text2));
        System.out.println(concatena(text2, text1));

        scanner.close();
    }

    public static String concatena(String text1, String text2) {
        return text1 + " " + text2;
    }
}