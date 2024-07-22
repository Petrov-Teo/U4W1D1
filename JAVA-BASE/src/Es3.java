import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Chiediamo all'utente di darci il lato A
        System.out.println("inserisci il lato A");
        String latoAStringa = scanner.nextLine();
        double latoA = Double.parseDouble(latoAStringa);

        //Chiediamo all'utente di darci il lato B
        System.out.println("inserisci il lato B");
        String latoBStringa = scanner.nextLine();
        double latoB = Double.parseDouble(latoBStringa);

        //Stampa in Terminale il risultato
        double risultatoPerimetroRettangolo = perimetroRettangolo(latoA, latoB);
        System.out.println("Il perimetro del rettangolo è: " + risultatoPerimetroRettangolo);


        //Esercizio PARI DISPARI
        System.out.println("Prego Inserisci un numero");
        String numueroInserito = scanner.nextLine();
        int numeroPariDispari = Integer.parseInt(numueroInserito);

        // Verifica se il numero è pari o dispari
        String risultatoPariDispari = pariDispari(numeroPariDispari);
        System.out.println("Il numero " + numeroPariDispari + " è " + risultatoPariDispari);


        // L'ARIA DI UN TRINGOLO Chiediamo all'utente di inserire i lati del triangolo
        System.out.println("Inserisci il lato A del triangolo:");
        String latoTriangoloAStringa = scanner.nextLine();
        double latoTriangoloA = Double.parseDouble(latoTriangoloAStringa);

        System.out.println("Inserisci il lato B del triangolo:");
        String latoTriangoloBStringa = scanner.nextLine();
        double latoTriangoloB = Double.parseDouble(latoTriangoloBStringa);

        System.out.println("Inserisci il lato C del triangolo:");
        String latoTriangoloCStringa = scanner.nextLine();
        double latoTriangoloC = Double.parseDouble(latoTriangoloCStringa);

        // Stampa in terminale il risultato del perimetro del triangolo
        double perimetroTriangolo = perimetroTriangolo(latoTriangoloA, latoTriangoloB, latoTriangoloC);
        System.out.println("L'area del triangolo è: " + perimetroTriangolo);

        scanner.close();
    }

    // Metodo per calcolare il perimetro del rettangolo
    public static double perimetroRettangolo(double latoA, double latoB) {
        return 2 * (latoA + latoB);
    }

    //Metodo per calcolare se un numero è pari o dispari
    public static String pariDispari(int numero) {
        if (numero % 2 == 0) {
            return "pari";
        } else {
            return "dispari";
        }
    }

    //Metodo per calcolare il perimetro di un triangolo
    public static double perimetroTriangolo(double latoA, double latoB, double latoC) {
        double s = (latoA + latoB + latoC) / 2; // Semiperimetro
        return Math.sqrt(s * (s - latoA) * (s - latoB) * (s - latoC));
    }
}

