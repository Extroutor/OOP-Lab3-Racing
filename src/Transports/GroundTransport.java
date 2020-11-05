package Transports;

public class GroundTransport extends Transport {

    protected Double timeBeforeRest() { return 0.0; }
    protected Double firstRestTime() { return 0.0; }
    protected Double secondRestTime() { return 0.0; }
    protected Double otherRestTime() { return 0.0; }

    @Override
    public boolean CanTakePart(RaceType type) {
        return type != RaceType.AirTransport;
    }

}
