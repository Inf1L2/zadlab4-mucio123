package obliczanieFigur;
public class Kwadrat {
    double a;
    public Kwadrat(double a) {
        this.a = a;
    }    
    public double obw(){
    double obwod;
    obwod=a*4;
    return obwod;
    }
     public double pole(){
    double pole;
    pole=a*a;
    return pole;
    }
      public void pokaz(){
    System.out.println("Bok Kwadratu: " + a);
    System.out.println("Pole Kwadratu: " + pole());
    System.out.println("Obwod Kwadratu: " + obw());
    }
}
