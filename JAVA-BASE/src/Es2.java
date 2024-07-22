import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Proviamo a chiedere all'utente di inserire la prima parola
        System.out.println("inserisci la prima parola");
        String text1 = scanner.nextLine();
        // Proviamo a chiedere all'utente di inserire la seconda parola

        System.out.println("inserisci la seconda parola");
        String text2 = scanner.nextLine();
        // Proviamo a chiedere all'utente di inserire la terza parola
        System.out.println("inserisci la terza parola");
        String text3 = scanner.nextLine();

        System.out.println(concatena(text1, text2, text3));
        System.out.println(concatena(text3, text2, text1));

        scanner.close();
    }

    public static String concatena(String text1, String text2, String text3) {
        return text1 + " " + text2 + " " + text3;
    }
}