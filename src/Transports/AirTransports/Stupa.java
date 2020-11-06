package Transports.AirTransports;

import Transports.AirTransport;

public class Stupa extends AirTransport {

    public Stupa() {
        name = "Stupa";
        speed = 8.0;
    }

    @Override
    public String GetName() { return name;}

    @Override
    public double GetAirRacingTime(double distance) {

        return distance*0.94/speed;

    }

}
