public class Triangulo implements Figura {

    private Punto p1;
    private Punto p2;
    private Punto p3;

    public Triangulo(
            Punto p1,
            Punto p2,
            Punto p3
    ) {

        double area = calcularArea(
                p1,
                p2,
                p3
        );

        if (area <= 0) {
            throw new IllegalArgumentException(
                    "Los puntos deben formar un triangulo valido"
            );
        }

        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    private double calcularArea(
            Punto a,
            Punto b,
            Punto c
    ) {

        return Math.abs(
                (
                        a.getX() * (b.getY() - c.getY())
                                + b.getX() * (c.getY() - a.getY())
                                + c.getX() * (a.getY() - b.getY())
                ) / 2
        );
    }

    @Override
    public String getTipo() {
        return "Triangulo";
    }

    @Override
    public double area() {
        return calcularArea(
                p1,
                p2,
                p3
        );
    }

    @Override
    public double perimetro() {

        return p1.distancia(p2)
                + p2.distancia(p3)
                + p3.distancia(p1);
    }

    @Override
    public double dimensionar() {
        return perimetro();
    }

    @Override
    public void desplazar(
            double dx,
            double dy
    ) {

        p1.desplazar(dx, dy);
        p2.desplazar(dx, dy);
        p3.desplazar(dx, dy);
    }

    @Override
    public void escalar(double factor) {

        if (factor <= 0) {
            throw new IllegalArgumentException(
                    "El factor debe ser mayor que 0"
            );
        }

        p1.escalar(factor);
        p2.escalar(factor);
        p3.escalar(factor);
    }

    @Override
    public String dimensiones() {

        return "P1: " + p1
                + ", P2: " + p2
                + ", P3: " + p3;
    }
}