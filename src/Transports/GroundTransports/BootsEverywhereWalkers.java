package Transports.GroundTransports;

import Transports.GroundTransport;

public class BootsEverywhereWalkers extends GroundTransport {

    public BootsEverywhereWalkers() {

        name = "BootsEverywhereWalkers";
        speed = 6.0;
        timeBeforeRest = 60.0;
        individualRest.put(1, 10.0);
        usualTimeRest = 5.0;

    }

    @Override
    public String GetName() {

        return name;

    }


}
