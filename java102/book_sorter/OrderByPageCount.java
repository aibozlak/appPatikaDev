package book_sorter;

import java.util.Comparator;

class OrderByPageCount implements Comparator<Book> {

   @Override
   public int compare(Book book1, Book book2) {
      return book1.getPageCount() - book2.getPageCount();
   }
   
}
