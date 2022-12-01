package Book_has_a_relation;

public class book {
	private String bookname;
	private int price;
	private int quantity;
	Author a;
	public book(String bookname, int price, int quantity, Author a) {
		super();
		this.bookname = bookname;
		this.price = price;
		this.quantity = quantity;
		this.a = a;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Author getA() {
		return a;
	}
	public void setA(Author a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "book [bookname=" + bookname + ", price=" + price + ", quantity=" + quantity + ", a=" + a + "]";
	}

}
