package Transports.AirTransports;

import Transports.AirTransport;

public class Stupa extends AirTransport {

    public Stupa() {
        name = "Stupa";
        speed = 8.0;
    }

    public String GetName() { return name;}

    public double GetAirRacingTime(double distance) {

        return distance*0.94/speed;

    }

}
