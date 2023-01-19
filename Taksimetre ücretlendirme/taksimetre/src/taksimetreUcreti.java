import java.util.Scanner;

public class taksimetreUcreti {

    public static void main(String[] args){

        double kmBasinaUcret = 2.20, minUcret = 20, taksimetreAcilisUcret = 10, km, odenecekTutar;

        Scanner giris = new Scanner(System.in);

        System.out.print("Lütfen gidilen km\'yi girin : ");
        km = giris.nextDouble();

        odenecekTutar = taksimetreAcilisUcret + km * kmBasinaUcret;

        System.out.print(odenecekTutar <= 20? "Ödenecek ücret : 20 TL" : "Ödenecek ücret " + odenecekTutar + " Tl\'dir");


    }
}
