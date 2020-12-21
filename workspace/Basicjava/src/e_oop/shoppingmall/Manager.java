package e_oop.shoppingmall;

import java.util.Arrays;

public class Manager {

	public static void main(String[] args) {
		
		Customer cus = new Customer();
		
		String order;
		System.out.println(cus.question1());
		
		System.out.println(cus.question2());
		
		System.out.println("옷 갖다 드리는 중...");
		
		cus.product("원피스");
		
		cus.pay("계산");
		

	}

}
