public class Main {

    public static  void main (String[] args) {

        // 4 tane tamsayı tipi var. ->  Int, Byte, Long , Short


        //1. Int       - > Bilgilsayarımızda 32 bit  yani 4 byte lık yer kaplıyor.

        int a = 4 ;  //  integer en az ->  -2^31 degerini alabilir.   , integer en fazla ->  +2^31-1  değerini alabilir.

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        //2. Byte    ->   Bilgilsayarımızda   8 bite  1 byte lık yer kaplar.
        //  Byte en az ->  -127 degerini alabilir.   , byteen fazla ->  128  değerini alabilir.

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        //3. Short   ->

        //  Short en az ->  -32768 degerini alabilir.   , short en fazla ->  32767 değerini alabilir.

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        //4.  Long

        //  Long en az -> -9223372036854775808 degerini alabilir.   , Long en fazla ->  9223372036854775807  değerini alabilir.

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);





        // byte --> short --> int --> long

        /* Bazen farklı tamsayı veri tiplerinden verileri beraber islem yapabiliriz. Bu durumda ne yapabiliriz ?

        Öncelikle çoğu zaman java kendisi otomatik çevirir
        Diğer bir durumda ise biz çevirme yaparız. Java hata veriyor çeviremediğinde.


         */

        // Otomatik çeviriyor.
        short j = 1000;
        int i = (j/2);
        System.out.println(i);

        //Otomatik çeviremediğinde hata verir.Sonucun başına parantez içinde istenilen tamsayı veritipini yazarsak kendişmiz ceviririz.

     byte n =100;
     byte m= (byte) (a/2);




    }
}
