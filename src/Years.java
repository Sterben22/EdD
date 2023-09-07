import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Years {
    public static void main(String[] args) {
        Date d = new Date();
        Calendar c = new GregorianCalendar();
        c.setTime(d);
        int dia, mes, annio;
        dia = c.get(Calendar.DATE);
        mes = c.get(Calendar.MONTH);
        annio = c.get(Calendar.YEAR);

        int day, month, year, annios;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el fecha de su nacimiento (dd mm yy): ");
        day = scan.nextInt();
        month = scan.nextInt();
        year = scan.nextInt();

        annios = annio - year;
        if (mes < month){
            annios --;
        } else if (dia < day && mes==month) {
            annios--;
        }
        System.out.println("La edad es " + annios);

    }
}