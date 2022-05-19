package homework;

public class Build_Taxi {
    int fuel; //주유량
    int speed = 0; // 속도 0으로 시작
    String destination; // 목적지
    int basicDist; // 기본거리
    int intervalDist; // 목적지까지 거리
    int finalDist;
    int basicfee; // 기본요금 3300원
    int distancefee; // 거리당 요금
    static int num; // 택시 고유 번호
    int driving = 0; // 운행 상태 (운행 정지로 시작) = 0일 때 운행 정지 1일 때 일반 상태 2일 때 운행 중
    int finalfee;



    public Build_Taxi(){
        num++;
    };

    public void Destination(String destination){
        this.destination = destination;
    }

    public void StartDrive(int fuel) {
        this.fuel = fuel;
        if (this.fuel < 10) { // 주유량이 10 아래일 때
            this.driving = 0; // 운행 정지 상태
        }else
            this.driving = 1; // 일반 상태로 전환
        }




    public void take() { // 승객 탑승
        if (this.driving == 1) {
            this.driving = 2; // 운행 중으로 전환
        }
    }

    public void Speed(int speed){
        this.speed = speed;
        if (this.driving==2){ // 운행 중일 때
            this.speed += 10; // 속도가 10 올라감
        }
    }

    public void fee(int basicDist,int intervalDist,int basicfee,int distancefee){
        this.intervalDist = intervalDist-basicDist;
        this.basicfee = basicfee;
        this.distancefee = distancefee;
        this.basicDist = basicDist;
        this.finalDist = intervalDist;

        if (this.driving==2 && basicDist < intervalDist){
            this.finalfee = this.basicfee+(this.distancefee*this.intervalDist);
        }
        if (this.driving==2 && basicDist > intervalDist){
            this.finalfee = this.basicfee;
        }

    }

    public void showinfo() {
        if (driving == 2) {
            System.out.println("택시 " + num + "번의 목적지는 " + destination + ". 기본거리는 " + basicDist + ". 총 거리는 " + finalDist + ". 주유량은 " + fuel + ". 속도는 " + speed + ". 기본요금 3300원 거리요금 " + distancefee + "원으로 " + "최종 요금은 " + finalfee + "원 입니다.");
        }else if (driving == 1) {
            System.out.println("택시 "+num+"번은 일반 상태입니다. 승객을 태울 수 있습니다.");
        }else if (driving == 0){
            System.out.println("택시 "+num+"번은 주유가 필요합니다. 운행할 수 없습니다.");
        }
    }

}



