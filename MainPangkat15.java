import java.util.Scanner;

public class MainPangkat15 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input15.nextInt();

        Pangkat15[] png = new Pangkat15[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1) +": ");
            int basis = input15.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1) +": ");
            int pangkat = input15.nextInt();
            png[i] = new Pangkat15(basis, pangkat);
        }
        System.out.println("HASIL PANGKAT BRUTEFORCE: ");
        for (Pangkat15 p : png) {
            //System.out.println(p.nilai+"^" + p.pangkat + ": " + p.pangkatBF(p.nilai, p.pangkat));
            System.out.println(p.nilai+"^" + p.pangkat + ": " + p.pangkatBF());
        }   
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER: ");
        for (Pangkat15 p : png) {
            System.out.println(p.nilai+"^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
    }
}
}