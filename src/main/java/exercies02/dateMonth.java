package exercies02;

public class dateMonth {
  //Viết chương trình nhập vào tháng và năm, sau đó tính và in ra số ngày của tháng thuộc năm đã nhập.
public void dateMonth(int month,int year){
  switch(month){
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
      System.out.println(" Date of month "+ month + " "+"31 ngày");
    case 4:
    case 6:
    case 9:
    case 11:
      System.out.println(" Date of month "+ month + "+ "+ "30 ngày");
    case 2:
      if(year%4==0 ||year%400==0){
        System.out.println(" Date of month "+ month + " "+ "29 ngày");
      }else{System.out.println(" Date of month "+ month +" "+ "28 ngày");

  }
}

}

  public static void main(String[] args) {
  dateMonth date = new dateMonth();
  date.dateMonth(2,2024);

  }}
