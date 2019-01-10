import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class test {

	public static void main(String[] args) {
		
		ArrayList<player>players=new ArrayList<player>();
		PlayerPro p1=new PlayerPro("Cohen", "Avi");	
		PlayerPro p2=new PlayerPro( "David", "Beni");
		PlayerPro p3=new PlayerPro("Dany", "Ben");
		PlayerRegular p4=new PlayerRegular("Eliyaho", "Shiran");
		PlayerRegular p5=new PlayerRegular("nahum", "Dany");
		
		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);
		players.add(p5);
		System.out.println(players);
		
		SquashCenter.countHowManyProAndRegular(players);
			
		}
	
		
			
			
			
	
	/*	
		System.out.println(SquashCenter.getInstance().getCity());
		
		p1.trainning();
		p1.FoodInfo();
		p2.trainning();
		p2.FoodInfo();
		
		
		System.out.println(p1);
		p1.imRelavantOnlyForThisClass();
		p1.hello();
		p2.hello();
		
		ArrayList<player>players=new ArrayList<>();
		players.add(p1);
		players.add(p2);
		players.add(p3);
		
		System.out.println(players);
		Collections.sort(players, new Comparator<player>() {

			@Override
			public int compare(player p1, player p2) {
				
				return p1.getFirst().compareTo(p2.getFirst());
				
				
			}
			
		});
		p1.whoAmI();
		p2.whoAmI();*/
		//PlayerPro p3=p1;
	//	 p1.setFirst("Baroch");
		// System.out.println(p3);
				
		/*	Collections.sort(players, new Comparator<player>() {

				@Override
				public int compare(player p1, player p3) {
					
					
					return p1.getFirst().compareTo(p3.getFirst());
					
					
				}
			});
			
		System.out.println(players);
		
	//	System.out.println(p1);
	 * 
	 * 
	 */
	}
	
	


	
	


