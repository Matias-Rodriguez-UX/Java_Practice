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

    public static void numeroIfFunc(int numeroIf) {
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es igual a cero");
        }
    }

    public static void hasta3() {
        int numeroWhile = 0; // Valor inicial de la variable
        while (numeroWhile < 3) {
            numeroWhile++; // Incrementa el valor de la variable en uno
            System.out.println(numeroWhile); // Muestra el valor por pantalla
        }
    };

    public static void bulce3() {
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor); // Muestra el valor por pantalla
        }
    }

    public static void Estacion() {
        String estacion = "verano"; // Puedes cambiar el valor de la variable aquí

        switch (estacion) {
            case "primavera":
                System.out.println("Es primavera.");
                break;
            case "verano":
                System.out.println("Es verano.");
                break;
            case "otoño":
                System.out.println("Es otoño.");
                break;
            case "invierno":
                System.out.println("Es invierno.");
                break;
            default:
                System.out.println("El valor de la variable no corresponde a una estación.");
                break;
        }
    }
    // Switch

}

class Coche {
    public int puertas = 4;

    public void agregarPuertas() {
        this.puertas++;
    }
}