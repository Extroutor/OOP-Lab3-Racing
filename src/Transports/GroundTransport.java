package Transports;

import java.util.ArrayList;

public class GroundTransport extends Transport {

    protected ArrayList<Double> individualRest = new ArrayList<>();
    protected Double timeBeforeRest;
    protected Double usualTimeRest;

    protected GroundTransport(String name, Double speed) {
        super(name, speed, RaceType.GroundTransport);
    }


    @Override
    public double GetRacingTime(double distance) {

        ArrayList<Double> uniRests = new ArrayList<>(individualRest);
        int restCount = (int) ((distance / GetSpeed()) / timeBeforeRest);
        int count = restCount;
        double totalTime = 0;

        while (count != 0) {

            if (uniRests.size() == 0) {
                totalTime += timeBeforeRest + usualTimeRest;
                count--;
            }
            else {
                for (Double temp : uniRests) {

                    totalTime += timeBeforeRest + temp;
                    count--;

                }
                uniRests.clear();
            }

        }

        totalTime += distance / GetSpeed() - restCount * timeBeforeRest;

        return totalTime;

    }

}

