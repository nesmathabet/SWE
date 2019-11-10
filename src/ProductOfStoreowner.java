import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ProductOfStoreowner {
private String name;
private String category;
private String price;
private String brandname;
private String brandcategory;
   ArrayList<ProductOfStoreownerEntity> ProductOfStoreownerDatabase = new ArrayList<ProductOfStoreownerEntity>();
public ProductOfStoreowner(String Pname,String Pcategory,String Pprice,String bname,String bcategory) throws Exception {
   this.name=Pname;
   this.category=Pcategory;
   this.price=Pprice;
   this.brandname=bname;
   this.brandcategory=bcategory;
   ProductOfStoreownerDatabase = readFromFile();
}
public ProductOfStoreowner() throws Exception {
	ProductOfStoreownerDatabase = readFromFile();
}

public ArrayList<ProductOfStoreownerEntity> readFromFile() throws Exception{
	ArrayList<ProductOfStoreownerEntity> productstore = new ArrayList<ProductOfStoreownerEntity>();
	BufferedReader reader = new BufferedReader(new FileReader(new File("ProductsOfStoreowner.txt")));
	String line;
	while((line = reader.readLine()) != null) {
		String[] arr = line.split("\\|");
		productstore.add(new ProductOfStoreownerEntity(arr[0], arr[1], arr[2], arr[3], arr[4] ));
	}
	return productstore;
}

public static void usingBufferedWritter(String textToAppend) throws IOException //Dii el function ele zadet
{
    BufferedWriter writer = new BufferedWriter(new FileWriter("ProductsOfStoreowner.txt", true));  
    writer.write(textToAppend);
    writer.newLine();   //Add new line
    writer.close();
}

/*public void addstoreproductinfo( String pname, String pcategory,String pprice) throws Exception {
    boolean FoundinSystem=false;
	for(int i = 0; i < new product().prodctDatabase.size() ; ++i) {
	   if((pname.equals(new product().prodctDatabase.get(i).getName())) & 
	     (pcategory.equals(new product().prodctDatabase.get(i).getCategory())) &
	     (pprice.equals(new product().prodctDatabase.get(i).getPrice()))){
		      FoundinSystem=true;   
		 }
	}
	if(FoundinSystem==false) {
		System.out.println("Product is not found in system");
		return;
	}
     if(FoundinSystem==true) {
    	for(int i = 0; i < ProductOfStoreownerDatabase.size() ; ++i) {	       
	          if(ProductOfStoreownerDatabase.get(i).getName().equals(pname)) {
	   		   System.out.print("this product is already added  \n");
	   		   return;
	   	      }
    	 }
	    usingBufferedWritter(pname + "|" + pcategory + "|" + pprice);
	    System.out.println("Product is added to store");
	  }
}*/

public void addstoreproductinfo( String pname, String pcategory,String pprice,String bname,String bcategory) throws Exception {
   
	boolean FoundinSystem1=false;
	boolean FoundinSystem2=false;
	for(int i = 0; i < new product().prodctDatabase.size() ; ++i) {
	   if((pname.equals(new product().prodctDatabase.get(i).getName())) &
	     (pcategory.equals(new product().prodctDatabase.get(i).getCategory())) &
	     (pprice.equals(new product().prodctDatabase.get(i).getPrice()))){
		      FoundinSystem1=true;   
		 }
	}
	for(int j = 0; j < new Brand().BrandDatabase.size() ; ++j) {
		   if((bname.equals(new Brand().BrandDatabase.get(j).getBrandName())) & 
		     (bcategory.equals(new Brand().BrandDatabase.get(j).getBrandCategory())))
		     {
			      FoundinSystem2=true;   
			 }
		}
	
	if(FoundinSystem1==false || FoundinSystem2==false ) {
		System.out.println("The Product or Brand is not found in system");
		return;
	} 
     if(FoundinSystem1==true & FoundinSystem2==true) {
    	for(int i = 0; i < ProductOfStoreownerDatabase.size() ; ++i) {	       
	          if(ProductOfStoreownerDatabase.get(i).getName().equals(pname) & ProductOfStoreownerDatabase.get(i).getBrandName().equals(bname)) {
	   		   System.out.print("this product is already added with this brand  \n");
	   		   return;
	   	      }
    	 }
	    usingBufferedWritter(pname + "|" + pcategory + "|" + pprice + "|" + bname + "|" + bcategory);
	    System.out.println("Product is added to store with a brand");
	  }
   }
}
	   
   

