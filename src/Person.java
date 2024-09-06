public class Person {
    private String name;
    private int age;

    // Конструктор класса
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Методы для получения и установки имени и возраста
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        // Пример использования класса Person
        Person person = new Person("Alice", 30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Изменение возраста
        person.setAge(31);
        System.out.println("Updated age: " + person.getAge());
    }
}
