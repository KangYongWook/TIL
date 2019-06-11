package ws2;

public class Engine {

	private int engineplace;
	private int enginemethod;
	
	
	public Engine() {
	}

	public void Enginestat(int engine) 
			throws Exception {
		switch(engine) {
		case 1:
			engineplace = 2000;
			enginemethod = 4;
			break;
		case 2:
			engineplace = 2000;
			enginemethod = 8;
			break;
		case 3:
			engineplace = 3300;
			enginemethod = 4;
			break;
		case 4:
			engineplace = 3300;
			enginemethod = 8;
			break;			
		default:
			throw new Exception("E001");
		}
	}
	
	
	public String Engineout() {
		
		return "배기량- "+engineplace+"cc, "+enginemethod+"기통";
	}
	
}
