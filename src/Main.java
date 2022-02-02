import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.print("sti gatti \n");
        System.out.println("sempre quelli");
        System.out.println("ancora");

        int x;
        x = 10;
        int y = 40;
        double z = 5.45;
        System.out.println(x + y + z);
        x = 20;
        System.out.println(x + y + z);

        String name = "Tizio";
        double temperature = 36.5;
        System.out.println("La temperatura di " + name + " è " + temperature);

        /*
        boolean true | false
        byte    -128 : 127
        short   -32768 : 32767
        int     -2 miliardi : 2 miliardi            int x = 2_000_000_000;
        long    -9 quintilioni : 9 quintilioni      long x = 5000000000000L; L finale
        float   6-7 cifre decimali                  float x = 5.76543f; f finale
        double  15 cifre decimali
        char    singolo carattere                   char x = 'f'; singoli apici
        String  stringa
         */

        // reference
        System.out.println(name.toUpperCase());

    }
}
