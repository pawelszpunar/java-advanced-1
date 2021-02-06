package interfaces;

public interface Bank {
    //metody są domyslnie public

    String credit(int amount);
    String debit(int amount);
    int balance();
}
