
package exampractice;

class CheckNumber {
  public static void main(String[] args) {

    int[] num = {1, 2, 3, 4, 5,6};
    int toFind = 3;
    boolean found = false;

    for (int i : num) {
      if (i == toFind) {
        found = true;
        break;
      }
    }
    
    if(found)
      System.out.println(toFind + " is found.");
    else
      System.out.println(toFind + " is not found.");
  }
}
