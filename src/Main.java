import Racing.Race;
import Transports.BactrianCamel;
import Transports.BootsEverywhereWalkers;
import Transports.RaceType;

public class Main {
    public static void main(String[] args) throws Exception {

        Race race1 = new Race(RaceType.GroundTransport, 1000);

        BactrianCamel bactrianCamel = new BactrianCamel();
        BootsEverywhereWalkers bootsEverywhereWalkers = new BootsEverywhereWalkers();


        race1.AddTransport(bactrianCamel);
        race1.AddTransport(bootsEverywhereWalkers);

        System.out.println("Winner: " + race1.Run());


    }
}
