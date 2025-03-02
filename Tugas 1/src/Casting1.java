/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg13020220239_nasrinaimtiyaszahra;

/**
 *
 * @author mac
 */
/*Casting menggunakan tipe data primitif*/
public class Casting1 {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            int a=5,b=6;
            float d=2.f,e=3.2f;
            char g='5';
            double k=3.14;
            System.out.println((float)a); // int <-- float

            System.out.println((double)b); // int <-- double
            System.out.println((int)d); // float <-- int
            System.out.println((double)e); // float <-- double
            System.out.println((int)g); // char <-- int (ASCII)
            System.out.println((float)g); // char <-- float (ASCII)
            System.out.println((double)g); // char <-- double (ASCII)
            System.out.println((int)k); // double <-- int
            System.out.println((float)k); // double <-- float
        }
}
