class Account {
    static int balance = 1000;
    int getBalance() {
        return balance;
    }
     synchronized static void withdraw(int amount) {
        balance = balance - amount;
    }
}