package programs;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class DoublyLinkedList {
    public static void ListaDoblementeEnlazadaNumeros(){
        // Creamos una lista doblemente enlazada para almacenar números enteros.
        List<Integer> numeros = new LinkedList<>();

        // Agregamos números a la lista.
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);

        System.out.println("Números en la lista:");

        // Utilizamos un iterador para recorrer la lista y mostrar los números.
        ListIterator<Integer> iterador = numeros.listIterator();
        while (iterador.hasNext()) {
            int numero = iterador.next();
            System.out.println(numero);
        }
    }
}
