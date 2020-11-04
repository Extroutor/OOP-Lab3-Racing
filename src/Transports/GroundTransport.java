package Transports;

public class GroundTransport extends Transport {

    RaceType type = RaceType.GroundTransport;

    @Override
    public boolean CanTakePart(RaceType type) {
        return type != RaceType.AirTransport;
    }

}
