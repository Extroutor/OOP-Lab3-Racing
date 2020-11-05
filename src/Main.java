import Racing.Race;
import Transports.*;
import Transports.AirTransports.*;
import Transports.GroundTransports.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("");
        Race groundRace = new Race(RaceType.GroundTransport, 1000.0);
        Race airRace = new Race(RaceType.AirTransport, 1000.0);
        Race anyRace = new Race(RaceType.AnyTransport, 1000.0);

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
        groundRace.Run();

        airRace.AddTransport(broom);
        airRace.AddTransport(magicCarpet);
        airRace.AddTransport(stupa);
        airRace.Run();

        anyRace.AddTransport(broom);
        anyRace.AddTransport(bactrianCamel);
        anyRace.Run();

    }
}
