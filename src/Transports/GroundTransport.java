package Transports;

public class GroundTransport extends Transport {

    @Override
    public boolean CanTakePart(RaceType type) {
        return type != RaceType.AirTransport;
    }

}
