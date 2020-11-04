package Transports;

public class BootsEverywhereWalkers extends GroundTransport {

    int speed = 6;
    int timeBeforeRest = 60;
    int firstRestTime = 10;
    int otherRestTime = 5;

    @Override
    public String name() {
        return "BootsEverywhereWalkers";
    }

    @Override
    public double GetGroundRacingTime(double distance) {

        int restCount = (int) distance / speed;
        double totalTime = 0;

        for (int i = 0; i < restCount; i++) {

            if (i == 0)
                totalTime += timeBeforeRest + firstRestTime;
            else
                totalTime += timeBeforeRest + otherRestTime;

        }

        totalTime += distance - restCount*timeBeforeRest;

        return totalTime;
    }

}
