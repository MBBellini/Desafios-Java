import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Desafio {
    public static void main(String[] args) {
String nombre = "Rocket Raccoon";
        String tipoDeCuenta = "Corriente";
        double saldo = 2500.90;
        int opcion = 0;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("********************************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es : " + tipoDeCuenta);
        System.out.println("Su saldo disponible es : $ " + saldo );
        System.out.println("********************************************************");

     String menu = """
              *** Escriba el numero de la opcion deseada ***
            1 - Consultar saldo
            2 - Retirar
            3 - Depositar
            6 - Salir
            """;

            Scanner teclado = new Scanner(System.in);
            while (opcion != 6){
                    System.out.println(menu);
                    opcion = teclado.nextInt();

                    switch (opcion){
                            case 1 :
                                    System.out.println("El saldo actual es : $ " + saldo);
                                    break;
                            case 2:
                                    System.out.println("¿Cuál es el valor que desaa retitar?");
                                    double valorARetirar = teclado.nextDouble();
                                    if (valorARetirar > saldo){
                                            System.out.println("Saldo insuficiente");
                                    } else{
                                            saldo = saldo - valorARetirar;
                                            System.out.println("El saldo actualizado es de : $ " + saldo);
                                    }
                                    break;
                            case 3:
                                    System.out.println("¿Cuál es el monto que desea depositar?");
                                    double valorADepositar = teclado.nextDouble();
                                    saldo = saldo + valorADepositar;
                                    System.out.println("Su saldo actualizado es de : $" + saldo);
                                    break;
                            case 6:
                                    System.out.println("Saliendo del programa, gracias por confiar en nosotros");
                                    break;
                            default:
                                    System.out.println("Opción no válida");
                    }

     }

    }
}