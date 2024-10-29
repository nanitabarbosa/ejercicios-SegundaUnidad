
    class Rectangulo {
        int ancho;
        int alto;

        Rectangulo(int ancho, int alto){
            this.ancho = ancho;
            this.alto = alto;
        
        }
    }
 public class modificarObjeto {

    public static void modificarRectangulo(Rectangulo rect){
        rect.ancho = 30;
        rect.alto = 60;

        System.out.println("Dentro del metodo: ancho es = " + rect.ancho + " ,alto = " + rect.alto);

    }

    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo(10, 20);

        System.out.println("Antes de modificar el ancho: " + miRectangulo.ancho + ", alto =" + miRectangulo.alto);

        modificarRectangulo(miRectangulo);
        System.out.println("Despues de modificar: ancho =" + miRectangulo.ancho + ", alto = " + miRectangulo.alto);
    }

 }
