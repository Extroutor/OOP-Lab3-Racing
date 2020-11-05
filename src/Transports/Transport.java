package Transports;

public abstract class Transport {

    protected String name;
    protected Double speed;

    public String GetName() { return ""; };

    public abstract boolean CanTakePart(RaceType type);

    public double GetGroundRacingTime(double distance) { return 0; }
    public double GetAirRacingTime(double distance) { return 0; }

}
