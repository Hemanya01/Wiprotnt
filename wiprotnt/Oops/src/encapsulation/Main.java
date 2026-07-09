package encapsulation;

public class Main {

	public static void main(String[] args) {
		Author author = new Author("Velivela Hemanya", "velivelahemanya06@gmail.com", 'F');
		Book book = new Book("Java Programming", author, 850.00, 200);
		System.out.println("Book Details:");
        System.out.println("Name: " + book.getName());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Quantity in Stock: " + book.getQtyInStock());
        System.out.println("\nAuthor Details:");
        System.out.println("Name: " + book.getAuthor().getName());
        System.out.println("Email: " + book.getAuthor().getEmail());
        System.out.println("Gender: " + book.getAuthor().getGender());
	}

}
