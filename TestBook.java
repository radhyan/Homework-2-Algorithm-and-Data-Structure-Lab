class TestBook {
    public static void main(String[] args){
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book[] books = new Book[3];
        books[0] = book1;
        book1.title = "Introduction to Java Programming and Data Structure";
        book1.author = "Daniel Liang";
        books[0].price = 355000;
        books[1] = book2;
        book2.title = "Advanced Java Programming";
        book2.author = "Uttam Roy";
        books[1].price = 236250;
        books[2] = book3;
        book3.title = "Practical Java Programming";
        book3.author = "Perry Xiao";
        books[2].price = 95000;

        for (int i = 0; i <= 2; i++){
            Double tax = books[i].price * 0.1;

            System.out.printf("\nBook%d data", i+1);
            System.out.printf("\nTitle: "+ books[i].title);
            System.out.printf("\nAuthor: "+ books[i].author);
            System.out.printf("\nPrice: %d", books[i].price+=tax);
        }
    }

}
