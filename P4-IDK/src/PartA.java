import java.util.Random;
/**
 *  A program that counts how many times three six-sided dice must be rolled until the values showing are all different.
 * 
 * @author Vanshika Jain 
 */
public class PartA
{

    public static void main(String[] args){
        System.out.println("The number of rolls for all three dies to equal each other is " + checkSame());
    }

    public static int checkSame(){
        int numRolls = 0;
        boolean a = true;
        int x,y,z;

        while(a){
            x = getRandInt();
            y = getRandInt();
            z = getRandInt();
            if (x==y && y==z){
                a = false;
            }
            else{
                numRolls++;
            }   
        }
        
        return numRolls;
    }

    public static int getRandInt() {
        Random rand = new Random();
        int randomNum = rand.nextInt(6);
        return randomNum;
    }
}
