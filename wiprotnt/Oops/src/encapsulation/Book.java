package encapsulation;

public class Book {
	private String name;
    private Author author;  // Composition: Book HAS an Author
    private double price;
    private int qtyInStock;
    public Book(String name, Author author, double price, int qtyInStock) 
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public String getName() 
    {
        return name;
    }

    public Author getAuthor() 
    {
        return author;
    }

    public double getPrice() 
    {
        return price;
    }

    public int getQtyInStock() 
    {
        return qtyInStock;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) 
    {
        this.qtyInStock = qtyInStock;
    }
    public String toString() 
    {
        return "Book[name=" + name + ", " + author.toString() +
               ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
    }
}
