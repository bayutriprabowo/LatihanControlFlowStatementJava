package alarmsystem;

public class Alarm {
    public boolean isAlarmStatusWarning(double suhuYangTerdeteksiSensorSuhu, boolean statusSensorAsap, boolean statusSensorWaterDetection) {
        boolean statusAlarmWarning = false;
        
        if(suhuYangTerdeteksiSensorSuhu > 55.5 || statusSensorAsap == true || statusSensorWaterDetection == true) {
            statusAlarmWarning = true;
        }
    
        return statusAlarmWarning;
    }
}