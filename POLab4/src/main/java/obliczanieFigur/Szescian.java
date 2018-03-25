package obliczanieFigur;
public class Szescian {
double a;
    public Szescian(double a) {
        this.a = a;
    }    
    public double obj(){
    double objetosc;
    objetosc=a*a*a;
    return objetosc;
    }
     public double pw(){
    double powierzchnia;
    powierzchnia=6*(a*a);
    return powierzchnia;
    }
     public void pokaz(){
    System.out.println("Dlugosc boku Szescianu:" + a);
    System.out.println("Powierzchnia Szescianu:" + obj());
    System.out.println("Objetosc Szescianu:" + pw());
    }
}
