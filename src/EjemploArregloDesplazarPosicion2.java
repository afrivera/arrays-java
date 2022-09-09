import java.util.Scanner;

public class EjemploArregloDesplazarPosicion2 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int item, position;
        Scanner sc = new Scanner(System.in);
        int total = a.length;

        for (int i = 0; i < total -1; i++) {
            System.out.print("Ingrese un número: ");
            a[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Nuevo elemento: ");
        item = sc.nextInt();
        System.out.println("Posición para agregar el elemento: ");
        position = sc.nextInt();

        for (int i = total -2; i >= position; i--) {
            a[i+1] = a[i];
        }
        a[position] = item;

        for (int i = 0; i < total; i++) {
            System.out.println("a[i] = " + a[i]);
        }
    }
}
