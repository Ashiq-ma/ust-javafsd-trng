package stream;

import java.util.ArrayList;
import java.util.List;

class Product{
	int id;
	String name;
	float price;
	public Product(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class Stream4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productsList=new ArrayList<Product>();
		productsList.add(new Product(1,"HP Laptop",25000f));
		productsList.add(new Product(2,"Dell Laptop",30000f));
		productsList.add(new Product(3,"Lenovo Laptop",28000f));
		productsList.add(new Product(4,"Sony Laptop",90000f));
		Float totalPrice=productsList.stream().map(product->product.price).reduce(0.0f,(sum,price)->sum+price);
		System.out.println(totalPrice);
		float totalPrice2=productsList.stream().map(product->product.price).reduce(0.0f,Float::sum);
		System.out.println(totalPrice2);
	}

}