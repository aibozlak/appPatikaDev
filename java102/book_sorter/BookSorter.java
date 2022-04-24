package book_sorter;

import java.util.TreeSet;

class BookSorter {
   public static void main(String[] args) {
      Book[] myBooks = {
         new Book("Astronomi 1", 191, "Levent Kurnaz", "Eylül 2018"),
         new Book("Son Buzul Erimeden", 477, "Levent Kurnaz", "Eylül 2019"),
         new Book("Fiziğin Evrimi", 162, "Albert Einstein, Leopold Infeld", "English: 1960, Turkish: 2011"),
         new Book("Evrim Kuramı ve Mekanizmaları", 157, "Çağrı Mert Bakırcı", "Aralık 2013"),
         new Book("İslam Tarihi ve Medeniyeti, Cilt 1", 1384, "Heyet (İslam Tarihçileri)", "Ekim 2018")
      };

      TreeSet<Book> myBooksOrderByName = new TreeSet<>();
      for (Book book : myBooks){
         myBooksOrderByName.add(book);
      }
      
      System.out.println();
      for (Book book : myBooksOrderByName){
         System.out.println(book.getName());
      } 
      // Worked... Sorted my books order by its name... (English Chars < Turkish Chars in ASCII)

      System.out.println("--------------------------------------------------");

      TreeSet<Book> myBooksOrderByPageCount = new TreeSet<>(new OrderByPageCount().reversed());
      for (Book book : myBooks){
         myBooksOrderByPageCount.add(book);
      }

      
      for (Book book : myBooksOrderByPageCount){
         System.out.println(book.getName() + "  " + book.getPageCount());
      }
      // Worked.... Sorted my books order by its page count...
   }
}
