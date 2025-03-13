import java.util.Scanner;
public class MainSum15 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input15.nextInt();

        Sum15 sm = new Sum15(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = input15.nextDouble();
        }
        System.out.println("Total keuntungan menggunakan Buterforce: "+sm.totalBF());
        System.out.println("Total keuntungan menggunakan Devide and Conquer: "+sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}
