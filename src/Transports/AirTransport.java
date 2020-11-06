package Transports;

public abstract class AirTransport extends Transport {


    protected AirTransport(String name, Double speed, RaceType type) {
        super(name, speed, type);
    }

    public abstract double DistanceReducer(double distance);

    @Override
    public double GetRacingTime(double distance) {

        return DistanceReducer(distance)/GetSpeed();

    }

}
