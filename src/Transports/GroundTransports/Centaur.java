package Transports.GroundTransports;

import Transports.GroundTransport;

public class Centaur extends GroundTransport {

    Double timeBeforeRest = 8.0;
    Double restTime = 2.0;

    @Override
    public String name() {
        return "BootsEverywhereWalkers";
    }
    @Override
    public Double speed() { return 15.0; }
    @Override
    public Double timeBeforeRest() { return 8.0; }
    @Override
    public Double otherRestTime() { return 2.0; }

    @Override
    public double GetGroundRacingTime(double distance) {

        int restCount = (int) ((int) (distance / speed()) / timeBeforeRest);
        double totalTime = 0;

        for (int i = 0; i < restCount; i++) {
            totalTime += timeBeforeRest + restTime;
        }

        totalTime += distance/speed() - restCount*timeBeforeRest;

        return totalTime;

    }

}
