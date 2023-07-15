abstract class LibraryItem{
	private String title;
	private String itemID;
	private boolean ischeckedout;
	
	public LibraryItem(String title,String itemID){
		this.title=title;
		this.itemID=itemID;
		this. ischeckedout= ischeckedout;
	}
	
	public void checkOut(){
		 ischeckedout=true;
		 System.out.println(title+"has checked out");
	}
	
	public void checkIn(){
		 ischeckedout=false;
		 System.out.println(title+"has checked in");
	}
	
	public void displayItemDetails(){
		System.out.println("Title of the book: "+title);
		System.out.println("ItemID: "+itemID);
		//System.out.println("Is it checked out: "+ischeckedout);
	}
}

class Book extends LibraryItem{
	private String author;
	private int numPages;
	
	public Book(String title,String itemID,String author,int numPages){
		super(title,itemID);
		this.author=author;
		this.numPages=numPages;
	}
	
	public void displayItemDetails(){
		super.displayItemDetails();
		System.out.println("Author of the book: "+author);
		System.out.println("Number of the pages: "+numPages);
	}
}

class Magazine extends LibraryItem{
	private String issueDate;
	private String name;
	
	public Magazine(String title,String itemID,String issueDate,String name){
		super(title,itemID);
		this.issueDate=issueDate;
		this.name=name;
	}
	
	public void displayItemDetails(){
		super.displayItemDetails();
		System.out.println("The issuedate of the magazine: "+issueDate);
		System.out.println("The publisher: "+name);
	}
}
		

class LibraryMember{
	private String memberID;
	private String name;
	
	public LibraryMember(String memberID,String name){
		this.memberID=memberID;
		this.name=name;
	}
	
	public void displayMemberDetails(){
		System.out.println("The memberid: "+memberID);
		System.out.println("The name of the library member: "+name);
	}
}

class ManagementSystem{
	public static void main(String args[]){
	Book b1=new Book("The Catcher in the Rye","B001","J.D. Salinger",240);
	Book b2=new Book("To Kill a Mockingbird ","B002","Harper Lee",281);
	Book b3=new Book("1984","B003","George Orwell",328);
	Book b4=new Book("Pride and Prejudice","B004","Jane Austen",432);
	Book b5=new Book("The Hobbit","B005","J.R.R. Tolkien",320);
	
	Magazine m1=new Magazine("National Geographic","M001","August 2023","National Geographic Society");
	Magazine m2=new Magazine("Time","M002","September 2023","Time USA, LLC");
	Magazine m3=new Magazine("Forbes","M003","June 2023","Forbes Media");
	Magazine m4=new Magazine("Vogue","M004","July 2023","Condé Nast");
	Magazine m5=new Magazine("Sports Illustrated","M005","July 2023","Maven Coalition");
	
	LibraryMember lbm1=new LibraryMember("L001","John Doe");
	LibraryMember lbm2=new LibraryMember("L002","Jane Smith");
	LibraryMember lbm3=new LibraryMember("L003","David Johnson");
	LibraryMember lbm4=new LibraryMember("L004","Sarah Williams");
	LibraryMember lbm5=new LibraryMember("L005","Michael Brown");
	
	b1.checkOut();
	b2.checkOut();
	
	System.out.println("\nThe details of the books: ");
	System.out.println("\n");
	b1.displayItemDetails();
	b2.displayItemDetails();
	b3.displayItemDetails();
	b4.displayItemDetails();
	b5.displayItemDetails();
	
	System.out.println("\nThe details of the magazines: ");
	System.out.println("\n");
	m1.displayItemDetails();
	m2.displayItemDetails();
	m3.displayItemDetails();
	m4.displayItemDetails();
	m5.displayItemDetails();
	
	System.out.println("\nThe details of the library members: ");
	System.out.println("\n");
	lbm1.displayMemberDetails();
	lbm2.displayMemberDetails();
	lbm3.displayMemberDetails();
	lbm4.displayMemberDetails();
	lbm5.displayMemberDetails();
	}
}

	