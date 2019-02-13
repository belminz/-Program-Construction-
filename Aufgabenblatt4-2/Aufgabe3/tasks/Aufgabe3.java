/*
    Aufgabe 3, 4, 5,) Zweidimensionale Arrays -- Vier Gewinnt

    Beim Spiel "Vier gewinnt" gewinnt der Spieler, der als erstes vier Steine
    in eine Reihe bringt (horizontal, vertikal, oder diagonal). Das Spielfeld
    steht senkrecht und ist 7 Spalten breit und 6 Reihen hoch. Steine können nur
    im untersten Feld einer Spalte platziert werden, das noch nicht von einem
    anderen Stein besetzt ist.

    "Vier gewinnt" wird in mehreren, aufeinander aufbauenden Aufgaben in
    mehreren Aufgabenblättern verwendet, Sie sollten daher diese Aufgaben
    unbedingt lösen. In diesem Aufgabenblatt deckt das Spiel "Vier gewinnt"
    3 Aufgaben ab. Bitte kreuzen Sie diese separat in TUWEL an.
    
    Hinweis: Sie können Hilfsmethoden implementieren, dürfen aber vorgegebene
             Methoden und deren Signaturen nicht verändern.
    
    *****************************  Aufgabe 3  **********************************
    Für Aufgabe 3 schreiben Sie folgende statische Methoden:

    1) public static int[][] spielfeld()
    
    Diese Methode erzeugt ein leeres Vier-Gewinnt-Spielfeld. Das Spielfeld soll
    als zweidimensionales Array von int-Werten dargestellt werden, wobei auf
    ein Feld in Reihe r und Spalte s im Feld f mit f[r][s] zugegriffen werden
    soll. Ein leeres Feld wird mit 0 repraesentiert, ein Stein auf einem Feld
    durch 1 für einen Stein des Spielers 1 bzw. 2 für einen Stein des
    Spielers 2.

    2) public static void spielstand(int[][] f)
    
    Diese Methode gibt den Spielstand f in folgender Form aus:
    
    |       |
    |       |
    |       |   Definition: Die linke unterste Ecke ist als Koordinate [0][0]
    |       |               definiert und stellt den Ausgangspunkt des
    |  xo   |               Spielbrettes dar.
    |  ox   |
    +-------+
    
    wobei für ein leeres Feld ein Leerzeichen ausgegeben wird, für einen Stein
    von Spieler 1 ein x, und für einen Stein von Spieler 2 ein o.
    
    Zusatzfragen:
    1. Welche anderen Möglichkeiten neben der von Ihnen gewählten gibt es, um
    von der Spielernummer auf x bzw. o zu kommen?
    ****************************************************************************
    
    *****************************  Aufgabe 4  **********************************
    Für Aufgabe 4 schreiben Sie folgende statische Methoden:

    1) public static int[][] zug(int[][] f, int spieler, int spalte)

    Diese Methode führt einen Zug des Spielers "spieler" in Spalte
    "spalte" (0-6 für legale Züge) durch und gibt die neue Stellung
    (das Spielfeld nach dem Zug) zurück.  Wenn in Spalte "spalte" kein
    Zug möglich ist (weil die Spalte voll ist oder nicht im erlaubten
    Bereich), soll zug() null zurückgeben.  Das vom Parameter f
    referenzierte Feld darf verändert werden oder unverändert bleiben.

    2) public static boolean sieg(int[][] f, int spieler)

    Diese Methode liefert true, wenn "spieler" vier Steine in einer Reihe hat,
    sonst false.

    Zusatzfragen:
    1. Welche Vor- und Nachteile hat es für dieses Beispiel und in
    Hinblick auf Aufgabe 5, den Parameter f von zug() zu verändern.
    ****************************************************************************

    *****************************  Aufgabe 5  **********************************
    Für Aufgabe 5 schreiben Sie folgende statische Methode:

    1) public static void spiel()

    Diese Methode führt ein Vier-Gewinnt-Spiel zwischen zwei Spielern durch:
    Beginnend mit einem leeren Spielfeld werden abwechselnd Spieler 1 und
    Spieler 2 zur Eingabe eines Spielzuges aufgefordert, der Spielzug
    durchgeführt, und der aktuelle Spielstand ausgegeben, solange bis ein
    Spieler gewonnen hat oder das Spielfeld voll ist. Überlegen Sie sich
    eine sinnvolle Behandlung von ungültigen Eingaben. In "main" wird am Ende
    nur noch die Methode spiel() aufgerufen. Testen Sie spiel() selbst, auch
    den Fall, dass das Spielfeld voll wird, ohne dass ein Spieler gewonnen hat.

    Zusatzfragen:
    1. Was machen Sie bei ungültigen Eingaben?
    ****************************************************************************
*/
import java.util.Scanner;
public class Aufgabe3 {
/*
1) public static int[][] spielfeld()

    Diese Methode erzeugt ein leeres Vier-Gewinnt-Spielfeld. Das Spielfeld soll
    als zweidimensionales Array von int-Werten dargestellt werden, wobei auf
    ein Feld in Reihe r und Spalte s im Feld f mit f[r][s] zugegriffen werden
    soll.
    -Ein leeres Feld wird mit 0 repraesentiert, ein Stein auf einem Feld
    durch 1 für einen Stein des Spielers 1 bzw. 2 für einen Stein des
    Spielers 2.

    2) public static void spielstand(int[][] f)

    Diese Methode gibt den Spielstand f in folgender Form aus:

    |       |
    |       |
    |       |   Definition: Die linke unterste Ecke ist als Koordinate [0][0]
    |       |               definiert und stellt den Ausgangspunkt des
    |  xo   |               Spielbrettes dar.
    |  ox   |
    +-------+

    wobei für ein leeres Feld ein Leerzeichen ausgegeben wird, für einen Stein
    von Spieler 1 ein x, und für einen Stein von Spieler 2 ein o.
 */
    //***************************  Aufgabe 3  **********************************


