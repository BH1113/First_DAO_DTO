package vo;

public class BookVO {
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;
	
	public BookVO(int bookid, String bookname, String publisher, int price) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.publisher = publisher;
		this.price = price;
	}
	public int getBookid() {
		return bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getPrice() {
		return price;
	}
}
