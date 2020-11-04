package Transports.AirTransports;

import Transports.AirTransport;

public class MagicCarpet extends AirTransport {

    double speed = 10.0;

    @Override
    public String name() {
        return "MagicCarpet";
    }

    @Override
    public double GetAirRacingTime(double distance) {

        double totalTime;

        if (distance < 1000)
            totalTime = distance / speed;
        else if (distance < 5000)
            totalTime = distance*0.97/speed;
        else if (distance < 10000)
            totalTime = distance*0.9/speed;
        else totalTime = distance*0.95/speed;

        return totalTime;

    }



}
