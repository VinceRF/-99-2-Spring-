package homework;

public class Bus {
    public static void main(String[] args) {
        Build_Bus b1 = new Build_Bus();
        b1.take(14);
        b1.Fuel(11,60);
        b1.Fee(1000);
        b1.showInfo();

        Build_Bus b2 = new Build_Bus();
        b2.Fuel(10,60);
        b2.showInfo();


    }

}
