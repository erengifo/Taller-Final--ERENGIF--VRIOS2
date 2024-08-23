import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean cerrar = false;
        int opc;
        int opcdp;
        int opcad;

        System.out.println("***************************************");
        System.out.println("*        CAPÍTULO PROGRAMACIÓN        *");
        System.out.println("*          ERIKA Y VALENTINA          *");
        System.out.println("***************************************");

        do {
            System.out.println("***************************************");
            System.out.println("*        1. Datos Primitivos.         *");
            System.out.println("*        2. String.                   *");
            System.out.println("*        3. Constantes.               *");
            System.out.println("*        4. Tipos de Operadores.      *");
            System.out.println("*        5. Condicional IF ELSE.      *");
            System.out.println("*        6. Condicional SWITCH.       *");
            System.out.println("*        7. Condicional TERNARIA.     *");
            System.out.println("*        8. Bucle DO WHILE.           *");
            System.out.println("*        9. Bucle WHILE.              *");
            System.out.println("*        10. Blucle FOR.              *");
            System.out.println("*        0. Salir.                    *");
            System.out.println("***************************************");
            System.out.print("Digite su opción: ");
            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("***************************************");
                    System.out.println("*          Datos Primitivos           *");
                    System.out.println("***************************************");
                    System.out.println("*         1. Explicación byte.        *");
                    System.out.println("*         2. Explicación short        *");
                    System.out.println("*         3. Explicación int          *");
                    System.out.println("*         4. Explicación long         *");
                    System.out.println("*         5. Explicación float        *");
                    System.out.println("*         6. Explicación double       *");
                    System.out.println("*         7. Explicación char         *");
                    System.out.println("*         8. Explicación boolean      *");
                    System.out.println("*         9. Volver al menú anterior  *");
                    System.out.println("*         0. Salir.                   *");
                    System.out.println("***************************************");
                    System.out.print("Digite su opción: ");
                    opcdp = scanner.nextInt();
                    switch (opcdp) {
                        case 1:
                            System.out.println("****************************************");
                            System.out.println("*                  BYTE                *");
                            System.out.println("* Representa un tipo de dato de 8 bits *");
                            System.out.println("* Puede almacenar valores numéricos en *");
                            System.out.println("* el rango de -128 a 127               *");
                            System.out.println("*                                      *");
                            System.out.println("*                EJEMPLO               *");
                            System.out.println("*         byte diasMes = 31;           *");
                            System.out.println("*                                      *");
                            System.out.println("*      1. Volver al menú anterior      *");
                            System.out.println("*      0. Salir.                       *");
                            System.out.println("****************************************");
                            System.out.print("Digite su opción: ");
                            opcad = scanner.nextInt();
                            switch (opcad) {
                                case 1:
                                    break;
                                case 0:
                                    cerrar = true;
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("****************************************");
                            System.out.println("*                SHORT                 *");
                            System.out.println("****************************************");
                            System.out.println("* Este tipo de dato nos permiten       *");
                            System.out.println("* rabajar con números enteros ya sean  *");
                            System.out.println("* positivos o negativos. Puede         *");
                            System.out.println("* almacenar  valores numéricos en el   *");
                            System.out.println("* rango –32,768 to 32,767              *");
                            System.out.println("*                                      *");
                            System.out.println("*                EJEMPLO               *");
                            System.out.println("*      short temperatura = -10         *");
                            System.out.println("*                                      *");
                            System.out.println("****************************************");
                            System.out.println("*         1. Volver al menú anterior   *");
                            System.out.println("*         0. Salir.                    *");
                            System.out.println("****************************************");
                            System.out.print("Digite su opción: ");
                            opcad = scanner.nextInt();
                            switch (opcad) {
                                case 1:
                                    break;
                                case 0:
                                    cerrar = true;
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("***************************************");
                            System.out.println("*                  INT                 *");
                            System.out.println("***************************************");
                            System.out.println("*Representa una cantidad finita de    *");
                            System.out.println("*números enteros, puede contener hasta *");
                            System.out.println("*tres cifras.                          *");
                            System.out.println("*                                     *");
                            System.out.println("*                EJEMPLO              *");
                            System.out.println("*             int edad=101            *");
                            System.out.println("*                                     *");
                            System.out.println("***************************************");
                            System.out.println("*         1. Volver al menú anterior  *");
                            System.out.println("*         0. Salir.                   *");
                            System.out.println("***************************************");
                            System.out.print("Digite su opción: ");
                            opcad = scanner.nextInt();
                            switch (opcad) {
                                case 1:
                                    break;
                                case 0:
                                    cerrar = true;
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 4:
                            System.out.println("*****************************************");
                            System.out.println("*                 LONG                  *");
                            System.out.println("*****************************************");
                            System.out.println("* Se utiliza cuando se necesitan números*");
                            System.out.println("* enteros muy grandes o cuando los      *");
                            System.out.println("* números tienen un valor decimal       *");
                            System.out.println("*                                       *");
                            System.out.println("*               EJEMPLO                 *");
                            System.out.println("*   Long velocidadLuz =  299792458,36   *");
                            System.out.println("*                                       *");
                            System.out.println("*         1. Volver al menú anterior    *");
                            System.out.println("*         0. Salir.                     *");
                            System.out.println("*****************************************");
                            System.out.print("Digite su opción: ");
                            opcad = scanner.nextInt();
                            switch (opcad) {
                                case 1:
                                    break;
                                case 0:
                                    cerrar = true;
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 5:
                            System.out.println("****************************************");
                            System.out.println("*                 FLOAT                *");
                            System.out.println("****************************************");
                            System.out.println("* Este tipo de dato nos permiten       *");
                            System.out.println("* trabajar con números los cuales      *");
                            System.out.println("* posean punto decimal ya sean         *");
                            System.out.println("* positivos o negativos.               *");
                            System.out.println("* utiliza 32 bits                      *");
                            System.out.println("*                                      *");
                            System.out.println("*               EJEMPLO                *");
                            System.out.println("*        float pi = 3.1415926535       *");
                            System.out.println("*                                      *");
                            System.out.println("****************************************");
                            System.out.println("*         1. Volver al menú anterior   *");
                            System.out.println("*         0. Salir.                    *");
                            System.out.println("****************************************");
                            System.out.print("Digite su opción: ");
                            opcad = scanner.nextInt();
                            switch (opcad) {
                                case 1:
                                    break;
                                case 0:
                                    cerrar = true;
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 6:
                            System.out.println("****************************************");
                            System.out.println("*                 DOUBLE               *");
                            System.out.println("****************************************");
                            System.out.println("* Almacena números en coma flotante    *");
                            System.out.println("* con doble precisión de 64 bits,      *");
                            System.out.println("* lo que proporciona una mayor         *");
                            System.out.println("* precisión que float.                 *");
                            System.out.println("*                                      *");
                            System.out.println("*              EJEMPLO                 *");
                            System.out.println("*  double e = 2.718281828459045235360; *");
                            System.out.println("*                                      *");
                            System.out.println("****************************************");
                            System.out.println("*         1. Volver al menú anterior   *");
                            System.out.println("*         0. Salir.                    *");
                            System.out.println("****************************************");
                            System.out.print("Digite su opción: ");
                            opcad = scanner.nextInt();
                            switch (opcad) {
                                case 1:
                                    break;
                                case 0:
                                    cerrar = true;
                                    break;
                                default:
                                    break;
                            }
                            break;

                        case 7:
                            System.out.println("*****************************************");
                            System.out.println("*                  CHAR                 *");
                            System.out.println("*****************************************");
                            System.out.println("* Este tipo de dato nos permite         *");
                            System.out.println("* trabajar con caracteres alfanuméricos *");
                            System.out.println("* almacena hasta 16 bits                *");
                            System.out.println("*                                       *");
                            System.out.println("*             EJEMPLO                   *");
                            System.out.println("*         char letraA = 'a';            *");
                            System.out.println("*      char letraANumerico = 61;        *");
                            System.out.println("*                                       *");
                            System.out.println("*****************************************");
                            System.out.println("*         1. Volver al menú anterior    *");
                            System.out.println("*         0. Salir.                     *");
                            System.out.println("*****************************************");
                            System.out.print("Digite su opción: ");
                            opcad = scanner.nextInt();
                            switch (opcad) {
                                case 1:
                                    break;
                                case 0:
                                    cerrar = true;
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 8:
                            System.out.println("****************************************");
                            System.out.println("*                BOOLEAN               *");
                            System.out.println("****************************************");
                            System.out.println("* Este tipo de datos nos permitirá     *");
                            System.out.println("* trabajar con valores lógicos,        *");
                            System.out.println("* verdadero o falso.                   *");
                            System.out.println("*                                      *");
                            System.out.println("*               EJEMPLO                *");
                            System.out.println("*       boolean verdadero = true;      *");
                            System.out.println("*       boolean falso = false;         *");
                            System.out.println("*                                      *");
                            System.out.println("****************************************");
                            System.out.println("*         1. Volver al menú anterior   *");
                            System.out.println("*         0. Salir.                    *");
                            System.out.println("****************************************");
                            System.out.print("Digite su opción: ");
                            opcad = scanner.nextInt();
                            switch (opcad) {
                                case 1:
                                    break;
                                case 0:
                                    cerrar = true;
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 9:

                            break;
                        case 0:
                            cerrar = true;
                            break;
                    }

                case 2:
                    System.out.println("String");
                    break;
                case 3:
                    System.out.println("Constantes");
                    break;
                case 4:
                    System.out.println("Tipos de Operadores");
                    break;
                case 5:
                    System.out.println("Condicional IF ELSE");
                    break;
                case 6:
                    System.out.println("Condicional SWITCH");
                    break;
                case 7:
                    System.out.println("Condicional TERNARIA");
                    break;
                case 8:
                    System.out.println("Bucle DO WHILE");
                    break;
                case 9:
                    System.out.println("Bucle WHILE");
                    break;
                case 10:
                    System.out.println("Bucle FOR");
                    break;
                case 0:
                    cerrar = true;
                    break;
                default:
                    break;
            }
        } while (!cerrar);
    }
}