import java.util.Scanner;

public class EDAD_ALUMNOS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" INGRESE LA CANTIDAD QUE DESEE DE LOS ESTUDIANTES : ");
        int edad_alumnos = scanner.nextInt();

        int[] edades = new int[edad_alumnos];

        for (int i = 0; i < edad_alumnos; i++) {
            System.out.print(" POR FAVOR INGRESE LA CANTIDAD DE EDAD DE EL ESTUDIANTE " + (i + 1) + " : ");
            edades[i] = scanner.nextInt();
            System.out.print( "POR FAVOR MUESTRE EL GRADO Y QUE COINCIDA CON EL AÑO DE EDAD" );
        }

        int sumamayores5 = 0;
        int cantidadmayores5 = 0;
        for (int edad : edades) {


            if (edad > 5) {
                sumamayores5 += edad;
                cantidadmayores5++;
            }
        }
    }
}