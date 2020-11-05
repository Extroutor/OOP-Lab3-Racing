package Transports.AirTransports;

import Transports.AirTransport;

public class Stupa extends AirTransport {

    @Override
    public String name() {
        return "Stupa";
    }
    @Override
    public Double speed() { return 10.0; }

    @Override
    public double GetAirRacingTime(double distance) {

        return distance*0.94/speed();

    }

}
