package obliczanieFigur;
public class Kolo {
    double r;
    public Kolo(double r) {
        this.r = r;
    }    
    public double pole() {
        double pole;
        pole = Math.PI * (r * r);
        return pole;
    }
    public double obw() {
        double obwod;
        obwod = 2 * Math.PI * r;
        return obwod;
    }
    public void pokaz(){
    System.out.println("Promien Kola: " + r);
    System.out.println("Pole Kola: " + pole());
    System.out.println("Obwod Kola: " + obw());
    }
}
