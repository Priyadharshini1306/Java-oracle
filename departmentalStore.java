import java.util.*;
import java.util.ArrayList;

interface Payment{
	void getPayment(double amount);
	static Payment modeOfPayment(String payment)
	{
		if("CreditCard".equalsIgnoreCase(payment))
		{
			return new CreditCardPayment();
		}
		else if("DebitCard".equalsIgnoreCase(payment))
		{
			return new DebitCardPayment();
		}
		else
		{
			return new UpiPayment();
		}
		
	}
}
class CreditCardPayment implements Payment{
	public void getPayment(double amount)
	{
		System.out.println("Credit card payment $" +amount+ " successful....");
	}
}
class DebitCardPayment implements Payment{
	public void getPayment(double amount)
	{
		System.out.println("Debit Card payment $" +amount+ " successful....");
	}
}
class UpiPayment implements Payment{
	public void getPayment(double amount)
	{
		System.out.println("Upi payment $" +amount+ " successful....");
	}
}
class Product{
	public int productNo;
	public String productName;
	public double productPrice;
	public int productQuantity;
	Product(int productNo,String productName,double productPrice,int productQuantity)
	{
		this.productNo = productNo;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity; 
	}
	public String toString()
	{
		return "productNo: " + productNo + " productName: " + productName + " productPrice " + productPrice + "productQuantity"
+ productQuantity;	}
}
class Order{
	public double finalAmount;
	public  double getTotal(List<Product> products)
	{
		for(Product p : products)
		{
			finalAmount += p.productPrice*p.productQuantity;
		}
		return finalAmount;
	}
	
}
class Customer{
	Product p;
	private String customerName;
	private String customerAdr;
	private long phNumber;
	Customer(String customerName,String customerAdr,long phNumber)
	{
		this.customerName = customerName;
		this.customerAdr = customerAdr;
		this.phNumber = phNumber;
	}
	public List<Product> addProduct()
	{
		ArrayList<Product> product = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of products:");
		int number;
		int prdno;
		String prdname;
		double prdprice;
		int prdqua;
		number = scan.nextInt();
		for(int i=0;i<number;i++)
		{
			System.out.print("enter the product no:");
			prdno = scan.nextInt();
			scan.nextLine();
			System.out.print("enter the product name:");
			prdname = scan.nextLine();
			System.out.print("enter the product price:");
			prdprice = scan.nextDouble();
			System.out.print("enter the product quantity:");
			prdqua = scan.nextInt();
			product.add(new Product(prdno,prdname,prdprice,prdqua));
		}
		return Collections.unmodifiableList(product);
	}
}
public class departmentalStore {
    public static void main(String args[])
   {
	   Scanner scan = new Scanner(System.in);
	   Customer c = new Customer("priya","cbe",1234566);
	   List<Product> pro = c.addProduct();
	   double d = new Order().getTotal(pro);
	   System.out.println("enter the mode of payment");
	   String paymentmethod = scan.nextLine();
	   Payment p = Payment.modeOfPayment(paymentmethod);
	   p.getPayment(d);
	   
   }
}
