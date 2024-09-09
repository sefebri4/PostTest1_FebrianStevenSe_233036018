public class BacaNilai {
    public static void main(String[] args) {
        int nilai = 39;
        if (nilai >= 80) {
            System.out.println("Nilai "+ nilai + " mendapat indeks A");
        }
        else if (nilai >= 65) {
            System.out.println("Nilai "+ nilai + " mendapat indeks B");
        }
        else if (nilai >= 55) {
            System.out.println("Nilai "+ nilai + " mendapat indeks C");
        }
        else if (nilai >= 40) {
            System.out.println("Nilai "+ nilai + " mendapat indeks D");
        }
        else{
            System.out.println("Nilai "+ nilai + " mendapat indeks E");
        }
    }
}
