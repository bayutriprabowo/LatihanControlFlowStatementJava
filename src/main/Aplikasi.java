package main;

import pembayaran.Pembayaran;
import sdm.Karyawan;
import billing.Customer;
import expertsystem.Expert;
import alarmsystem.Alarm;
import classifier.IrisClassifier;
import classifier.CustomerPredictor;

public class Aplikasi {
    public static void main(String[] args) {
        
        Pembayaran pembayaran = new Pembayaran();
        
        int nilaiYangDibayarkan;
        // gaji, pph, ptkp
        //test case 1
        nilaiYangDibayarkan = pembayaran.hitungPembayaran(6000000, 0.05);
        System.out.println(nilaiYangDibayarkan);
        
        //test case 2
        nilaiYangDibayarkan = pembayaran.hitungPembayaran(4000000, 0.05);
        System.out.println(nilaiYangDibayarkan);
        
        //test case 3
        nilaiYangDibayarkan = pembayaran.hitungPembayaran(5000000, 0.05);
        System.out.println(nilaiYangDibayarkan);
        
        System.out.println("--------------------------------");
        Karyawan karyawan = new Karyawan();
        
        int gajiYangDibayarkan;
        
        //test case 1
        gajiYangDibayarkan = karyawan.hitungGaji(6000000, 0.1, 6000000);
        System.out.println(gajiYangDibayarkan);
        
        //test case 2
        gajiYangDibayarkan = karyawan.hitungGaji(4000000, 0.1, 3000000);
        System.out.println(gajiYangDibayarkan);
        
        //test case 3
        gajiYangDibayarkan = karyawan.hitungGaji(500000, 0.1, 1000000);
        System.out.println(gajiYangDibayarkan);
        
        System.out.println("--------------------------------");
        int PPHYangHarusDibayarkan;
        // gaji, pph, ptkp
        //test case 1
        PPHYangHarusDibayarkan = karyawan.hitungPPH(6000000, 0.1, 6000000);
        System.out.println(PPHYangHarusDibayarkan);
        
        //test case 2
        PPHYangHarusDibayarkan = karyawan.hitungPPH(4000000, 0.1, 3000000);
        System.out.println(PPHYangHarusDibayarkan);
        
        //test case 3
        PPHYangHarusDibayarkan = karyawan.hitungPPH(500000, 0.1, 1000000);
        System.out.println(PPHYangHarusDibayarkan);
        
        System.out.println("--------------------------------");
        Customer customer = new Customer();
        int nilaiTagihanPembayaranSetelahDenda;
        
        // nilai tagihan pembayaran sebelum denda, prosentase denda, tanggal jatuh tempo, bulan jatuh tempo
        //test case 1
        nilaiTagihanPembayaranSetelahDenda = customer.hitungPembayaranTagihan(400000, 0.01, 1, 4);
        System.out.println(nilaiTagihanPembayaranSetelahDenda);
        
        //test case 2
        nilaiTagihanPembayaranSetelahDenda = customer.hitungPembayaranTagihan(300000, 0.01, 1, 3);
        System.out.println(nilaiTagihanPembayaranSetelahDenda);
        
        System.out.println("--------------------------------");
        Expert expert = new Expert();
        boolean jenisTumpahan;
        
        //test case 1
        jenisTumpahan = expert.isAceticAcid(true, 5, true);
        System.out.println(jenisTumpahan);
        
        //test case 2
        jenisTumpahan = expert.isAceticAcid(true, 6, true);
        System.out.println(jenisTumpahan);
        
        //test case 3
        jenisTumpahan = expert.isAceticAcid(true, 7, true);
        System.out.println(jenisTumpahan);
        
        //test case 4
        jenisTumpahan = expert.isAceticAcid(true, 5, false);
        System.out.println(jenisTumpahan);
        
        //test case 5
        jenisTumpahan = expert.isAceticAcid(true, 6, false);
        System.out.println(jenisTumpahan);
        
        //test case 6
        jenisTumpahan = expert.isAceticAcid(true, 7, false);
        System.out.println(jenisTumpahan);
        
        //test case 7
        jenisTumpahan = expert.isAceticAcid(false, 5, true);
        System.out.println(jenisTumpahan);
        
        //test case 8
        jenisTumpahan = expert.isAceticAcid(false, 6, true);
        System.out.println(jenisTumpahan);
        
        //test case 9
        jenisTumpahan = expert.isAceticAcid(false, 7, true);
        System.out.println(jenisTumpahan);
        
        
        System.out.println("--------------------------------");
        Alarm alarm = new Alarm();
        boolean statusAlarmWarning;
        
        //suhu yang terdeteksi sensor suhu, status senso asap, status sensot water detection
        //test case 1
        statusAlarmWarning = alarm.isAlarmStatusWarning(55.5, true, true);
        System.out.println(statusAlarmWarning);
        
        //test case 2
        statusAlarmWarning = alarm.isAlarmStatusWarning(60, true, true);
        System.out.println(statusAlarmWarning);
        
        //test case 3
        statusAlarmWarning = alarm.isAlarmStatusWarning(40, true, true);
        System.out.println(statusAlarmWarning);
        
        //test case 4
        statusAlarmWarning = alarm.isAlarmStatusWarning(55.5, false, true);
        System.out.println(statusAlarmWarning);
        
        //test case 5
        statusAlarmWarning = alarm.isAlarmStatusWarning(60, false, true);
        System.out.println(statusAlarmWarning);
        
        //test case 6
        statusAlarmWarning = alarm.isAlarmStatusWarning(40, false, true);
        System.out.println(statusAlarmWarning);
        
        //test case 7
        statusAlarmWarning = alarm.isAlarmStatusWarning(55.5, false, false);
        System.out.println(statusAlarmWarning);
        
        //test case 8
        statusAlarmWarning = alarm.isAlarmStatusWarning(60, false, false);
        System.out.println(statusAlarmWarning);
        
        //test case 1
        statusAlarmWarning = alarm.isAlarmStatusWarning(40, false, false);
        System.out.println(statusAlarmWarning);
        
        
        System.out.println("--------------------------------");
        IrisClassifier irisClassifier = new IrisClassifier();
        String jenisBunga;
        //panjang sepal, lebar sepal, panjang petal, lebar petal
        //test case 1
        jenisBunga = irisClassifier.predict(4.3, 3.0, 1.1, 0.1);
        System.out.println(jenisBunga);
        //test case 2
        jenisBunga = irisClassifier.predict(4.8, 3.0, 1.4, 0.1);
        System.out.println(jenisBunga);
        //test case 3
        jenisBunga = irisClassifier.predict(5.2, 4.1, 1.5, 0.1);
        System.out.println(jenisBunga);
        //test case 4
        jenisBunga = irisClassifier.predict(4.6, 3.6, 1.0, 0.2);
        System.out.println(jenisBunga);
        //test case 5
        jenisBunga = irisClassifier.predict(5.1, 3.3, 1.7, 0.5);
        System.out.println(jenisBunga);
        //test case 6
        jenisBunga = irisClassifier.predict(5.0, 3.5, 1.6, 0.6);
        System.out.println(jenisBunga);
        //test case 7
        jenisBunga = irisClassifier.predict(5.0, 2.3, 3.3, 1.0);
        System.out.println(jenisBunga);
        //test case 8
        jenisBunga = irisClassifier.predict(4.9, 2.4, 3.3, 1.0);
        System.out.println(jenisBunga);
        //test case 9
        jenisBunga = irisClassifier.predict(5.0, 2.0, 3.5, 1.0);
        System.out.println(jenisBunga);
        //test case 10
        jenisBunga = irisClassifier.predict(6.1, 2.8, 4.0, 1.3);
        System.out.println(jenisBunga);
        //test case 11
        jenisBunga = irisClassifier.predict(5.7, 2.8, 4.1, 1.3);
        System.out.println(jenisBunga);
        //test case 12
        jenisBunga = irisClassifier.predict(5.6, 3.0, 4.1, 1.3);
        System.out.println(jenisBunga);
        //test case 13
        jenisBunga = irisClassifier.predict(6.1, 2.6, 5.6, 1.4);
        System.out.println(jenisBunga);
        //test case 14
        jenisBunga = irisClassifier.predict(6.0, 2.2, 5.0, 1.5);
        System.out.println(jenisBunga);
        //test case 15
        jenisBunga = irisClassifier.predict(6.3, 2.2, 5.0, 1.5);
        System.out.println(jenisBunga);
        //test case 16
        jenisBunga = irisClassifier.predict(7.2, 3.0, 5.8, 1.6);
        System.out.println(jenisBunga);
        //test case 17
        jenisBunga = irisClassifier.predict(4.9, 2.5, 4.5, 1.7);
        System.out.println(jenisBunga);
        //test case 18
        jenisBunga = irisClassifier.predict(6.2, 2.8, 4.8, 1.8);
        System.out.println(jenisBunga);
        
        
        System.out.println("--------------------------------");
        CustomerPredictor customerPredictor = new CustomerPredictor();
        boolean potensiMenjadiCustomer;
        
        // umur(muda=0/dewasa=1/tua=2), status pelajar(pelajar=0/bukan pelajar=1), tiingkat pelunasan kredit(baik=0/buruk=1)
        //test case 1
        potensiMenjadiCustomer = customerPredictor.predict(0, 0, 0);
        System.out.println(potensiMenjadiCustomer);
        //test case 2
        potensiMenjadiCustomer = customerPredictor.predict(0, 0, 1);
        System.out.println(potensiMenjadiCustomer);
        //test case 3
        potensiMenjadiCustomer = customerPredictor.predict(0, 1, 0);
        System.out.println(potensiMenjadiCustomer);
        //test case 4
        potensiMenjadiCustomer = customerPredictor.predict(0, 1, 1);
        System.out.println(potensiMenjadiCustomer);
        //test case 5
        potensiMenjadiCustomer = customerPredictor.predict(1, 0, 0);
        System.out.println(potensiMenjadiCustomer);
        //test case 6
        potensiMenjadiCustomer = customerPredictor.predict(1, 0, 1);
        System.out.println(potensiMenjadiCustomer);
        //test case 7
        potensiMenjadiCustomer = customerPredictor.predict(1, 1, 0);
        System.out.println(potensiMenjadiCustomer);
        //test case 8
        potensiMenjadiCustomer = customerPredictor.predict(1, 1, 1);
        System.out.println(potensiMenjadiCustomer);
        //test case 9
        potensiMenjadiCustomer = customerPredictor.predict(2, 0, 0);
        System.out.println(potensiMenjadiCustomer);
        //test case 10
        potensiMenjadiCustomer = customerPredictor.predict(2, 0, 1);
        System.out.println(potensiMenjadiCustomer);
        //test case 11
        potensiMenjadiCustomer = customerPredictor.predict(2, 1, 0);
        System.out.println(potensiMenjadiCustomer);
        //test case 12
        potensiMenjadiCustomer = customerPredictor.predict(2, 1, 1);
        System.out.println(potensiMenjadiCustomer);
        
    }
    
}
