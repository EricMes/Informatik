public class AuswahlSort {

public static void main (String[] argv) {
    int anz = ConIn.readInt("Anzahl:");


    int[] zahlen = eingabe(anz);
    
   zahlen = sortieren(zahlen, anz);
   ausgabe(zahlen, anz);
}

public static int[] eingabe(int anzahl) {
    int[] z = new int [anzahl];
    for(int i = 0; i < anzahl; i++) {
     z[i] =  ConIn.readInt("Zahl eingeben: ");
    }
    return z;
}
public static int[] sortieren(int[] zahlen, int anzahl) {
    for(int i = 0; i < anzahl-1; i ++) {
        for(int k = i + 1; k < anzahl; k++) {
            if (zahlen[k] < zahlen[i]) {
                int h = zahlen[i];
                zahlen[i] = zahlen[k];
                zahlen[k] = h;
            }
        }
    }
    return zahlen;
}
public static void ausgabe(int[] zahlen, int anzahl) {
    System.out.println("Die Zahlen nach Grösse sortiert:");
    for(int i = 0; i < anzahl; i ++) {
        System.out.println(zahlen[i]);
    }
    
}
}