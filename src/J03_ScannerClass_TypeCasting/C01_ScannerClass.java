package J03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {
        //kullanıcıdan veri almak için şu adımlar takip edilir:
        // 1. Adım: -> Scanner class'dan obj create edilir.

      //  Scanner scan = new Scanner(System.in); // Scanner classtan scan isminde değerini System içinden alan bir obj.
//
      //  //2. Adım: Kullanıcıdan istenen veri için bildirimde bulunulur -> sout(" .... ");
      //  System.out.println("adınızı giriniz :");
      //  // 3. Adım: Kullanıcının girdiği veri data type'ına göre bir variable atanır.
//
      //  String isim = scan.nextLine();// kullanıcıdan gelen String tipinde isim verisi scan objesine nextLine() methodu ile atandı.
      //  System.out.println("isim = " + isim);
      //
      //  //TASK : Kullanıcının girdiği değere göre kare alanı ve çevresini hesaplayan kod create ediniz...
      //
      //  Scanner scan1 = new Scanner(System.in);
      //  System.out.println("Karenin kenar uzunluğunu giriniz : ");
      //  int kenar = scan1.nextInt();
      //  int cevre = (kenar*4);
      //  System.out.println("cevre = " + cevre);
      //  int alan = (kenar*kenar);
      //  System.out.println("alan = " + alan);

        // TASK : Kullanıcının günde içtiği çay ve bir bardak çaya kullandığı şeker sayısından
        // 1 yıl boyunca çay içerek kaç kg şeker tükettiğini hesaplayan kod create ediniz.(1 şeker 1.7 grdır.)

        Scanner sc = new Scanner(System.in);
        System.out.println("günde kaç bardak çay içtiğinizi giriniz : ");
        int cay = sc.nextInt();

        System.out.println("Çayı kaç şekerli içtiğinizi giriniz : ");
        int sugar = sc.nextInt();

        System.out.println("Yıllık şeker tüketiminiz: " + ((365*sugar*1.7*cay)/1000) + " kilogramdır.");










    
    
    }
}
