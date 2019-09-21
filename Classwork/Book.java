public class Book{
    private int numPages;
    private int currentPage;
    
    public Book(int n){
        numPages = n;
        currentPage = 1;
    }

    public void nextPage(){
        if (currentPage < numPages){
            currentPage++;
        }
        
        else{
            System.out.println("You have finished the book!");
        }
    }

    public int getCurrentPage(){
        return currentPage;
    }

    public int getTotalPages(){
        return numPages;
    }
}