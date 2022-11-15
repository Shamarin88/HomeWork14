public class Main {
    public static void main(String[] args) {
        homeWork14Part1();
        homeWork14Part2();
    }
    public static void homeWork14Part1() {
        /*
        Задание 1
        Создайте новый проект в IDEA. Создайте класс «Человек», у которого есть:
        Год рождения (yearOfBirth),
        имя (name),
        город проживания (town).

        Создайте объекты для следующих персон:
        Максим из города Минск, который родился в 1988 году;
        Аня из города Москва, которая родилась в 1993 году;
        Катя из города Калининград, которая родилась в 1992 году;;
        Артем из города Москва, который родился в 1995 году.
        Подсказка
        Свойства объектов можно объявить как public и использовать прямой доступ к свойствам для того,
        чтобы их заполнить.

        Напишите программу так, чтобы в консоль выводилось приветственное сообщение в формате:
        "Привет! Меня зовут… Я из города… Я родился в… году. Будем знакомы!"

        Подсказка
        Для вывода объекта в консоль можно определить у него метод toString().

        Критерии оценки
        Создан класс human со свойствами yearOfBirth, name, town.
        Создан объект «Максим» со свойствами класса human.
        Создан объекта «Аня» со свойствами класса human.
        Создан объект «Катя» со свойствами класса human.
        Создан объект «Артем» со свойствами класса human.
        В консоль для каждого объекта выводится сообщение: "Привет! Меня зовут… Я из города…
        Я родился в… году. Будем знакомы!"
        Переменные инициализированы согласно правилам camelCase.
        */
        System.out.println("Домашнее задание 1, Задание 1");
        System.out.println();

        Human human1 = new Human(0, "", "", "");
        Human human2 = new Human(1993, "Аня", "Москва", "Методист образовательных программ");
        Human human3 = new Human(1992, "Катя", "Калинград", "Продакт-менеджер");
        Human human4 = new Human(1995, "Артем", "Москва", "Директор по развитию бизнеса");

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println();
        /*
        Задание 2
        Добавьте в поле класса «Человек» новое свойство — «Должность» (jobTitle).

        Каждому созданному объекту допишите в поле string  должность:

        Максим работает бренд-менеджером.
        Аня работает методистом образовательных программ.
        Катя работает продакт-менеджером.
        Артем работает директором по развитию бизнеса.
        Допишите программу таким образом, чтобы в консоль выводилось приветственное сообщение в формате:
        "Привет! Меня зовут… Я из города… Я родился в… году. Я работаю на должности… . Будем знакомы!"

        Критерии оценки
        Создан класс human со свойствами yearOfBirth, name, town и job.
        Создан объект «Максим» со свойствами класса human.
        Создан объекта «Аня» со свойствами класса human.
        Создан объект «Катя» со свойствами класса human.
        Создан объект «Артем» со свойствами класса human.
        В консоль для каждого объекта выводится сообщение: "Привет! Меня зовут… Я из города… Я родился
        в … году. Я работаю на должности… . Будем знакомы!"
        Переменные инициализированы согласно правилам camelCase.
        */
        System.out.println("Домашнее задание 1, Задание 2");

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println();
    }
    public static void homeWork14Part2() {
        /*
        Создайте класс «Автомобиль», у которого есть:

        марка (brand),
        модель (model),
        объем двигателя в литрах (engineVolume),
        цвет кузова (color),
        год производства (year),
        страна сборки (country).
        Создайте объекты для следующих автомобилей:

        Lada Granta, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя — 1,7 л.
        Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова,
        объем двигателя — 3,0 л.
        BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
        Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный,
        объем двигателя — 2,4 л.
        Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л,
        год выпуска — 2016 год.
        Напишите программу, которая будет выводить в консоль информацию о каждом автомобиле и все
        указанные выше характеристики.

        Подсказка
        Для вывода объекта в консоль можно определить у него метод toString().

        Критерии оценки
        Создан класс car со свойствами brand, model, engineVolume, color, productionYear, productionCountry.
        Создан объект Lada Granta со свойствами класса car.
        Создан объекта Audi A8 со свойствами класса car.
        Создан объект BMW Z8 со свойствами класса car.
        Создан объект Kia Sportage 4-го поколения со свойствами класса car.
        Создан объект Hyundai Avante со свойствами класса car.
        В консоль выводится информация о каждом автомобиле и все указанные характеристики.
        Переменные инициализированы согласно правилам camelCase.
        */
        System.out.println("Домашнее задание 1 Задание 3");
        System.out.println();

        Car car1 = new Car("",0,"","",0);
        Car car2 = new Car("Audi A8 50 L TDI quattro",2020,"Германия","черный",3.0);
        Car car3 = new Car("BMW Z8",2021,"Германия","черный",3.0);
        Car car4 = new Car("Kia Sportage 4-го поколения",2018,"Южная Корея","красный",2.4);
        Car car5 = new Car("Hyundai Avante",2016,"Южная Корея","оранжевый",1.6);

        System.out.println(car1);
        System.out.println();
        System.out.println(car2);
        System.out.println();
        System.out.println(car3);
        System.out.println();
        System.out.println(car4);
        System.out.println();
        System.out.println(car5);
        System.out.println();
    }
}