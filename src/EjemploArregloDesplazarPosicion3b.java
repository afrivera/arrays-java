import java.util.Scanner;

public class EjemploArregloDesplazarPosicion3b {
    public static void main(String[] args) {

        int[] a = new int[7];
        int item, position, last;
        Scanner sc = new Scanner(System.in);
        int total = a.length;
        for (int i = 0; i < total; i++) {
            System.out.print("Ingrese un numero en orden asc: ");
            a[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Ingrese el numero que desea agregar al array: ");
        item = sc.nextInt();

        last = a[total -1];
        position = 0;
        while ( position < 6 && item >a[position]){
            position++;
        }
        for(int i = total -2; i >= position; i--){
            a[i+1] = a[i];
        }

        int[] b = new int[total + 1];
        System.arraycopy(a, 0, b, 0, total);

        if(item > last){
            b[b.length -1] = item;
        } else {
            b[b.length -1] = last;
            b[position] = item;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " => " +b[i]);
        }

    }
}
