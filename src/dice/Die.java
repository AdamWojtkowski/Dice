
package dice;
import java.util.Random;
/**
 *
 * @author Adam Wojtkowski
 */
public class Die {
private int getDieValue;

    public int getGetDieValue() {
        Random rand = new Random();
        getDieValue = rand.nextInt(6)+1;
        return getDieValue;
    }

    public void setGetDieValue(int getDieValue) {
        this.getDieValue = getDieValue;
    }
}
