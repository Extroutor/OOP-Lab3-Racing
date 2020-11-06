package Transports.AirTransports;

import Transports.AirTransport;
import Transports.RaceType;

public class Broom extends AirTransport {

    public Broom() {

        super("Broom", 20.0);

    }

    @Override
    public double DistanceReducer(double distance) {

        int count = (int) distance/1000;

        for (int i = 0; i < count; i++) {

            distance = distance*0.99;

        }

        return distance;
    }

}
