package Racing;
import Transports.RaceType;
import Transports.Transport;

import java.util.ArrayList;

public class Race {

    public final ArrayList<Transport> transportsList = new ArrayList<>();
    RaceType type;
    Integer distance = 0;

    public Race(RaceType type, Integer distance) {

        this.type = type;
        this.distance = distance;

    }

    public void AddTransport(Transport transport) throws Exception {

        if (transport.CanTakePart(type))
            transportsList.add(transport);
        else
            throw new Exception("Wrong type of transport");

    }

    public String Run() throws Exception {

        if (this.type == RaceType.GroundTransport) {
            RacingForGroundTransports racing = new RacingForGroundTransports(transportsList);
            return racing.GetWinner(distance);
//        }
//        else if (this.type == RaceType.AirTransport) {
//            RacingForAirTransports racing = new RacingForAirTransports(transportsList);
//            return racing.GetTime();
//        }
//        else if (this.type == RaceType.AnyTransport) {
//            RacingForAnyTransports racing = new RacingForAnyTransports(transportsList);
//            return racing.GetTime();
//        }
//        else
//            throw new Exception("Error");
//    }

        }
        return "Error";
    }
}



