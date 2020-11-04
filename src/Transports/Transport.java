package Transports;

public abstract class Transport {

    public String name() { return "No name"; }

    public abstract boolean CanTakePart(RaceType type);

    public double GetGroundRacingTime(double distance) { return 0; }
    public double GetAirRacingTime(double distance) { return 0; }


}
