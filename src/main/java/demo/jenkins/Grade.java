//Editor: Tuu
//Change on: 12:03

package demo.jenkins;

public class Grade {

	public String convert(int score) {
		if(score >= 100){
			return "S";
		}
		if(score >= 80) {
			return "A";
		}
		if(score >= 70) {
			return "B";
		}
		if(score >= 60) {
			return "C";
		}
		if(score >= 50){
			return "D";
		}
		return "F";
		//TODO
		//FIXME
	}

}
