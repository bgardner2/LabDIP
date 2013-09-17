package dip.lab2.student.solution1;

public interface ITipCalculator {
    /*TODO
     * Add service quality enumeration
     */
    public static enum ServiceQuality {
    GOOD, FAIR, POOR
}
    public abstract double getTip();
    public abstract void setServiceRating(ServiceQuality q);
    public abstract ServiceQuality getServiceQuality();
}
