package Millionaire;
public class DoYouWantToBeAMillionaire {

    public static void main(String[] args) {
    StartScreen start = new StartScreen();
    start.setVisible(true);
    
    ChallengeScreen challenge = new ChallengeScreen ();
    WinScreen win = new WinScreen();
    LoseScreen lose = new LoseScreen();
    }  
}
