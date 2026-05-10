import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=========== SISTEMA DE DRONES ===========");
        System.out.println("1. Dron Liviano");
        System.out.println("2. Dron Carga");
        System.out.println("3. Dron Emergencia");

        System.out.print("Seleccione opcion: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        Dron dron = null;

        if (opcion == 1) {
            dron = new DronLiviano();
        } else if (opcion == 2) {
            dron = new DronCarga();
        } else if (opcion == 3) {
            dron = new DronEmergencia();
        } else {
            System.out.println("Opcion invalida");
            return;
        }
        System.out.print("Ingrese codigo: ");
        dron.setCodigo(sc.nextLine());

        System.out.print("Ingrese modelo: ");
        dron.setModelo(sc.nextLine());

        System.out.print("Ingrese distancia (km): ");
        dron.setDistanciaKm(sc.nextDouble());

        System.out.print("Ingrese peso (kg): ");
        dron.setPesoPaquete(sc.nextDouble());

        System.out.print("Ingrese horas de vuelo: ");
        dron.setHorasVuelo(sc.nextDouble());
        System.out.println("\nValidando datos...");

        if (dron.validarDatos()) {

            System.out.println("Datos correctos");

            System.out.println("\nCalculando costo...\n");

            dron.mostrar();
            System.out.println("\n-- Cambio de peso con setter --");

            double costoInicial = dron.calcularCostoEntrega();

            dron.setPesoPaquete(dron.getPesoPaquete() + 2);

            double nuevoCosto = dron.calcularCostoEntrega();
            System.out.println("Costo inicial -> $" + costoInicial);
            System.out.println("Nuevo costo -> $" + nuevoCosto);

        } else {
            System.out.println("Datos incorrectos");
        }
        sc.close();
    }
}