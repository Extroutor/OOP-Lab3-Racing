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

        HashMap<String, Integer> map = new HashMap<>();
        String winner = null;
        int minTime = 0;

        for (Transport transport : transportsArray) {

            int time = transport.GetRacingTime(distance);

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
