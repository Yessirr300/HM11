package app;

class Person {
    private String name;
    private int age;
    private String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }

    public void displayInfo() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession);
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");

        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        Person person4 = new Person("Alice", 28, "Архітектор");
        person4.displayInfo();

        person4.setProfession("Дизайнер");
        System.out.println("\n(Після оновлення професії)");
        person4.displayInfo();
    }
}
