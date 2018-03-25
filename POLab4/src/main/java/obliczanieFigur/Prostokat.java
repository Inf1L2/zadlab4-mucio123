package obliczanieFigur;
public class Prostokat {
    double a;
    double b;
    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }    
    public double obw(){
    double obwod;
    obwod=(2*a)+(2*b);
        return obwod;
    }
    public double pole(){
    double pole;
    pole=a*b;
        return pole;
    }
    public void pokaz(){
    System.out.println("Pierwszy Bok Prostokata:" + a);
    System.out.println("Drugi Bok Prostokata:" + b);
    System.out.println("Pole Prostokata:" + pole());
    System.out.println("Obwod Prostokata:" + obw());
    }
}
