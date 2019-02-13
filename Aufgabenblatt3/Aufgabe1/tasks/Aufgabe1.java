/*******************************************************************************

 AUFGABENBLATT 3 - Allgemeine Informationen

 Achten Sie bei der Implementierung auf folgende Punkte:

 - Ihr Programm sollte den dazugehörenden Test (z.B. enthält Aufgabe1Test den
 Test zu Aufgabe1) bestehen.

 - Bei jeder Aufgabe finden Sie Zusatzfragen. Diese Zusatzfragen beziehen sich
 thematisch auf das erstellte Programm.  Sie müssen diese Zusatzfragen in der
 Übung beantworten können.

 - Verwenden Sie bei allen Ausgaben immer System.out.println().

 - Verwenden Sie für die Lösung der Aufgaben keine speziellen Aufrufe aus der
 Java-API, die die Aufgaben verkürzen würden.

 Abgabe: Die Abgabe erfolgt in TUWEL. Bitte laden Sie Ihr IntelliJ-Projekt
 bis spätestens Montag 07.11.2016 08:00 Uhr in TUWEL hoch. Zusätzlich
 müssen Sie in TUWEL ankreuzen welche Aufgaben Sie gelöst haben und während
 der Übung präsentieren können.

 ******************************************************************************/

/*
    Aufgabe 1) Schleifenanalyse

    Erweitern Sie die Klasse 'Aufgabe1' um eine statische Methode namens
    "drawNumDiamond(int h)", die einen Diamanten (Raute) mit Zahlen ausgibt.
    Der übergebene Parameter "h" entspricht der Höhe des Diamanten (Raute).
    Ein h=9 führt zu folgender Ausgabe:

        1
       222
      33333
     4444444
    555555555
     4444444
      33333
       222
        1

    Wird eine gerade Zahl dem Parameter "h" übergeben so wird "NO VALID INPUT"
    ausgegeben. Bei h=0 wird nichts ausgegeben und die Methode sofort verlassen.
    Der Rückgabetyp der Methode ist "void".
    Es sollen für die Implmentierung der Methdoe nicht mehr als 3 for-Schleifen
    (keine while- oder do/while-Schleife) verwendet werden. Überlegen
    Sie wie man eventuell weitere for-Schleifen einsparen könnte.
    (Die Methode soll für h <= 17 funktionieren.)

    Zusatzfragen:
    1. Wie ist die Vorgangsweise abzuändern, wenn statt jedem Wert 1 der
    Buchstabe A, statt jedem Wert 2 der Buchstabe B, ... und statt jedem Wert 5
    der Buchstabe E ausgegeben werden soll ?

*/
public class Aufgabe1 {

    public static void main(String[] args) {

        drawNumDiamond(9);
    }

    public static void drawNumDiamond (int h) {
        int middleE = h / 2 + 1;
        int ispisiBroj = 1;

        if (h % 2 == 0 && h != 0) {
            System.out.println("NO VALID INPUT");
            System.exit(0);
        } else if (h == 0) {
            System.exit(0);
        }

        for (int i = 1; i <= h ; i++) {
            for (int j = 1; j <= h ; j++) {
                if(((middleE-ispisiBroj)<j && (j<middleE+ispisiBroj))) {
                    System.out.print(ispisiBroj);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

            if(i<middleE) {
                ispisiBroj++;
            }else
            {
                ispisiBroj--;
            }
        }

    }
}














/*
public static void drawNumDiamond (int h) {
    int middleE=h/2+1;
    int ispisiBroj=0;

    if (h%2==0 && h!=0){
        System.out.println("NO VALID INPUT");
        System.exit(0);
    }
    else if (h==0) {
        System.exit(0);
    }

    for (int i=1;i<=middleE;i++) {
        ispisiBroj++;

        for (int j=1; j<=h;j++) {
            if (j<middleE+i && j>middleE-i) {
                System.out.print(ispisiBroj);

            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    for (int i=middleE-1;i>0;i--) {
        ispisiBroj--;
        for (int j=1;j<=h;j++) {
            if (j<i+middleE && j>middleE-i) {
                System.out.print(ispisiBroj);
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}
 */

    /*
    private static void drawNumDiamond(int h) {
            int brojkolona=1;
        int upisibroj=0;
        int brojPraznihMjesta=4;
        for (int i = 1; i <= h; i++) { // outsideLoop

                if (i<5) {
                    upisibroj++;
                }
            else {
                    upisibroj=10-i;
                }


            for (int j = 1; j <= brojkolona; j++) {
                System.out.print(upisibroj);

            }
            System.out.println();

        if (i<5) {
            brojkolona++;
        } else {
            brojkolona--;
        }

        }

    }
}
*/




