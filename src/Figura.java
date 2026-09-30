public interface Figura {

    String getTipo();

    double area();

    double perimetro();

    double dimensionar();

    void desplazar(double dx, double dy);

    void escalar(double factor);

    String dimensiones();
}