package Transports.GroundTransports;

import Transports.GroundTransport;

public class Centaur extends GroundTransport {

    public Centaur() {

        name = "Centaur";
        speed = 15.0;
        timeBeforeRest = 8.0;
        usualTimeRest = 2.0;

    }

    public String GetName() {

        return name;

    }


}
