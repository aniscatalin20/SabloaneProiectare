package ro.uvt;

public class Autor {
    private String nume;
    public Autor(String nume) {
        this.nume=nume;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
