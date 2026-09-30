public class Main {

    public static void main(String[] args) {

        Circulo circulo =
                new Circulo(
                        new Punto(0, 0),
                        5
                );

        Triangulo triangulo =
                new Triangulo(
                        new Punto(0, 0),
                        new Punto(4, 0),
                        new Punto(0, 3)
                );

        mostrar(circulo);
        mostrar(triangulo);
    }

    public static void mostrar(Figura figura) {

        System.out.println(
                "------------------------"
        );

        System.out.println(
                "Tipo: " + figura.getTipo()
        );

        System.out.println(
                "Dimensiones: "
                        + figura.dimensiones()
        );

        System.out.println(
                "Area: "
                        + figura.area()
        );

        System.out.println(
                "Perimetro: "
                        + figura.perimetro()
        );

        System.out.println(
                "Dimensionar: "
                        + figura.dimensionar()
        );
    }
}