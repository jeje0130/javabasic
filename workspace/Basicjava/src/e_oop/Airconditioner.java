package e_oop;

public class Airconditioner {

	boolean power = false;
	int temperature = 1; //온도
	int capacity = 5;  //풍량

	final int MIN_TEM = 10;
	final int MAX_TEM = 40;
	final int MIN_CAP = 0;
	final int MAX_CAP = 10;
	
	
	void power(){ 
		power = !power;
		System.out.println(power ? "에어컨 ON" : "에어컨 OFF");
	}
	
	void changeTamperature(int temperature){
		if(power){
			if(MIN_TEM <= temperature && temperature <= MAX_TEM){
				this.temperature = temperature;
			}
			System.out.println("온도. " + this.temperature);
		}
	}
	
	void temperatureUp(){
		changeTamperature(temperature +1); 
	}
	
	void temperatureDown(){
		changeTamperature(temperature -1); 
	}
	
	void capacityUp(){
		if(power){
			if(capacity < MAX_CAP){
				capacity++;
			}
			showCapacity();
		}
	}
	
	void capacityDown(){
		if(power){
			if(capacity < MIN_CAP){
				capacity--;
			}
			showCapacity2();
		}
	}
	
	void showCapacity(){
		System.out.print("풍량. ");
		for(int i = MIN_CAP + 1; i <= MAX_CAP; i++){
			if(i <= capacity){
				System.out.print("▶");
			}else{
				System.out.print("▷");
			}
		}
		System.out.println();
		
	}
	void showCapacity2(){
		System.out.print("풍량. ");
		for(int i = MIN_CAP + 1; i <= MAX_CAP; i++){
			if(i <= capacity){
				System.out.print("◀");
			}else{
				System.out.print("◁");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Airconditioner air = new Airconditioner();
		
		while(true){
			System.out.println("--------------------------------");
			System.out.println("1.전원 2.온도조절 3.온도업 4.온도다운");
			System.out.println("5.풍량업 6.풍량다운 0.종료");
			System.out.println("--------------------------------");
			System.out.println("번호 입력>");
			int input = ScanUtil.nextint();
			
			switch(input) {
			case 1: air.power(); break;
			case 2:
				System.out.println("온도 조절>");
				int tem = ScanUtil.nextint();
				air.changeTamperature(tem);
				break;
			case 3: air.temperatureUp(); break;
			case 4: air.temperatureDown(); break;
			case 5: air.capacityUp(); break;
			case 6: air.capacityDown(); break;
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0);

			}
		}
	}
}
