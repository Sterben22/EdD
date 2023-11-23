import java.util.Scanner;

class Nodo {
    int dato;
    Nodo izquierda, derecha;

    public Nodo(int valor) {
        dato = valor;
        izquierda = derecha = null;
    }
}

public class ArbolBinario {
    static Scanner in = new Scanner(System.in);
    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Método para insertar un nuevo nodo en el árbol
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo raiz, int valor) {
        // Si el árbol está vacío, se crea un nuevo nodo
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        // De lo contrario, se recorre el árbol
        if (valor < raiz.dato) {
            raiz.izquierda = insertarRec(raiz.izquierda, valor);
        } else if (valor > raiz.dato) {
            raiz.derecha = insertarRec(raiz.derecha, valor);
        }

        return raiz;
    }

    // Método para realizar un recorrido en orden (in-order) del árbol
    public void imprimirEnOrden() {
        imprimirEnOrdenRec(raiz);
    }

    private void imprimirEnOrdenRec(Nodo raiz) {
        if (raiz != null) {

            imprimirEnOrdenRec(raiz.izquierda);

            imprimirEnOrdenRec(raiz.derecha);
            System.out.print(raiz.dato + " ");
        }
    }

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        System.out.println("Cuantos elementos agregara al arbol:");
        int n = in.nextInt();
        in.nextLine();
        for(int i=0; i<n;i++){
            System.out.println("Ingrese el valor del nodo: ");
            arbol.insertar(in.nextInt());
            in.nextLine();

        }

        // Imprimir el árbol en orden
        System.out.println("Recorrido en orden del árbol:");
        arbol.imprimirEnOrden();
    }
}
