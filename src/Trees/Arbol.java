package Trees;

import java.util.Scanner;

class NodeBiologico {
    private String name;
    private NodeBiologico[] children;

    public NodeBiologico( String name){
        this.name = name;
        this.children = new NodeBiologico[0];
    }
    public void setChildren(NodeBiologico[] children) {
        this.children = children;
    }

    public String getName() {
        return name;
    }
    public NodeBiologico[] getChildren() {
        return children;
    }


    public String[] getChildrenNames() {
        if (this.children != null && this.children.length > 0) {
            String[] childNames = new String[children.length];
            for (int i = 0; i < children.length; i++) {
                childNames[i] = children[i].getName();
            }
            return childNames;
        } else {
            return new String[]{"No tiene hijos"};
        }
    }


}


public class Arbol {
    static Scanner in = new Scanner(System.in);

    // Nuevo método para obtener un nodo hijo por nombre
    private static NodeBiologico getChildNodeByName(NodeBiologico parent, String childName) {
        for (NodeBiologico child : parent.getChildren()) {
            if (child.getName().equals(childName)) {
                return child;
            }
        }
        return null;
    }

    // Nuevo método para imprimir los nombres de los descendientes recursivamente
    private static void printDescendants(NodeBiologico node, int level) {
        String[] childNames = node.getChildrenNames();
        for (String childName : childNames) {
            // Agrega espacios para indentar según el nivel en la jerarquía
            System.out.println("--".repeat(level)+">"+ childName);

            // Llama recursivamente para imprimir los nietos
            NodeBiologico childNode = getChildNodeByName(node, childName);
            if (childNode != null) {
                printDescendants(childNode, level + 1);
            }
        }
    }

    public static void addChildren(NodeBiologico root){
       System.out.printf("Cuantos hijos tiene %s:\n", root.getName());
       int t = in.nextInt();
       in.nextLine();
       if(t>0){
           NodeBiologico[] family = new NodeBiologico[t];
           for(int i=0; i<t; i++){
               System.out.printf("Nombre del hijo %d de %s: \n", i+1, root.getName());
               String name = in.nextLine();
               NodeBiologico child = new NodeBiologico(name);
               addChildren(child);
               family[i] = child;
           }
           root.setChildren(family);
       }
   }

    public static void main(String[] args){
        System.out.println("Ingrese el nombre del nodo raíz:");
        String name = in.nextLine();
        NodeBiologico familia = new NodeBiologico(name);
        addChildren(familia);

        // Imprime los nombres de los hijos y nietos
        System.out.printf("Nombres de los hijos y nietos de %s:\n",familia.getName());
        printDescendants(familia, 0);

        System.out.println("Exitoso");
    }

}
