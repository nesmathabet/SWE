import java.util.Scanner;
public class Adminstrator  extends systemUser   {
	public Adminstrator() throws Exception {
		super();

	}
	
	public void addproducttosystem()throws Exception {
    	Scanner userInput2 = new Scanner(System.in);
		System.out.println("name of products is:");
	    String Pname = userInput2.nextLine();
	    System.out.println("category of products is:" );
	    String Pcategory = userInput2.nextLine();
	    System.out.println("price of products is:" );
	    String Pprice = userInput2.nextLine();
	       	    new product().addproductinfo(Pname,Pcategory, Pprice);
	}
	boolean check=true;
	public boolean AcceptStore() {
		System.out.println("Do you want to add this store to storeOwner enter 1 if no enter 2");
		Scanner request=new Scanner(System.in);
		int what=request.nextInt();
		if(what==1) {	
			return check;
		}
		check=false;
		return check;
     }
	////////
public void addBrandtosystem()throws Exception {
		
    	Scanner userInput2 = new Scanner(System.in);
		System.out.println("name of Brands is:");
	    String name = userInput2.nextLine();
	    System.out.println("category of Brands is:" );
	    String category = userInput2.nextLine();
	       	    new Brand().addBrandinfo(name,category);
}

}
