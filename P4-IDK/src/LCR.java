import java.util.Random;
/**
 * Simulates the LRC game. 
 * 
 * @author Vanshika Jain  
 */
public class LCR
{
    private int numPlayers;
    int centerPot = 0;
    boolean gamePlaying = true;
    Player[] thePlayers;

    public LCR(int p)
    {
        numPlayers = p;
        thePlayers = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++){
            thePlayers[i]=new Player();
        }
    }

    public int getRandomInt() {
        Random rand = new Random();
        int randomNum = rand.nextInt(6);
        return randomNum;
    }

    public char rollDice(){
        char[] dice = {'R', 'L', 'C', 'C', 'D', 'D'};
        int x = getRandomInt();
        return dice[x];
    }

    public void diceAction(int currentPlayer, char r){
        if (r == 'D'){
            System.out.println("Got a dot.");
            return; 
        }
        if (r == 'L'){
            System.out.println("One chip to the left.");
            if (currentPlayer>1){
                thePlayers[currentPlayer].removeChips();
                thePlayers[currentPlayer - 1].addChips();
            }
            else {
                thePlayers[currentPlayer].removeChips();
                thePlayers[numPlayers - 1].addChips();
            }
        }
        if (r == 'R'){
            System.out.println("One chip to the right.");
            if (currentPlayer<(numPlayers-1)){
                thePlayers[currentPlayer].removeChips();
                thePlayers[currentPlayer + 1].addChips();
            }
            else {
                thePlayers[currentPlayer].removeChips();
                thePlayers[0].addChips();
            }
        }
        if (r == 'C'){
            System.out.println("Putting a chip into the center.");
            thePlayers[currentPlayer].removeChips();
            centerPot++;
        }
    }

    public boolean checkPlayerChips(){
        int numPlayersWithChips = 0;
        for (int i = 0; i < numPlayers; i ++){
            if(thePlayers[i].getChips() > 0){
                numPlayersWithChips++;
            }
        }
        return (numPlayersWithChips>1);
    }

    public int winnerOfGame(){
        for (int i = 0; i <= numPlayers; i ++){
            if(thePlayers[i].getChips() > 0){
                return i;
            }
        }
        return -1;
    }

    public int numberOfRolls(int chips){
        if(chips>2){
            return 3;
        }
        else{
            return chips; 
        }
    }

    public void runGame() throws InterruptedException{
        int numRolls = 0;
        int currentPlayer = 0;
        while(gamePlaying){
            numRolls = numberOfRolls(thePlayers[currentPlayer].getChips());
            if(numRolls>0){
                for(int i = 0; i < numRolls; i++){
                    System.out.println(currentPlayer + "'s turn.");
                    diceAction(currentPlayer, rollDice());
                    Thread.sleep(1000);
                }
            }
            currentPlayer++;
            if(currentPlayer > numPlayers-1){
                currentPlayer = 0;
            }
            gamePlaying = checkPlayerChips();
        }
        int w = winnerOfGame();
        System.out.println("The winner is " + w +" with " + thePlayers[w].getChips()+ " chips");
    }

}
