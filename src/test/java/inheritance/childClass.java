package inheritance;

public class childClass extends ParentVehicle {

	
	public void getColor() {
		
		System.out.println(color);
	}
	
	public void getbreak() {
		breakSystem();
	}
	
	public void getGearsys() {
		
		GearSystem();
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childClass c = new childClass();
		
		c.getColor();
		c.getbreak();
		c.getGearsys();
		AudioSystem();
		
		
	}

}
