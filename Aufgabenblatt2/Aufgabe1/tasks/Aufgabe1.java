/*******************************************************************************

 AUFGABENBLATT 2 - Allgemeine Informationen

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
 bis spätestens Montag 24.10.2016 08:00 Uhr in TUWEL hoch. Zusätzlich
 müssen Sie in TUWEL ankreuzen welche Aufgaben Sie gelöst haben und während
 der Übung präsentieren können.

 ******************************************************************************/

/*
    Aufgabe1) Typen und Typumwandlungen

    Erweitern Sie die main-Methode um folgende Funktionalität:
    - Deklarieren und initialisieren Sie je eine lokale Variable mit den Werten
          'F', 0xf, 070, 70L, 77e-1f, 7.7f, 7.77e1, 77.7
      und sorgen Sie dafür, dass die Variablen dieselben Typen haben wie diese
      Literale.
    - Erzeugen Sie durch Verwendung des Operators + einen String, der die Werte
      in den Variablen in der oben gegebenen
      Reihenfolge enthält, jeweils getrennt durch ", ". Geben Sie den String
      mittels System.out.println(...) aus.
    - Berechnen Sie das ganzzahlige Produkt aller Werte in diesen Variablen,
      wobei Nachkommastellen so früh wie möglich abgeschnitten werden.
      Vermeiden Sie einen Überlauf des Ergebnisses. Geben Sie das Produkt
      mittels System.out.println(...) aus.
    - Berechnen Sie die Summe aller Werte in diesen Variablen und wandeln Sie
      das Ergebnis am Ende der Berechnung in eine ganze Zahl um. Geben Sie die
      ganzzahlige Summe mittels System.out.println(...) aus.
    - Wandeln Sie jeden Wert in den Variablen in einen Wert vom Typ byte um und
      berechnen Sie die Summe der umgewandelten Werte. Geben Sie die Summe
      mittels System.out.println(...) aus.

    Zusatzfragen:

    1. Wodurch erklären sich die Unterschiede zwischen den beiden berechneten
    Summen?

    2. Warum ist der aus den Variablen erzeugte String nicht gleich der oben
    vorgegebenen Zeile mit Literalen?

    3. Von welchem Typ ist der zuletzt ausgegebene Wert?

    4. Wann wird ein Wert automatisch in einen Wert eines anderen Typs
    umgewandelt, wann benötigt man einen Cast?

    5. Wieviel Speicher belegt ein Wert eines elementaren Typs mindestens (je
    nach Typ)?

    6. Welchen Wertebereich kann ein elementarer Typ abdecken (je nach Typ)?
*/
public class Aufgabe1{

    public static void main(String[] args) {

        char c='F';
        int i=0xf; //hex
        int a=070; //oktal
        long l=70L;
        float f = 77e-1f;
        float h =  7.7f;
        double d=7.77e1;
        double q=77.7;

        System.out.println(c + ", "+i+", "+a+", "+l+", "+f+", "+h+", "+d+", "+q);

        System.out.println(((long)c*(long)i*(long)a*(long)l*(long)f*(long)h*(long)d*(long)q));

        System.out.println((int) (c+i+a+l+f+h+d+q));

        System.out.println((byte)c+(byte)i+(byte)a+(byte)l +(byte)f+(byte)h+(byte)d+(byte)q);
    }
}


/*
1)

2)

3) Von typ "INT". Hier werden die byte-Werte implizit (also im Programmtext nicht offensichtlich)
in int-Werte umgewandelt.
Implizite Typumwandlungen können stets nur von einem elementaren Typ
mit kleinerem Wertebereich zu einem elementaren Typ mit größerem Wertebereich
erfolgen.

4) Wenn wir einen Typ von einem größeren zu einem kleineren
Wertebereich umzuwandeln wollen, dann benötigen wir Cast. Umgekehrt ist den Cast nicht notwendig.

5,6) byte :8 Bit  ,Wertebereich von −2 ^7 bis 2^7 − 1 (127)
   short: 16 Bit ,Wertebereich von −2^15 bis 2^^15 − 1 (32.767)
   int:  32 Bit  , Wertebereich von −2^31 bis 2^31 − 1 (2.147.483.647)
   long: 64 Bit ,Wertebereich von  −2^63 bis 2^63 − 1 (9.223.372.036.854.775.807)

 */