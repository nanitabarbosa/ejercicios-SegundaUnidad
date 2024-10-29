public class intercambioValores {


    public static void intercambiar(int a, int b){
        int cambioa= a;
        a = b;
        b = cambioa;

        System.out.println("Dentro del metodo intercambio: a " + a + ", b= " + b);

    }
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        System.out.println("Antes de llamar al metodo, a = " + a + ", b = " + b );

        intercambiar(a, b);
        System.out.println("Despues de llamar al metodo: a = " + a + " ,b = " + b);
    }


    
}