import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


    double para,kdvtutari,kdvlitutar;
    double kdv1 =0.18;
    double kdv2 =0.08;
	Scanner intscanner = new Scanner(System.in);
	System.out.println("Para değerini giriniz: ");
	para = intscanner.nextInt();

	boolean tutar = para>1000;
	kdvtutari = tutar ? (para*kdv2) : (para*kdv1);
	kdvlitutar = kdvtutari + para;
	System.out.println("KDV'siz fiyat: "+para);
	System.out.println("KDV'li Fiyat: "+kdvlitutar);
	System.out.println("KDV tutarı: "+kdvtutari);









    }
}