import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {
        
        String [] productos = new String[7];
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Externo";
        productos[3] = "Asus NoteBook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos); // para ordenar con la clase Arrays

        String prod0 = productos[0];
        String prod1 = productos[1];
        String prod2 = productos[2];
        String prod3 = productos[3];
        String prod4 = productos[4];
        String prod5 = productos[5];
        String prod6 = productos[6];


        System.out.println("productos[0] = " + prod0); // por defecto es null
        System.out.println("productos[1] = " + prod1);
        System.out.println("productos[2] = " + prod2);
        System.out.println("productos[3] = " + prod3);
        System.out.println("productos[4] = " + prod4);
        System.out.println("productos[5] = " + prod5);
        System.out.println("productos[6] = " + prod6);

        int [] numeros = new int[4];
        // por defecto todos los valores son 0
        numeros[0] = 100;
        numeros[1] = 20;
        numeros[2] = 35;
        numeros[3] = 4;
        Arrays.sort(numeros);
        //numeros[4] = 5; // lanza una exception
        System.out.println("numeros[0] = " + numeros[0]);
        System.out.println("numeros[1] = " + numeros[1]);
        System.out.println("numeros[2] = " + numeros[2]);
        System.out.println("numeros[3] = " + numeros[3]);

        //obtener el último atributo del arreglo
        int lg = numeros.length - 1;
        System.out.println("último valor de numeros = " + numeros[lg]);

    }
}
