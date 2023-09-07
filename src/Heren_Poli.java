class Vehiculo {
    String marca, modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
}

class Automovil extends Vehiculo {
    String combustible;

    public Automovil(String marca, String modelo, String combustible) {
        super(marca, modelo);
        this.combustible = combustible;
    }
}

class Motocicleta extends Vehiculo {
    int llantas;

    public Motocicleta(String marca, String modelo, int llantas) {
        super(marca, modelo);
        this.llantas = llantas;
    }
}

public class Heren_Poli {
    public static void main(String[] args) {
        Automovil auto = new Automovil("Toyota", "Corolla", "Gasolina");
        Motocicleta moto = new Motocicleta("Honda", "CBR", 2);

        System.out.println("Automóvil:");
        System.out.println("Marca: " + auto.marca);
        System.out.println("Modelo: " + auto.modelo);
        System.out.println("Combustible: " + auto.combustible);

        System.out.println("\nMotocicleta:");
        System.out.println("Marca: " + moto.marca);
        System.out.println("Modelo: " + moto.modelo);
        System.out.println("Número de llantas: " + moto.llantas);
    }
}
