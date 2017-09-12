
package dice;

/**
 *
 * @author Adam Wojtkowski
 */
public class Person {
    
    private String name;
    private int rollDice1;
    private int rollDice2;

    public void setRollDice1(int rollDice1) {
        this.rollDice1=rollDice1;
    }

    public int getRollDice1() {
        Die die1 = new Die();
        rollDice1 = die1.getGetDieValue();
        return rollDice1;
    }

    public void setRollDice2(int rollDice2) {
        this.rollDice2=rollDice2;
    }

    public int getRollDice2() {
        Die die2 = new Die();
        rollDice2 = die2.getGetDieValue();
        return rollDice2;   
    }

    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 
}
