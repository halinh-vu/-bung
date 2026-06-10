public class Dozent extends Person {
    private String fachgebiet;
    private int nummer;
    private boolean istGastdozent;

    public Dozent(String fachgebiet, int nummer, boolean istGastdozent) {
        this.fachgebiet = fachgebiet;
        this.nummer = nummer;
        this.istGastdozent = istGastdozent;
    }
}