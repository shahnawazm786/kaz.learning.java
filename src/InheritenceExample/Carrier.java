package InheritenceExample;

public class Carrier implements IAnimals,ICar{

	@Override
	public void manualFourWheel() {
		// TODO Auto-generated method stub
		System.out.println("Manual Four Wheel");
		
	}

	@Override
	public void automaticFourWheel() {
		// TODO Auto-generated method stub
		System.out.println("Automatic Four Wheel");
		
	}

	@Override
	public void twoLeg() {
		// TODO Auto-generated method stub
		System.out.println("Animals of two legs");
	}

	@Override
	public void fourLeg() {
		// TODO Auto-generated method stub
		System.out.println("Animals of four legs");
	}

}
