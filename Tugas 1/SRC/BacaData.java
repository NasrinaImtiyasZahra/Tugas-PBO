import java.util.Scanner;  

/* Contoh membaca integer menggunakan Class Scanner */  
public class BacaData {  

    public static void main(String[] args) {  
        // Kamus  
        int a;  
        Scanner masukan;  

        // Program  
        System.out.print("Contoh membaca dan menulis, ketik nilai integer: \n");  

        masukan = new Scanner(System.in);  
        a = masukan.nextInt(); // Input dari pengguna  

        System.out.println("Nilai yang dibaca: " + a);  

        // Menutup Scanner setelah selesai digunakan  
        masukan.close();  
    }  
}
