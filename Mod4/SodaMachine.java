public class SodaMachine {

    private int balance;
    private int sodaPrice;
    private int sodasSold;

    public SodaMachine() {
        balance = 0;
        sodaPrice = 150;
        sodasSold = 0;
    }

    public void insertCoin(int cents) {
        if (cents == 5 || cents == 10 || cents == 25 || cents == 100) {
            balance += cents;
            System.out.println("Inserted: " + cents + " cents");
        } else {
            System.out.println("Invalid coin.");
        }
    }

    public void buy() {
        if (balance >= sodaPrice) {
            balance -= sodaPrice;
            sodasSold++;
            System.out.println("Soda purchased! Enjoy!");
        } else {
            System.out.println("Not enough money. Please insert more coins.");
        }
    } // Add this closing brace

    public int getChange() {
        int change = balance;
        balance = 0;
        return change;
    }

        public static void main(String[] args) {

            SodaMachine machine = new SodaMachine();

            machine.insertCoin(100);
            machine.insertCoin(100);

            machine.buy();

            System.out.println("Change returned: "
                    + machine.getChange() + " cents");

            System.out.println("Sodas sold: " + machine.sodasSold);
        }

    }


