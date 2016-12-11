/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

/**
 *
 * @author HP
 */
public class Perhitungan {
    double z1,z2,z3,z4,Z;
    double a1,a2,a3,a4;
    double nBibit,nPanen;
    double penebaranBibitSedikit, penebaranBibitBanyak;
    double hariPanenSedang, hariPanenLama;
    int harga;
    
    public void hitunganRule1(){   
        //Jika PenebaranBibit Sedikit dan HariPanen Sedang maka Harga Mahal
        penebaranBibitSedikit = 1200;
        hariPanenSedang = 50;
              
        //menentukan niu
        nBibit = (1500 - penebaranBibitSedikit) / (1500 - 500);
        
        //menentukan niu hari panen sedang
        if ((hariPanenSedang >=40) && (hariPanenSedang <=80)) {
            nPanen = (hariPanenSedang - 40) / (80 - 40);
        }
        
        //tentukan alpha predikat (karena grafik segitiga)
        if (nBibit < nPanen) {
            a1 = nBibit;
        }else if (nBibit > nPanen) {
            a1 = nPanen;
        }
        
        //tentukan Z1
        z1 = (penebaranBibitSedikit + hariPanenSedang) * 700;
        System.out.println("a1 = " + String.valueOf(a1));
        System.out.println("z1 = " + String.valueOf(z1));
    }
    
    public void hitunganRule2(){   
        //Jika Penebaran Bibit Sedikit dan Hari Panen Lama maka harga Mahal
        penebaranBibitSedikit = 1200;
        hariPanenLama = 110;
              
        //menentukan niu Penebaran Bibit
        nBibit = (1500 - penebaranBibitSedikit) / (1500 - 500);
        
        //menentukan niu hari panen Lama
        if ((hariPanenLama >=100) && (hariPanenLama <=180)) {
            nPanen = (hariPanenLama - 100) / (180 - 100);
        }
        
        //tentukan alpha predikat (karena grafik segitiga)
        if (nBibit < nPanen) {
            a2 = nBibit;
        }else if (nBibit > nPanen) {
            a2 = nPanen;
        }
        
        //tentukan Z2
        z2 = (penebaranBibitSedikit + hariPanenLama) * 700;
        System.out.println("a2 = " + String.valueOf(a2));
        System.out.println("z2 = " + String.valueOf(z2));
    }
    
    public void hitunganRule3(){
        //Jika Penebaran Bibit Banyak dan Hari Panen Sedang maka harga Murah
        penebaranBibitBanyak = 1900;
        hariPanenSedang = 120;
              
        //menentukan niu bibit
        nBibit = (penebaranBibitBanyak - 1500) / (3000 - 1500);
        
        //menentukan niu hari panen sedang
        if ((hariPanenSedang !=80) && (hariPanenSedang <=120)) {
            nPanen = (hariPanenSedang - 110) / (120 - 80);
        }
        
        //tentukan alpha predikat (karena grafik segitiga)
        if (nBibit < nPanen) {
            a3 = nBibit;
        }else if (nBibit > nPanen) {
            a3 = nPanen;
        }
        
        //tentukan Z3
        z3 = (penebaranBibitBanyak + hariPanenSedang) * 150;
        System.out.println("a3 = " + String.valueOf(a3));
        System.out.println("z3 = " + String.valueOf(z3));
    }
    
    public void hitunganRule4(){
        //Jika Penebaran Bibit Banyak dan Hari Panen Lama maka harga Mahal
        penebaranBibitBanyak = 1900;
        hariPanenLama = 110;
              
        //menentukan niu bibit
        nBibit = (penebaranBibitBanyak - 1500) / (3000 - 1500);
        
        //menentukan niu hari panen sedang
        if ((hariPanenLama >=80) && (hariPanenLama <=120)) {
            nPanen = (hariPanenLama - 100) / (180 - 100);
        }
        
        //tentukan alpha predikat (karena grafik segitiga)
        if (nBibit < nPanen) {
            a4 = nBibit;
        }else if (nBibit > nPanen) {
            a4 = nPanen;
        }
        
        //tentukan Z3
        z4 = (penebaranBibitBanyak + hariPanenLama) * 500;
        System.out.println("a4 = " + String.valueOf(a4));
        System.out.println("z4 = " + String.valueOf(z4));
    }
    
    public void hitungZ(){
        Z = ((a1*z1)+(a2*z2)+(a3*z3)+(a4*z4)) / (a1+a2+a3+a4);
        System.out.println("a1 = " + String.valueOf(a1));
        System.out.println("a2 = " + String.valueOf(a2));
        System.out.println("a3 = " + String.valueOf(a3));
        System.out.println("a4 = " + String.valueOf(a4));
        
        System.out.println("ZBesar1 = " + String.valueOf(a1*z1));
        System.out.println("ZBesar2 = " + String.valueOf(a2*z2));
        System.out.println("ZBesar3 = " + String.valueOf(a3*z3));
        System.out.println("ZBesar4 = " + String.valueOf(a4*z4));
        System.out.println("Z = " + String.valueOf(Z));
    }
}
