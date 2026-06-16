import java.util.Scanner; //Scannerって書いたら、java/util/Scannerのことだよって意味

public class LearningApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // System.inはキーボードからの入力を表す

    int choice;

    Lesson[] lessons = new Lesson[5];

    lessons[0] = new Lesson("1.Javaとは", "Javaはプログラミング言語です。", "Javaはプログラミング言語ですか？", "yes");
    lessons[1] = new Lesson("2. 変数", "変数はデータを保存する箱です。", "変数はデータを保存する箱ですか？", "yes");
    lessons[2] = new Lesson("3. 演算子", "演算子は計算や比較を行うための記号です。", "演算子は計算や比較を行うための記号ですか？", "yes");
    lessons[3] = new Lesson("4. 条件分岐", "条件分岐は条件によって処理を変える仕組みです。", "条件分岐は条件によって処理を変える仕組みですか？", "yes");
    lessons[4] = new Lesson("5. 繰り返し", "繰り返しは同じ処理を何度も実行する仕組みです。", "繰り返しは同じ処理を何度も実行する仕組みですか？", "yes");

    while (true) {

      showMenu(lessons);

      try {
        // choice = scanner.nextInt(); //
        // 初期化されてない変数（入力されてないやつ）があると、エラーが発生するから、これを先に書かないとエラーが発生する

        String input = scanner.nextLine();
        choice = Integer.parseInt(input); // Integer.parseInt()は文字列(String)をint型に変換するメソッド

      } catch (NumberFormatException e) {
        System.out.println("数字を入力してください。");
        // scanner.nextLine(); //1行読み取って捨てる
        continue;
      } catch (Exception e) {
        System.out.println("予期せぬエラーです。");
        // scanner.nextLine(); //1行読み取って捨てる
        e.printStackTrace();
        break;
      }

      System.out.println("あなたが選んだ番号は " + choice + " です。 ");
      // scanner.nextLine();

      if (choice == 0) {
        break;
      }
      if (1 <= choice && choice <= 5) {
        lessons[choice - 1].showInfo();
        System.out.println("Enterを押すと問題へ進みます。");

        scanner.nextLine();

        lessons[choice - 1].showQuiz();

        String userAnswer = scanner.nextLine();

        if (lessons[choice - 1].checkAnswer(userAnswer)) {
          System.out.println("正解です。");
        } else {
          System.out.println("不正解です。");
        }
      } else {
        System.out.println("存在しない番号です。");
      }
    }
    System.out.println("終了します。");

    scanner.close();
  }

  public static void showMenu(Lesson[] lessons) {
    System.out.println("===Java学習アプリ===");

    for (int i = 0; i < lessons.length; i++) {

      System.out.println(lessons[i].title);

    }

    System.out.println("0. 終了");
  }

}