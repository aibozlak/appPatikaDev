package book_sorter;

class Book implements Comparable<Book> {

   private String name;
   private int pageCount;
   private String author;
   private String releaseDate;

   // ********************************* Consructors **************************************
   public Book(String name, int pageCount){
      this.setName(name);
      this.setPageCount(pageCount);
   }

   public Book(String name, int pageCount, String author, String releaseDate){
      this.setName(name);
      this.setPageCount(pageCount);
      this.author = author;
      this.releaseDate = releaseDate;
   }

   // ********************************* Getters and Setters **************************************
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getPageCount() {
      return pageCount;
   }

   public void setPageCount(int pageCount) {
      this.pageCount = pageCount;
   }

   public String getAuthor() {
      return author;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

   public String getReleaseDate() {
      return releaseDate;
   }

   public void setReleaseDate(String releaseDate) {
      this.releaseDate = releaseDate;
   }

   // ********************************* compareTo method (Override) **************************************
   @Override
   public int compareTo(Book book) {
      return this.getName().compareTo(book.getName());
   }
      
}
