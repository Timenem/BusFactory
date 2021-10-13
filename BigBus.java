package Lesson9.BusFactory;

public class BigBus extends BaseBus{

    public BigBus(int passengerCapacity) {
        super(passengerCapacity);
    }

    @Override
    public String toString(){
            return String.format("you choice Big Bus for %s  peoples ",passengerCapacity);

    }
}
