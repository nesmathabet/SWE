import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StoreOwner extends systemUser {
	public StoreOwner() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
public void wantaddstore()throws Exception {
		//Adminstrator admin=new Adminstrator();
	    Scanner userInput2 = new Scanner(System.in);
		System.out.println("Name of store is:");
	    String sname = userInput2.nextLine();
	    System.out.println("Type of store is:" );
	    String stype = userInput2.nextLine();
	    System.out.println("location of store is:" );
	    String slocation = userInput2.nextLine();
	    System.out.println("Wait for the admin to accept this may take time"); 
	    
	    }
public void addnewstore()throws Exception {
    Scanner userInput2 = new Scanner(System.in);
	System.out.println("Name of store is:");
    String sname = userInput2.nextLine();
    System.out.println("Type of store is:" );
    String stype = userInput2.nextLine();
    System.out.println("location of store is:" );
    String slocation = userInput2.nextLine();
    new Store().addstoreinfo(sname,stype,slocation);
    }
public void addproducttostoreowner() throws Exception{
	Scanner userInput3 = new Scanner(System.in);
	System.out.println("name of products is:");
    String Pname = userInput3.nextLine();
    System.out.println("category of products is:" );
    String Pcategory = userInput3.nextLine();
    System.out.println("price of products is:" );
    String Pprice = userInput3.nextLine();
    System.out.println("name of brand is:");
    String Brandname = userInput3.nextLine();
    System.out.println("category of brand is:" );
    String Brandcategory = userInput3.nextLine();
     new ProductOfStoreowner().addstoreproductinfo(Pname,Pcategory, Pprice,Brandname,Brandcategory);
}


}