import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {

        int[] a, pares, impares;
        int totalpares = 0, totalImpares = 0;
        System.out.println("Ingrese 10 numeros");
        a = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if( a[i] %2==0){
                totalpares++;
            } else {
                totalImpares++;
            }
        }

        pares = new int[totalpares];
        impares = new int[totalImpares];

        int ipar = 0, iImpar = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2 == 0){
                pares[ipar++] = a[i];
            } else {
                impares[iImpar++] = a[i];
            }
        }
        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();
        System.out.println("Impares");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }

    }
}
