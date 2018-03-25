package obliczanieFigur;
public class Prostopadloscian {
     double a;
    double b;
    double h;
    public Prostopadloscian(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }
   
    public double pw() {
        double powierzchnia;
        powierzchnia = (2 * a * b) + (2 * b * h) + 2 * (a * h);
        return powierzchnia;
    }
    public double obj() {
        double objetosc;
        objetosc = a * b * h;
        return objetosc;
    }
    public void pokaz(){
    System.out.println("Pierwsza krawedz podstawy prostopadloscianu:" + a);
    System.out.println("Druga krawedz podstawy prostopadloscianu:" + b);
    System.out.println("Trzecia krawedz podstawy prostopadloscianu:" + h);
    System.out.println("Powierzchnia Prostopadloscianu:" + pw());
    System.out.println("Objetosc Prostopadloscianu:" + obj());
    }
}
