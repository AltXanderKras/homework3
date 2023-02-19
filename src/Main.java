public class Main {
    public static void main(String[] args) {

        int account = 300;
        int deposit = 1700;

        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }

        int totalAmount = account + deposit + bonus;

        System.out.println("Общая сумма: " + totalAmount + "р.");
        System.out.println("Бонусных: " + bonus + "р.");

    }
}