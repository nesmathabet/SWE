 import java.util.ArrayList;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class systemUser {
	private ArrayList<UserEntity> userDatabase = new ArrayList<UserEntity>();
        protected String nameOremail;
        protected String password;
        protected String conf;
        public File myObj=new File("Accounts.txt");
        public systemUser() throws Exception {
      	  userDatabase = readFromFile();
		}
		private Scanner input;
		public static void usingBufferedWritter(String textToAppend) throws IOException 
		{
		    BufferedWriter writer = new BufferedWriter(new FileWriter("Accounts.txt", true));
		    writer.write(textToAppend);  
		    writer.newLine();   //Add new line
		    writer.close();
		}
        public void register() throws IOException{
        	
    	  input = new Scanner(System.in);
    	  System.out.println("Registration Page");
    	  System.out.println("Be sure that the username is unique");
    	  System.out.printf("Register by email or username: ");
    	  nameOremail=input.nextLine();
    	  System.out.printf("Password: ");
    	  password=input.nextLine();
    	  System.out.printf("Confirm Password: ");
    	  conf=input.nextLine();
    	  int length=password.length();
    	  //File myObj=new File("Accounts.txt");
    	  if(length<6){
    		  System.out.println("Too short password,password must be more than 6 characters");
    		  System.out.printf("Password too short,Re-enter Password: ");
              password=input.next();
    		  }
    	  else{
    		  if(password.equals(conf)){
                  for(int i = 0; i < userDatabase.size(); i++) {
                	  if(userDatabase.get(i).getUsername().equals(nameOremail)) {
                          System.out.println("Username is already exists and used, please type another one");
                	      register();
                	  }
                  }
    			  usingBufferedWritter(nameOremail + "|" + password);
                  userDatabase.add(new UserEntity(nameOremail, password));
                  System.out.println("Register is done");
    		  }
    		  else 
    			  System.out.println("Password not matched, Re-Enter password");
    		  }
       }
        public ArrayList<UserEntity> readFromFile() throws Exception{
        	ArrayList<UserEntity> users = new ArrayList<UserEntity>();
        	BufferedReader reader = new BufferedReader(new FileReader(new File("Accounts.txt")));
        	String line;
        	while((line = reader.readLine()) != null) {
        		String[] arr = line.split("\\|");
        		users.add(new UserEntity(arr[0], arr[1]));
        	}
			return users;
        }
      public void login() throws Exception {
    	  input = new Scanner(System.in);
           System.out.println("Enter the username or email: ");
           nameOremail=input.nextLine();
           System.out.printf("Password: ");
     	   password=input.next();
     	  for(int i = 0 ; i < userDatabase.size(); ++i) {
     		  if(userDatabase.get(i).getUsername().equals(nameOremail) && userDatabase.get(i).getPassword().equals(password)) {
     			  System.out.println("You are logged in");
     			  return;
     		  }
     	  }
     	  System.out.println("Email or Password is wrong");
     	  login();
      }
}