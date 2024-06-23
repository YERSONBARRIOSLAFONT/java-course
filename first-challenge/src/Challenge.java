import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        String nombre = "John Smith";
        String tipoDeCuenta = "Corriente";
        double saldo = 2879.99;
        int opcion = 0;

        System.out.println("**********************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: " + "$ " + saldo);
        System.out.println("\n**********************");

        String menu = """
                *** Escriba el número de la opcion deseada ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es: "+ "$ " + saldo);
                    break;
                case 2:
                    System.out.println("¿Cuál es el valor que desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if(saldo < valorARetirar) {
                        System.out.println("Saldo insuficiente");
                    } else  {
                        saldo = saldo - valorARetirar;
                        System.out.println("El saldo actualizado es: "+ "$ " + saldo);
                    }
                    break;

                case 3:
                    System.out.println("¿Cuál es el valor que desea depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El saldo actualizado es: "+ "$ " + saldo);
                    break;

                case 9:
                    System.out.println("Saliendo del programa, gracias por usar nuestros servicios!");
                    break;
                default:
                    System.out.println("Opcion no valida, digita una opcion valida");
            }
        }
    }
}




