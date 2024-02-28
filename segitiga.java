public class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void setAlas(double newAlas) {
        this.alas = newAlas;
    }

    public void setTinggi(double newTinggi) {
        this.tinggi = newTinggi;
    }

    **public double getLuas() {**
        **return 0.5 * alas * tinggi;**
    }
}