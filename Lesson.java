public class Lesson{
  String title;
  String description;
  String quiz;
  String answer;

  Lesson(String title, String description, String quiz, String answer){
    this.title = title; //引数titleはコンストラクタ実行中だけ存在する引数
    this.description = description; //だから、メンバ変数に代入する必要がある
    this.quiz = quiz;
    this.answer = answer;
  }

  public void showInfo(){
    System.out.println(this.title);
    System.out.println(this.description);
  }

  public void showQuiz(){
    System.out.println(this.quiz);
    // System.out.println(this.answer); 答えは一緒に表示しない
  }

  public boolean checkAnswer(String userAnswer) {

    return userAnswer.equals(this.answer);

} //役割を完全に分けて、「正誤の判定」はLessonクラス、「表示」はLearningApppクラスとした
}