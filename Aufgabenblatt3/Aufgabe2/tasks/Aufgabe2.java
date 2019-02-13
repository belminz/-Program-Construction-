/*
    Aufgabe 2) Einfache rekursive Methode

    Erweitern Sie die Klasse 'Aufgabe2' um eine statische Methode namens
    'specialSum' mit einem Parameter vom Typ int und einem Ergebnis vom Typ
    int. Diese Methode soll die Summe aller geraden, nicht durch 7 teilbaren
    Zahlen im Intervall von 1 bis inklusive dem Parameterwert ermitteln (oder 0
    zurückgeben wenn der Parameterwert kleiner 1 ist).

    In der Implementierung von 'specialSum' darf keine Schleife verwendet und
    keine andere Methode (außer 'specialSum') aufgerufen werden. Das heißt,
    statt einer Schleife ist (direkte) Rekursion zu verwenden.

    Zusatzfragen:
    1. Woran erkennt man, dass eine Methode rekursiv ist?
    2. Was ist die Abbruchbedingung der Rekursion in 'specialSum'?
*/
public class Aufgabe2{



    public static void main(String[] args) {
        System.out.println(specialSum(6));
    }



    private static int specialSum (int n) {
        if (n<1) {
            return 0;
        }
        return ((n%2==0 && n%7!=0)  ? n :0) + specialSum(n-1);
    }
}





