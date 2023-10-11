public class MethodDecomposition {
    public static void main(String[] args) {

        double[] feedExpensesCat = {100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4};
        double[] feedExpensesHamster = {70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4};

        sayHello("Пиксель");
        double maxFeedExpenseCat = findMaxExpense(feedExpensesCat);
        System.out.println("Твой самый дорогой корм стоил " + maxFeedExpenseCat);
        double sumFeedCat = findExpensesSum(feedExpensesCat);
        System.out.println("Всего на корм было потрачено " + sumFeedCat);
        sayEnjoyMeal("Пиксель");

        sayHello("Байт");
        double maxFeedExpenseHamster = findMaxExpense(feedExpensesHamster);
        System.out.println("Твой самый дорогой корм стоил " + maxFeedExpenseHamster);
        double sumFeedHamster = findExpensesSum(feedExpensesHamster);
        System.out.println("Всего на корм было потрачено " + sumFeedHamster);
        sayEnjoyMeal("Байт");

    }
    public static void sayHello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static double findMaxExpense(double[] feedExpenses){
        double maxFeedExpense = 0;
        for (int i = 0; i < feedExpenses.length; i++) {
            if (feedExpenses[i] > maxFeedExpense) {
                maxFeedExpense = feedExpenses[i];
            }
        }
        return maxFeedExpense;
    }

    public static double findExpensesSum(double[] feedExpenses) {
        double sumFeed = 0;
        for (int i = 0; i < feedExpenses.length; i++) {
            sumFeed = sumFeed + feedExpenses[i];
        }
        return sumFeed;

    }

    public static void sayEnjoyMeal(String name) {
        System.out.println("Приятного аппетита, " + name + "!");
    }
}
