
public class DriverLL {

	public static void main(String[] args) {
		LinkedStringLog list;
		list = new LinkedStringLog("test");
		
		list.insert("fun");
		list.insert("food");
		list.insert("bryan");
		list.insert("bryan");

		
		System.out.println(list);
		System.out.println(list.contains("bryan"));
		System.out.println("the amount of times the name bryan appears is " + list.howMany("bryan"));
		System.out.println("inserting bryan attempt " + list.uniqInsert("bryan"));
		System.out.println("inserting bob attempt " + list.uniqInsert("bob"));
		System.out.println("the smallest is: " + list.smallest());
		System.out.println(list);
	}

}
