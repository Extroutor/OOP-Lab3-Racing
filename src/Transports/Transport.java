package Transports;

public abstract class Transport {


    public String name() { return "No name"; }

    public abstract boolean CanTakePart(RaceType type);

    ////////////////////////////
    public int GetRacingTime(Integer distance) { return 0; }


}
