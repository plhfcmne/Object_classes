public class Main {
    public static void main(String[] args) {
        Book warAndPeace = new Book();

        warAndPeace.authorName = "Л. Н.Толстой";
        System.out.println("Автор - " + warAndPeace.authorName);

        warAndPeace.bookName = "Война и Мир";
        System.out.println("Название - " + warAndPeace.bookName);
        warAndPeace.publishingYear = 1867;
        System.out.println("Год - " + warAndPeace.publishingYear);


            Person sarah = new Person("Sarah", 30);
            System.out.println("sarah.name = " + sarah.name);
            System.out.println("sarah.age = " + sarah.age);
        Person john = new Person("John", 13);
        System.out.println("john.name = " + john.name);
        System.out.println("john.age = " + john.age);
    }


}