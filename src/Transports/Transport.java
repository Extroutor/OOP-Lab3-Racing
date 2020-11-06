package Transports;

public class Transport {

    protected String name;
    protected Double speed;

    public String GetName() { return ""; };

    public boolean CanTakePart(RaceType type) { return false; };

    public double GetGroundRacingTime(double distance) { return 0; }
    public double GetAirRacingTime(double distance) { return 0; }

}
