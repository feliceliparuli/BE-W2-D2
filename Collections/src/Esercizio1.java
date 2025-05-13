import java.util.*;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quante parole vuoi inserire?");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<String> parole = new ArrayList<>();
        Set<String> uniche = new HashSet<>();
        Set<String> duplicati = new HashSet<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci parola: ");
            String parola = scanner.nextLine();
            if (!uniche.add(parola)) {
                duplicati.add(parola);
            }
            parole.add(parola);
        }

        System.out.println("Parole duplicate: " + duplicati);
        System.out.println("Numero di parole distinte: " + uniche.size());
        System.out.println("Parole distinte: " + uniche);
    }
}