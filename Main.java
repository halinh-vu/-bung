public class Main {
    public static void main(String[] args) {
       Person[] personen = new Person[4];
       personen[0] = new Dozent("Müller", "Hans");
       personen[1] = new Student("Schmidt", "Anna");
       personen[2] = new Dozent("Meier", "Peter");
       personen[3] = new Student(" Weber", "Lisa");

       personen[0].print();
       personen[1].print();
       personen[2].print();
       personen[3].print();

       }

    }
