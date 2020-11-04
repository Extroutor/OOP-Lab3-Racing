package Racing;
import Transports.Transport;

import java.util.ArrayList;
import java.util.HashMap;

public class RacingForGroundTransports {
    public ArrayList<Transport> transportsArray;

    RacingForGroundTransports(ArrayList<Transport> transports) {

        this.transportsArray = transports;

    }

    protected String GetWinner(Integer distance) {

        HashMap<String, Double> map = new HashMap<>();
        String winner = null;
        Double minTime = 0.0;

        for (Transport transport : transportsArray) {

            double time = transport.GetRacingTime(distance);

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
