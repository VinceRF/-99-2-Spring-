package homework;
public class Build_Bus {
    int maxPass = 15; // 최대 승객 수
    int Pass; // 승객 수
    int fee; // 요금
    int fuel; // 주유량
    int speed; // 속도
    boolean driving = true; // 운행 상태
    static int num; //  버스 고유 번호


    public Build_Bus() { // 버스 번호 정하기
        num++;
    }

    public void take(int Pass ) {
        this.Pass = Pass;
        if (this.driving && this.Pass<this.maxPass) { // 운행중이고 승객 수가 최대 승객 수보다 적을 때)
            this.Pass++;
        }
    }

    public boolean Fuel(int fuel, int speed){
        this.fuel = fuel;
        this.speed = speed;
        if (driving==true){ // 운행중일때
            this.fuel--;
            this.speed++;
        }
        if(this.fuel<10){
            this.speed--;
            driving=false; // 차고지 행으로 전환

            return false;
        }
        return driving;
    }
    public void Fee(int fee){ // 버스 요금 정하기
        this.fee = fee;
    }
    public void showInfo(){
        if (driving==true) {
            System.out.println("버스" + num + "운행중이며, 승객 수는" + Pass + "명. 요금은" + fee + " 원." + " 속도는" + speed + ". 주유량은" + fuel);
        } else {
            System.out.println("버스" + num +"은 차고지행입니다."+" 주유가 필요합니다. 현재 주유량"+this.fuel+ " 속도는"+speed+".");
        }
        if(Pass>=this.maxPass){
            System.out.println("만원입니다. 승객을 더 태울 수 없습니다.");
        }
    }
}






