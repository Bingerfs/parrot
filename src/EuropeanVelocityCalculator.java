public class EuropeanVelocityCalculator {
    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage*getBaseSpeed());
    }
    public double getBaseSpeed() {
        return 12.0;
    }
}
