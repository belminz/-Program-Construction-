import java.util.LinkedList;

public class Person {
/*
        Um ein Kind hinzufügen zu können, implementieren Sie die Methode:

      void neuesKind(Person p);

    Stellen Sie sicher, dass die Ausgabe eines Objekts vom Typ Person
    mittels System.out.println(person) folgende Beschreibung dieser Person
    liefert:

    # <Vorname> <Nachname>, <Geschlecht>, <Alter> Jahre, Svnr: <Sozialversicherungsnummer>

    Hat eine Person Kinder, so werden auch rekursiv alle Kinder dieser
    Person (sowie auch alle darunterliegenden Hierarchieebenen) bei der
    Ausgabe berücksichtigt. Jede Ebene wird mit einem Leerzeichen
    eingerückt, z.B:

    # <Vorname> <Nachname>, <Geschlecht>, <Alter> Jahre, Svnr: <Sozialversicherungsnummer>
     # <Vorname Kind1> <Nachname Kind1>, <Geschlecht Kind1>, <Alter Kind1> Jahre, Svnr: <Sozialversicherungsnummer Kind1>
     # <Vorname Kind2> <Nachname Kind2>, <Geschlecht Kind2>, <Alter Kind2> Jahre, Svnr: <Sozialversicherungsnummer Kind2>
      # <Vorname Kind1 von Kind2> <Nachname Kind1 von Kind2>, <Geschlecht Kind1 von Kind2>, <Alter Kind1 von Kind2> Jahre, Svnr: <Sozialversicherungsnummer Kind1 von Kind2>
*/
        private String Vorname;
        private String Nachname;
        private String Geschlecht;
        private int Alter;
        private int Svnr;
        LinkedList<Person> Kinder = new LinkedList<>();

    public Person(String Vorname,String Nachname, String Geschlecht, int Alter, int Svnr) {
        this.Vorname=Vorname;
        this.Nachname = Nachname;
        this.Geschlecht = Geschlecht;
        this.Alter = Alter;
        this.Svnr = Svnr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;


        if (Svnr != person.Svnr)
            return false;
        if (Vorname != null ? !Vorname.equals(person.Vorname) : person.Vorname != null)
            return false;
        if (Nachname != null ? !Nachname.equals(person.Nachname) : person.Nachname != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = Vorname != null ? Vorname.hashCode() : 0;
        result = 31 * result + (Nachname != null ? Nachname.hashCode() : 0);
        result = 31 * result + Alter;
        result = 31 * result + Svnr;
        result = 31 * result + (Kinder != null ? Kinder.hashCode() : 0);
        return result;
    }

    void neuesKind (Person p) {
        if (p==null ) {
            return;
        }
        for (Person k : Kinder){
            if (k.equals(p)) {
                return;
            }
        }
        Kinder.add(p);
    }

    public String toString() {
        String rez ="#" + Vorname + " " + Nachname + " " + Geschlecht + " " + Alter + " Jahre" +  " " + "Svnr :" + Svnr+" "  ;
        for (Person p : Kinder) {
            rez+="\n"+ p.toString();
        }
        return rez;
    }
}
