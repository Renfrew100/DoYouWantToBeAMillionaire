package Millionaire;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.List;

public class DoYouWantToBeAMillionaire {
    
    public static ArrayList<ArrayList<String>> loadQuestions(){
        int questionNum = 4;
        ArrayList<ArrayList<String>> questionsMain = new ArrayList<ArrayList<String>>();
        
        String fName = "Q&A.txt";
        String line = null;
        
        try{
            FileReader fileReader = new FileReader(fName);
            BufferedReader bufferedReader = new BufferedReader(fileReader); 
            for (int j=0; j<questionNum;j++){
                questionsMain.add(new ArrayList<String>());
                for (int i=0; i<6;i++){
                    line = bufferedReader.readLine();
                    if (line == null){
                        break;
                    }
                    else {
                        questionsMain.get(j).add(i, line);
                    }
                }              
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("Cannot find file "+ fName + " .");
        }
        catch(IOException ex){
            System.out.println("Unable to open file '" + fName + "'");
        }
        return(questionsMain);
    }
    
    public static void main(String[] args) {
        StartScreen start = new StartScreen();
        start.setVisible(true);

        ChallengeScreen challenge = new ChallengeScreen ();
        WinScreen win = new WinScreen();
        LoseScreen lose = new LoseScreen();
    }
}
