import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {

    public static void sortBourble( Object[] arreglo){
        int lng = arreglo.length;
        int contador = 0;
        for(int i = 0; i < lng - 1; i++){
            for (int j = 0; j < lng - 1 - i; j++) {
                if( ((Comparable)arreglo[j+1]).compareTo(arreglo[j]) > 0){ // para cambiar el orden se cambia el signo < o >
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
                contador++;

            }
        }


    }
    public static void main(String[] args) {

        String[] productos = { "Kingston Pendrive 64GB",
                "Samsung Galaxy",
                "Disco Duro SSD Externo",
                "Asus NoteBook",
                "Macbook Air",
                "Chromecast 4ta generación",
                "Bicicleta Oxford"};

        int lng = productos.length;

        // ordenar metodo burbuja optimizado
        /*for(int i = 0; i < lng - 1; i++){
            for (int j = 0; j < lng - 1 - i; j++) {
                if( productos[j+1].compareTo(productos[j]) < 0){
                    String auxiliar = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = auxiliar;
                }
                contador++;

            }
        }*/

        // Arrays.sort(productos); // para ordenar con la clase Arrays
        System.out.println("=== Usando For ===");
        sortBourble(productos);
//        System.out.println("contador = " + contador);
        for (int i = 0; i < lng; i++) {
            System.out.println("i = " + i + " : " + productos[i]);
        }

        Integer[] numeros = new Integer[4];
        numeros[0] = 10;
        numeros[1] = 7;
        numeros[2] = 35;
        numeros[3] = -1;

        int lngn = numeros.length;
//        for(int i = 0; i < lngn - 1; i++){
//            for (int j = 0; j < lngn - 1 - i; j++) {
//                if( ((Integer)numeros[j+1]).compareTo(numeros[j]) < 0){
//                    int auxiliar = numeros[j];
//                    numeros[j] = numeros[j + 1];
//                    numeros[j + 1] = auxiliar;
//                }            }
//        }

        sortBourble(numeros);
        for (int i = 0; i < lngn; i++) {
            System.out.println("numeros = " + numeros[i]);

        }

    }
}
