package StoryPrompt;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Prompter{
	private File chars;
	private File ques;
	private Scanner sc_char;
	private Scanner sc_ques;
	private ArrayList<Character> characters;
	private ArrayList<String> questions;
	public Prompter(){
		chars = new File("characters.xml");
		ques = new File("questions.xml");
		try {
			sc_char = new Scanner(chars);
			sc_ques = new Scanner(ques);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		while(sc_char.hasNextLine()) {
		}
	}
	public static void main(String[] args){
		
	}
	public int getCharacterIndex(int id){
		
	}
	public String getRandomQuestion(){
		String question = "";
		double x = Math.random();
		int qNum = (int)(x*100);	//truncated. That's fine.
		int i = 0;
		while(i <= qNum){
			question = sc_ques.nextLine();
		}
		return question; 
	}
	public String fillTags(String question, int characterIndex){
		String newQuestion = question;
		if(newQuestion.contains("<characterName>")) {
		}else {
			return newQuestion;
		}
	}
}