package exercies02;

public class deletestring {
  //Xây dựng phương thức có 2 tham số truyền vào gồm chuỗi String, ký tự cần xóa. Thực hiện công việc xóa ký tự đó khỏi chuỗi String.
  // Sau khi thực hiện xóa thành công sẽ trả về chuỗi kết quả. Lưu ý: Chỉ xóa ký tự đầu tiên tìm thấy

  public static void main(String args[]) {
    String str = "this is Java";
    System.out.println(removeCharAt(str, 3));
  }
  public static String removeCharAt(String text1, int pos) {
    return text1.substring(0, pos) + text1.substring(pos +1);
  }
}

