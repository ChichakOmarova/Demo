public class Main1 {
    public static void main(String[] args) {
        Book lesmiserables = new Book();
        lesmiserables.title = "Les Miserables";
        lesmiserables.author = "Victor Hugo";
        lesmiserables.publicationYear = 1862;
        lesmiserables.isRead = true;
//        lesmiserables.sum =0;
        lesmiserables.displayInfo();
        lesmiserables.getSummary();
        lesmiserables.readBook();

        System.out.println(lesmiserables.addPages(10, 10));
    }

}
