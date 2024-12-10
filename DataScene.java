import org.code.theater.*;
import org.code.media.*;


public class DataScene extends Scene {

  private languageInfo[] language;
String[] languagesArray = FileReader.toStringArray("Languages.txt");
    double[] totalSpokenArray = FileReader.toDoubleArray("totalSpoken.txt");
  //Constructor
public DataScene(){
  language = createLanguage();
  
}

  //Returns 1D array of languageInfo object using txt files
  public languageInfo[] createLanguage() {
    

    languageInfo[] languageArray = new languageInfo[languagesArray.length];
    for (int i = 0; i < languageArray.length; i++) {
      languageArray[i] = new languageInfo(languagesArray[i], totalSpokenArray[i]);
    }

    return languageArray;
  }

  //method to draw the animation
public String millions(languageInfo a){
  if (a.getTotalSpoken() > 1.452){
    return "million";
  } else {
  return "billion";  
  }
  
}
  
  public void drawScene(){
   int randomIndex = (int) (Math.random() * language.length);
    languageInfo l = language[randomIndex];

    
    drawText("Language Most Spoken in the World", 44, 84);
    drawImage("Screenshot-2024-12-10-104429.png", 34, 236, 300);
playSound("334914__robinhood76__06304-message-ding-1.wav");
  
    drawText(l.toStringLanguages(), 21, 134);
    drawText(l.toStringTotalSpoken(), 67, 196);
    System.out.println(l);
    System.out.println(millions(l));
  }
  



  
}