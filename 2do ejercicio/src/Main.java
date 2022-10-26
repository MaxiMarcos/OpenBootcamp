public class Main {

    public static void main(String[] args) {

        coche miCoche = new coche();
        miCoche.sumarPuertas();

        System.out.println(miCoche.puertas);
    }


    public static int miVariable(int a, int b, int c) {
        return a + b + c;

    }
}

class coche {

    public int puertas = 4;

    public void sumarPuertas() {
        this.puertas++;
    }

}