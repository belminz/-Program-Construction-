/**
 * Created by belmi_000 on 31.10.2016.
 */
public class g {


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
        int numRows=9;//Length of the pyramid that we want.151 is just an example
        int midrow = numRows/2+1;//midrow is the middle row and has numRows number of *

        int diff=0;
        for(int i=1;i<numRows+1;i++) {
            for(int j=1;j<numRows+1;j++)
            {
                if(((midrow+i)<j && (j>midrow-i)))
                {
                    System.out.print(diff);
                }else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();

            if(i<midrow)
            {
                diff++;
            }else
            {
                diff--;
            }
        }




    }

}*/