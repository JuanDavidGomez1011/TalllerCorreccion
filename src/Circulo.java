public class Circulo implements Figura {

    private Punto centro;
    private double radio;

    public Circulo(Punto centro, double radio) {

        if (radio <= 0) {
            throw new IllegalArgumentException(
                    "El radio debe ser mayor que 0"
            );
        }

        this.centro = centro;
        this.radio = radio;
    }

    @Override
    public String getTipo() {
        return "Circulo";
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double dimensionar() {
        return area();
    }

    @Override
    public void desplazar(double dx, double dy) {
        centro.desplazar(dx, dy);
    }

    @Override
    public void escalar(double factor) {

        if (factor <= 0) {
            throw new IllegalArgumentException(
                    "El factor debe ser mayor que 0"
            );
        }

        centro.escalar(factor);
        radio = radio * factor;
    }

    @Override
    public String dimensiones() {
        return "Centro: " + centro
                + ", Radio: " + radio;
    }
}