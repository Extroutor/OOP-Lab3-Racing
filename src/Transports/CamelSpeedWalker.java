package Transports;

public class CamelSpeedWalker extends GroundTransport{

        int speed = 40;
        int timeBeforeRest = 10;
        int firstRestTime = 5;
        int secondRestTime = 6;
        int otherRestTime = 8;

        @Override
        public String name() {
            return "CamelSpeedWalker";
        }


        @Override
        public double GetGroundRacingTime(double distance) {

            int restCount = (int) distance / speed;
            double totalTime = 0;

            for (int i = 0; i < restCount; i++) {

                if (i == 0)
                    totalTime += timeBeforeRest + firstRestTime;
                else if (i == 1)
                    totalTime += timeBeforeRest + secondRestTime;
                else
                    totalTime += timeBeforeRest + otherRestTime;

            }

            totalTime += distance - restCount*timeBeforeRest;

            return totalTime;
        }


}
