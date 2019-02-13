/**
 * Created by belmi_000 on 31.10.2016.
 */
public class ff {

    public static void main(String[] args) {

        drawNumDiamond(9);
    }

    public static void drawNumDiamond(int h) {
        int middleE = h / 2 + 1;
        int ispisiBroj = 0;

        if (h % 2 == 0 && h != 0) {
            System.out.println("NO VALID INPUT");
            System.exit(0);
        } else if (h == 0) {
            System.exit(0);
        }



        for (int i = 1; i <= middleE; i++) {
            if (i<4) {
                ispisiBroj = i;
            } else {
                ispisiBroj=8-i;




            }

            for (int j = 1; j <= h; j++) {
                if (j < middleE + i && j > middleE - i) {
                    System.out.print(ispisiBroj);

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}