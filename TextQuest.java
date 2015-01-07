import java.io.Console;
import java.util.Scanner;

public class TextQuest {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("\n\nWhat's your first name, sonny? ");
    String firstName = scan.nextLine();
    System.out.print("\nHow about the last one? ");
    String lastName = scan.nextLine();

    String option;
    Boolean girl;

    System.out.printf("\nSo you're %s, huh? What a silly name for a girl.\n\nYou are a girl right?\n(yup/nope/leave me alone/who are you?) : ", firstName);

    while(true){
      option = scan.nextLine();
      if(option.equalsIgnoreCase("yup")) {
        girl = true;
        break;
      } else if(option.equalsIgnoreCase("nope")) {
        girl = false;
        break;
      } else {
        System.out.println("\nThat's not what I asked, sonny.\n");
        System.out.printf("Are you a girl or not, %s?\n(last time I checked/you're creepy/yup/who wants to know?/nope/I'm not sure) : ", firstName);
      }
    }

    if(girl) {
      System.out.printf("\nCan I buy ya a drink, %s?\n", firstName);
    } else {
      System.out.printf("\nHow's abouts you and I go to the pub for a bit, %s?\n", lastName);
    }

    System.out.print("(okay/hell no) : ");
    String comeon = "Comeon";
    while(true) {
      option = scan.nextLine();
      if(option.equalsIgnoreCase("okay") || option.equalsIgnoreCase("fine")) {
        System.out.println("\nYay let's go!!\n");
        break;
      } else {
        System.out.printf("\n" + comeon + "!\nLet's go to the pub, %s!\n", firstName);
        System.out.print("(do I have to?/I don't even know you/okay/nahhh/maybe/fine/beer is my favorite color) : ");
        comeon += "nn";
      }
    }

  }


}
