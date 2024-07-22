import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        // Attiviamo l'inserimento del dato attraverso la console
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

        //Stampiamo in console la concatenazione delle parole inserite dall'utente
        System.out.println(concatena(text1, text2, text3)); //<––– prima in ordine di inserimento
        System.out.println(concatena(text3, text2, text1)); //<––– poi in ordine di contrario

        scanner.close();
    }

    public static String concatena(String text1, String text2, String text3) {
        return text1 + " " + text2 + " " + text3;
    }
}