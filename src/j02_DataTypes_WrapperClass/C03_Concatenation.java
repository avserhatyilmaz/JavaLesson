package j02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {
        String ad = "Serhat";
        String soyAd = "YILMAZ";
        int a=7;
        int b=11;
        // Birden çok String variable ile farklı data type daki variable'lar + işareti ile işleme alınırsa
        // java birleştirme ( concatenation ) yaparak yeni bir String oluşturur.

        System.out.println(ad+soyAd+a+b);//SerhatYILMAZ711

        System.out.println(a+ad+soyAd+b);//7SerhatYILMAZ11

        System.out.println(a+b+ad+soyAd);//18SerhatYILMAZ

        System.out.println(" "+a+b);// (1 karakterlik bosluk bırakır ve 711 yazar

        System.out.println(ad+soyAd+(a+b));// SerhatYILMAZ18

        System.out.println((a+b)+ad+soyAd);//18SerhatYILMAZ

        System.out.println(ad+(a-b)+(a-b)); //Serhat-4-4

        System.out.println(ad+((a-b)+(a-b)));// Serhat-8



        char ch = '1'; //
        System.out.println(ad+ch); // Serhat1

        System.out.println(a+ch+ad); // 56Serhat

        System.out.println(ad+(ch+b));// Serhat60 çünkü ch nin Ascii değeri 49, b'nin değeri de 11 toplarsak 60 yapar.

        System.out.println(ad+ch);//Serhat1

        System.out.println(a+ad+ch);//7Serhat1

        /*TRICK -> char data tipi  işleme girdiği variable'ın türüne göre farklı işlem yapar.
        eğer işleme girdiği variable aritmetik bir variable ise bu variable'ın ASCII değeri ile işlem yapar.
         */




    }
}
