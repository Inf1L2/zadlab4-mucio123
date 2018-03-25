package obliczanieFigur;
public class Stozek {
    double r;
    double a;
    double h;
    public Stozek(double r, double a, double h) {
        this.r = r;
        this.a = a;
        this.h = h;
    }
    
    
    public double pw(){
    double powierzchnia;
    powierzchnia=(Math.PI*(r*r))+(Math.PI*r*a);
    return powierzchnia;
    }
    public double obj(){
    double objetosc;
        objetosc=(1/3)*(Math.PI*(r*r))+(Math.PI*r*a)*h;
        return objetosc;
    }
    public void pokaz(){
    System.out.println("Promien Stozka:" + r);
    System.out.println("Dlugosc boku Stozka" + a);
    System.out.println("Wysokosc Stozka:" + h);
    System.out.println("Powierzchnia Stozka:" + pw());
    System.out.println("Objetosc Stozka:" + obj());
    }
}
