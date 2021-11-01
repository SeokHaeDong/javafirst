
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//인스턴스 배열 만들기 
		food_brand [] str_name = new food_brand[3];
		
		//인스턴스 대입하기 
		//배열을 만들고 인스턴스를 대입할 때는 빠른열거를 사용하면 안됨
		for(int i = 0; i < str_name.length; i++) {
			str_name[i] = new food_brand();
		}
		
		str_name[0].brande_name = "BHC";
		str_name[0].best_menu = "후라이드";
		str_name[0].price = 17000;
		str_name[0].type = "chicken";

		str_name[1].brande_name = "BBQ";
		str_name[1].best_menu = "핫올리브";
		str_name[1].price = 17000;
		str_name[1].type = "chicken";
		
		str_name[2].brande_name = "호식이";
		str_name[2].best_menu = "반반";
		str_name[2].price = 17000;
		str_name[2].type = "chicken";
		
		for(food_brand imsi : str_name) {
			System.out.println(imsi.brande_name + " = " + imsi.best_menu + " : " + imsi.price + " / " + imsi.type);
		}
		
		
//		System.out.println(str_name[0].brande_name + " = " + str_name[0].best_menu + " : " + str_name[0].price + str_name[0].type);
		
		
		
	}

}
