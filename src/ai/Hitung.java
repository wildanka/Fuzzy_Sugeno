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
public class Hitung {
    String predikatPenebaranBenih;
    String predikatHariPanen;
    String predikatHarga;
    double z1, z2, z3, z4, Z;
    double a1, a2, a3, a4;
    double nHariPanen, nBenih;

    //hitung niu benih sedikit
    public double hitungNBenihSedikit(double penebaranBenih) {
        //menentukan niu benih
        nBenih = (1500 - penebaranBenih) / (1500 - 500);
        return nBenih;
    }

    //hitung niu benih sedang(sedikit)
    public double hitungNBenihSedangSedikit(double penebaranBenih) {
        //menentukan niu benih
        nBenih = (penebaranBenih - 1000) / (1500 - 1000);
        return nBenih;
    }

    //hitung niu benih sedang(banyak)
    public double hitungNBenihSedangBanyak(double penebaranBenih) {
        nBenih = (2000 - penebaranBenih) / (2000 - 1500);
        return nBenih;
    }

    //hitung niu benih banyak
    public double hitungNBenihBanyak(double penebaranBenih) {
        nBenih = (penebaranBenih - 1500) / (3000 - 1500);
        return nBenih;
    }

    //hitung niu hari panen cepat
    public double hitungNHariPanenCepat(double hariPanen) {
        nHariPanen = (60 - hariPanen) / (60-30);
        return nHariPanen;
    }

    //hitung niu hari panen sedang(cepat)
    public double hitungNHariPanenSedangCepat(double hariPanen) {
        nHariPanen = (hariPanen - 40) / (80-40);
        return nHariPanen;
    }

    //hitung niu hari panen sedang(lama)
    public double hitungNHariPanenSedangLama(double hariPanen) {
        nHariPanen = (120 - hariPanen) / (120-80);
        return nHariPanen;
    }

    //hitung niu hari panen lama
    public double hitungNHariPanenLama(double hariPanen) {
        nHariPanen = (hariPanen - 100) / (180-100);
        return nHariPanen;
    }

    //menentukan niu Penebaran Benih yang digunakan apakah sedikit/sedang sedang/banyak
    public void pilihNBenih(double penebaranBenih) {
        if ((penebaranBenih >= 500) && (penebaranBenih < 1000)) { //kuadran 1
            hitungNBenihSedikit(penebaranBenih);           

            predikatPenebaranBenih = "Sedikit"; //maka predikat penebaran benih = sedikit
            System.out.println(predikatPenebaranBenih+" = "+hitungNBenihSedikit(penebaranBenih));
        } else if ((penebaranBenih >= 1000) && (penebaranBenih <= 1500)) { //kuadran 2            
            //bandingkan niu-nya
            if(hitungNBenihSedikit(penebaranBenih) < hitungNBenihSedangSedikit(penebaranBenih)){
                predikatPenebaranBenih = "Sedikit"; //maka predikat penebaran benih = sedikit
                
            }else{
                predikatPenebaranBenih = "Sedang"; //maka predikat penebaran benih = sedang
            }
            
            System.out.println(predikatPenebaranBenih+" = "+Math.min(hitungNBenihSedikit(penebaranBenih), hitungNBenihSedangSedikit(penebaranBenih)));
        } else if ((penebaranBenih >= 1500) && (penebaranBenih <= 2000)) { //kuadran 3            
            //bandingkan niu-nya
            Math.min(hitungNBenihSedangBanyak(penebaranBenih), hitungNBenihBanyak(penebaranBenih));
            if(hitungNBenihSedangBanyak(penebaranBenih) < hitungNBenihBanyak(penebaranBenih)){
                predikatPenebaranBenih = "Sedang"; //maka predikat penebaran benih = sedang
            }else{
                predikatPenebaranBenih = "Banyak"; //maka predikat penebaran benih = banyak
            }
            
            System.out.println(predikatPenebaranBenih+" = "+Math.min(hitungNBenihSedangBanyak(penebaranBenih), hitungNBenihBanyak(penebaranBenih)));
        } else if (penebaranBenih >= 1500) { //kuadran 4
            hitungNBenihBanyak(penebaranBenih);
            predikatPenebaranBenih = "Banyak"; //maka predikat penebaran benih = sedang
            System.out.println(predikatPenebaranBenih+" = "+hitungNBenihSedikit(penebaranBenih));
        }
    }
    //menentukan niu yang digunakan apakah cepat/sedang sedang/lama

