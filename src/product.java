import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class product {
	private
		String name;
        String category;
        String price;
       ArrayList<ProductEntity> prodctDatabase = new ArrayList<ProductEntity>();
   public product(String Pname,String Pcategory,String Pprice) throws Exception {
	   this.name=Pname;
	   this.category=Pcategory;
	   this.price=Pprice;
	   
	   prodctDatabase = readFromFile();
   }
   public product() throws Exception {
	   prodctDatabase = readFromFile();
   }

   public ArrayList<ProductEntity> readFromFile() throws Exception{
   	ArrayList<ProductEntity> products = new ArrayList<ProductEntity>();
   	BufferedReader reader = new BufferedReader(new FileReader(new File("Products.txt")));
   	String line;
   	while((line = reader.readLine()) != null) {
   		String[] arr = line.split("\\|");
   		products.add(new ProductEntity(arr[0], arr[1], arr[2]));
   	}
		return products;
   }
   
   public static void usingBufferedWritter(String textToAppend) throws IOException //Dii el function ele zadet
	{
	    BufferedWriter writer = new BufferedWriter(new FileWriter("Products.txt", true));  
	    writer.write(textToAppend);
	    writer.newLine();   //Add new line
	    writer.close();
	}

   public void addproductinfo( String pname, String pcategory,String pprice) throws IOException {
	   for(int i = 0; i < prodctDatabase.size(); ++i) {
		   if(prodctDatabase.get(i).getName().equals(pname)) {
			   System.out.print("this product is found");
			   return;
		   }
	   }
	   
	   usingBufferedWritter(pname + "|" + pcategory + "|" + pprice);
	   System.out.println("Product is added to system");
}
}