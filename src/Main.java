//    Напишите небольшой библиотечный справочник, где хранится информация о книгах.
//    Рекомендуем создать отдельный класс, например с именем Main или App — в нем объявить метод main и в нем протестировать работу вашего кода.
//    Создайте класс Book, который содержит в себе данные о названии, авторе и годе публикации книги.
//    Типы полей должны быть String, Author (его мы создадим в п. 2) и int.
//    Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
//    Напишите конструкторы для обоих классов, заполняющие все поля.
//    Создайте геттеры для всех полей автора и всех полей книги.
//    Создайте сеттер для поля «Год публикации» у книги.
//    В методе main создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор» (достаточно тоже двух) и инициализируйте их. Учтите,
//    что авторы являются обязательными и книги не могут создаваться без авторов.
//    Метод main не должен находиться в классах Book и Author.
//    Создайте отдельный класс для запуска приложения и объявите метод main в нем.
//    В том же методе main измените год публикации одной из книг с помощью сеттера.
//    Так как вы изучили геттеры и сеттеры, оставлять поля открытыми, без модификатора доступа private, недопустимо.


// Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
// Обратите внимание, что toString книги не должен дублировать код из toString автора, а должен делегировать (вызывать) его версию метода.

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Михаил", "Булгаков");
        System.out.println("author1 - " + author1);
        System.out.println("author2 - " + author2);

        Book book1 = new Book("Война и Мир", author1, 1869);
        Book book2 = new Book("Мастер и Маргарита", author2, 1940);

//        System.out.println("book1 - " + book1.getTitle() + ", " + author1.getFirstName() + " " + author1.getLastName() + ", " + book1.getYear());
//        System.out.println("book2 - " + book2.getTitle() + ", " + author2.getFirstName() + " " + author2.getLastName() + ", " + book2.getYear());

        System.out.println("book1 - " + book1);
        System.out.println("book2 - " + book2);

//        book1.setYear(1870);
//        System.out.println("Год публикации книги " + book1.getTitle() + " изменен на " + book1.getYear());
    }
}