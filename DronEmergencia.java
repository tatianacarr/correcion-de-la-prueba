public class DronEmergencia extends Dron {
    private double recargoUrgencia;
    public DronEmergencia() {
        codigo = "DE-000";
        modelo = "Emergency-Pro";
        distanciaKm = 5;
        pesoPaquete = 2;
        horasVuelo = 1;
        costoBase = 8.0;
        recargoUrgencia = 5.0;
    }
    @Override
    public double calcularCostoEntrega() {
        return costoBase + (distanciaKm * 0.7) + recargoUrgencia;
    }
    @Override
    public boolean validarDatos() {
        if (pesoPaquete > 10) {
            System.out.println("Peso excede limite del dron emergencia");
            return false;
        }
        if (horasVuelo > 3) {
            System.out.println("Maximo 3 horas");
            return false;
        }
        return true;
    }

    @Override
    public void mostrar() {
        System.out.println("====== DRON EMERGENCIA ======");
        super.mostrar();
    }
}