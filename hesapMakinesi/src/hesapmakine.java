import java.util.Scanner;

public class hesapmakine {
    public static void main(String[] args) {


        int yaz;

        System.out.println("1:toplama\n  2: cıkarma\n 3: bölme \n 4:çaprma\n");
        Scanner ne = new Scanner(System.in);
         yaz = ne.nextInt();

        Scanner in = new Scanner(System.in);
        int gir = in.nextInt();
        System.out.println(gir);
        Scanner input = new Scanner(System.in);
        int girr = input.nextInt();
        System.out.println(girr);

        switch (yaz) {
            case 1 -> System.out.println(gir + girr);
            case 2 -> System.out.println(gir - girr);
            case 3 -> System.out.println(gir / girr);
            case 4 -> System.out.println(gir * girr);
            default -> System.out.println("yanlış değer girdiniz");
        }
    }
}
