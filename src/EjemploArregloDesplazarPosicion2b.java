import java.util.Scanner;

public class EjemploArregloDesplazarPosicion2b {
    public static void main(String[] args) {

        int[] a = new int[10];
        int item, position, last;
        Scanner sc = new Scanner(System.in);
        int total = a.length;

        for (int i = 0; i < total; i++) {
            System.out.print("Ingrese un número: ");
            a[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Nuevo elemento: ");
        item = sc.nextInt();
        System.out.println("Posición para agregar el elemento: ");
        position = sc.nextInt();

        last = a[total - 1];
        for (int i = total -2; i >= position; i--) {
            a[i+1] = a[i];
        }
        int[] b = new int[total + 1];
        System.arraycopy(a, 0, b, 0, total);
//        tambien se puede reasignar el array a = b
        b[position] = item;
        b[b.length -1] = last;
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[i] = " + b[i]);
        }
    }
}
