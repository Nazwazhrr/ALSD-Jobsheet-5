public class MainNilaiMahasiswa15 {
        public static void main(String[] args) {
            Mahasiswa15[] mahasiswa = {
                new Mahasiswa15("Ahmad", 220101001, 2022, 78, 82),
                new Mahasiswa15("Budi", 220101002, 2022, 85, 88),
                new Mahasiswa15("Cindy", 220101003, 2021, 90, 87),
                new Mahasiswa15("Dian", 220101004, 2021, 76, 79),
                new Mahasiswa15("Eko", 220101005, 2023, 92, 95),
                new Mahasiswa15("Fajar", 220101006, 2020, 85, 85),
                new Mahasiswa15("Gina", 220101007, 2022, 80, 83),
                new Mahasiswa15("Hadi", 220101008, 2020, 82, 84)
            };
    
            int uts[] = new int[mahasiswa.length];
            int uas[] = new int[mahasiswa.length];
    
            for (int i = 0; i < mahasiswa.length; i++) {
                uts[i] = mahasiswa[i].nilaiUTS;
                uas[i] = mahasiswa[i].nilaiUAS;
            }
    
            System.out.println("Nilai UTS Tertinggi (DC): " + Mahasiswa15.HitungNilai.cariMaxDC(uts, 0, uts.length - 1));
            System.out.println("Nilai UTS Terendah (DC): " + Mahasiswa15.HitungNilai.cariMinDC(uts, 0, uts.length - 1));
            System.out.println("Rata-rata Nilai UAS (BF): " + Mahasiswa15.HitungNilai.rataRataUAS(uas));
        }
    }    

      
