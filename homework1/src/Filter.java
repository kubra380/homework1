
public class Filter {
	private String name;
	private int room;
	private int hall;

	public Filter(String name,int room,int hall) {
		setName(name);
		setRoom(room);
		setHall(hall);
		}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setRoom(int room) {
		this.room=room;
	}

	public double getRoom() {
		return room;
		
	}
	public void setHall(int hall) {
		this.hall=hall;
	}
	public int getHall() {
		return hall;
	}
	@Override
	public String toString() {
		return"Filter{" +
			"name='"    + getName()+ '\''+
		    ", room='"   + getRoom()+  '\''+
		    "hall=" +getHall()+
				
			'}';
	}
}
