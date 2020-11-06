package Transports;

public abstract class Transport {

    private final String name;
    private final Double speed;
    private final RaceType type;

    protected Transport(String name, Double speed, RaceType type){

        this.name = name;
        this.speed = speed;
        this.type = type;

    }

    public String GetName() { return name; }
    public RaceType GetType() { return type; }
    protected Double GetSpeed() { return speed; }

    public abstract double GetRacingTime(double distance);

}
