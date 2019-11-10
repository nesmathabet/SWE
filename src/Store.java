import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class Store {
	
 
 public String storelocation;
 public String storetype;
 public String storename;
 ArrayList<StoreEntity> StoreDatabase=new ArrayList<StoreEntity>();
 public Store(String storename ,String storetype, String storelocation ) throws Exception {
	 this.storename=storename;
	 this.storetype=storetype;
	 this.storelocation=storelocation;
	 StoreDatabase=readFromFile();
 }
 public Store() throws Exception{
	 StoreDatabase=readFromFile();
 }
 public ArrayList<StoreEntity> readFromFile() throws Exception{
	   	ArrayList<StoreEntity> store = new ArrayList<StoreEntity>();
	   	BufferedReader reader = new BufferedReader(new FileReader(new File("Store.txt")));
	   	String line;
	   	while((line = reader.readLine()) != null) {
	   		String[] arr = line.split("\\|");
	   		store.add(new StoreEntity(arr[0], arr[1], arr[2]));
	   	}
			return store;
}
 public static void usingBufferedWritter(String textToAppend) throws IOException 
{
	    BufferedWriter writer = new BufferedWriter(new FileWriter("Store.txt", true));  
	    writer.write(textToAppend);
	    writer.newLine();   //Add new line
	    writer.close();
}
 public void addstoreinfo( String storename, String storetype,String storelocation) throws IOException {
	   for(int i = 0; i < StoreDatabase.size(); ++i) {
		   if(StoreDatabase.get(i).getname().equals(storename)) {
			   System.out.print("this product is found");
			   return;
		   }
	   }
	   
	   usingBufferedWritter(storename + "|" + storetype + "|" + storelocation );
	   System.out.println("Store is added");
}
}

