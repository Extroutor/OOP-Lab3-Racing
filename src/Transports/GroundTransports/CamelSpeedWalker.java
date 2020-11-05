package Transports.GroundTransports;

import Transports.GroundTransport;

public class CamelSpeedWalker extends GroundTransport {

    @Override
    public String name() {
        return "CamelSpeedWalker";
    }

    @Override
    public Double speed() { return 40.0; }

    @Override
    public Double timeBeforeRest() { return 10.0; }

    @Override
    public Double firstRestTime() { return 5.0; }

    @Override
    public Double secondRestTime() { return 6.5; }

    @Override
    public Double otherRestTime() { return 8.0; }


    @Override
    public double GetGroundRacingTime(double distance) {

        int restCount = (int) ((int) (distance / speed()) / timeBeforeRest());
        double totalTime = 0;

        for (int i = 0; i < restCount; i++) {

            if (i == 0)
                totalTime += timeBeforeRest() + firstRestTime();
            else if (i == 1)
                totalTime += timeBeforeRest() + secondRestTime();
            else
                totalTime += timeBeforeRest() + otherRestTime();

        }

        totalTime += distance / speed() - restCount * timeBeforeRest();

        return totalTime;
    }

}
