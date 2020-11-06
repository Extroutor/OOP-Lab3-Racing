package Transports.GroundTransports;

import Transports.GroundTransport;
import Transports.RaceType;

public class BactrianCamel extends GroundTransport {

    public BactrianCamel() {

        super("BactrianCamel", 10.0);
        timeBeforeRest = 30.0;
        individualRest.add(5.0);
        usualTimeRest = 8.0;

    }

}