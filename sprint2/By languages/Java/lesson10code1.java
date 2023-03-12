public class Main {
    public static void main(String[] args) {
        func(1);
        func(2);
        func(3);
        sayHello("Гоша");
    }
    
    public static void func(int step) {
        System.out.println("Call me. Step: " + step);
    }
    
    public static void sayHello(String name) {
        System.out.println("Привет, " + name);
        printHoroscope(name.toUpperCase());
        System.out.println("Пока, " + name + ", хорошего дня!");
    }
    
    public static void printHoroscope(String name) {
        System.out.println(name + "! Сегодня подходящий день для прогулок в парке и изучения рекурсии");
    }
}
