import java.util.Scanner;

public class Prompter {

  public void displayOutput() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("ADMINISTRATION SETUP");
    System.out.println("--------------------");

    System.out.print("What type of item should go in the jar: ");
    String itemType = scanner.nextLine();

    System.out.printf("What is the maximum amount of %s that should go in the jar: ", itemType);
    int  maxNumberItem = Integer.parseInt(scanner.nextLine());
    System.out.println("---------------------");

    Jar jar = new Jar(itemType, maxNumberItem);

    int exactNumberOfItemInJar = jar.fill();

    System.out.printf("%n%n%n%n------------------%n");
    System.out.printf("Welcome to the guessing game!%n");
    System.out.printf("How many %s are in the jar?", itemType);
    System.out.printf("Pick a number between 1 and %d: ", maxNumberItem);
    int choice = Integer.parseInt(scanner.nextLine());
    int attemptNumber = 1;

    while(choice != exactNumberOfItemInJar){

      if(choice > maxNumberItem){
        System.out.printf("Your guess must be less than %d%n", maxNumberItem);
      }else{
        if (choice < exactNumberOfItemInJar) {
          System.out.println("Your guess is too low");
        }else {
          if(choice > exactNumberOfItemInJar){
            System.out.println("Your guess is too high");
          }
        }
        attemptNumber++;
      }

      System.out.print("How many esplanades are in the jar?");
      System.out.printf("Pick a number between 1 and %d: ", maxNumberItem);
      choice = Integer.parseInt(scanner.nextLine());
    }

    if(attemptNumber==1){
      System.out.printf("You got it in %d attempt", attemptNumber);
    }else{
      System.out.printf("You got it in %d attempts", attemptNumber);
    }
  }
}
