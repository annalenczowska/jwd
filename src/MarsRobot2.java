public class MarsRobot2 {

    String status;
    int speed;
    int power;

    MarsRobot2(String status, int speed, int power){            //konstruktor zparametryzowany
        this.status = status;
        this.speed =  speed;
        this.power = power;
    }

    MarsRobot2() {}

    public static void main(String[] args) {
        MarsRobot2 marsRobot2 = new MarsRobot2("w bazie", 0, 4);
        System.out.println(marsRobot2.status);
    }


    }

