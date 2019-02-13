/*
    Aufgabe 3) Rekursion in Iteration ändern

    Stellen Sie fest, was die Methode 'rec' macht. Schreiben Sie eine statische
    Methode 'iter', die das Gleiche macht wie 'rec'
    (gleiches Input-Output-Verhalten), aber ohne Rekursion auskommt.

    Zusatzfragen:
    1. Warum ist es notwendig, negative Parameterwerte getrennt zu behandeln?
    2. Warum ist es notwendig, 0 als Sonderfall zu behandeln?
    3. Ist es immer vernünftig, sich an die Hinweise einer IDE zu halten?
    
*/
public class Aufgabe3 {

    //Was berechnet "rec"?
    public static int rec(int x, int y) {
        if (x < 0) {
            return rec(-x, y);
        }
        if (y < 0) {
            return rec(x, -y);
        }
        if (x == 0) {
            return 0;
        }
        if (x > y) {
            return rec(y, x);
        }
        if (x == y) {
            return x;
        }
        return rec(x, y - x);
    }

    // TODO: Implementieren Sie hier die Angabe

    public static void main(String[] args) {
       // System.out.println(rec(5, -25));
        System.out.println(iter(20,10));
    }


    public static int iter(int x, int y) {


        if (x < 0) {
            x= -x;
        }
        if (y < 0) {
            y= -y;
        }
        if (x == 0 || y==0) {
            return 0;
        }
        if (x == y) {
            return x;

        }

        while (x != y) {
            if (x > y) {
                int help = x;
                x = y;
                y = help;

            }
            y -= x;
        }
   return x;
    }

}





