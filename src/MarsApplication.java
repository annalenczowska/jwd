public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();         //pierwszy obiekt w metodzie
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;
        spirit.showAttributes();

        System.out.println("----------------------");

        System.out.println("Zwiększanie prędkości do 3.");
        spirit.speed = 3;
        spirit.showAttributes();

        System.out.println("----------------------");

        System.out.println("Zmiana temperatury do -90");
        spirit.temperature = -90;
        spirit.showAttributes();

        System.out.println("----------------------");

        System.out.println("Sprawdzenie temperatury");
        spirit.checkTemperature();
        spirit.showAttributes();

        System.out.println("----------------------");
        System.out.println("Laboratorium 2");

        MarsRobot opportunity = new MarsRobot();                    //drugi robot w metodzie
        opportunity.status = "eksploracja";
        opportunity.speed = 3;
        opportunity.temperature = -70;
        opportunity.showAttributes();


        System.out.println("----------------------");
        System.out.println("Status robota spirit:");
        spirit.checkStatus();
        System.out.println("Status robota opportunity:");
        opportunity.checkStatus();

    }

}
