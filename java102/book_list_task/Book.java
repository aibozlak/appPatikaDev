package book_list_task;

class Book {
   private String name;
   private int pageNumber;
   private String authorName;
   private String releaseDate;

   // ******************************* Getters ******************************************

   public String getName() {
      return name;
   }
   public int getPageNumber() {
      return pageNumber;
   }
   public String getAuthorName() {
      return authorName;
   }
   public String getReleaseDate() {
      return releaseDate;
   }

   // ******************************* Setters ******************************************

   public void setName(String name) {
      this.name = name;
   }
   public void setPageNumber(int pageNumber) throws Exception {
      if (pageNumber >= 0){ this.pageNumber = pageNumber; }
      else { throw new Exception("Sayfa sayısı negatif değer olamaz..!!"); }
   }
   public void setAuthorName(String authorName) {
      this.authorName = authorName;
   }
   public void setReleaseDate(String releaseDate) {
      this.releaseDate = releaseDate;
   }

   // ******************************* Constructor ******************************************

   public Book(String name, int pageNumber, String authorName, String releaseDate){
      this.setName(name);
      try {
         this.setPageNumber(pageNumber);
      } catch (Exception e) {
         System.out.println(e.toString());
      }
      this.setAuthorName(authorName);
      this.setReleaseDate(releaseDate);
   }

}
