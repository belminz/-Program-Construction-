public class Saeugetier implements Meerestier{

    private String name;
    private int regal;
    private int gewicht;

    public Saeugetier (String name, int regal, int gewicht) {
        this.name=name;
        this.regal=regal;
        this.gewicht=gewicht;

    }
    public String toString() {
        return name + " " + " regal " +  regal + " " +gewicht + " kg";
    }

    @Override
    public void einordnen(int regal) {
this.regal=regal+100;
    }

    @Override
    public void ausraeumen() {

    }

    public int getGewicht() {
        return gewicht;
    }
    @Override
    public void abwiegen(int gewicht) {
        this.gewicht=gewicht*1000;

    }
}
