package Skillfactory.BookStore1;

public class BookStore {
    public static void main(String[] args) {
        Book[] bookList = new Book[99];

        Book book1 = new Book("Hobbit", 999, 1931);
        addBook(bookList, book1);
        Book book2 = new Book("Hobbit1", 991, 1945);
        addBook(bookList, book2);
        addBook(bookList, book1);
        printAllBooks(bookList);


    }

    public static boolean checkBook(Book[] bookList, Book book) {
        for (Book item : bookList) {
            if (item != null && item.bookName.equals(book.bookName) && item.editionYer == book.editionYer) {
                System.out.println("Данная Книга уже есть");
                return true;
            }
        }
        System.out.println("Данной Книги нет в Картотеке");
        return false;
    }

    public static void addBook(Book[] bookList, Book book) {
        if (!checkBook(bookList, book)) {
            for (int i = 0; i < bookList.length; i++) {
                if (bookList[i] == null) {
                    bookList[i] = book;
                    System.out.println("Данная Книга добавлена в картотеку");
                    break;
                }
                if (i == bookList.length - 1) {
                    System.out.println("Картотека переполнена");
                }
            }
        }
    }

    public static void printAllBooks(Book[] bookList) {
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] != null) {
                System.out.printf("Книга %d: название: %s, год издания: %d, цена: %d USD; ",
                        i + 1, bookList[i].bookName, bookList[i].editionYer, bookList[i].bookPrice);
            }
        }
    }
}

