
public class ParametroException extends Exception {
	private String message;
	
	public ParametroException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
