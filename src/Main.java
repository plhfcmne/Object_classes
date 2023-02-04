public class Main {
    public static void main(String[] args) {
       /* Book warAndPeace = new Book();

        warAndPeace.authorName = "Л. Н.Толстой";
        System.out.println("Автор - " + warAndPeace.authorName);

        warAndPeace.bookName = "Война и Мир";
        System.out.println("Название - " + warAndPeace.bookName);
        warAndPeace.publishingYear = 1867;
        System.out.println("Год - " + warAndPeace.publishingYear);*/
        Book book = new Book("S. King", 100, "Book Publishing Ltd.");
        Book book2 = new Book("S. Kong", 1000, "книга Publishing Ltd.");
        Book book3 = new Book("Пушкин", 156, "МИФ");
        Book book4 = new Book("Козюлькин", 1234);


            Person sarah = new Person("Sarah", 30);
            System.out.println("sarah.name = " + sarah.name);
            System.out.println("sarah.age = " + sarah.age);
        Person john = new Person("John", 13);
        System.out.println("john.name = " + john.name);
        System.out.println("john.age = " + john.age);
        String phoneNumber = "8(916)-111-11-11";
        System.out.println(NumberUtility.removeSymbols(phoneNumber));
        System.out.println(NumberUtility.validateCountry(phoneNumber));
        System.out.println("book2.author = " + book2.author);
        book2.author = "Дурочка из-под забора";
        System.out.println("book4.publishier = " + book4.publisher);

    }


}