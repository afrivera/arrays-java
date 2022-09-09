import java.util.Locale;
import java.util.Scanner;

public class EjemploArregloBuscarString {
    public static void main(String[] args) {

        String[] a = new String[4];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un nombre: ");
            a[i] = sc.next();
        }
        System.out.println("\r\nIngrese el nombre a buscar");
        String nombre = sc.next();

        int i = 0;
        while (i < a.length && !a[i].equalsIgnoreCase(nombre)) {
            i++;
        }

//        con un for sería así
//        for(int i = 0; i < a.length && a[i] != num; i++){};

        if( i == a.length){
            System.out.println("nombre no encontrado");
        } else if(a[i].toLowerCase().compareTo(nombre.toLowerCase())==0){
            System.out.println("el nombre está en la posición = " + i);

        }


    }
}
