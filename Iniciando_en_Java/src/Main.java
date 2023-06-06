// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it

        int res = suma(10, 20, 30);
        System.out.println(res);

        Coche miCoche = new Coche();
        miCoche.agregarPuertas();
        System.out.println(miCoche.puertas);

    }

    // Press Mayús+F10 or click the green arrow button in the gutter to run the
    // code.
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

}

class Coche {
    public int puertas = 4;

    public void agregarPuertas() {
        this.puertas++;
    }
}