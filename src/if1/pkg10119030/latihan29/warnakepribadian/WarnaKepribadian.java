package if1.pkg10119030.latihan29.warnakepribadian;
import java.util.Scanner;
/**
* Nama              :Rendy Dermawan
* NIM               :10119030
* Kelas             :IF1
* Deskripsi Program :Program ini mendeskripsikan kepribadian seseorang, melalui
*                    warna yang dipilih.
*/
public class WarnaKepribadian {
    final Scanner scan = new Scanner(System.in);
    static String foreground = "\033[38;2;";
    static String background = "\033[48;2;";
    static String netral[] = {"\033[0m", "\033[38;2;255;255;255m"};
    String warna, nama;

        String[] merah = {
            "MERAH",
            "255;0;0m",
            "1. Periang, \n" +
            "2. Pemberani, \n" +
            "3. Berani mengambil risiko dalam setiap langkah, \n" +
            "4. Menyukai tantangan \n" +
            "5. Kurang sabar, \n" +
            "6. Dapat menahan marah namu jika sudah tahap puncak toleransi, kemarahanyya akan sulit dikontrol,\n" +
            "7. Memiliki energi kehangatan dan cinta." 
        };
        String[] biru = {
            "BIRU",
            "0;0;255m",
            "1. Menyenangkan, \n" +
            "2. Bijaksana, \n" +
            "3. Pembawaan diri tenang saat menghadapi masalah, \n" +
            "4. Dinamis, \n" +
            "5. Senang berbagi, \n" +
            "6. Bersahabat, \n" +
            "7. Tidak terlalu suka menjadi sorotan banyak orang, \n" +
            "8. Menyembunyikan peraaan karena karakternya yang cenderung mencari jalan damai." 
        };
        String[] kuning = {
            "KUNING",
            "255;255;0m",
            "1. Optimis, \n" +
            "2. Suka bergaul, \n" +
            "3. Periang, \n" +
            "4. Senang menolong, \n" +
            "5. Lincah dan aktif, \n" +
            "6. Tidak suka meremehkan kekurangan orang lain, \n" +
            "7. Loyal, \n" + 
            "8. Hangat, \n" +
            "9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil, \n" +
            "10. Cenderung penakut." 
        };
        String[] ungu = {
            "UNGU",
            "255;0;255m",
            "1. Optimis, \n" +
            "2. Tidak Pernah ragu, \n" +
            "3. Menurutnya pasangan yang ideal adalah yang memiliki mental kuat, \n" +
            "4. Memiliki ambisi yang benar, \n" +
            "5. Memiliki empati yang besar, \n" +
            "6. Memiliki sisi misterius sebab seringkali menutupi perasaanya, \n" +
            "7. Terkadang bersikapp keras kepala dan angkuh." 
        };
        String[] hijau = {
            "HIJAU",
            "0;255;0m",
            "1. Romantis, \n" +
            "2. Menyukai hal yang berbau alami dan keindahan, \n" +
            "3. Teguh pada prinsip, \n" +
            "4. Menginginkan kesempurnaan, \n" +
            "5. Mudah cemburu, \n" +
            "6. Mudah merasa iri, \n" +
            "7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan." 
        };
        
    private void masukkanWarna(){
        String[][] color ={merah, hijau, kuning, ungu, biru};
            System.out.println(foreground.concat(merah[1]).concat("YUK ")
                    .concat(foreground).concat(hijau[1]).concat("CEK ")
                    .concat(foreground).concat(kuning[1]).concat("KEPRIBADIANMU ")
                    .concat(foreground).concat(hijau[1]).concat("DARI ")
                    .concat(foreground).concat(ungu[1]).concat("WARNA ")
                    .concat(foreground).concat(biru[1]).concat("FAVORITMU\n"));
                  for (String[] x : color) {
                System.out.println(background.concat(x[1]).concat(netral[1]).concat("\t\t")
                        .concat(x[0]).concat("\t\t").concat(netral[0]));
            }
            System.out.print("\n PILIH WARNA FAVORITMU : ");
            warna = scan.next().toUpperCase();
            System.out.print("NAMA KAMU : ");
            nama = scan.next();
    }  /* Good */  
        private String menentukanKepribadian(){
            String warnaku = "Warna Favoritmu adalah ".concat(foreground);
            switch (this.warna) {
                case "MERAH" :
                    warnaku += String.join("", merah[1],merah[0],netral[0].concat("\n"), merah[2]);
                    break;
                case "BIRU" :
                    warnaku += String.join("", biru[1],biru[0],netral[0].concat("\n"), biru[2]);
                    break;
                case "HIJAU" :
                    warnaku += String.join("", hijau[1],hijau[0],netral[0].concat("\n"), hijau[2]);
                    break;
                case "KUNING" :
                    warnaku += String.join("", kuning[1],kuning[0],netral[0].concat("\n"), kuning[2]);
                    break;
                case "UNGU" :
                    warnaku += String.join("", ungu[1],ungu[0],netral[0].concat("\n"), ungu[2]);
                    break;
                default:
                    warnaku = "Oops.. Belum teridentifikasi";
            }
            return warnaku;
        }
    private void tampilTest(){
        System.out.println("====HASIL TEST KEPRIBADIAN "+nama+"===");
        System.out.println(menentukanKepribadian());
    }
    public static void main(String[] args) {
        WarnaKepribadian data = new WarnaKepribadian();
        data.masukkanWarna();
        data.tampilTest();
        System.out.println("(Developed by : Rendy Dermawan");   
    }   
}
