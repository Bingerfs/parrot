public class AfricanVelocityCalculator implements IParrotVelocityCalculator{

    private int numberOfCoconuts=0;

    AfricanVelocityCalculator(int numberOfCoconuts){
        this.numberOfCoconuts = numberOfCoconuts;
    }

    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

}
