import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar, kdvoran = 0.18, kdvoran1 = 0.08,kdvtutar,kdvlitutar,kdvtutar1,kdvlitutar1;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();
        if (tutar > 1000) {
            kdvtutar1 = tutar *kdvoran1 ;
            kdvlitutar1 = kdvtutar1 + tutar ;
            System.out.println("Uygulanan Kdv Oranı: %8" );
            System.out.println("Uygulanan Kdv tutarı: " + kdvtutar1);
           System.out.println("Kdv'li tutar: " + kdvlitutar1);
        } else {
            kdvtutar = tutar * kdvoran;
            kdvlitutar = kdvtutar + tutar;
            System.out.println("Uygulanan Kdv Oranı: %18" );
            System.out.println("Uygulanan Kdv tutarı: " + kdvtutar);
            System.out.println("Kdv'li tutar: " + kdvlitutar);
        }
    }
}
