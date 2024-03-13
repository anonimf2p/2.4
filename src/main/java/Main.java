import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;
public class Main {
  public static void main(String[] args) {
    double a ;
    double b;
    Scanner WyborLiczby = new Scanner(System.in);
    System.out.println("Wprowadz wartosci zmiennych liczb a i b");

    a = WyborLiczby.nextDouble();
    b = WyborLiczby.nextDouble();


    System.out.println("jaka operacje chcesz wykonac?:");
    System.out.println("1. Suma");
    System.out.println("2. Roznica");
    System.out.println("3. Iloczyn");
    System.out.println("4. Iloraz");
    int wybor = WyborLiczby.nextInt();
    switch (wybor) {
      case 1:
         double suma = a + b;
        System.out.println("Wynik sumy: " + suma);
        break;
      case 2:
        double roznica = a - b;
        System.out.println("Wynik roznicy: " + roznica);
        break;
      case 3:
        double iloczyn = a * b;
        System.out.println("Wynik iloczynu: " + iloczyn);
        break;
      case 4:
        double iloraz = a / b;
        if (b == 0) {
          System.out.println("Niestety, ale nie mozna podzielic przez zero");
          break;
        } else {
          System.out.println("Wynik ilorazu: " + iloraz);
          break;
        }
      default:
        System.out.println("zla operacja");
        break;
    }
  }
}