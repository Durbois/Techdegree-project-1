import java.util.Random;

public class Jar {

  private String name;
  private int maxNumberItem;

  public Jar(String name, int maxNumberItem) {
    this.name = name;
    this.maxNumberItem = maxNumberItem;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMaxNumberItem() {
    return maxNumberItem;
  }

  public void setMaxNumberItem(int maxNumberItem) {
    this.maxNumberItem = maxNumberItem;
  }

  /**
   * This method uses the random number of items between one item and the maximum possible to items
   * @return
   */
  public int fill(){
    Random random = new Random();
    //random Number should be between 1 and maxNumberItem
    int randomNumber = random.nextInt(maxNumberItem) + 1;
    return randomNumber;
  }
}
