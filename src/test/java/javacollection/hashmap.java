package javacollection;

import java.util.HashMap;
import java.util.Map.Entry;
import org.testng.annotations.Test;


public class hashmap {
  //new hashmap

  public void hashmap(int number,int number1,String text, String text1, int index){
    HashMap<Integer, String> numbers = new HashMap<>();
    numbers.put(number,text);
    numbers.put(number1,text);
    System.out.println(" Hashmap after put "+numbers);
    System.out.println("value at index " + index +" " + numbers.get(index));

  }
  //keys set,value,keys
  public void accessHashmap(String text2, String text3, String text4, String text5){
    HashMap<String, String> colors= new HashMap<>();
    colors.put(text2, text3);
    colors.put(text4, text5);
    System.out.println(" hashmap" + colors);
    //key set
    System.out.println("Keys set " + colors.keySet());
    //using values()
    System.out.println("Values " + colors.values());
    //using entrySet()
    System.out.println("entry set "+ colors.entrySet());

  }
  //Change HashMap Value
  public void changeHashmap(int number, int number1, int number2, String text1, String text2, String text3, String text4, int index, int index1){
    HashMap<Integer, String> languages = new HashMap<>();
    languages.put(number, text1);
    languages.put(number1,text2);
    languages.put(number2,text3);
    System.out.println(" changeHashmap " + languages);
    // change element with key
    System.out.println("HashMap using replace "+ index +" " + languages.replace(number1,text4));
  //Remove HashMap Elements with key index
    String value = languages.remove(index1);
    System.out.println("Removed value:" + value);
    System.out.println("Updated HashMap:" + languages);}
    //Iterate through a HashMap
  public void iterateHashmap(int number1, int number2, int number3, String text1, String text2, String text3){
    HashMap<Integer, String> languages = new HashMap<>();
    languages.put(number1, text1);
    languages.put(number2, text2);
    languages.put(number3, text3);
    System.out.println("HashMap: " + languages);

    // iterate through keys only
    System.out.print("Keys: ");
    for (Integer key : languages.keySet()) {
      System.out.print(key);
      System.out.print(", ");
    }

    // iterate through values only
    System.out.print("Values: ");
    for (String value : languages.values()) {
      System.out.print(value);
      System.out.print(", ");
    }

    // iterate through key/value entries
    System.out.print("Entries: ");
    for (Entry<Integer, String> entry : languages.entrySet()) {
      System.out.print(entry);
      System.out.print(", ");
    }
  }


  @Test(priority = 0)

  public void runhashmap(){
    hashmap(1,2,"one","two",1);
    accessHashmap("red","màu đỏ","green","màu xanh");
    changeHashmap(1,2,3,"python","javascript","c++","PHP",2,1);
  }
  @Test(priority = 1)
  public void runiterateHashmap(){
    iterateHashmap(1,2,3,"japan","english","china");
  }


}