    //Menentukan niu Hari Panen yang digunakan, apakah cepat/sedang sedang/lama
    public void pilihNHariPanen(double hariPanen) {
        if (hariPanen<40) { //kuadran 1 (cepat)
            hitungNHariPanenCepat(hariPanen);
            predikatHariPanen = "Cepat";
            System.out.println(predikatHariPanen+" "+hitungNHariPanenCepat(hariPanen));
        } else if((hariPanen >= 40) && (hariPanen <=60)){ //kuadran 2 (cepat/sedang)                        
            if(hitungNHariPanenCepat(hariPanen) < hitungNHariPanenSedangCepat(hariPanen)){
                predikatHariPanen = "Cepat";
            }else{
                predikatHariPanen = "Sedang";
            }
            Math.min(hitungNHariPanenSedangCepat(hariPanen), hitungNHariPanenCepat(hariPanen));
            System.out.println(predikatHariPanen+" "+Math.min(hitungNHariPanenSedangCepat(hariPanen), hitungNHariPanenCepat(hariPanen)));
        } else if((hariPanen >= 60) && (hariPanen <=80)){ //kuadran 3(sedang naik/cepat)
            hitungNHariPanenSedangCepat(hariPanen);
            predikatHariPanen = "Sedang";
            System.out.println(predikatHariPanen+" "+hitungNHariPanenSedangCepat(hariPanen));
        } else if((hariPanen >= 80) && (hariPanen <=100)){ //kuadran 4 (sedang turun/lambat)
            hitungNHariPanenSedangLama(hariPanen);
            predikatHariPanen = "Sedang";
            System.out.println(predikatHariPanen+" "+hitungNHariPanenSedangLama(hariPanen));
        } else if((hariPanen >= 100) && (hariPanen <=120)){
            if (hitungNHariPanenSedangLama(hariPanen) < hitungNHariPanenLama(hariPanen)) {
                predikatHariPanen = "Sedang";
            } else {
                predikatHariPanen = "Lama";
            }
            Math.min(hitungNHariPanenLama(hariPanen), hitungNHariPanenSedangLama(hariPanen));
            System.out.println(predikatHariPanen+" "+Math.min(hitungNHariPanenLama(hariPanen), hitungNHariPanenSedangLama(hariPanen)));
        } else if(hariPanen>=120){
            hitungNHariPanenLama(hariPanen);
            predikatHariPanen = "Lama";
            System.out.println(predikatHariPanen+" "+hitungNHariPanenLama(hariPanen));
        }
    }

    
    
    public double hargaMurah(double penebaranbenih, double hariPanen){
        double z = (penebaranbenih+hariPanen)*150;
        return z;
    }
    
    public double hargaSedang(double penebaranbenih, double hariPanen){
        double z = (penebaranbenih+hariPanen)*400;
        return z;
    }
    
    public double hargaMahal(double penebaranBenih, double hariPanen){
        double z = (penebaranBenih+hariPanen)*520;
        return z;
    }
    
