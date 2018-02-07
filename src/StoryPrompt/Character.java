package StoryPrompt;

import java.io.Serializable;
import java.util.Hashtable;

public class Character implements Serializable {
	private static int staticID;
	private int id;
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private String birthMonth;
	private int birthYear;
	private int birthDay;
	private Hashtable<String,String> moreDetails;
	public Character() {
		id = staticID;
		staticID++;
	}
	public static void main(String[] args) {
		Character r = new Character();
	}
	//Get Methods
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getMiddleName() {
		return this.middleName;
	}
	public int getAge() {
		return this.age;
	}
	public String getBirthMonth() {
		return this.birthMonth;
	}
	public int getBirthDay() {
		return this.birthDay;
	}
	public int getBirthYear() {
		return this.birthYear;
	}
	public String getFullBirthday() {
		int day = this.getBirthDay();
		String month = this.getBirthMonth();
		int year = this.getBirthYear();
		return month+" "+day+", "+year;
	}
	public String getBirthMonthDay() {
		int day = this.getBirthDay();
		String fDay = "";	//formatted day
		if(day%10==1 && day!=11) {
			fDay = day+"st";
		}else if(day%10 == 2 && day!=12) {
			fDay = day+"nd";
		}else if(day%10 == 3 && day!=13) {
			fDay = day+"rd";
		}else {
			fDay = day+"th";
		}
		
		String month = this.getBirthMonth();
		return month+" "+fDay;
	}
	public String getDetails(String key) {
		String detail = "";
		try {
			detail = this.moreDetails.get(key);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return detail;
	}
	//Set Methods
	public void setFirstName(String name) {
		this.firstName = name;
	}
	public void setMiddleName(String name) {
		this.middleName = name;
	}
	public void setLastName(String name) {
		this.lastName = name;
	}
	public void setBirthDay(int day) {
		this.birthDay = day;
	}
	public void setBirthMonth(String month) {
		this.birthMonth = month;
	}
	public void setBirthYear(int year) {
		this.birthYear = year;
	}
	public void addDetails(String key, String value) {
		this.moreDetails.put(key,value);
	}
}