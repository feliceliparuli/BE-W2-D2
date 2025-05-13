import java.util.*;

public class Esercizio2 {

    public static List<Integer> generaLista(int n) {
        List<Integer> lista = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            lista.add(rand.nextInt(101));
        }
        return lista;
    }

    public static List<Integer> invertiLista(List<Integer> lista) {
        List<Integer> invertita = new ArrayList<>(lista);
        Collections.reverse(invertita);
        return invertita;
    }

    public static void stampaPosizioni(List<Integer> lista, boolean pari) {
        for (int i = 0; i < lista.size(); i++) {
            if ((i % 2 == 0 && pari) || (i % 2 != 0 && !pari)) {
                System.out.println("Posizione " + i + ": " + lista.get(i));
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> lista = generaLista(10);
        System.out.println("Lista originale: " + lista);

        List<Integer> listaInversa = invertiLista(lista);
        System.out.println("Lista inversa: " + listaInversa);

        System.out.println("Stampo posizioni pari:");
        stampaPosizioni(lista, true);

        System.out.println("Stampo posizioni dispari:");
        stampaPosizioni(lista, false);
    }
}