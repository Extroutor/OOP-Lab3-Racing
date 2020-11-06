package Transports.GroundTransports;

import Transports.GroundTransport;
import Transports.RaceType;

public class BootsEverywhereWalkers extends GroundTransport {

    public BootsEverywhereWalkers() {

        super("BootsEverywhereWalkers", 6.0, RaceType.GroundTransport);
        timeBeforeRest = 60.0;
        individualRest.add(10.0);
        usualTimeRest = 5.0;

    }

}
