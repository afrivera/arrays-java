import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {

        int[] a = new int[7];
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 7 numeros");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        boolean ascen = false;
        boolean desc = false;
        for (int i = 0; i < a.length - 1; i++) {
            if(a[i] > a[i+1]){
                desc = true;
            }

            if(a[i]< a[i+1]){
                ascen = true;
            }
        }

        if( ascen && desc){
            System.out.println("Arreglo Desordenado");
        } else  if( !ascen && !desc){
            System.out.println("todos son iguales");
        } else if( ascen && !desc) {
            System.out.println("Arreglo ordenado de forma ascendente");
        } else {
            System.out.println("Arreglo ordenado de forma descendente");
        }
    }
}
