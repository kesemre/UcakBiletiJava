import java.util.Scanner;

public class UcakBiletiFiyati {
    public static void main(String[] args) {
        int mesafe, yolculukTipi, yas;
        double tutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen gideceğimniz mesafeyi yazınız");
        mesafe = input.nextInt();
        System.out.print("tek yön için 1 gidiş dönüş için 2 yi yazınız");
        yolculukTipi = input.nextInt();
        System.out.print("Lütfen Yaşınızı yazınız");
        yas = input.nextInt();

        if ((yolculukTipi == 1 || yolculukTipi == 2) && (mesafe > 0) && (yas > 0)) {
            tutar = mesafe * 0.1;
            if (yolculukTipi == 2) {
                tutar= tutar * 1.6;
            }
            if (yas < 12) {
                tutar = tutar * 0.5;
            } else if (yas <= 24) {
                 tutar = tutar * 0.9;

            } else if (yas >= 65) {
                tutar = tutar * 0.7;
            }
            System.out.println("Toplam ödeyeceğiniz tutar:"+tutar);

        } else {
            System.out.println("Hatalı bilgi girdiniz");
        }



    }

}