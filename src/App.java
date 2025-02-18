import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);// scanner para ingresar datos
        boolean estado_menu = true; // estado del menu para saber cuando para el ciclo while
        double valor1 = 0, valor2 = 0;// valores para manejar los datos de la calculadora
        int opcion_menu = 0;// variable para manejar las opciones del menu
        String titulo = "Calculadora en java";
        String ingresar_primer_valor = "Ingrese el primer valor";
        String ingresar_segundo_valor = "Ingrese el segundo valor";
        String resultadoString = "El resultado de la operacion es igual a : ";
        String dato_debe_ser_numerico = "El valor debe ser numerico"; // texto que se repite
        while (estado_menu) {// menu
            System.out.println();
            System.out.println(titulo);
            System.out.println("Menu:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Dividir");
            System.out.println("4. Multiplicar");
            System.out.println("5. Salir");
            System.out.println();
            try {// excepciones para que de error que el usuario puedad leer
                opcion_menu = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Valor ingresado no valido debe ser un numero");
                scanner = new Scanner(System.in);// reseteo del scanner
            }

            scanner = new Scanner(System.in);
            switch (opcion_menu) {// opciones del menu
                case 1 -> {
                    try {// try catch para manejar error en caso que el valor ingresado no sea numero
                        System.out.println("Sumar");
                        System.out.println(ingresar_primer_valor);
                        valor1 = scanner.nextDouble();// se ingresan los valores
                        System.out.println(ingresar_segundo_valor);
                        valor2 = scanner.nextDouble();
                        System.out.println(resultadoString + calculadora.sumar(valor1, valor2));// se llama la clase
                                                                                                // calculadora con el
                                                                                                // metodo elegido
                    } catch (Exception e) {
                        System.out.println(dato_debe_ser_numerico);
                    }

                }
                case 2 -> {
                    try {// try catch para manejar error en caso que el valor ingresado no sea numero
                        System.out.println("Restar");
                        System.out.println(ingresar_primer_valor);
                        valor1 = scanner.nextDouble();
                        System.out.println(ingresar_segundo_valor);
                        valor2 = scanner.nextDouble();
                        System.out.println(resultadoString + calculadora.restar(valor1, valor2));// se llama la clase
                                                                                                 // calculadora con el
                                                                                                 // metodo elegido
                    } catch (Exception e) {
                        System.out.println(dato_debe_ser_numerico);
                    }
                }
                case 3 -> {
                    try {// try catch para manejar error en caso que el valor ingresado no sea numero
                        System.out.println("Dividir");
                        System.out.println(ingresar_primer_valor);
                        valor1 = scanner.nextDouble();
                        System.out.println(ingresar_segundo_valor);
                        valor2 = scanner.nextDouble();
                        System.out.println(resultadoString + calculadora.dividir(valor1, valor2));// se llama la clase
                                                                                                  // calculadora con el
                                                                                                  // metodo elegido
                    } catch (Exception e) {
                        System.out.println(dato_debe_ser_numerico);
                    }

                }
                case 4 -> {
                    try {// try catch para manejar error en caso que el valor ingresado no sea numero
                        System.out.println("Multiplicar");
                        System.out.println(ingresar_primer_valor);
                        valor1 = scanner.nextDouble();
                        System.out.println(ingresar_segundo_valor);
                        valor2 = scanner.nextDouble();
                        System.out.println(resultadoString + calculadora.multiplicar(valor1, valor2));// se llama la
                                                                                                      // clase
                                                                                                      // calculadora con
                                                                                                      // el metodo
                                                                                                      // elegido

                    } catch (Exception e) {
                        System.out.println(dato_debe_ser_numerico);
                    }

                }
                case 5 -> {
                    System.out.println("Saliendo de la calculadora");
                    estado_menu = false;
                }
                default -> {
                    System.out.println("Opcion ingresada no valida debes de elegir una opcion del 1 al 5");
                }
            }

        }

    }
}
