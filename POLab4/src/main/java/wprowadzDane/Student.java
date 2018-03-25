package wprowadzDane;
import java.util.Scanner;
public class Student {

    public Student() {
    this.imie="";
    this.nazwisko="";
    this.nr_indeksu=0;
    this.nazwaspecjalnosci="";
    this.rok_studiow=0;
    }
    String imie;
    String nazwisko;
    int nr_indeksu;
    String nazwaspecjalnosci;
    int rok_studiow;
  
    public void wyswietlDane(){
    System.out.println("Imie: "+imie);
    System.out.println("nazwisko: "+nazwisko);
    System.out.println("nr indeksu: "+nr_indeksu);
    System.out.println("nazwa specjalnosci: "+nazwaspecjalnosci);
    System.out.println("rok studiow: "+rok_studiow);
    }
    public void przypiszdomyslne(){
    this.imie="";
    this.nazwisko="";
    this.nr_indeksu=0;
    this.nazwaspecjalnosci="";
    this.rok_studiow=0;
    }
    public void podWybrany(){
    Scanner s=new Scanner(System.in);
       System.out.println("Podaj imie: ");
    this.imie=s.next();
    System.out.println("Podaj nazwisko: ");
    this.nazwisko=s.next();
    System.out.println("Podaj nr indeksu: ");
     this.nr_indeksu=s.nextInt();
    System.out.println("Podaj specjalnosc: ");
     this.nazwaspecjalnosci=s.next();
    System.out.println("Podaj rok studiow: "); 
    this.rok_studiow=s.nextInt();
    }
    }