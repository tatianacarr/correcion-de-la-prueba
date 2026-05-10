public class DronCarga extends Dron {
    private double costoPorKg;
    public DronCarga() {
        codigo = "DC-000";
        modelo = "Carga-Z";
        distanciaKm = 5;
        pesoPaquete = 2;
        horasVuelo = 2;
        costoBase = 6.0;
        costoPorKg = 1.5;
    }
    @Override
    public double calcularCostoEntrega() {
        return costoBase + (distanciaKm * 0.4) + (pesoPaquete * costoPorKg);
    }
    @Override
    public boolean validarDatos() {
        if (pesoPaquete > 30) {
            System.out.println("Peso excede limite del dron carga");
            return false;
        }
        return true;
    }
    @Override
    public void mostrar() {
        System.out.println("====== DRON CARGA ======");
        super.mostrar();
    }
}