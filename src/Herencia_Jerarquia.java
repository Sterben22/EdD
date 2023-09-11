class Animal {
    private String nombre;
    private int edad;
    private String tipoAlimentacion;

    public Animal(String nombre, int edad, String tipoAlimentacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAlimentacion = tipoAlimentacion;
    }
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }

    public void comer() {
        System.out.println("El animal come.");
    }

    public void dormir() {
        System.out.println("El animal duerme.");
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Tipo de alimentación: " + tipoAlimentacion);
    }
}

class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String tipoAlimentacion, String raza) {
        super(nombre, edad, tipoAlimentacion);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }

    public void jugar() {
        System.out.println("El perro juega con una pelota.");
    }

    public void mostrarRaza() {
        System.out.println("Raza del perro: " + raza);
    }
}

class Gato extends Animal {
    private String colorPelaje;
    public Gato(String nombre, int edad, String tipoAlimentacion, String colorPelaje) {
        super(nombre, edad, tipoAlimentacion);
        this.colorPelaje = colorPelaje;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla.");
    }

    public void cazar() {
        System.out.println("El gato sale a cazar ratones.");
    }

    public void mostrarColorPelaje() {
        System.out.println("Color del pelaje del gato: " + colorPelaje);
    }
}
public class Herencia_Jerarquia {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Rex", 3, "Carnívoro", "Labrador");
        Gato miGato = new Gato("Mittens", 2, "Carnívoro", "Gris");

        System.out.println("Información del perro:");
        miPerro.mostrarInformacion();
        miPerro.mostrarRaza();
        miPerro.hacerSonido();
        miPerro.comer();
        miPerro.jugar();
        miPerro.dormir();

        System.out.println("\nInformación del gato:");
        miGato.mostrarInformacion();
        miGato.mostrarColorPelaje();
        miGato.hacerSonido();
        miGato.comer();
        miGato.cazar();
        miGato.dormir();
    }
}
