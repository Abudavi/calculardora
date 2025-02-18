import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        boolean estado_menu = true;
        double valor1 = 0, valor2 = 0;
        int opcion_menu = 0;
        String titulo = "Calculadora en java";
        String ingresar_primer_valor = "Ingrese el primer valor";
        String ingresar_segundo_valor = "Ingrese el segundo valor";
        String resultadoString = "El resultado de la operacion es igual a : ";
        while (estado_menu) {
            System.out.println();
            System.out.println(titulo);
            System.out.println("Menu:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Dividir");
            System.out.println("4. Multiplicar");
            System.out.println("5. Salir");
            System.out.println();
            opcion_menu = scanner.nextInt();
            scanner = new Scanner(System.in);
            switch (opcion_menu) {
                case 1 -> {
                    System.out.println("Sumar");
                    System.out.println(ingresar_primer_valor);
                    valor1 = scanner.nextDouble();
                    System.out.println(ingresar_segundo_valor);
                    valor2 = scanner.nextDouble();
                    System.out.println(resultadoString + calculadora.sumar(valor1, valor2));
                }
                case 2 -> {
                    System.out.println("Restar");
                    System.out.println(ingresar_primer_valor);
                    valor1 = scanner.nextDouble();
                    System.out.println(ingresar_segundo_valor);
                    valor2 = scanner.nextDouble();
                    System.out.println(resultadoString + calculadora.restar(valor1, valor2));
                }
                case 3 -> {
                    System.out.println("Dividir");
                    System.out.println(ingresar_primer_valor);
                    valor1 = scanner.nextDouble();
                    System.out.println(ingresar_segundo_valor);
                    valor2 = scanner.nextDouble();
                    System.out.println(resultadoString + calculadora.dividir(valor1, valor2));
                }
                case 4 -> {
                    System.out.println("Multiplicar");
                    System.out.println(ingresar_primer_valor);
                    valor1 = scanner.nextDouble();
                    System.out.println(ingresar_segundo_valor);
                    valor2 = scanner.nextDouble();
                    System.out.println(resultadoString + calculadora.multiplicar(valor1, valor2));
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
