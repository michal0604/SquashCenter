import java.util.ArrayList;

public class SquashCenter {
	private static SquashCenter instance = new SquashCenter("077-7905272", "TLV");
	private String phoneNumber;
	private String city;
	ArrayList<player>players=new ArrayList<player>();
	 
	
	private SquashCenter(String phoneNumber, String city) {
		this.phoneNumber = phoneNumber;
		this.city = city;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public static SquashCenter getInstance() {
		return instance;
	}
	

	public static void countHowManyProAndRegular(ArrayList<player> players) {
		int counterPro=0;
		int counterRe=0;
		
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
	
	
	
	
	
	
	
	
			
	
	


