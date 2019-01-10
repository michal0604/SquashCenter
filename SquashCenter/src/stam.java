import java.util.ArrayList;

public class stam {
	
	public void countHowManyProAndRegular(int c) {
		int counterPro=0;
		int counterRe=0;
		ArrayList<player>players=new ArrayList<player>();
		for(player p:players) {
			
			if (p instanceof PlayerPro) {
				System.out.println("type pro");
				counterPro++;
			}
			else {
				System.out.println("type regular");
				counterRe++;
			}
		}
		System.out.println("there is "+counterPro+"pro in squash");
		System.out.println("there is"+counterRe+"regular in squash");
		}

}
