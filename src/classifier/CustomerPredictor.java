package classifier;

public class CustomerPredictor {
    public boolean predict(int umur, int statusPelajar, int tingkatPelunansanKredit) {
        
        boolean potensiMenjadiCustomer = false;
        
        if(umur == 1) {
            potensiMenjadiCustomer = true;
        } else if(umur ==0 && statusPelajar == 0) {
            potensiMenjadiCustomer = true;
        } else if (umur == 2 && tingkatPelunansanKredit == 0) {
            potensiMenjadiCustomer = true;
        } else {
            potensiMenjadiCustomer = false;
        }
        
        
        return potensiMenjadiCustomer;
    }
}
