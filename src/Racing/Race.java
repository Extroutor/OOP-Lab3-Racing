package Racing;

import Transports.RaceType;
import Transports.Transport;

import java.util.ArrayList;
import java.util.HashMap;

public class Race {

    public final ArrayList<Transport> transportsList = new ArrayList<>();
    RaceType type;
    Double distance;

    public Race(RaceType type, Double distance) {

        this.type = type;
        this.distance = distance;

    }

    public void AddTransport(Transport transport) throws Exception {

        if (type == RaceType.AnyTransport || type == transport.GetType())
            transportsList.add(transport);
        else
            throw new Exception("Wrong type of transport");

    }

    public void Run() {

        HashMap<String, Double> map = new HashMap<>();
        String winner = null;
        Double minTime = -1.0;
        System.out.println("List of Transports in the race:");
        for (Transport transport : transportsList) {

            double time = transport.GetRacingTime(distance);
            map.put(transport.GetName(), time);

        }
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


