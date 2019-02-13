/*
    Aufgabe2) Eingabe (Scanner)

    Erweitern Sie die main-Methode so, dass wiederholt Werte eingelesen werden,
    bis die Zahl 0 eingegeben wird. Dann wird das Programm beendet. Zuvor wird
    noch der Durchschnittswert aller eingelesenen Zahlen als ganzzahliger Wert
    ausgegeben (Nachkommastellen gehen verloren),  falls alle eingelesenen Werte
    ganze Zahlen waren. In allen anderen Fällen wird nichts ausgegeben.

    Zusatzfragen:
    1. Warum muss eine ungültige Eingabe (keine ganze Zahl) aus dem
    Input-Stream entfernt werden?
    2. Woran kann man erkennen, dass ein eingelesener Wert eine ganze Zahl ist?
    3. Woran kann man feststellen, ob eine frühere Eingabe ungültig war?
*/
import java.util.Scanner;
public class Aufgabe2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int nummer=1;

        while (nummer!=0 && scanner.hasNext() ) {

            if (scanner.hasNextInt()) {          //2.
                nummer = scanner.nextInt();

                if (nummer != 0) {
                    sum += nummer;
                    count++;
                }
                }
                    else {
                    scanner.next();            //3.
                }
            }
            if (count != 0)
                System.out.println(sum / count);
        }
    }

/*
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int nummer;
        while (s.hasNext() ) {
            if (s.hasNextInt()) {
                nummer = s.nextInt();
                if (nummer != 0) {
                    sum += nummer;
                    count++;
                }
                else if (nummer==0) {
                    break;
            }
            }
        }
        if (count!=0)
        System.out.println(sum / count);
    }
}
*/











