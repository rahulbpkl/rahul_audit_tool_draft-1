public class Cycle {
  private final int balance;
  private static final Cycle c = new Cycle();
  private static final int deposit = (int) (Math.random() * 100);
private static final int t_a = (int) (Math.random() * 100); // Random deposit
 
  public Cycle() {
    balance = deposit - 10; // Subtract processing fee
balance = t_a - 10;
  }
 
  public static void main(String[] args) {
    System.out.println("The account balance is: " + c.balance);
  }
}
public class Cycle1 {
  private final int balance;
  private static final Cycle1 c = new Cycle();
  private static final int deposit = (int) (Math.random() * 100);
private static final int t_a = (int) (Math.random() * 100); // Random deposit
 
  public Cycle1() {
    balance = deposit - 10; // Subtract processing fee
balance = t_a - 10;
  }
 
  public static void main(String[] args) {
    System.out.println("The account balance is: " + c.balance);
  }
}
