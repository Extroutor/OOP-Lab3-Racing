package Transports.AirTransports;

import Transports.AirTransport;

public class Stupa extends AirTransport {

    double speed = 10.0;

    @Override
    public String name() {
        return "Stupa";
    }

    @Override
    public double GetAirRacingTime(double distance) {

        return distance*0.94/speed;

    }

}
