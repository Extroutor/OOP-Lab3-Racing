package Transports.AirTransports;

import Transports.AirTransport;
import Transports.RaceType;

public class Stupa extends AirTransport {

    public Stupa() {

        super("Stupa", 8.0, RaceType.AirTransport);

    }

    @Override
    public double DistanceReducer(double distance) {

        return distance*0.94;

    }

}
