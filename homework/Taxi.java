package homework;

public class Taxi {
    public static void main(String[] args) {
        Build_Taxi t1 = new Build_Taxi();
        t1.Destination("광화문");
        t1.StartDrive(11);
        t1.take();
        t1.Speed(50);
        t1.fee(1,2,3300,200);
        t1.showinfo();

        Build_Taxi t2 = new Build_Taxi();
        t2.StartDrive(11);
        t2.showinfo();

        Build_Taxi t3 = new Build_Taxi();
        t3.StartDrive(9);
        t3.showinfo();

    }
}
