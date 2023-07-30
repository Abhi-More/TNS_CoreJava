package in.bkcmet;

public class Library {

	public  String libraryName;
	private long userId;
	String bookName;
	
	//public method
	public  void displayPublic() {
		System.out.println("Library Name "+libraryName);
		
	}
	
	// private method
	
	private void displyPrivate() {
		System.out.println("User Id "+userId);
		
	}
	
	// default method
	void displyDefault() {
		System.out.println("bookName  "+bookName);		
	}

}