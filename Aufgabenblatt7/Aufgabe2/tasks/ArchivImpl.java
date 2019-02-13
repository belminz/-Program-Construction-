import java.util.LinkedList;

public class ArchivImpl implements Archiv {

    LinkedList<Meerestier> tiere = new LinkedList<>();






/*
Die Methoden sollen sich folgendermaßen verhalten:
	    - void registrieren(Meerestier m);
	      Fuegt ein Meerestier im Archiv hinzu.

	    - void ausraeumen();
	      Raeumt alle Tiere bis auf Saeugetiere aus (= ins Regal 0 geben)

	    - void einordnen();
	      Ordnet alle Tiere der Reihe nach in Regalnummern, allerdings sind
	      Saeugetiere in den Regalen ab 100 und Fische ab den Regalen 200
	      (einfach 100 respektive 200 zu dem Index hinzugeben)

        - void neuWiegen(int gewicht[]);
	      Wiegt alle Tiere neu. Allerdings gibt es einen systematischen Fehler
	      bei Schildkröten. Diese wiegen tatsächlich um 10% weniger als die
	      Waage angzeigt hat (der Wert im Array). Sauegetiere werden immer in
	      Tonnen gewogen. Korallen haben immer ein Kilogramm, unabhängig vom
	      Wert im Array.
 */

    @Override
    public void registrieren(Meerestier m) {
        tiere.add(m);
    }

    @Override
    public void ausraeumen() {
        for (Meerestier tier : tiere) {
            tier.ausraeumen();
        }
    }

    @Override
    public void einordnen() {
        int count=0;
        for (Meerestier tier : tiere ) {
            tier.einordnen(count++);
        }
    }

    @Override
    public void neuWiegen(int[] gewicht) {
        for (int i = 0; i < gewicht.length; i++) {
            tiere.get(i).abwiegen(gewicht[i]);

        }

    }

    public String toString() {
        String s = "";
        for (int i = 0; i < tiere.size(); i++) {
            s+=tiere.get(i) + "\n";
        }
        return s;
    }
}

