
public class ObjectFactory {
	
	public Machine getObject(String objectType) {
		if(objectType.equalsIgnoreCase("Fax"))
			return new FaxMachine();
		else if(objectType.equalsIgnoreCase("Xerox"))
			return new XeroxMachine();
		
		return new NullMachine();
	}

}
