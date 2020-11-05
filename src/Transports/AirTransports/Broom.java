package Transports.AirTransports;

import Transports.AirTransport;

public class Broom extends AirTransport {


    public Broom() {
        name = "Broom";
        speed = 20.0;
    }

    @Override
    public String GetName() { return name;}

    @Override
    public double GetAirRacingTime(double distance) {

        double dist = distance;
        int count = (int) distance/1000;

        for (int i = 0; i < count; i++) {

            dist = dist*0.99;

        }

        return dist/speed;

    }

}
