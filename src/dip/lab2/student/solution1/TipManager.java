package dip.lab2.student.solution1;

public class TipManager {
    public double getTipForService(ITipCalculator tipCalculator){
        return tipCalculator.getTip();
    }
    
}
