package controller;

import util.ScanUtil;

public class Coding {

	static int volume = 1;
	static int channel = 1;
	
	final int maxChannel = 10;
	final int minChannel = 0;
	final int maxVolume = 5;
	final int minVolume = 1;
	
	
	void channelUp(){
		channel++;
		if(channel>maxChannel){
			channel = 1;
		}
	}
	
	void channelDown(){
			channel--;
		if(channel<minChannel){
			channel = 10;
		}
	}
	
	
	void volumeup(){
		volume++;
		if(volume> maxVolume){
			volume=5;
		}
		showVolume();
	}
	
	void volumeDown(){
		volume--;
		if(volume<minVolume){
			volume=1;
		}
		showVolume();
	}
	
	void showVolume(){
		for(int i = maxVolume; i >= minVolume; i--){
			if(i <= volume){
				System.out.println("■");
			}else{
				System.out.println("□");}
	
		switch (volume){
		case 1 : break;
		case 2 : vol = "■■□□□"; break;
		case 3 : vol = "■■■□□"; break;
		case 4 : vol = "■■■■□"; break;
		case 5 : vol = "■■■■■"; break;
		}
		System.out.println("볼륨."+ vol);
		}
	}
	
	
	public static void main(String[] args) {
		Coding tv = new Coding();
		
		String[] menu = {"뒤로가기","한식","중식","일식"};
		int select = 3;
		vol:while(true){
			for(int i = 0; i < menu.length; i++){
			if(select == i+1)
				System.out.print("■");
			else System.out.print("□");
			System.out.println(menu[i]);
			}
			System.out.print("[ 5 : 위 , 2 :아래]");
			System.out.println("입력>");
			switch(ScanUtil.nextLine()){
			case "5" : 
				if(select == 1)
					select = menu.length;
				else if(select > 1) 
					select--;
				break;
			case "2" : 
				if(select == menu.length)
					select = 1;
				else if(select < menu.length) 
					select++; 
				break;
			case "" : break vol; 
			
			}
		}
		String str = "";
		switch(select){
		case 1 : str = menu[select-1]; break;
		case 2 : str = menu[select-1]; break;
		case 3 : str = menu[select-1]; break;
		case 4 : str = menu[select-1]; break;
		}
		System.out.println(str); 
		
		
		
		
		
		
		

//		int num = 2;
//		while(true){
//			String [] menu = {"티비켜기\n", "볼륨조절하기\n", "채널조절하기\n(위로가기 5, 아래로가기 2) "};
//			for(int i = 0; i<menu.length; i++){
//				if(num == i+1){
//					System.out.print("■");
//				}else System.out.print("□");
//				System.out.print(menu[i]);
//			}
//			
//			String input = ScanUtil.nextLine();
//			
//			switch(input) {
//			case "5" : if(num == 1){
//				num=menu.length; 
//			}else num--; break;
//			case "2" : if(num==menu.length){
//				num=1;
//			}else num++; break;
//			case "" : 
//				System.out.println("선택한 메뉴는 채널조절하기 입니다"); break;
			
			
		
		
		
		
		
//		while(true){
//			System.out.print("[ 5) 채널업 , 2) 채널다운]");
//			System.out.print("입력>");
//			int input = ScanUtil.nextInt();
//			
//			switch(input) {
//			case 2 : tv.channelDown();; break;
//			case 5 : tv.channelUp(); break;
//				
//			}
//			System.out.println("티비채널>"+channel);
//			
//		}
	}

}

















