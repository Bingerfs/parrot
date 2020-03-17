public interface IParrotVelocityCalculator{
    default public double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage*getBaseSpeed());
    }

    default double getLoadFactor() {
        return 9.0;
    }

    default double getBaseSpeed() {
        return 12.0;
    }

    double getSpeed();
}
