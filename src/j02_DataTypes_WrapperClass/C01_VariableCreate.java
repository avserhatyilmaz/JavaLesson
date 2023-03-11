package j02_DataTypes_WrapperClass;

public class C01_VariableCreate {

    public static void main(String[] args) {
        //1.yol -> best practice - Recommended (tavsiye edilen yol)
        int yas = 48;
        int maas = 33000;
        System.out.println("yas");// yas
        System.out.println(yas);// 48
        System.out.println(maas);//33000
        System.out.println("nur hanım başlangıç maaşı :" + maas); // nur hanım başlangıç maaşı : 33000

        // 2. yol değeri atanmayan boy isminde bir int tanımlandı (declaration) var assignment yok.
        int boy = 0;
        //System.out.println(boy); // değeri atanmamış değişken hiç bir aksiyonda kullanılamaz CTE verir.
        boy=175;
        System.out.println(boy);// 175

        //3. yol
        int yevmiye, age, kilo; // birden çok aynı tipte değişken tanımlandı.
        age = 33;
        yevmiye = 1000;
        kilo=99; // tanımlanan değişkenlere değer atamaları yapıldı.

        int gunluk = 1500, yil=2022, agırlık=99;
            // TRICK - > bir variable sadece 1 defa tanımlanabilir (1 defa "name" alır) ama bir çok defa yeni "değer-value" atanabilir.
        System.out.println(gunluk);//1500
        gunluk=1800;//günlüğe yeni değer olarak 1800 atandı.
        System.out.println(gunluk);//1800


    }
}


