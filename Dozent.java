public class Dozent extends Person {
    private String fachgebiet;
    private int nummer;
    private boolean istGastdozent;

    public Dozent(String fachgebiet, int nummer, boolean istGastdozent) {
        super("", "");
        this.fachgebiet = fachgebiet;
        this.nummer = nummer;
        this.istGastdozent = istGastdozent;
    }

    public String getFachgebiet() {
        return fachgebiet;
    }

    public void setFachgebiet(String fachgebiet) {
        this.fachgebiet = fachgebiet;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public boolean getIstGastdozent() {
        return istGastdozent;
    }

    public void setIstGastdozent(boolean istGastdozent) {
        this.istGastdozent = istGastdozent;
    }
}



