public class Book {
    String title;
    String author;
    int publicationYear;
    boolean isRead;




    public void displayInfo(){
        System.out.println("Title: " + title +" , "+"Outor:" + author+" , " + "Year:" + publicationYear);
    }
    public String getSummary() {
        return title + ", " + author ;

    }
    public void readBook(){
        System.out.println("The book has been read"+" " + isRead);

    }
    public int addPages(int page1, int page2){
        return page1+page2;


    }

}
