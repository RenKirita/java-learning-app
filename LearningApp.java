import java.util.Scanner; //Scannerって書いたら、java/util/Scannerのことだよって意味

public class LearningApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // System.inはキーボードからの入力を表す

    int choice;

    System.out.println("===Java学習アプリ===");
    System.out.println("1. Javaとは");
    System.out.println("2. 変数");
    System.out.println("3. 演算子");
    System.out.println("4. 条件分岐");
    System.out.println("5. 繰り返し");
    System.out.println("0. 終了");

    while (true) {

      choice = scanner.nextInt(); //初期化されてない変数（入力されてない）やつがあると、エラーが発生するから、これを先に書かないとエラーが発生する
      System.out.println("あなたが選んだ番号は " + choice + " です。 ");

      if(choice == 0){
        break;
      }
      if (choice == 1) {
        Lesson javaLesson = new Lesson("1. Javaとは", "Javaはプログラミング言語です。");
        javaLesson.showInfo();

      } else if (choice == 2) {
        Lesson variableLesson = new Lesson("2. 変数", "変数はデータを保存する箱です。");
        variableLesson.showInfo();

      } else if (choice == 3) {
        Lesson OperatorLesson = new Lesson("3. 演算子", "演算子は計算や比較を行うための記号です。");
        OperatorLesson.showInfo();

      } else if (choice == 4) {
        Lesson TermsLesson = new Lesson("4. 条件分岐", "条件分岐は条件によって処理を変える仕組みです。");
        TermsLesson.showInfo();
        
      } else if (choice == 5) {
        Lesson RepetitionLesson = new Lesson("5. 繰り返し", "繰り返しは同じ処理を何度も実行する仕組みです。");
        RepetitionLesson.showInfo();
        
      } else {
        showInvalidNumberInfo();
      }
    }
    System.out.println("終了します。");

    scanner.close();

  }
  public static void showJavaInfo(){
    System.out.println("Javaはプログラミング言語です"); //staticとはインスタンスを作らなくても使えるもの
  }
  public static void showVariableInfo(){
    System.out.println("変数はデータを保存する箱です。"); //メソッド名は区切りを大文字にする（キャメルケース）
  }
  public static void showOperatorInfo(){
    System.out.println("演算子は計算や比較を行うための記号です。");
  }
  public static void showTermsInfo(){
    System.out.println("条件分岐は条件によって処理を変える仕組みです。");
  }
  public static void showRepetitionInfo(){
    System.out.println("繰り返しは同じ処理を何度も実行する仕組みです。");
  }
  public static void showInvalidNumberInfo(){
    System.out.println("存在しない番号です。");
  }

}