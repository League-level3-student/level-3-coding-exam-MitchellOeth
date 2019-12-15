import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> v) {
		int a = 0;
		for (int i = 0; i < v.size(); i++) {
			if(v.get(i).toLowerCase().equals("pope francis")) {
				a++;
			} else if(v.get(i).toLowerCase().contentEquals("edward snowden")) {
				a--;
				
			}
			System.out.println(a);
		}
		
		if(a < 0) {
			return "edward snowden";
		}
		if(a > 0) {
			return "pope francis";
		}
		else {
			return "TIE";	
		}
	}
}
