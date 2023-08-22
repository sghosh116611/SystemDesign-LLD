
public class Main {

	public static void main(String[] args) {

		try {
			TV tv = new TV();

			tv.setStage(new OffStage());

//			Stage tvStage = tv.getStage();

//			tvStage.changeChannel();
//			tvStage.turnOnVolume();

			tv.setStage(new OnStage());

			Stage tvStage = tv.getStage();
			tvStage.changeChannel();
			tvStage.turnOnVolume();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
