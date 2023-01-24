public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment = 1001;

        if (replenishment > 1000){
            int newBalance = (balance + replenishment) + (replenishment / 100);
            System.out.println("Ваш баланс после пополнения равен " + newBalance);
        } else {
            int newBalance = balance + replenishment;
            System.out.println("Ваш баланс после пополнения равен " + newBalance);
        }
    }
}
