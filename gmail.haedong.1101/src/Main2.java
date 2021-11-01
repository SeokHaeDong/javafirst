
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		food_brand.type = "Chicken";
		
		
		food_brand chicken_brand = new food_brand();
		chicken_brand.brande_name = "BHC";
		chicken_brand.best_menu = "후라이드";
		chicken_brand.sub_menu = new String[]{"감튀","치즈볼","윙"};
		chicken_brand.price = 16000;
		
		food_brand chicken_brand1 = new food_brand();
		chicken_brand1.brande_name = "처가";
		chicken_brand1.best_menu = "양념";
		chicken_brand1.price = 17000;
		
		
		System.out.println(food_brand.type);

		System.out.println(chicken_brand.brande_name + "=" + chicken_brand.best_menu + " : " + chicken_brand.price + "원 / " + chicken_brand.type + " / " +chicken_brand.sub_menu[0] );
		System.out.println(chicken_brand1.brande_name + "=" +chicken_brand1.best_menu + " : " + chicken_brand1.price + "원 / " + chicken_brand1.type );
	}

}
