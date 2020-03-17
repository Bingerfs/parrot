public class NorwegianVelocityCalculator implements IParrotVelocityCalculator{

    private Boolean isNailed;
    private double voltage;

    NorwegianVelocityCalculator(Boolean isNailed, double voltage){
        this.isNailed = isNailed;
        this.voltage = voltage;
    }

    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }
}
