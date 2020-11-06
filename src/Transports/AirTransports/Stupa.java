package Transports.AirTransports;

import Transports.AirTransport;

public class Stupa extends AirTransport {

    public Stupa() {

        super("Stupa", 8.0);

    }

    @Override
    public double DistanceReducer(double distance) {

        return distance*0.94;

    }

}
