public class Main {
    public static void main(String[] args) {

        int initialBalance = 100;
        int add = 1100;

        int bonus = add > 1000 ? add / 100 : 0;

        int finalBalance = initialBalance + add + bonus;

        System.out.println("Итоговый баланс:" + finalBalance);
        System.out.println("Cумма бонусов:" + bonus);

    }
}