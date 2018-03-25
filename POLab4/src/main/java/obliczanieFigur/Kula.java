package obliczanieFigur;
public class Kula {
    double r;
    public Kula(double r) {
        this.r = r;
    }    
    public double pw() {
        double powierzchnia;
        powierzchnia = 4 * Math.PI * (r * r);
        return powierzchnia;
    }
    public double obj() {
        double objetosc;
        objetosc = (4 / 3) * Math.PI * (r * r * r);
        return objetosc;
    }
     public void pokaz(){
    System.out.println("Promien Kuli: " + r);
    System.out.println("Powierzchnia Kuli: " + pw());
    System.out.println("Objetosc Kuli: " + obj());
    }
}
