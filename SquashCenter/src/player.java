import java.util.ArrayList;

import org.w3c.dom.css.Counter;

public abstract class player {
	private static int id=100;
	private String last;
	private String first;
	protected int level;
	private ArrayList<player>players=new ArrayList<>();
	public player( String last, String first) {
		super();
		this.id = id;
		this.id++;
		this.last = last;
		this.first = first;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + id;
		result = prime * result + ((last == null) ? 0 : last.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		player other = (player) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (id != other.id)
			return false;
		if (last == null) {
			if (other.last != null)
				return false;
		} else if (!last.equals(other.last))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "player [id=" + id + ", last=" + last + ", first=" + first + "]";
	}
	
	public abstract void whoAmI();
	
	public final void imRelavantOnlyForThisClass() {
		System.out.println("wohoooo");
	}
		public static void hello() {
			System.out.println("hello");
		}
		
			
		
	}
	


