package exercies02;

public class stringtext {
  //Truyền chuỗi, viết ra ký tự in hoa.
  public void stringtext(String text){
    System.out.println(text.toUpperCase());
  }

  public static void main(String[] args) {
    stringtext S1= new stringtext();
    S1.stringtext(" how are you");
  }

}
