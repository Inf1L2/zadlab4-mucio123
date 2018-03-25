package pl.edu.ur.polab4;
import java.util.Scanner;
import obliczanieFigur.*;
import wprowadzDane.*;
public class Main {
    public static void main(String[] args) {
        Scanner wybor = new Scanner(System.in);
        int wyb1;
        System.out.println("1 - zadanie 4,2 - zadanie 5");
        wyb1 = wybor.nextInt();
        switch (wyb1) {
            case 1: {
                int menu = 1;
                while (menu != 0) {
                    System.out.println("wybierz figury dla ktorej chcesz obliczyc pole \n 1 - kwadrat\n2 - prostokat\n3 - kolo\n4 - szescian\n5 - prostopadloscian\n6 - kula\n7 - stozek\n0 - koniec");
                    menu = wybor.nextInt();
                    switch (menu) {
                        case 1: {
                            System.out.println("Podaj bok kwadratu");
                            Kwadrat kwadrat = new Kwadrat(wybor.nextInt());
                            kwadrat.pokaz();
                            break;
                        }
                        case 2: {
                            System.out.println("Podaj boki prostokata");
                            Prostokat prostokat = new Prostokat(wybor.nextInt(), wybor.nextInt());
                            prostokat.pokaz();
                            break;
                        }
                        case 3: {
                            System.out.println("Podaj promien kola");
                            Kolo kolo = new Kolo(wybor.nextInt());
                            kolo.pokaz();
                            break;
                        }
                        case 4: {
                            System.out.println("Podaj bok Szescianu");
                            Szescian szescian = new Szescian(wybor.nextInt());
                            szescian.pokaz();
                            break;
                        }
                        case 5: {
                            System.out.println("Podaj boki prostopadloscianu");
                            Prostopadloscian prostopadloscian = new Prostopadloscian(wybor.nextInt(), wybor.nextInt(), wybor.nextInt());
                            prostopadloscian.pokaz();
                            break;
                        }
                        case 6: {
                            System.out.println("Podaj promien Kuli");
                            Kula kula = new Kula(wybor.nextInt());
                            kula.pokaz();
                            break;
                        }
                        case 7: {
                            System.out.println("Podaj promien,dlugosc boku i wysokosc stozka");
                            Stozek stozek = new Stozek(wybor.nextInt(), wybor.nextInt(), wybor.nextInt());
                            stozek.pokaz();
                            break;
                        }
                    }
                }

            }
            case 2: {
                Student[] studenci = new Student[100];

                for (int i = 0; i < 100; i++) {
                    studenci[i] = new Student();
                }

                int ktorestudenci=1, podana;
                while (ktorestudenci != 0){
                System.out.println("1.wprowadzanie danych studenta pod wybrany index tablicy");
                System.out.println("2.edycja spod wybranego indeksu");
                System.out.println("3.usuniecie danych studenta");
                System.out.println("4.wyswietlenie obiektu o danym indeksie");
                System.out.println("5.wyswietlenie wszystkich obiektow");
                System.out.println("6.wyswietlenie zakresu obiektów w podanym zakresie");

                ktorestudenci = wybor.nextInt();
                switch (ktorestudenci) {

                    case 1: {
                        System.out.println("Podaj indeks tablicy dla ktorego chcesz wprowadzic dane: ");
                        podana = wybor.nextInt();
                        studenci[podana].podWybrany();
                        break;

                    }
                    case 2: {
                        System.out.println("Podaj indeks tablicy dla ktorego chcesz wprowadzic dane: ");
                        podana = wybor.nextInt();
                        studenci[podana].podWybrany();
                        break;
                    }
                    case 3: {
                        System.out.println("Podaj indeks tablicy dla ktorego chcesz przypisac domyslne dane: ");
                        podana = wybor.nextInt();
                        studenci[podana].przypiszdomyslne();
                        break;
                    }
                    case 4: {
                        System.out.println("Podaj indeks tablicy dla ktorego chcesz wyswietlic dane: ");
                        podana = wybor.nextInt();
                        studenci[podana].wyswietlDane();
                        break;
                    }
                    case 5: {
                        for (int i = 0; i < 100; i++) {
                            studenci[i].wyswietlDane();
                        }
                        break;
                    }
                    case 6: {
                        int poczatek, koniec;
                        System.out.println("Podaj poczatek zakresu: ");
                        poczatek = wybor.nextInt();
                        System.out.println("Podaj koniec zakresu: ");
                        koniec = wybor.nextByte();
                        for (int i = poczatek; i < koniec; i++) {
                            studenci[i].wyswietlDane();
                        }
                        break;
                    }
                }
                }
            }
        }
    }
}
