import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {

        int[] a = new int[10];
        int last;
        Scanner sc = new Scanner(System.in);
        int total = a.length;
        
        for (int i = 0; i < total; i++) {
            System.out.print("Ingrese un número: ");
            a[i] = sc.nextInt();
        }
        
        last = a[ total -1];
        for (int i = total-2; i >= 0; i--) {
            a[i+1] = a[i];
        }
        a[0] = last;

        for (int i = 0; i < total; i++) {
            System.out.println("a[i] = " + a[i]);
        }
    }
}
