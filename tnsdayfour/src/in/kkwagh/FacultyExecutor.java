package in.kkwagh;

import in.bkcmet.*;

public class FacultyExecutor {

	public void displayPublic() {
		System.out.print("Public method same class ");
	}
	
	public static void main(String[] args) {
		Library s = new Library(); // from in.bkc.met package
		FacultyExecutor s1=new FacultyExecutor();
		s.libraryName="MET BKC";
		
		s.displayPublic();
		s1.displayPublic();
		
		
/*
 * user Id and displayPrivate method is private so we can't access another package can only access within class */
		
//		s.userId=1;
//		s.displayPrivate();
		
		
		// we can not access outside another package we can access within package only 
//		s.bookName;
//		s.displyDefault();

	}

}