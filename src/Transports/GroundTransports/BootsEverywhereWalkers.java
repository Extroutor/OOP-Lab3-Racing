package Transports.GroundTransports;

import Transports.GroundTransport;

public class BootsEverywhereWalkers extends GroundTransport {

    @Override
    public String name() {
        return "BootsEverywhereWalkers";
    }
    @Override
    public Double speed() { return 6.0; }
    @Override
    public Double timeBeforeRest() { return 40.0; }
    @Override
    public Double firstRestTime() { return 10.0; }
    @Override
    public Double otherRestTime() { return 5.0; }


    @Override
    public double GetGroundRacingTime(double distance) {

        int restCount = (int) ((int) (distance / speed()) / timeBeforeRest());
        double totalTime = 0;

        for (int i = 0; i < restCount; i++) {

            if (i == 0)
                totalTime += timeBeforeRest() + firstRestTime();
            else
                totalTime += timeBeforeRest() + otherRestTime();

        }

        totalTime += distance/speed() - restCount*timeBeforeRest();

        return totalTime;
    }

}
