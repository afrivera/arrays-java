import java.util.Scanner;

public class EjemploArregloDesplazarPosicion3 {
    public static void main(String[] args) {

        int[] a = new int[7];
        int item, position;
        Scanner sc = new Scanner(System.in);
        int total = a.length;
        for (int i = 0; i < total -1; i++) {
            System.out.println("Ingrese un numero en orden asc: ");
            a[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Ingrese el numero que desea agregar al array: ");
        item = sc.nextInt();

        position = 0;
        while ( position < 6 && item >a[position]){
            position++;
        }
        for(int i = total -2; i >= position; i--){
            a[i+1] = a[i];
        }
        a[position] = item;
        for (int i = 0; i < total; i++) {
            System.out.println(i + " => " +a[i]);
        }

    }
}
