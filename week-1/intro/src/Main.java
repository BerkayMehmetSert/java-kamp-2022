public class Main {
    public static void main(String[] args) {
        // Değişken isimlendirmeleri "camelCase" olarak yazılır.
        String metinsel = "Hello, World!";
        int tamSayisal = 42;
        double ondalikli = 3.14;
        boolean mantiksal = true;
        
        // Değişkenlerin değerlerini ekrana yazdırmak için "System.out.println()" kullanılır.
        System.out.println("Metinsel Değişken : " + metinsel);
        System.out.println("Tam Sayısal Değişken : " + tamSayisal);
        System.out.println("Ondalıklı Değişken : " + ondalikli);
        System.out.println("Mantıksal Değişken : " + mantiksal);
        
        String[] metinselDizi = {"eleman1" + "eleman2" + "eleman3"};
        int[] tamSayisalDizi = {1, 2, 3};
        double[] ondalikliDizi = {1.1, 2.2, 3.3};
        
        /*
         * Örnek - 1
         * Ok yönü hangi yöne olmalıdır ?
         * */
        
        String okYonu = "";
        
        double dolarDun = 18.15;
        double dolarBugun = 18.20;
        
        if (dolarBugun < dolarDun) {
            okYonu = "down.svg";
            System.out.println("Ok yönü : " + okYonu);
            
        } else if (dolarBugun > dolarDun) {
            okYonu = "up.svg";
            System.out.println("Ok yönü : " + okYonu);
            
        } else {
            okYonu = "equal.svg";
            System.out.println("Ok yönü : " + okYonu);
            
        }
        
        /*
         * Örnek - 2
         * Döngüleri ekrana yazdırmak.
         * */
        
        String[] arrays = {"eleman1", "eleman2", "eleman3"};
        
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
            
        }
    }
}