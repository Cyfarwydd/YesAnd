import java.util.Scanner;

public class commandline{
	public static void main(String[] args){
		Questions q = new Questions("./data/questions");
		String str = "";
		Scanner scan = new Scanner(System.in);
		String input = "";
		System.out.println("Hello!\n\nI am 'Yes And?', a program designed to 'listen' to your story and ask you questions to prompt ideas! So come on! Tell me about your story.");
		while(!input.equals("-1")){
			input = scan.nextLine();
			str = q.askQuestion();
			System.out.println(str);
		}
		System.out.println("Thank you for using 'Yes And', created by Nicolas MacDonald.\n\nGithub Page: https://github.com/Cyfarwydd/YesAnd\n\nFeedback can be sent to the email linked to my github page.\n\nThanks!\n\tNic.");
	}
}
