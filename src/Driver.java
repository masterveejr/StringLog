
public class Driver {

	public static void main(String[] args) {
		StringLogInterface log;
		log = new ArrayStringLog("test");
		log.insert("bryan");
		log.insert("john");
		log.insert("school");
		log.insert("bryan");
		System.out.println(log);
		System.out.println("the ammount of times the name bryan appears is " + log.howMany("bryan"));
		System.out.println("inserting school attempt " + log.uniqInsert("school"));
		System.out.println("inserting bob attempt " + log.uniqInsert("bob"));
		System.out.println("the smallest is: " + log.smallest());
		
	}

}
