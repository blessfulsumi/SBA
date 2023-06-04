package lti_sba;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



class Product{
	private int product_id;
	private String nameString;
	private double price;
	private int rating;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int product_id, String nameString, double price, int rating) {
		super();
		this.product_id = product_id;
		this.nameString = nameString;
		this.price = price;
		this.rating = rating;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "\nProduct [product_id=" + product_id + ", nameString=" + nameString + ", price=" + price + ", rating="
				+ rating + "]\n";
	}

}

public class List_SBA_Medium {

	public static void main(String[] args) {
		List<Product> products=new LinkedList<>();
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {

			products.add(new Product(
					scanner.nextInt(),
					scanner.next(),
					scanner.nextDouble(),
					scanner.nextInt()
					));
		}

		int choice=scanner.nextInt();
		switch(choice) {
		case 1:
			SortById(products);
			break;
		case 2:
			SortByName(products);
			break;
		case 3:
			SortByRating(products);
			break;

		default:
			System.out.println("Invalid choice");


		}

	}

	private static void SortByRating(List<Product> products) {
		Collections.sort(products,new	Comparator<Product>() {
			public int	compare(Product p1, Product p2) {
				return	Integer.compare(p1.getRating(),p2.getRating());
			}
		});
		System.out.println(products);

	}

	private static void SortByName(List<Product> products) {
		Collections.sort(products,new	Comparator<Product>() {
			public int	compare(Product p1, Product p2) {
				//a.name.compareToIgnoreCase(b.name)
				return	p1.getNameString().compareToIgnoreCase(p2.getNameString());
			}
		});
		System.out.println(products);

	}

	private static void SortById(List<Product> products) {
		Collections.sort(products,new	Comparator<Product>() {
			public int	compare(Product p1, Product p2) {
				return	Integer.compare(p1.getProduct_id(),p2.getProduct_id());
			}
		});
		System.out.println(products);

	}
}
