package Transports.GroundTransports;

import Transports.GroundTransport;

public class BactrianCamel extends GroundTransport {

    public BactrianCamel() {

        name = "BactrianCamel";
        speed = 10.0;
        timeBeforeRest = 30.0;
        individualRest.put(1, 5.0);
        usualTimeRest = 8.0;
    }

    public String GetName() {

        return name;

    }

}