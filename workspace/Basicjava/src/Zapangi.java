
public class Zapangi {
	
	boolean power = false;
	int coffe = 350;
	int cocoa = 400; 
	
	boolean power = false;// 전원
	int channel = 1; // 채널
	int volume = 5; // 음량

	final int MIN_CHANNEL = 1;
	final int MAX_CHANNEL = 100;
	final int MIN_VOLUME = 0;
	final int MAX_VOLUME = 10;
	
	
	void power(){ 
		power = !power;    //전원동작
		System.out.println(power ? "TV ON" : "TV OFF");
	}
	
	void changeChannel(int channel){
		if(power){
			if(MIN_CHANNEL <= channel && channel <= MAX_CHANNEL){
				this.channel = channel; //전역변수와 지역변수 구분하기위해 this 붙임
			}
			System.out.println("채널. " + this.channel);
		}
	}
	
	void channelUp(){
		changeChannel(channel +1); //코드의 재사용
	}
	
	void channelDown(){
		changeChannel(channel -1);
	}
	
	void volumeUp(){
		if(power){
			if(volume < MAX_VOLUME){
				volume++;
			}
			showVolume();
		}
	}
	
	void volumeDown(){
		if(power){
			if(MIN_VOLUME < volume){
				volume--;
			}
			showVolume();
		}
	}
	
	void showVolume(){
		System.out.print("음량. ");
		for(int i = MIN_VOLUME + 1; i <= MAX_VOLUME; i++){
			if(i <= volume){
				System.out.print("■");
			}else{
				System.out.print("□");
			}
		}
		System.out.println();
	}
}
