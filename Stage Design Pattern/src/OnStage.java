
public class OnStage implements Stage {

	@Override
	public void changeChannel() throws Exception {
		System.out.println("Can change channel");
	}

	@Override
	public void turnOnVolume() throws Exception {
		System.out.println("Turning on volume");
	}

}
