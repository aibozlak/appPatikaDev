package book_list_task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class BookListTask {
   public static void main(String[] args) {

      ArrayList<Book> myBooks = new ArrayList<>(10);
      myBooks.add(new Book("Astronomi 1", 191, "Levent Kurnaz", "Eylül 2018"));
      myBooks.add(new Book("Son Buzul Erimeden", 477, "Levent Kurnaz", "Eylül 2019"));
      myBooks.add(new Book("Fiziğin Evrimi", 162, "Albert Einstein, Leopold Infeld", "English: 1960, Turkish: 2011"));
      myBooks.add(new Book("Evrim Kuramı ve Mekanizmaları", 157, "Çağrı Mert Bakırcı", "Aralık 2013"));
      myBooks.add(new Book("İslam Tarihi ve Medeniyeti, Cilt 1", 1384, "Heyet (İslam Tarihçileri)", "Ekim 2018"));
      myBooks.add(new Book("Kronolojik Türkçe Kuran", 602, "Abdullah Manaz", null));
      myBooks.add(new Book("Melekler ve Şeytanlar", 481, "Dan Brown", "Mayıs 2000"));
      myBooks.add(new Book("Dijital Kale", 342, "Dan Brown", "1998"));
      myBooks.add(new Book("İhanet Noktası", 512, "Dan Brown", "2001"));
      myBooks.add(new Book("Da Vinci Şifresi", 528, "Dan Brown", "Mart 2003"));


      HashMap<String,String> bookAndAuthor = new HashMap<>(10);
      myBooks.forEach(book -> bookAndAuthor.put(book.getName(), book.getAuthorName()));


      List<Book> books100 = myBooks.stream().filter(book -> book.getPageNumber() > 100).toList();
      
   }
}
