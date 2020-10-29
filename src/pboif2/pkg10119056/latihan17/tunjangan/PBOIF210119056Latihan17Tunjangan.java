/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan17.tunjangan;
import java.util.Scanner;
/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Program Tunjangan
 */
public class PBOIF210119056Latihan17Tunjangan {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String status;
        int gajiPokok;
        double tunjangan,totalGaji;
                
        System.out.println("============Program Tunjangan============");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp.");
        gajiPokok = input.nextInt();
        System.out.print("Status Anda? (Menikah/Belum) :");
        status = input.next();
        if("Menikah".equals(status)){
            tunjangan = 0.35 * gajiPokok;
        }else{
            tunjangan=0;
        }
        totalGaji = gajiPokok + tunjangan;

        System.out.println("");
        System.out.println("========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok      : Rp. "+gajiPokok);
        System.out.println("Tunjangan       : Rp. "+tunjangan);
        System.out.println("Total Gaji      : Rp. "+totalGaji);
        System.out.println("(Develover by: Irfan Ginanjar)");
    }
    
}
