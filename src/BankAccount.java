public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum) {
        amount = amount + sum;
        System.out.println("вы внесли счет" + sum);

    }
    public void withDraw(int sum) throws LimitException{
        if (sum > amount) {
            throw new LimitException("ошибка у вас не достаточно средств" + "у вас на счету", amount);

        }else {
            amount = amount - sum;
            System.out.println("вы сняли со счета" + sum);

        }


    }
}
