package Racing;

import Transports.RaceType;
import Transports.Transport;

import java.util.ArrayList;
import java.util.HashMap;

public class RacingForAnyTransports {
    public ArrayList<Transport> transportsArray;

    RacingForAnyTransports(ArrayList<Transport> transports) {

        this.transportsArray = transports;

    }
    protected String GetWinner(Double distance) {

        HashMap<String, Double> map = new HashMap<>();
        String winner = null;
        Double minTime = 0.0;

        for (Transport transport : transportsArray) {
            double time;

            if(transport.CanTakePart(RaceType.GroundTransport))
                time = transport.GetGroundRacingTime(distance);
            else
                time = transport.GetAirRacingTime(distance);

            map.put(transport.name(), time);

        }

        for (String trans : map.keySet()) {

            if (map.get(trans) < minTime)
                minTime = map.get(trans);
            winner = trans;
        }

        return winner;

    }
}
