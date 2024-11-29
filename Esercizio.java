//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        // - Definire un vettore V contenente 5 nomi di cantanti
        String[] v = new String[5];
        v[0] = "Matt";
        v[1] = "Chris";
        v[2] = "Dom";
        v[3] = "Adele";
        v[4] = "Celine";

        // - Definire un vettore W contenente 5 nomi di cantanti inseriti da tastiera
        Scanner scanner = new Scanner(System.in);
        String[] w = new String[5];
        int i;
        for (i = 0; i <= 4; i++) {
            System.out.println("Inserisci il nome di un cantante: ");
            w[i] = scanner.nextLine();
        }

        // - Definire un vettore X contenente 10 numeri da 1 a 10
        int[] x = new int[10];
        for (i = 0; i <= 9; i++) {
            // In questo caso il valore dell'indice è collegato al valore della cella
            // (valore = i + 1)
            x[i] = i + 1;
        }

        // - Definire un vettore Y contenente i primi 10 numeri pari
        int[] y = new int[10];
        for (i = 0; i <= 9; i++) {
            // In questo caso il valore dell'indice è collegato al valore della cella
            // (valore = (i+1) * 2)
            y[i] = (i + 1) * 2;
        }

        // - Visualizzare solo 3 elementi del vettore V
        System.out.println("Visualizzare solo 3 elementi del vettore V: " + v[0] + " " + v[2] + " " + v[4]);

        // - Visualizzare tutti gli elementi dei vettori V, W, X, Y
        System.out.println("Visualizzare tutti gli elementi dei vettori V, W, X, Y");
        System.out.print("V: ");
        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

        System.out.print("\nW: ");
        for (i = 0; i < w.length; i++) {
            System.out.print(w[i] + " ");
        }

        System.out.print("\nX: ");
        for (i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }

        System.out.print("\nY: ");
        for (i = 0; i < y.length; i++) {
            System.out.print(y[i] + " ");
        }

        // Visualizzare solo gli elementi con indice pari del vettore X
        System.out.print("\nX, solo indici pari: ");
        for (i = 0; i < x.length; i += 2) {
            System.out.print(x[i] + " ");
        }

        // Visualizzare solo gli elementi con indice dispari del vettore X
        System.out.print("\nX, solo indici dispari: ");
        for (i = 1; i < x.length; i += 2) {
            System.out.print(x[i] + " ");
        }

        // Visualizzare solo gli elementi con valore pari del vettore X
        System.out.print("\nX, solo valori pari: ");
        for (i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                System.out.print(x[i] + " ");
            }
        }


    }
}
