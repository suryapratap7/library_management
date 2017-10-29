package libraryPackage;
import java.util.Scanner;
public class Console
{
  static Scanner console = new Scanner(System.in);

  public static String askString(String aPrompt)
  {
	  System.out.print(aPrompt);
	  String reply = console.nextLine();
	  return reply;
  }

  public static int askInt(String aPrompt)
  {
      String reply = askString(aPrompt);
      return Integer.parseInt(reply);
  }

  public static char askOption(String aMenu)
  {
	  System.out.println(aMenu);
	  String reply = askString("Enter option: ");
	  if (reply.trim().length() == 0)
		  return '\0';
	  else
	    return Character.toUpperCase(reply.trim().charAt(0));
  }

}

