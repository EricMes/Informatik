public class Unterprogramme {

    public static void main(String[] args) {
        int zahl1;
        int zahl2;
        int summe;

        zahl1 = eingeben(1);
        zahl2 = eingeben(2);
        summe = addieren(zahl1,zahl2);
        ausgeben(zahl1,zahl2,summe);

    }

    static int eingeben(int n) {
        int z;
        z = ConIn.readInt(n + ". Zahl: ");
        return z;
    }
    public static int addieren (int z1, int z2) {
        int summe;
        summe = z1 + z2;
        return summe;
    }
    public static void ausgeben (int z1, int z2, int summe) {
        System.out.println("Ergebnis: " + z1 + " + " + z2 + " = " + summe);

    }
}