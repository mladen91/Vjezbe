package predavanja;

public class Message {

	
	private String sender;
	private String content;
	public Message(String sender, String content) {
		this.sender = sender;
		this.content = content;
	}
	public String getMessage(){
		return sender+": "+content;
	}
	
	
}
