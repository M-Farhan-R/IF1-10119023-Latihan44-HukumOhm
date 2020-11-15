/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan44.hukumohm;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : program menghitung rambatan listrik
 *
 */
public class IF110119023Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baterai b1 = new Baterai();
        Baterai b = new Baterai(3.0f, 12.0f);
        System.out.println();
        System.out.println("Kuat Arus : "+b.getKuatArus()+" Ampere(A)");
        System.out.println("Hambatan : "+b.getHambatan()+" Ohm(\u03A9)");
        System.out.println("Hasil Tegangan : "+b.hitungTegangan()+" Volt(V)");
    }

}
