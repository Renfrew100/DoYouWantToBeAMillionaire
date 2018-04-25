
package Millionaire;
import java.util.concurrent.TimeUnit;


public class timer extends javax.swing.JFrame implements Runnable {
    
    public static int timer = 30;
      
    public void run(){
      
            try{
               
                while(true){
                  if(DoYouWantToBeAMillionaire.timerActive){
                      if (timer == 0){
                          break;
                      }
                      else {
                          System.out.println(timer);
                          Thread.sleep(1000);
                          timer -= 1;
                      }
                  }
                  else{
                      break;
                  }
                }
                
            }
            
            catch(Exception e){
            }
          
        }    
    
    

}
