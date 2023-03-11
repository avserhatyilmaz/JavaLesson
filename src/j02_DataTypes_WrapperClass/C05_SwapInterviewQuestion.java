package j02_DataTypes_WrapperClass;

public class C05_SwapInterviewQuestion {
    public static void main(String[] args) {
        /*
        TASK :
        Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
        a) 3. bir variable kulanarak,
        b) 3. bir variable kullanmadan.

	     input	: sayi1=20 ve sayi2=34;
		 output  :  sayi1=34 ve sayi2=20

         */
        // a)
        System.out.println("*** a çözümü ***");

        int sayi1=20;
        int sayi2=34;
        System.out.println("Swap işlemi öncesi \nsayi1 = " + sayi1 + "\nsayi2 = " + sayi2);
        int temp = sayi1; //20
        sayi1 = sayi2; //34
        sayi2 = temp; //20
        System.out.println("Swap işlemi sonrası \nsayi1 = " + sayi1 + "\nsayi2 = " + sayi2);


        // b)
        System.out.println("*** b çözümü ***");

        int num1 = 20;
        int num2 = 34;
        System.out.println("Swap işlemi öncesi \nnum1 = " + num1 + "\nnum2 = " + num2);

        num2 = num2 + num1;//54
        num1 = num2 - num1;//34
        num2 = num2 - num1;//20

        System.out.println("Swap işlemi sonrası \nnum1 = " + num1 + "\nnum2 = " + num2);

    }}