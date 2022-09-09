import java.util.Arrays;

public class EjemploArreglosFor {
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

        System.out.println("=== Usando Foreach ===");
        for(String prod: productos){
            System.out.println("prod = " + prod);
        }

        System.out.println("=== Usando While ===");
        int i = 0;
        // el for es más optimizado que el while para arreglos
        while(i < lng){
            System.out.println("para indice " + i + " : " + productos[i]);
            i++;
        }
        System.out.println("=== Usando DoWhile ===");
        int j = 0;
        do{
            System.out.println("para indice " + j+ " : " + productos[j]);
            j++;
        }while (j<lng);


        int[] numeros = new int[10];
        int total = numeros.length;
        for(int k = 0; k<total; k++){
            numeros[k] = k*3;
        }
        for(int k = 0; k<total; k++){
            System.out.println("numeros[k] = " + numeros[k]);
        }

        
        
        
    }
}
