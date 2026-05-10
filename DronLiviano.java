public class DronLiviano extends Dron {
    private double limiteHoras;
    public DronLiviano() {
        codigo = "DL-000";
        modelo = "Liviano-X";
        distanciaKm = 5;
        pesoPaquete = 2;
        horasVuelo = 2;
        costoBase = 3.0;
        limiteHoras = 2;
    }

    @Override
    public double calcularCostoEntrega() {
        return costoBase + (distanciaKm * 0.5) + (pesoPaquete * 0.8);
    }
    @Override
    public boolean validarDatos() {
        if (pesoPaquete > 5) {
            System.out.println("Peso excede limite del dron liviano");
            return false;
        }
        if (horasVuelo > limiteHoras) {
            System.out.println("Horas excedidas");
            return false;
        }

        return true;
    }
    @Override
    public void mostrar() {
        System.out.println("====== DRON LIVIANO ======");
        super.mostrar();
    }
}