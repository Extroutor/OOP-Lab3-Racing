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
    protected void GetWinner(Double distance) {

        HashMap<String, Double> map = new HashMap<>();
        String winner = null;
        Double minTime = -1.0;

        for (Transport transport : transportsArray) {
            double time;

            if(transport.CanTakePart(RaceType.GroundTransport))
                time = transport.GetGroundRacingTime(distance);
            else
                time = transport.GetAirRacingTime(distance);

            map.put(transport.name(), time);

        }
        System.out.println("List of Transports in the race:");
        for (String trans : map.keySet()) {
            System.out.println(trans + " - " + map.get(trans));
            if (minTime == -1.0) {
                minTime = map.get(trans);
                winner = trans;
            } else if (map.get(trans) < minTime) {
                minTime = map.get(trans);
                winner = trans;
            }
        }
        System.out.println("~Winner is " + winner + " - " + minTime);
        System.out.println("");

    }
}
