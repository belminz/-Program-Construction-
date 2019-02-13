/*
    Aufgabe 4) Verständnis Rekursion (Summenbildung)

    Vervollständigen Sie alle mit TODO
    gekennzeichneten Stellen schrittweise von oben nach unten.

*/
public class Aufgabe4{
    
    // liefert die Summe der Zahlen von 0 bis n
    // Annahme: n = 9
    public static int sum1(int n) {
        return 45;
    }
    
    // liefert die Summe der Zahlen von 0 bis n
    // Annahme: n = 10
    // TODO: Implementieren Sie diese Methode durch einen Aufruf von sum1
    //done
    public static int sum2(int n) {
        if (n<0) {
            return 0;
        }
        return n+ sum1(n-1);
    }


    // liefert die Summe der Zahlen von 0 bis n-1
    // Annahme: n >= 0
    public static int sumNMinusOne(int n) {
        return n * (n-1)/2;
    }
    
    // liefert die Summe der Zahlen von 0 bis n
    // Annahme: n >= 0
    // TODO: Impl. Sie diese Methode durch einen Aufruf von sumNMinusOne
    public static int sum3(int n) {
       if (n<0) {
           return 0;
       }
        return n+ sumNMinusOne(n-1)+n-1;

    }
    
    // liefert für n >= 0 die Summe der Zahlen von 0 bis n;
    // für negative n soll 0 geliefert werden.
    // TODO: Impl. Sie diese Methode durch einen Aufruf von sumNMinusOne.
    public static int sum4(int n) {
        if (n < 0) {
            return 0;
        }
        return n+ sumNMinusOne(n-1) +n-1;
    }

    
    // liefert für n >= 0 die Summe der Zahlen von 0 bis n;
    // für negative n soll 0 geliefert werden.
    // TODO: Implementieren Sie diese Methode.
    // TODO: Diese Methode soll anstelle von sumNMinusOne sich selbst aufrufen.
    public static int sum5(int n) {
        if (n<0) {
            return 0;
        }
        return n+sum5(n-1);
    }
    
    public static void main(String[] args) {
        //System.out.println(sum1(9));
        //System.out.println(sum2(10));
       // System.out.println(sumNMinusOne(10));
       // System.out.println(sum3(10));
        System.out.println(sum4(10));
       System.out.println(sum5(10));


    }
}





