//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String s = "abcde ";
        System.out.println(s.trim().length()); // 5 (boşlukları trimleyip kalan uzunluk)
        System.out.println(s.charAt(4)); // e (4. indexteki char nedir?)
        System.out.println(s.indexOf('e')); // 4 (e'nin indexi nedir?)
        System.out.println(s.indexOf("de")); // 3 ("de" substringinin başlangıç indexi.)
        System.out.println(s.substring(2, 4).toUpperCase()); // CD (index 2den 4e (4 dahil değil) bir substring oluşturup onun uppercaseini verir. )
        System.out.println(s.replace('a', '1')); // 1bcde (a yerine 1 yaz işte)
        System.out.println(s.contains("DE")); // false (case sensitive olduğu için hayır)
        System.out.println(s.startsWith("a")); // true ("a" ile mi başlıyor? string search işte)

        System.out.println("------------------------------------------");

        String s1 = "cat";
        String s2 = "cat";
        String s3 = new String("cat");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true
        //(1 ve 2 memoryde aynı yere işaret ederler, 3te yeni hello açılır o da ona işaret eder, “==” adres, “.equals” değer karşılaştırır.)

        System.out.println("------------------------------------------");


        String s4 = "1" + 3 + 3; // işlemler soldan sağa yapıldığı için başta string olduğundan + operatoru önce concatenation işlevi görür (stringi bir şeyle conc. yaptığımızda yine string oluşur.) sonra string gelmiş olur ve + yine conc. yapar sonuç olarak hepsi birleşmiş olur. )
        String s5 = 1 + 3 + "3"; // işlemler soldan sağa yapıldığı için önce toplama olur, sonra string geldiği için + operatörü concatenation yapar ve ikisi birleşir.
        System.out.println(s4); // 133
        System.out.println(s5); // 43

        System.out.println("------------------------------------------");
        System.out.println("abc".trim());           // abc
        System.out.println("\t   a b c\n".trim()); // a b c





        System.out.println("------------String Builder-----------");

        //String immutable old. için değiştirilermiyor o yüzden stringbuilder kullanıyoruz onu değiştirip düzenleyebiliriz.

        StringBuilder b = new StringBuilder(); // boş StringBuilder
        b.append(12345).append('-'); // 12345-
        System.out.println(b.length()); // 6 uzunluk direkt
        System.out.println(b.indexOf("-")); // 5 ("-"nin kaçıncı indexte olduğu)
        System.out.println(b.charAt(2)); // 3 (2. indexte ne var?)

        StringBuilder b2 = b.reverse(); // stringbuilderı reverse ediyoruz ve aynı objecte referans return ediyor. yani b ile b2 aynı referans
        System.out.println(b.toString()); // -54321 (b ike b2 aynı objecte referans old. için ve b2 artık b'nin terdini gösterdiği için b de tersi gösterir.)
        System.out.println(b == b2); // true

        ///!!! b.reverse() yapınca memoryde yeni nesne olulturulmaz b'nin içindeki veri direkt -54321 olarak değiştirilir.
        ///!!! metot işlem bitince b nesnesinin referansını return eder ve bu da b2ye eşitlenir.
        ///!!! sonuç olarak ikisi de bellekteki tek ve aynı StringBuilder kutusuna işaret eder.

        System.out.println("------------------------------------------");


        StringBuilder sb = new StringBuilder("abcde");
        sb.insert(1, '-').delete(3, 4); // önce insert ile -> 1. indexteki karakterden hemen önceye bir "-" koyarız (yani yeni 1. index o olacak) -> a-bcde olur.
        // sonrasında da .delete(3,4) ile -> 3. indexten başlayarak 4. indexe kadarki (4 dahil değil) ([3,4)) karakterleri sileriz. (yani     a-bcde -> a-bde olur yeni hali.
        System.out.println(sb); //a-bde
        System.out.println(sb.substring(2, 4)); // bd (2. indexten 4. indexe kadar olanki substring [2,4) .)


        ///There are three ways to construct a StringBuilder:
        /// StringBuilder sb1 = new StringBuilder();
        /// StringBuilder sb2 = new StringBuilder("animal");
        /// StringBuilder sb3 = new StringBuilder(10);
        /// The fi rst says to create a StringBuilder containing an empty sequence of characters and
        /// assign sb1 to point to it. The second says to create a StringBuilder containing a specifi c
        /// value and assign sb2 to point to it. For the fi rst two, it tells Java to manage the implementa
        /// tion details. The fi nal example tells Java that we have some idea of how big the eventual value
        /// will be and would like the StringBuilder to reserve a certain number of slots for characters

        ///StringBuilder sb = new StringBuilder("animals");
        /// String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        /// int len = sb.length();
        /// char ch = sb.charAt(6);
        /// System.out.println(sub + " " + len + " " + ch);
        /// The correct answer is anim 7 s.
        ///!!!Notice that substring() returns a String rather than a StringBuilder. That is why sb
        ///is not changed. substring() is really just a method that inquires about where the substring
        ///happens to be

    }
}