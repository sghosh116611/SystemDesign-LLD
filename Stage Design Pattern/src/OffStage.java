
public class OffStage implements Stage{

	@Override
	public void changeChannel() throws Exception {
		throw new Exception("Cannot change channel in off stage");
	}

	@Override
	public void turnOnVolume() throws Exception {
		throw new Exception("Cannot change volume in off stage");
	}

}
