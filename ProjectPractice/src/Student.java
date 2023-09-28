
public class Student {
	String name;
	int hindimarks;
	int englishmarks;
	int mathsmarks;
	
	public Student(String name,int hindimarks,int englishmarks,int mathsmarks) {
		this.name=name;
		this.hindimarks=hindimarks;
		this.englishmarks=englishmarks;
		this.mathsmarks=mathsmarks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHindimarks() {
		return hindimarks;
	}

	public void setHindimarks(int hindimarks) {
		this.hindimarks = hindimarks;
	}

	public int getEnglishmarks() {
		return englishmarks;
	}

	public void setEnglishmarks(int englishmarks) {
		this.englishmarks = englishmarks;
	}

	public int getMathsmarks() {
		return mathsmarks;
	}

	public void setMathsmarks(int mathsmarks) {
		this.mathsmarks = mathsmarks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", hindimarks=" + hindimarks + ", englishmarks=" + englishmarks
				+ ", mathsmarks=" + mathsmarks + "]";
	}
	

}
