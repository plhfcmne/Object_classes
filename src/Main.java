import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

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

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Иванов Иван0", "89250000000");
        phoneBook.addContact("Иванов Иван1", "89250000001");
        phoneBook.addContact("Иванов Иван2", "89250000002");
        phoneBook.addContact("Иванов Иван3", "89250000003");
        phoneBook.addContact("Иванов Иван4", "89250000004");
        phoneBook.printAllContacts();
        // Распечатываем все контакты
        System.out.println("Размер тел. книги: " + phoneBook.getCurrentSize());
        // Распечатываем размер телефонной книги
        System.out.println();

        phoneBook.findContact("Иванов Иван4");
        // Ищем контакт Иванов Иван4
        System.out.println();

        phoneBook.removeContact("Иванов Иван4");
        // Удаляем контакт Иванов Иван4
        phoneBook.findContact("Иванов Иван4");
        // Ищем контакт Иванов Иван4
        phoneBook.printAllContacts();
        // Снова распечатываем все контакты
        System.out.println("Размер тел. книги: " + phoneBook.getCurrentSize());
        // Снова распечатываем размер телефонной книги

        Contact c = new Contact("Иванов Иван", "89250000005");
        Contact c2 = new Contact("Иванов Иван", "89250000005");
        System.out.println(c.equals(c2));

        System.out.println(new String("Tproger") == new String("Tproger"));


        String sentenceZero = "А муза рада музе без ума да разума";//предложение палиндром
        String sentence = sentenceZero.toLowerCase(); //приводим символы к одному регистру
        //System.out.println(sentence);

        StringBuilder sb = new StringBuilder();//создаем пустую сущность
        for (int i = 0; i < sentence.length(); i++) {
            if (' '!=sentence.charAt(i)) {
                sb.append(sentence.charAt(i)); //добавляем в строку sb все символы кроме пробелов
            }
        }
        int counter=0; //создаем идентификатор для того, чтобы понять есть ли равные символы
        for (int i = 0; i <= sb.length()/2+1; i++) {
            if (sb.charAt(i) == sb.charAt(sb.length() - (i+1))) {
                counter++;
            } else break;//прерываем цикл, тк нет смысла проверять каждый символ, если первый уже не равен последнему
        }
            if (counter == sb.length() / 2+2) {
                System.out.println("строка палиндром");
            } else {
                System.out.println("строка не палиндром");
            }
        int[] arr = {1,2,3};

        int[] arr2 = Arrays.copyOf(arr, arr.length);
    }
}

