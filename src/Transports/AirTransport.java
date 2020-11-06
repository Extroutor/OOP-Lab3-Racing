package Transports;

public abstract class AirTransport extends Transport {


    protected AirTransport(String name, Double speed) {
        super(name, speed, RaceType.AirTransport);
    }

    public abstract double DistanceReducer(double distance);

    @Override
    public double GetRacingTime(double distance) {

        return DistanceReducer(distance)/GetSpeed();

    }

}
