// Definición de la interfaz FiguraGeometrica
interface FiguraGeometrica {
    double calcularArea();
}

// Clase que representa un círculo
class Circulo implements FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

// Clase que representa un rectángulo
class Rectangulo implements FiguraGeometrica {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return largo * ancho;
    }
}

public class Inter {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);

        System.out.printf("Área del circulo: %.2f \n", circulo.calcularArea());
        System.out.printf("Área del rectángulo: %.2f ", rectangulo.calcularArea());
    }
}
