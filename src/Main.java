import Racing.Race;
import Transports.*;
import Transports.AirTransports.Broom;
import Transports.AirTransports.MagicCarpet;
import Transports.AirTransports.Stupa;
import Transports.GroundTransports.BactrianCamel;
import Transports.GroundTransports.BootsEverywhereWalkers;
import Transports.GroundTransports.CamelSpeedWalker;
import Transports.GroundTransports.Centaur;

public class Main {
    public static void main(String[] args) throws Exception {

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
        System.out.println("Winner: " + groundRace.Run());

        airRace.AddTransport(broom);
        airRace.AddTransport(magicCarpet);
        airRace.AddTransport(stupa);
        System.out.println("Winner: " + airRace.Run());

        anyRace.AddTransport(broom);
        anyRace.AddTransport(bactrianCamel);
        System.out.println("Winner: " + anyRace.Run());

    }
}
