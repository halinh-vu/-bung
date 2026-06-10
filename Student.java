public class Student extends Person {
 private int alter;
 private int anzahl;

 public Student(int alter, int anzahl){
    this.alter = alter;
    this.anzahl = anzahl;
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