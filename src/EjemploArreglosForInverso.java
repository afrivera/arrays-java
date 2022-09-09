import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {
        
        String [] productos = new String[7];

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

        System.out.println("=== Usando For Inverso===");
        for(int i = 0; i<lng; i++){
            System.out.println("para i = " + (lng -1 -i) + " valor: " + productos[lng - 1 - i]);
        }
        System.out.println("=== Usando For Inverso 2===");
        for(int i = lng-1; i>=0; i--){
            System.out.println("para i = " + i + " valor: " + productos[i]);
        }
    }
}
