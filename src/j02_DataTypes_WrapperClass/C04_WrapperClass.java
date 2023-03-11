package j02_DataTypes_WrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {
        String name ="Serhat";
        int yas = 40;

        System.out.println(name.toUpperCase()); //SERHAT

        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
        //Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        // ara çözüm imkanı sunmuştur.


        //TASK id ve tc String değerlernin toplamını print eden code yazınız
        String tc ="1234455";
        String id="98765";
        System.out.println(tc+id);//concat-> birleştirme : 123445598765

        int yeniTC = Integer.valueOf(tc); // String türündeki TCKN verisini int 'e çevirdik (int değerini aldık)
        int yeniID = Integer.valueOf(id); // String türündeki ID verisini int 'e çevirdik (int değerini aldık)

        System.out.println(yeniID+yeniTC);

       //int yeniId=  Integer.valueOf(id);// tc String değerini int cevirdi ve yeniId'ye atadı
       //System.out.println("yeniId = " + yeniId);

       //System.out.println(yeniId+yeniTC);// aritmetik toplama->1333220
       //String okulNo="234543l";
       //int yeniOkulNo= Integer.valueOf(okulNo);// run time Exception-> çalışma zamanı hatası
       //System.out.println("yeniOkulNo = " + yeniOkulNo);
        System.out.println("madem geldin dünyaya otur çalış javaya");

        //TASK -> byte short int maximum ve minimum değerlerini print eden code create ediniz.

        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byteMin = " + byteMin);
        System.out.println("byteMax = " + byteMax);
        
        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;
        System.out.println("shortMax = " + shortMax);
        System.out.println("shortMin = " + shortMin);
        
        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        System.out.println("intMax = " + intMax);
        System.out.println("intMin = " + intMin);


    }
}



