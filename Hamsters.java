public class Hamsters {



    public static void main(String[] args) {
        Hamster bite = new Hamster(); // Имя Байта менять не нужно
        bite.eat(35);
        for (int i = 0; i < 3; i++) {
            bite.runInWheel();
        }

        Hamster ninja = new Hamster();
        ninja.name = "Ниндзя";
        ninja.weight = 250;
        ninja.runInWheel();
        if (ninja.weight < 265) {
            ninja.eat(45);
        }

        Hamster kuzya = new Hamster();
        kuzya.name = "Кузя";
        //kuzya.weight = 450;
        kuzya.weight = 325;
        kuzya.eat(20);

        Hamster paskal = new Hamster();
        paskal.name = "Паскаль";
        paskal.weight = 320;

        Hamster[] arr = {bite, kuzya, ninja, paskal};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].name + " " + arr[i].weight);
        }
    }

    public static class Hamster {

        //Поля
        String name = "Байт"; // Имя
        int age = 2; // Возраст
        String color = "Рыжий"; // Цвет
        int weight = 350;

        // Методы
        void eat(int foodWeight) {
            weight = weight + foodWeight;
        }

        // Бегать в колесе
        void runInWheel() {
            System.out.println("Бегу-бегу-бегу!");
            weight = weight - 5;
        }

        // Прятать семечки
        void hideSeeds(int seedWeight) {
            System.out.println("Зимой не заголодаю.");
            weight = weight + seedWeight;
        }
    }
}
