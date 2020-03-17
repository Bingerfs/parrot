
public class Parrot {

    private ParrotTypeEnum type;
    private int numberOfCoconuts = 0;
    private double voltage;
    private boolean isNailed;


    public Parrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = _type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        IParrotVelocityCalculator iParrotVelocityCalculator;
        switch(type) {
            case EUROPEAN:
                iParrotVelocityCalculator = new EuropeanVelocityCalculator();
                return iParrotVelocityCalculator.getSpeed();
            case AFRICAN:
                iParrotVelocityCalculator = new AfricanVelocityCalculator(this.numberOfCoconuts);
                return iParrotVelocityCalculator.getSpeed();
            case NORWEGIAN_BLUE:
                iParrotVelocityCalculator = new NorwegianVelocityCalculator(isNailed, voltage);
                return iParrotVelocityCalculator.getSpeed();
        }
        throw new RuntimeException("Should be unreachable");
    }




}