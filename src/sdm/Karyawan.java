package sdm;

public class Karyawan {
    public int hitungGaji(int gajiSebelumPPH, double PPH, int PTKP) {
        int gajiSetelahPPH = gajiSebelumPPH;
        if(gajiSebelumPPH >= PTKP) {
            gajiSetelahPPH = (int) (gajiSebelumPPH - (gajiSebelumPPH * PPH));
        }
        return gajiSetelahPPH;
    }
    public int hitungPPH(int gajiSebelumPPH, double PPH, int PTKP){
        int PPHSetelahPenghitungan = 0;
        if(gajiSebelumPPH >= PTKP) {
            PPHSetelahPenghitungan = (int) (gajiSebelumPPH * PPH);
        }
        return PPHSetelahPenghitungan;
    }
}
