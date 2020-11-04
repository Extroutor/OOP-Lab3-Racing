import Racing.Race;
import Transports.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Race groundRace = new Race(RaceType.GroundTransport, 1000);
        Race airRace = new Race(RaceType.AirTransport, 1000);

        BactrianCamel bactrianCamel = new BactrianCamel();
        BootsEverywhereWalkers bootsEverywhereWalkers = new BootsEverywhereWalkers();
        CamelSpeedWalker camelSpeedWalker = new CamelSpeedWalker();
        Centaur centaur = new Centaur();

        Broom broom = new Broom();
        MagicCarpet magicCarpet = new MagicCarpet();
        Stupa stupa = new Stupa();

        groundRace.AddTransport(bactrianCamel);
        groundRace.AddTransport(bootsEverywhereWalkers);
        groundRace.AddTransport(camelSpeedWalker);
        groundRace.AddTransport(centaur);
        System.out.println("Winner: " + groundRace.Run());

        airRace.AddTransport(broom);
        airRace.AddTransport(magicCarpet);
        airRace.AddTransport(stupa);
        System.out.println("Winner: " + airRace.Run());


    }
}
