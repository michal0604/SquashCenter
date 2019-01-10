
public class PlayerRegular extends player implements Athlete {

	public PlayerRegular( String last, String first) {
		super( last, first);
		this.level=1;
		
	}
	

	

	@Override
	public String toString() {
		return "PlayerRegular [level=" + level + ", getId()=" + getId() + ", getLast()=" + getLast() + ", getFirst()="
				+ getFirst() + "]";
	}




	@Override
	public void FoodInfo() {
		System.out.println("1 banana");
		
	}

	@Override
	public void trainning() {
		System.out.println("8 hours");
		
	}




	@Override
	public void whoAmI() {
		System.out.println("type playerRegular");
		
	}
	
		
	}

	

