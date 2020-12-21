package e_oop;

public class TvTv {
	
	boolean power = false; 
	int channel = 1;
	int volume = 5;
	
	final int MIN_CHANNEL = 1;
	final int MAX_CHANNEL = 100;
	final int MIN_VOLUME = 0;
	final int MAX_VOLUME = 10;
	
	void power(){
		power = !power;
		System.out.println(power ? "TV 켜기" : "TV 끄기");
	}
	
	void changeChannel(int channel){
		if(power){
			if(MIN_CHANNEL <= channel && channel <= MAX_CHANNEL){
				this.channel = channel;
			}
			System.out.println("채널. "+ this.channel);
		}
	}
	
	void channelUp(){
		changeChannel(channel +1);
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
		for(int i = MIN_VOLUME +1; i <= MAX_VOLUME; i++){
			if(i <= volume){
				System.out.print("★");
			}else{
				System.out.print("☆");
			}
		}System.out.println();
	}
	
	
	public static void main(String[] args) {
		TvTv tv = new TvTv();
		
		while(true){
			System.out.println("=============================");
			System.out.println("1.전원 2.채널변경 3.채널업 4.채널다운");
			System.out.println("5.볼륨업 6.볼륨다운 0.종료");
			System.out.println("=============================");
			System.out.println("번호 입력>");
			int input = ScanUtil.nextint();
					
			switch(input){
			case 1: tv.power(); break;
			case 2:
				System.out.println("변경할 채널 입력>");
				int ch = ScanUtil.nextint();
				tv.changeChannel(ch);
				break;
			case 3: tv.channelUp(); break;
			case 4: tv.channelDown(); break;
			case 5: tv.volumeUp(); break;
			case 6: tv.volumeDown(); break;
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0); 
			}
		}
	}

}


















