package YesAnd;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Questions {
	private ArrayList<String> questions;
	public Questions(String str){
		Scanner scan = null;
		boolean done = false;
		while(!done){
			try{
				scan = new Scanner(new File(str));
				while(scan.hasNextLine()){
					String q = scan.nextLine();
					questions.add(q);
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public Questions(File file){
		boolean done = false;
		Scanner scan;
		while(!done){
			try{
				scan = new Scanner(file);
				while(scan.hasNext()){
					String q = scan.nextLine();
					questions.add(q);
				}
				done = true;
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	private String returnQuestion(int num){
		return this.questions.get(num);
	}
	private int pickQuestion(){
		double random = (Math.random())*10;
		int questionNumber = (int) random;
		return questionNumber;
	}
	public String askQuestion(){
		int i = pickQuestion();
		String question = this.returnQuestion(i);
		return question;
	}
}
