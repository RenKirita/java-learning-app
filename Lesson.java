public class Lesson{
  String title;
  String description;

  Lesson(String title, String description){
    this.title = title; //引数titleはコンストラクタ実行中だけ存在する引数
    this.description = description; //だから、メンバ変数に代入する必要がある
  }

  public void showInfo(){
    System.out.println(this.title);
    System.out.println(this.description);
  };
}