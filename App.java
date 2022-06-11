import week5CodingAssignement.AsteriskLogger;
import week5CodingAssignement.SpacedLogger;
public class App {
    public static void main(String[] args) {
        
      SpacedLogger spacedLogger = new SpacedLogger(); 
      AsteriskLogger asteriskLogger = new AsteriskLogger();
       
      
      spacedLogger.Log("This is a spaced log.");
      System.out.println("");
      spacedLogger.Error("This is a spaced error.");

      System.out.println("");
      asteriskLogger.Log("This is an asterisk log.");
      System.out.println("");
      asteriskLogger.Error("This is an asterisk error.");
    }
}
