package Transports.GroundTransports;

import Transports.GroundTransport;
import Transports.RaceType;

public class CamelSpeedWalker extends GroundTransport {


    public CamelSpeedWalker() {

        super("CamelSpeedWalker", 40.0, RaceType.GroundTransport);
        timeBeforeRest = 10.0;
        individualRest.add(5.0);
        individualRest.add(6.5);
        usualTimeRest = 8.0;

    }

}