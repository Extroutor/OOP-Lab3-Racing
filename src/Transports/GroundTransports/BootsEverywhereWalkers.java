package Transports.GroundTransports;

import Transports.GroundTransport;

public class BootsEverywhereWalkers extends GroundTransport {

    public BootsEverywhereWalkers() {

        super("BootsEverywhereWalkers", 6.0);
        timeBeforeRest = 60.0;
        individualRest.add(10.0);
        usualTimeRest = 5.0;

    }

}
