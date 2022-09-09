import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void main(String[] args) {

        String[] productos = new String[7];

        int lng = productos.length;
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Externo";
        productos[3] = "Asus NoteBook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos); // para ordenar con la clase Arrays
        System.out.println("=== Usando For ===");
        for (int i = 0; i < lng; i++) {
            System.out.println("i = " + i + " : " + productos[i]);
        }

        /*for(int i = 0; i < lng/ 2; i++){
            String actual = productos[i];
            String inverso = productos[lng -1 -i];
            productos[i] = inverso;
            productos[lng -1 -i] = actual;
        }
        */

        // ordenar con la api Collections
        Collections.reverse(Arrays.asList(productos));

        System.out.println("=== Usando For ===");
        for (int i = 0; i < lng; i++) {
            System.out.println("i = " + i + " : " + productos[i]);
        }




    }
}
