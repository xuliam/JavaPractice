package exmpleOfDoWhile;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book("Big shoot", "123-78m", 95.3, 5,true);
		BookBiz bookBiz = new BookBiz();
		bookBiz.sellBook(book);
		System.out.println(book.getCount());
	}

}
 