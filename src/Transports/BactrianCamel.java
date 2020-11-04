package Transports;

public class BactrianCamel extends GroundTransport {

    int speed = 10;
    int timeBeforeRest = 30;
    int firstRestTime = 5;
    int otherRestTime = 8;

    @Override
    public String name() {
        return "BactrianCamel";
    }


    @Override
    public double GetRacingTime(double distance) {

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