    //menentukan harga berdasarkan rule
    public double ruleHarga(double penebaranBenih, double hariPanen){
        double hargaOptimal=0;
        if ((predikatPenebaranBenih.equals("Banyak")) && (predikatHariPanen.equals("Cepat"))) { //rule1
        //Jika PenebaranBibit Banyak dan HariPanen Cepat maka Harga Murah
            hargaOptimal = hargaMurah(penebaranBenih, hariPanen);
            predikatHarga = "Murah";
            System.out.println("Rule1, Murah = "+hargaMurah(penebaranBenih, hariPanen));
            return hargaOptimal;
        } else if ((predikatPenebaranBenih.equals("Sedang")) && (predikatHariPanen.equals("Cepat"))){  //rule2
        //Jika PenebaranBibit Sedang dan HariPanen Cepat maka Harga Murah
            hargaOptimal = hargaMurah(penebaranBenih, hariPanen);
            predikatHarga = "Murah";
            System.out.println("Rule2, Murah = "+hargaMurah(penebaranBenih, hariPanen));
        } else if((predikatPenebaranBenih=="Sedikit") && (predikatHariPanen=="Cepat")){  //rule3
        //Jika PenebaranBibit Sedikit dan HariPanen Cepat maka Harga Sedang
            hargaOptimal = hargaSedang(penebaranBenih, hariPanen);
            predikatHarga = "Sedang";
            System.out.println("Rule3, Sedang = "+hargaSedang(penebaranBenih, hariPanen));
        } else if ((predikatPenebaranBenih=="Banyak") && (predikatHariPanen=="Sedang")){  //rule4
        //Jika Penebaran Bibit Banyak dan Hari Panen Sedang maka harga Murah        
            hargaOptimal = hargaMurah(penebaranBenih, hariPanen);
            predikatHarga = "Murah";
            System.out.println("Rule4, Murah = "+hargaMurah(penebaranBenih, hariPanen));
        } else if ((predikatPenebaranBenih=="Sedang") && (predikatHariPanen=="Sedang")){  //rule5
        //Jika PenebaranBibit Sedang dan HariPanen Sedang maka Harga Sedang
            hargaOptimal = hargaSedang(penebaranBenih, hariPanen);
            predikatHarga = "Sedang";
            System.out.println("Rule5, Sedang= "+hargaSedang(penebaranBenih, hariPanen));
        } else if ((predikatPenebaranBenih=="Sedikit") && (predikatHariPanen=="Sedang")){  //rule6
        //Jika PenebaranBibit Sedikit dan HariPanen Sedang maka Harga Mahal
            hargaOptimal = hargaMahal(penebaranBenih, hariPanen);
            predikatHarga = "Mahal";
            System.out.println("Rule 6, Mahal= "+hargaMahal(penebaranBenih, hariPanen));
        } else if ((predikatPenebaranBenih.equals("Banyak")) && (predikatHariPanen.equals("Lama"))){  //rule7
        //Jika Penebaran Bibit Banyak dan Hari Panen Lama maka harga Mahal
            hargaOptimal = hargaMahal(penebaranBenih, hariPanen);
            predikatHarga = "Mahal";
            System.out.println("Rule 7, Mahal= "+hargaMahal(penebaranBenih, hariPanen));
        } else if ((predikatPenebaranBenih=="Sedang") && (predikatHariPanen=="Lama")){  //rule8
        //Jika Penebaran Bibit Sedang dan Hari Panen Lama maka harga Mahal 
            hargaOptimal = hargaMahal(penebaranBenih, hariPanen);
            predikatHarga = "Mahal";
            System.out.println("Rule 8, Mahal= "+hargaMahal(penebaranBenih, hariPanen));
        } else if ((predikatPenebaranBenih=="Sedikit") && (predikatHariPanen=="Lama")){  //rule9
        //Jika Penebaran Bibit Sedikit dan Hari Panen Lama maka harga Mahal    
            hargaOptimal = hargaMahal(penebaranBenih, hariPanen);
            predikatHarga = "Mahal";
            System.out.println("Rule 9, Mahal= "+hargaMahal(penebaranBenih, hariPanen));
            return hargaOptimal;
        }             
        return hargaOptimal;
    }
    
}
