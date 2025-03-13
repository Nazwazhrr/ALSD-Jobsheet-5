public class Mahasiswa15{
    String nama;
    int nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    public Mahasiswa15(String nama, int nim, int tahunMasuk, int nilaiUTS, int nilaiUAS){
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    public static class HitungNilai {
        public static int cariMaxDC(int arr[], int l, int r) {
            if (l == r) return arr[l];
            int mid = (l + r) / 2;
            int maxKiri = cariMaxDC(arr, l, mid);
            int maxKanan = cariMaxDC(arr, mid + 1, r);
            return Math.max(maxKiri, maxKanan);
        }
        public static int cariMinDC(int arr[], int l, int r) {
            if (l == r) return arr[l];
            int mid = (l + r) / 2;
            int minKiri = cariMinDC(arr, l, mid);
            int minKanan = cariMinDC(arr, mid + 1, r);
            return Math.min(minKiri, minKanan);
        }
    
        public static double rataRataUAS(int arr[]) {
            int total = 0;
            for (int nilai : arr) {
                total += nilai;
            }
            return (double) total / arr.length;
        }
    }
}
