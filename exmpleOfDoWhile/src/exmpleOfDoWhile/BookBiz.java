package exmpleOfDoWhile;

public class BookBiz {

	public int sellBook(Book book) {
		if(!(book.getCount()>1)) {
			return -1;
			
		}
		book.setCount(book.getCount() - 1);
		return 1;
	}
}
