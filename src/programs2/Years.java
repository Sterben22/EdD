package programs2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
// 1

public class Years {
    public static void main(String[] args) {
        // Obtener la fecha actual

        // Creamos un objeto "Date" que representa la fecha y hora actuales.
        Date currentDate = new Date();
        // Creamos un objeto "Calendar" para manipular la fecha y hora.
        Calendar currentCalendar = new GregorianCalendar();
        currentCalendar.setTime(currentDate); // Configuramos el objeto "Calendar" con la fecha actual.

        // Obtenemos el año actual del objeto "Calendar" y lo almacenamos en la variable "currentYear".
        int currentYear = currentCalendar.get(Calendar.YEAR);


        // Pedir la fecha de nacimiento al usuario
        int day, month, year;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese su fecha de nacimiento (dd mm yyyy): ");
        day = scan.nextInt();     // Día de nacimiento
        month = scan.nextInt();   // Mes de nacimiento
        year = scan.nextInt();    // Año de nacimiento

        // Calcular la edad llamando a la función calculateAge
        int age = calculateAge(currentYear, currentCalendar.get(Calendar.MONTH) + 1, currentCalendar.get(Calendar.DAY_OF_MONTH), year, month, day);

        // Mostrar la edad
        System.out.println("La edad es " + age);
    }

    /**
     * Función para calcular la edad
     *
     * @param currentYear Año actual
     * @param currentMonth  Mes actual (Recordar que java cuanta desde 0; es decir enero es 0)
     * @param currentDay Dia actual
     * @param birthYear Año de nacimiento
     * @param birthMonth Mes de nacimiento
     * @param birthDay Día de nacimiento
     * */
    public static int calculateAge(int currentYear, int currentMonth, int currentDay, int birthYear, int birthMonth, int birthDay) {
        int age = currentYear - birthYear;

        // Comprobar si aún no ha cumplido años en el año actual
        /*
        * Si Mes_Actual es menor que Mes_Nacimiento
        * O
        * Mes_Actual es igual Mes_Nacimiento y Dia_Actual es menor que Dia_Nacimiento
        *
        * Restar un año a la edad
        * */
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }

        return age;  // Devolver la edad calculada
    }
}
