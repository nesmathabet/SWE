/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.util.Scanner;

public class product {
	private
		String name;
        String category;
        String price;
       
   public product(String name,String category,String price) {
	   this.name=name;
	   this.category=category;
	   this.price=price; 

}
   public static void usingBufferedWritter(String textToAppend) throws IOException
	{
	    BufferedWriter writer = new BufferedWriter(new FileWriter("Products.txt", true));  
	   
	    writer.newLine();   //Add new line
	    writer.write(textToAppend);
	    writer.close();
	}
   public void addproductinfo() {
	   
	   Scanner input1 = new Scanner(System.in);
	   System.out.println("NAME of products is:");
	   String pname = input1.nextLine();
	   Scanner input2 = new Scanner(System.in);
	   System.out.println("category of products is:" );
	   String pcategory = input2.nextLine();
	   Scanner input3 = new Scanner(System.in);
	   System.out.println("price of products is:" );
	   String pprice = input3.nextLine();
	 
   }
   public void addnewproduct(String name,String category,String price)throws IOException {
	   
		product p=new product(name,category,price);
		usingBufferedWritter(name);
		usingBufferedWritter(category);
		usingBufferedWritter(price);
		
		ArrayList <String>words=new ArrayList<String>();
		BufferedReader br=new BufferedReader(new FileReader("Products.txt"));
		 String s=br.readLine();
		 while(s!=null) {
			 for(String word:words) {
				 if(!word.equals(p)) {
		p=new product(name,category,price);
		System.out.println("product is added");}
		else {
			System.out.println("product already exist");}
		
			
			
			 }
		 }br.close();
}
}*/