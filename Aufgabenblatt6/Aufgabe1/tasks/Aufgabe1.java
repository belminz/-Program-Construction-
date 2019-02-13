import java.util.Arrays;

/*******************************************************************************

 AUFGABENBLATT 6 - Allgemeine Informationen

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
 bis spätestens Montag 12.12.2016 08:00 Uhr in TUWEL hoch. Zusätzlich
 müssen Sie in TUWEL ankreuzen welche Aufgaben Sie gelöst haben und während
 der Übung präsentieren können.

 ******************************************************************************/
/*
    Aufgabe 1) Sortieren & Suchen

    Implementieren Sie in dieser Aufgabe in der gegebenen Klasse Aufgabe1
    folgende statische Methoden:

    - sort:       Diese Methode soll den Sortieralgorihtmus "QuickSort"
                  implementieren. Sie müssen den Sortieralgorithmus selbst
                  ausimplementieren und dürfen keinen entsprechenden Aufruf aus
                  der Java-API verwenden.

    - binSearch:  Dieser Methode wird ein sortiertes Array übergeben.
                  Zusätzlich erhält die Methode einen Wert nach dem gesucht
                  werden soll. Es soll eine binäre Suche implementiert werden,
                  die true zurückliefert falls das Element enthalten ist,
                  ansonsten false.
                  
    Hinweis: Sie dürfen zusätzliche Hilfsmethoden implementieren und verwenden!

    Zusatzfragen:
    1. Welche API-Aufrufe bietet Java für das Sortieren von Arrays an?
    2. Welcher Sortieralgorithmus wird in der Java (1.8) für das Sortieren von
       Arrays verwendet?
    3. Warum ist die Wahl des Pivot-Elements entscheidend für die Performance
       des Quicksort Algorithmus?
    4. Warum muss das Array für die binäre Suche sortiert sein?
    5. Wie geht man vor wenn man in einem absteigend sortierten Array die
       Binärsuche anwenden will?
*/
public class Aufgabe1 {

    public static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int low, int high) {
        int i = low;
        int j = high;
        int pivot = array[(low + high) / 2];

        while (i <= j) {

            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int help = array[i];
                array[i] = array[j];
                array[j] = help;
                i++;
                j--;
            }
        }
        if (low < i - 1) {
            quickSort(array, low, i - 1);
        }
        if (i < high) {
            quickSort(array, i, high);
        }
    }

    public static boolean binSearch(int[] array, int elem) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mitte = (high + low) / 2;
            if (array[mitte] < elem) {
                low = mitte + 1;
            } else if (array[mitte] == elem) {
                return true;
            } else high = mitte - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,6,5,3,8,7};
        sort(arr);
        System.out.println(binSearch(arr,4));
        System.out.println(Arrays.toString(arr));
    }
}



