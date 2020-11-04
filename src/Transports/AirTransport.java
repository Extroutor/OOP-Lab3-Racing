package Transports;

public class AirTransport extends Transport {

    @Override
    public boolean CanTakePart(RaceType type) {
        return type != RaceType.GroundTransport;
    }

}
