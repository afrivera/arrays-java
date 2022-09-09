import java.util.Scanner;

public class EjemploArreglosNotasAlumnos {
    public static void main(String[] args) {

        double[] matematicas, historia, lenguaje;
        double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;
        matematicas = new double[7];
        historia = new double[7];
        lenguaje = new double[7];

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 7 notas de estudiantes para matematicas");
        for (int i = 0; i < matematicas.length; i++) {
            matematicas[i] = sc.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para historia");
        for (int i = 0; i < historia.length; i++) {
            historia[i] = sc.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para lenguaje");
        for (int i = 0; i < lenguaje.length; i++) {
            lenguaje[i] = sc.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sumNotasMatematicas += matematicas[i];
            sumNotasHistoria += historia[i];
            sumNotasLenguaje += lenguaje[i];
        }

        System.out.println("Promedio matematicas " + ( sumNotasMatematicas / matematicas.length));
        System.out.println("Promedio historia " + ( sumNotasHistoria / historia.length));
        System.out.println("Promedio lenguaje " + ( sumNotasLenguaje / lenguaje.length));
        System.out.println("Promedio total del curso " + (sumNotasMatematicas + sumNotasHistoria + sumNotasLenguaje ) / 3);

        System.out.println("Ingrese el identificador del alumno");
        int id = sc.nextInt();
        double promedioAlumno = (matematicas[id] + historia[id] + lenguaje[id]) / 3;
        System.out.println("promedioAlumno = " + promedioAlumno);

    }
}
