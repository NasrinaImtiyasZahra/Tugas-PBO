/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg13020220239_nasrinaimtiyaszahra;

/**
 *
 * @author mac
 */
import java.util.Scanner;
/* contoh membaca integer menggunakan Class Scanner*/
public class BacaData {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            /* Kamus */
            int a;
            Scanner masukan;
            /* Program */
            System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");

            masukan = new Scanner(System.in);
            a = masukan.nextInt(); /* coba ketik : masukan.nextInt(); ;

            Apa akibatnya ?*/

            System.out.print ("Nilai yang dibaca : "+ a);
        }
}
