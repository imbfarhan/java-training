class Library{
    int ctr;
    String[] books;
    String[] issuedBooks;
    int issuedCtr=0;
    Library()
    {
        ctr=0;
        this.books = new String[20];
        this.issuedBooks = new String[20];
        issuedCtr=0;
    }
    void addBook(String bookName)
    {
        this.books[this.ctr] = bookName;
        ctr++;
    }
    
    void issueBook(String bookName)
    {
        //First we have to see if the book that the user requires is present
        //Only if it is present, then we can issue it, else we cannot
        for(String book:this.books)
        {
            if(book.equals(bookName))
            {
                this.issuedBooks[issuedCtr]=bookName;
                System.out.println(bookName+" successfully issued");
                return;
            }
        }
        System.out.println("The specified book is not available");
        return;
    }

    void showAvailableBooks()
    {
        System.out.println("Available Books:");
        for(String book:this.books)
        {
            System.out.println(book);
        }
    }

    void showIssuedBooks()
    {
        System.out.println("Issued Books:");
        for(String book:this.issuedBooks)
        {
            System.out.println(book);
        }
    }

    void returnBook(String bookName)
    {
        
    }


}



public class LibraryClass {
    
}
