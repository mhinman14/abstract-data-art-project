// Represents the language most spoken
public class languageInfo {

  private String languages;     //name of the language
  private double totalSpoken;      // number of people speaking this language


  // constructor
  public languageInfo(String languages, double totalSpoken) {
    this.languages = languages;
    this.totalSpoken = totalSpoken;
  }

  // Accessor method for languages
  public String getLanguages() {
    return languages;
  }

  //Accessor method for totalSpoken
  public double getTotalSpoken() {
    return totalSpoken;
  }

  public String toString() {
    return languages + " is most spoken with, " + totalSpoken +  " speakers.";
  }

  public String toStringLanguages() {
    return "Language: " + languages;
  }

  public String toStringTotalSpoken() {
    return "Total Speakers: " + totalSpoken + " million";
  }
}