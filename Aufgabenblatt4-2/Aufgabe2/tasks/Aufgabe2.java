/*
    Aufgabe 2) Rekursion und Termination

    Die Methoden f, g, h, p und q sind vorgegeben. Rufen Sie in main jede
    dieser Methoden mit allen Argumenten im Bereich von [-10, 10] (in
    aufsteigender Reihenfolge) auf und geben sie die Ergebnisse aus, wenn die
    Aufrufe mit diesen Werten terminieren. Aufrufe, die nicht terminieren
    würden, sind auszulassen. Vermeiden Sie Exceptions.

    Zusatzfragen:
    1. Beschreiben Sie überblicksartig, was die Methoden f, g, h, p und q
    berechnen.
    2. Nennen Sie für jeden nicht terminierenden Aufruf von f, g, h, p und q im
    Intervall [-10, 10] einen Grund für die Endlosrekursion.
    2. Bedeutet ein StackOverflowError immer, dass eine Endlosrekursion
    vorhanden ist?
*/
public class Aufgabe2 {

    private static int f(int x) {
        return x * x > 10 ? 0 : f(x - 1) + 1;
    }

    private static int g(int x) {
        return x < 0 ? 0 : g(x / 2) + 1;
    }

    private static int h(int x) {
        return x > 10 ? 0 : h(x * x) + 1;
    }

    private static int p(int x) {
        return x == 0 ? 0 : x % 2 == 1 ? p(x / 2) + 2 : p(-x - 1) + 1;
    }

    private static int q(int x) {
        return x % 3 == 0 ? 0 : q(x + x % 3 + 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println("Ergebnisse für f:");
        for (int i = -10; i <= 10; i++) {
            System.out.println(f(i));
        }


        System.out.println("Ergebnisse für g:");
        for (int i = -10; i <= 10; i++) {
            if (i < 0) {
                System.out.println(g(i));
            }
        }

        System.out.println("Ergebnisse für h:");
        for (int i = -10; i <= 10; i++) {
            if (i < -1 || i > 1) {
                System.out.println(h(i));
            }
        }

        System.out.println("Ergebnisse für p:");
        for (int i = -10; i <= 10; i++) {
            if (i == -8 || i == -4 || i == -2 || i == -1 || i == 0 || i == 1 || i == 3 || i == 7) {
                System.out.println(p(i));

            }
        }

        System.out.println("Ergebnisse für q:");
        for (int i = -10; i <= 10; i++) {
            if (i != -10 && i != -7 && i != -4 && i != -1 && i != 2 && i != 5 && i != 8) {
                System.out.println(q(i));
            }
        }
    }
}