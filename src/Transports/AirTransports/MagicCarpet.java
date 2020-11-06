package Transports.AirTransports;

import Transports.AirTransport;

public class MagicCarpet extends AirTransport {

    public MagicCarpet() {

        super("MagicCarpet", 10.0);

    }

    @Override
    public double DistanceReducer(double distance) {

        double newDist;

        if (distance < 1000)
            newDist = distance;
        else if (distance < 5000)
            newDist = distance*0.97;
        else if (distance < 10000)
            newDist = distance*0.9;
        else newDist = distance*0.95;

        return newDist;

    }

}
