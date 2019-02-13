/**
 * Created by belmi_000 on 31.10.2016.
 */
public class r {


    private static int ggt(int zahl1, int zahl2) {
        while (zahl2 != 0) {
            if (zahl1 > zahl2) {
                zahl1 = zahl1 - zahl2;
            } else {
                zahl2 = zahl2 - zahl1;
            }
        }
        return zahl1;
    }


    public static void main(String[] args) {

        int ersteZahl = 1000;
        int zweiteZahl = 10;


        int ergebnis = ggt(ersteZahl, zweiteZahl);

        System.out.println("Der GGT von "  + ersteZahl +
                " und " + zweiteZahl + " ist: " + ergebnis);
    }

}
