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
        t3.StartDrive(8);
        t3.showinfo();

        Build_Taxi t4 = new Build_Taxi();
        t4.Destination("광화문");
        t4.StartDrive(11);
//        t4.take(); // 기름이 충분하고 기본요금, 목적지 등의 값이 있더라도 take()로 승객을 태우지 않으면 일반 상태
        t4.Speed(50);
        t4.fee(1,2,3300,200);
        t4.showinfo();



    }
}
