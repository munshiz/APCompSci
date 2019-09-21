public class Booktest{
    public static void main(String[] args) {
        Book book = new Book(3);
        for (int i = 0; i < 4; i++){
            book.nextPage();
            System.out.println("Current page: " +  book.getCurrentPage());
        }
    } 
}


