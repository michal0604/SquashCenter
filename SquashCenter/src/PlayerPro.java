
public class PlayerPro extends player implements Athlete {

	public PlayerPro( String last, String first) {
		super( last, first);
		this.level=2;
	}


	@Override
	public String toString() {
		return "PlayerPro [level=" + level + ", getId()=" + getId() + ", getLast()=" + getLast() + ", getFirst()="
				+ getFirst() + "]";
	}
	


	@Override
	public void FoodInfo() {
		System.out.println("2 banana");
		
	}

	@Override
	public void trainning() {
		System.out.println("10 hours");
		
	}


	@Override
	public void whoAmI() {
		System.out.println("type playerpro");
	}


	
	
	}
	
	
	
	
	

	

