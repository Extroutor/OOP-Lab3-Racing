package Transports;

public class AirTransport extends Transport {

    RaceType type = RaceType.AirTransport;

    @Override
    public boolean CanTakePart(RaceType type) {
        return this.type == type;
    }

}
