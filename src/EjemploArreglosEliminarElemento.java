import java.util.Scanner;

public class EjemploArreglosEliminarElemento {
    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        int total = a.length;
        for (int i = 0; i < total; i++) {
            System.out.print("Ingrese un número: ");
            a[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Ingrese una posición a eliminar entre 0 - 9: ");
        int position = sc.nextInt();

        for (int i = position; i < total - 1; i++) {
            a[i] = a[i + 1];
        }

        for (int i = 0; i < total - 1; i++) {
            System.out.println(a[i]);
        }
        int[] b = new int[total - 1];
//    para compiar un array a uno nuevo
        System.arraycopy(a,0,b,0, b.length);
        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " => " + b[i]);
        }
    }
}
