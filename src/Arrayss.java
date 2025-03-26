public class Arrayss {
    public static void main(String[] args) {
        String [] books = new String[5];
        books[0] = "Book 1";
        books[1] = "Book 2";
        books[2] = "Book 3";
        books[3] = "Book 4";
        books[4] = "Book 5";
        for(int i = 0; i < books.length; i++){
            System.out.println(books[i]);
        }
        for(String s: books){
            System.out.println(s);

        }

    }
}
