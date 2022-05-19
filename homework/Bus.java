package homework;

public class Bus {
    public static void main(String[] args) {
        Build_Bus b1 = new Build_Bus();
        b1.take(14);
        b1.Fuel(12,60);
        b1.Fee(1000);
        b1.showInfo();

        Build_Bus b2 = new Build_Bus();
        b2.Fuel(10,60);
        b2.showInfo();

        Build_Bus b3 = new Build_Bus();
        b3.Fuel(11,60); //  주유량을 11로 넣어도 메서드가 실행되며 기름이 1 줄어들기 때문에 차고지행으로 출력
        b3.showInfo();


    }

}
