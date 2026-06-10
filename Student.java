public class Student extends Person {
 private int alter;
 private int anzahl;

 public Student(String nachname, String vorname){
    super(nachname, vorname);

 }

public int getAlter() {
    return alter;
}

public void setAlter(int alter) {
    this.alter = alter;
}

public int getAnzahl() {
    return anzahl;
}

public void setAnzahl(int anzahl) {
    this.anzahl = anzahl;
}

}