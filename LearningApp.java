import java.util.Scanner; //Scannerって書いたら、java/util/Scannerのことだよって意味

public class LearningApp{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in); //System.inはキーボードからの入力を表す

    System.out.println("===Java学習アプリ===");
    System.out.println("1. Javaとは");
    System.out.println("2. 変数");
    System.out.println("3. 演算子");
    System.out.println("4. 条件分岐");
    System.out.println("5. 繰り返し");
    System.out.println("0. 終了");

    int choice = scanner.nextInt();

    System.out.println("あなたが選んだ番号は " + choice + " です。 ");

    if(choice == 1){
      System.out.println("Javaはプログラミング言語です。");
    }

    scanner.close();
    
  }
}