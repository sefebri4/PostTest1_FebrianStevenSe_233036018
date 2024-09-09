public class Lingkaran {
    public static void main(String[] args) {
        int r = 7;
        double pi = 3.14;
        double pi2 = 22/7;
        double keliling = 2 * pi * r;
        double luas = pi * r * r;
        double keliling2 = 2 * pi2 * r;
        double luas2 = pi2 * r * r;
        System.out.println("-----Jika pi = 3.14-----");
        System.out.println("Keliling Lingkaran: " + keliling + " cm2");
        System.out.println("Luas Lingkaran: " + luas + " cm2");

        System.out.println("-----Jika pi = 22/7-----");
        System.out.println("Keliling Lingkaran: " + keliling2 + " cm2");
        System.out.println("Luas Lingkaran: " + luas2 + " cm2");
    }
}
