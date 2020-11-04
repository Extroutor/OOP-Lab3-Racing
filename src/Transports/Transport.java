package Transports;

public abstract class Transport {

    public String name() { return "No name"; }

    public abstract boolean CanTakePart(RaceType type);

    public double GetRacingTime(double distance) { return 0; }

}
