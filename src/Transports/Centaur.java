package Transports;

public class Centaur extends GroundTransport{

    int speed = 15;
    int timeBeforeRest = 8;
    int restTime = 2;

    @Override
    public String name() {
        return "BootsEverywhereWalkers";
    }

    @Override
    public int GetRacingTime(Integer distance) {

        int restCount = distance / speed;
        int totalTime = 0;

        for (int i = 0; i < restCount; i++) {

            totalTime += timeBeforeRest + restTime;
        }

        totalTime += distance - restCount*timeBeforeRest;

        return totalTime;
    }
}