public class Question{
  private String quiz;
  private String answer;

  Question(String quiz, String answer){
    this.quiz = quiz;
    this.answer = answer;
  }

  public String getQuestion(){
    return this.quiz;
  }

  public boolean checkAnswer(String userAnswer){
    return userAnswer.equals(this.answer);
  }

}