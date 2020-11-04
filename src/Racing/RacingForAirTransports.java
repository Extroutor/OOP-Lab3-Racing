package Racing;
import Transports.Transport;
import java.util.ArrayList;
import java.util.HashMap;

public class RacingForAirTransports {
    public ArrayList<Transport> transportsArray;

    RacingForAirTransports(ArrayList<Transport> transports) {

        this.transportsArray = transports;

    }

    protected String GetWinner(Double distance) {

        HashMap<String, Double> map = new HashMap<>();
        String winner = null;
        Double minTime = 0.0;

        for (Transport transport : transportsArray) {

            double time = transport.GetAirRacingTime(distance);

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
