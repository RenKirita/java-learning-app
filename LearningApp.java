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

    Lesson[] lessons = new Lesson[5];

    lessons[0] = new Lesson("1.Javaとは", "Javaはプログラミング言語です。");
    lessons[1] = new Lesson("2. 変数", "変数はデータを保存する箱です。");
    lessons[2] = new Lesson("3. 演算子", "演算子は計算や比較を行うための記号です。");
    lessons[3] = new Lesson("4. 条件分岐", "条件分岐は条件によって処理を変える仕組みです。");
    lessons[4] = new Lesson("5. 繰り返し", "繰り返しは同じ処理を何度も実行する仕組みです。");

    while (true) {

      choice = scanner.nextInt(); // 初期化されてない変数（入力されてない）やつがあると、エラーが発生するから、これを先に書かないとエラーが発生する
      System.out.println("あなたが選んだ番号は " + choice + " です。 ");

      if (choice == 0) {
        break;
      }
      if (1 <= choice && choice <= 5) {
        lessons[choice - 1].showInfo();
      } else {
        System.out.println("存在しない番号です。");
      }
    }
    System.out.println("終了します。");

    scanner.close();

  }

}