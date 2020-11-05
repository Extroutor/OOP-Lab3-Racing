package Transports.GroundTransports;

import Transports.GroundTransport;

public class CamelSpeedWalker extends GroundTransport {


    public CamelSpeedWalker() {

        name = "CamelSpeedWalker";
        speed = 40.0;
        timeBeforeRest = 10.0;
        individualRest.put(1, 5.0);
        individualRest.put(2, 6.5);
        usualTimeRest = 8.0;

    }

    public String GetName() {

        return name;

    }


}