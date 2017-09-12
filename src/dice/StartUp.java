package dice;

/**
 *
 * @author Adam Wojtkowski
 */
public class StartUp {
    public static void main(String[] args) {

        Person p1 = new Person("Adam");
        Person p2 = new Person("Joe");
        Person p3 = new Person("Allice");
        int die1p1Value = p1.getRollDice1();
        int die1p2Value = p2.getRollDice1();
        int die1p3Value = p3.getRollDice1();
        int die2p1Value = p1.getRollDice2();
        int die2p2Value = p2.getRollDice2();
        int die2p3Value = p3.getRollDice2();

        System.out.println("Person1 is : " + p1.getName() + ", They will now roll the dice. ");
        System.out.println(die1p1Value + ": Is the first die, roll!");
        System.out.println(die2p1Value + ": Is the second die, roll!");
        System.out.println(die1p1Value + die2p1Value + ": Is the total, roll!");
        System.out.println("Person2 is : " + p2.getName() + ", They will now roll the dice. ");
        System.out.println(die1p2Value + ": Is the first die, roll!");
        System.out.println(die2p2Value + ": Is the second die, roll!");
        System.out.println(die1p2Value + die2p2Value + ": Is the total, roll!");
        System.out.println("Person3 is : " + p3.getName() + ", They will now roll the dice. ");
        System.out.println(die1p3Value + ": Is the first die, roll!");
        System.out.println(die2p3Value + ": Is the second die, roll!");
        System.out.println(die1p3Value + die2p3Value + ": Is the total, roll!");
    }    
}
