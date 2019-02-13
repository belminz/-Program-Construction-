public class Fisch implements Meerestier{

    private String name;
    private int regal;
    private int gewicht;

    public Fisch (String name, int regal, int gewicht) {
        this.name=name;
        this.regal=regal;
        this.gewicht=gewicht;

    }
    public String toString() {
        return name + " " + " regal " +  regal + " " +gewicht + " kg";
    }


    @Override
    public void einordnen(int regal) {
        this.regal=regal + 200;
    }

    @Override
    public void ausraeumen() {
        this.regal=0;
    }


    public int getGewicht() {
        return gewicht;
    }

    @Override
    public void abwiegen(int gewicht) {
        this.gewicht=gewicht;
    }
}
