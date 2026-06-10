public class Main {
    public static void main(String[] args) {
       Person[] personen = new Person[4];
       personen[0] = new Dozent("Biologie", 1, false);
       personen[1] = new Student(9, 87);
       personen[2] = new Dozent("Chemie", 2, true);
       personen[3] = new Student(10, 83);
    }
}