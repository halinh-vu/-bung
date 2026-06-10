public class Person {
    private String nachname;
    private String vorname;

    public Person(String nachname, String vorname){
        this.nachname = nachname;
        this.vorname = vorname;
    }

    public void setNachname(String nachname){
        this.nachname = nachname;
    }

    public void setVorname(String vorname){
       this.vorname = vorname;
    }

    public String getNachname(){
          return nachname;
    }

    public String getVorname(){
        return vorname;
    }

}
