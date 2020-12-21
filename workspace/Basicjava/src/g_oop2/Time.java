package g_oop2;

public class Time {

	private int hour; //다른 클래스에서 접근하지 못하도록 private를 붙여줌
	
	
	public int getHour() {  //변수의 값을 읽어오는 역할
		return hour;
	}

	public void setHour(int hour) {////변수의 값을 저장하는 역할
		if(hour < 0){
			this.hour = 0;
		}else if( 23 < hour){
			this.hour = 0;
		}else{
			this.hour = hour;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute < 0){
			this.minute = 0;
		}else if( 59 < minute){
			this.minute = 0;
			setHour(hour + 1);
		}else{
			this.minute = minute;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second < 0){
			this.second = 0;
		}else if( 59 < second){
			this.second = 0;
			setMinute(minute + 1);
		}else{
			this.second = second;
		}
		
	}

	private int minute;
	private int second;
	
	String getTime(){
		return hour + ":" + minute + ":" + second;
	}
	
//	void clock(){ //1초마다 증가되는 시간 출력
//		 while(true){
//			 System.out.println(getTime());
//			 stop(1000);
//			 setSecond(second + 1);
			 
		 }
	}
	
	private void stop(int interval){
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 프로그램을 일정시간동안 멈추는 메서드 
		  // ctrl + 1 : try - catch
		
	}
}




















