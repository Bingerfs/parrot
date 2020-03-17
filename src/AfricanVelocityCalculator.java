public class AfricanVelocityCalculator {

    private int numberOfCoconuts=0;

    AfricanVelocityCalculator(int numberOfCoconuts){
        this.numberOfCoconuts = numberOfCoconuts;
    }

    public double getSpeedAfrican() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage*getBaseSpeed());
    }

    private double getLoadFactor() {
        return 9.0;
    }

    private double getBaseSpeed() {
        return 12.0;
    }
}
