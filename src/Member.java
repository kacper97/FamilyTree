import java.util.ArrayList;
/**
 * 
 * @author kacper
 *
 */
public class Member {
	private String name;
	private String sex;
	private String dob;
	private Member mother;
	private Member spouse;
	private Member father;
	private ArrayList<Member> children;
	
	public Member(String name, String sex, String dob, Member mother, Member father,Member spouse) {
		this.name = name;
		this.sex = sex;
		this.dob = dob;
		this.mother = mother;
		this.father = father;
		this.spouse=spouse;
		children=new ArrayList<Member>();   //empty when Member is created
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getsex() {
		return sex;
	}
	
	public void setsex(String sex) {
		if(sex.equals("M") || sex.equals("F")){  //must be F or M
		this.sex = sex;
		}
	}
	
	public String getDob() {
		return dob;
	}
	
	public void setDob(String dob) {
		this.dob =dob;
	}
	
	public Member getSpouse() {
		return spouse;
	}

	public void setSpouse(Member spouse) {
		this.spouse = spouse;
	}

	public ArrayList<Member> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<Member> children) {
		this.children = children;
	}

	public Member getMother() {
		return mother;
	}
	
	public void setMother(Member mother) {
		this.mother = mother;
	}
	
	public Member getFather() {
		return father;
	}
	
	public void setFather(Member father) {
		this.father = father;
	}
}
