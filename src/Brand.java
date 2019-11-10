import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class Brand {
	product p=new product();
	private
	String bname;
    String bcategory;
   ArrayList<BrandEntity> BrandDatabase = new ArrayList<BrandEntity>();
   public Brand(String Bname,String Bcategory) throws Exception {
   this.bname=Bname;
   this.bcategory=Bcategory;
   
   BrandDatabase = readFromFile();
}
public Brand() throws Exception {
   BrandDatabase = readFromFile();
}

public ArrayList<BrandEntity> readFromFile() throws Exception{
	ArrayList<BrandEntity> Brands = new ArrayList<BrandEntity>();
	BufferedReader reader = new BufferedReader(new FileReader(new File("Brands.txt")));
	String line;
	while((line = reader.readLine()) != null) {
		String[] arr = line.split("\\|");
		Brands.add(new BrandEntity(arr[0], arr[1]));
	}
	return Brands;
}

public static void usingBufferedWritter(String textToAppend) throws IOException 
{
    BufferedWriter writer = new BufferedWriter(new FileWriter("Brands.txt", true));  
    writer.write(textToAppend);
    writer.newLine();   //Add new line
    writer.close();
}

public void addBrandinfo( String Bname, String Bcategory) throws IOException {
   for(int i = 0; i < BrandDatabase.size(); ++i) {
	   if(BrandDatabase.get(i).getBrandName().equals(Bname)) {
		   System.out.print("this Brand is found");
		   return;
	   }
   }
   
   usingBufferedWritter(Bname + "|" + Bcategory );
   System.out.println("Brand is added");
}

}
