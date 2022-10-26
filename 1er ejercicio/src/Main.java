public class Main {

    public static void main(String[] args) {

        int opa = 5;
        int segundo = 10;
        int tercero = 15;

        var probando = miVariable(opa, segundo, tercero);

        System.out.println(probando);
    }


    public static int miVariable(int a, int b, int c) {
        return a + b + c;

    }
}