    public static int[][] spielfeld(){
        return new int[6][7];
    }
    public static void spielstand ( int[][] f){
            for (int i = 5; i >= 0; i--) {
                System.out.print("|");
                for (int j = 0; j < f[i].length; j++) {
                    if (f[i][j] == 1)
                        System.out.print("x");
                    else if (f[i][j] == 2)
                        System.out.print("o");
                    else
                        System.out.print(" ");
                }
                System.out.print("|");
                System.out.println();
            }
            for (int i = 0; i <= f.length + 2; i++) {
                if (i == 0 || i == f.length + 2)
                    System.out.print("+");
                else
                    System.out.print("-");
            }
            System.out.println();
        }


    //**************************************************************************
    
    
    //***************************  Aufgabe 4  **********************************
    public static int[][] zug(int[][] f, int spieler, int spalte) {
        if (spalte >= 0 && spalte <= 6) {
            if (f[5][spalte] != 0) {   // no place,return null;
                return null;

            } else {
                for (int i = 0; i < f.length; i++) {
                    if (f[i][spalte] == 0) {
                        f[i][spalte] = spieler;
                        i = f.length; // end of "zug" goto spielstand
                    }
                }
            }
        } else if (spalte < 0 || spalte > 6) {
            return null;
        }



        spielstand(f); //  After one "zug" goto spielstand and see results.

      /*  if (sieg(f, spieler)) {
            if (spieler == 1) {
                System.out.println("Winner is player : " + spieler);

            }
            else {
                System.out.println("Winner is player : "+ spieler);
*/
    return f;
    }



    public static boolean sieg(int[][] f, int spieler) {

        for (int zeile = 0; zeile < 3; zeile++) { //diagonal from bottom to top/left
            for (int spalte = 3; spalte < 7; spalte++) {
                if (f[zeile][spalte] == spieler && f[zeile + 1][spalte - 1] == spieler &&
                        f[zeile + 2][spalte - 2] == spieler && f[zeile + 3][spalte - 3] == spieler) {
                    return true;
                }
            }
        }
        for (int zeile = 0; zeile < 3; zeile++) { //diagonal
            for (int spalte = 0; spalte < 4; spalte++) {
                if (f[zeile][spalte] == spieler && f[zeile + 1][spalte + 1] == spieler &&
                        f[zeile + 2][spalte + 2] == spieler && f[zeile + 3][spalte + 3] == spieler) {
                    return true;
                }
            }
        }
        for (int zeile = 0; zeile < 6; zeile++) { //horizontal
            for (int spalte = 0; spalte < 4; spalte++) { // 3 is max, 4 would be here out of range.
                if (f[zeile][spalte] == spieler && f[zeile][spalte + 1] == spieler &&
                        f[zeile][spalte + 2] == spieler && f[zeile][spalte + 3] == spieler) {
                    return true;
                }
            }
        }
        for (int zeile = 0; zeile < 3; zeile++) { //vertical
            for (int spalte = 0; spalte < 7; spalte++) {
                if (f[zeile][spalte] == spieler && f[zeile + 1][spalte] == spieler &&
                        f[zeile + 2][spalte] == spieler && f[zeile + 3][spalte] == spieler) {
                    return true;
                }
            }
        }
        return false;
    }
    //**************************************************************************
    

    /*
    1) public static void spiel()

    Diese Methode führt ein Vier-Gewinnt-Spiel zwischen zwei Spielern durch:
    Beginnend mit einem leeren Spielfeld werden abwechselnd Spieler 1 und
    Spieler 2 zur Eingabe eines Spielzuges aufgefordert, der Spielzug
    durchgeführt, und der aktuelle Spielstand ausgegeben, solange bis ein
    Spieler gewonnen hat oder das Spielfeld voll ist. Überlegen Sie sich
    eine sinnvolle Behandlung von ungültigen Eingaben. In "main" wird am Ende
    nur noch die Methode spiel() aufgerufen. Testen Sie spiel() selbst, auch
    den Fall, dass das Spielfeld voll wird, ohne dass ein Spieler gewonnen hat.

    */
    //***************************  Aufgabe 5  **********************************
    public static boolean spielfeldFULL (int spielfeld [][]) {
        int count=0;
        for (int spalte=0;spalte<spielfeld[0].length ;spalte++) {
            if (spielfeld[5][spalte] != 0)
                count++;
        }
            if (count == 7) {
                return true;
            }
            return false;
        }

    public static void spiel() {

        int spielfeld[][] = spielfeld();
        Scanner scanner = new Scanner(System.in);
        System.out.println("First players turn");
        boolean turn = true;
        int player1 = 1;
        int player2 = 2;

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            if (turn) {
                zug(spielfeld, player1, input);
                if (sieg(spielfeld, 1)) {
                    System.out.println("Winner is player 1");
                    break;
                }
                turn = false;//goto 2nd player
                System.out.println("Second players turn");
            } else { //2nd player turn
                zug(spielfeld, player2, input);
                turn = true;
                if (sieg(spielfeld, 2)) {
                    System.out.println("Winner is player 2");
                    break;
                }
                // turn=true; //again 1st players turn
                System.out.println("First players turn");

            }
            if (spielfeldFULL(spielfeld))
                break;
            } else
                {
                scanner.next(); //ungültige Eingabe
                 }
            }
    }
    //**************************************************************************

    public static void main(String[] args) {
       spiel();
    }
}