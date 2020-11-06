package Transports;

import java.util.HashMap;

public class GroundTransport extends Transport {

    protected HashMap<Integer, Double> individualRest = new HashMap<>();
    protected Double timeBeforeRest;
    protected Double usualTimeRest;

    @Override
    public boolean CanTakePart(RaceType type) {
        return type != RaceType.AirTransport;
    }

    @Override
    public double GetGroundRacingTime(double distance) {

        HashMap<Integer, Double> uniRests = new HashMap<>(individualRest);
        int restCount = (int) ((distance / speed) / timeBeforeRest);
        int count = restCount;
        double totalTime = 0;

        while (count != 0) {

            if (uniRests.size() == 0) {
                totalTime += timeBeforeRest + usualTimeRest;
                count--;
            }
            else {
                for (Integer temp : uniRests.keySet()) {

                    totalTime += timeBeforeRest + uniRests.get(temp);
                    count--;

                }
                uniRests.clear();
            }

        }

        totalTime += distance / speed - restCount * timeBeforeRest;

        return totalTime;

    }

}

