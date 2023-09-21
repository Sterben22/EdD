package Tarea_Class;

import java.util.Scanner;
class Person {
    String name, age, profession;

    public Person(String name, String age, String profession){
        this.name = name;
        this.age = age;
        this.profession = profession;
    }
}

public class Class_Object {
    public static void print_line(Person person){
        System.out.println("###########");
        System.out.printf("Nombre: %s \n Edad: %s \n Profesion: %s \n", person.name,person.age, person.profession);
        System.out.println("###########");
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name,profession, age;
        System.out.println("Cuantas personas ingresara: ");
        int n = scan.nextInt();
        scan.nextLine();
        Person[] list_Person = new Person[n];

        for(int i=0; i<n; i++){
            System.out.printf("Ingrese el nombre de la Persona %d: ", i+1);
            name = scan.nextLine();
            System.out.printf("Ingrese la edad de la Persona %d: ", i+1);
            age = scan.nextLine();
            System.out.printf("Ingrese la profesion de la Persona %d: ", i+1);
            profession = scan.nextLine();

            list_Person[i] = new Person(name,age,profession);
        }
        for(int i=0; i<n; i++){
            print_line(list_Person[i]);
        }
    }
}
