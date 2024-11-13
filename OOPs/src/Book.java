
public class Book {
	
	String Book_name;
	String type;
	String author;
	float price;
	
	Book()
	{
		System.out.println("No argument constructor is called default constructor");
	    Book_name="abc";
	    type="novel";
	    author="xyz";
	    price=100;
	    
	}
	
	Book(String Book_name, String type, String author, float price)
	{
		this.Book_name=Book_name;
		this.type=type;
		this.author=author;
		this.price=price;
	}
	 
	
 
	public String toString()
	{
		return Book_name +" "+ type+" " +author+" "+price;
	}
	



	public static void main(String[] args) {
		Book b=new Book();
		Book b1=new Book("Head first java", "Java book", "xyz", 100);
		
		System.out.println(b);
		System.out.println(b1);
		/*System.out.println("Book ID:"+b.getId());
		System.out.println("Book Name:"+b.getBook_name());
		System.out.println("Author Name:"+b.getAuthor());*/

	}

}
