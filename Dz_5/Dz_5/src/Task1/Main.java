package Task1;

public class Main {
    public static void main(String[] args) {
        Phonebook phoneBook = new Phonebook();
        phoneBook.add("Иванов", "7892673891");
        phoneBook.add("Лидия Аркадьевна Бубликова", "637929");
        phoneBook.add("Иван Михайлович Серебряков", "162348");
        phoneBook.add("Дональд Джон Трамп", "8082771");

        phoneBook.add("Джон Фердинанд ЮТрамп", "759-080--0");
        phoneBook.add("Лидия Аркадьевна Бубликова", "212135");
        phoneBook.showContacts("Лидия Аркадьевна Бубликова");
        phoneBook.showAllCont();
    }
}
