package Transports.AirTransports;

import Transports.AirTransport;

public class Broom extends AirTransport {


    @Override
    public String name() { return "Broom"; }
    @Override
    public Double speed() { return 10.0; }


    @Override
    public double GetAirRacingTime(double distance) {

        double dist = distance;
        int count = (int) distance/1000;

        for (int i = 0; i < count; i++) {

            dist = dist*0.99;

        }

        return dist/speed();

    }

}
