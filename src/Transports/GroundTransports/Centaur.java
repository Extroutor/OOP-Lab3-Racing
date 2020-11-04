package Transports.GroundTransports;

import Transports.GroundTransport;

public class Centaur extends GroundTransport {

    int speed = 15;
    int timeBeforeRest = 8;
    int restTime = 2;

    @Override
    public String name() {
        return "BootsEverywhereWalkers";
    }

    @Override
    public double GetGroundRacingTime(double distance) {

        int restCount = (int) distance / speed;
        double totalTime = 0;

        for (int i = 0; i < restCount; i++) {
            totalTime += timeBeforeRest + restTime;
        }

        totalTime += distance - restCount*timeBeforeRest;

        return totalTime;

    }

}
