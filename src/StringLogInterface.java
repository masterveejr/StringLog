
public interface StringLogInterface 
{
	void insert(String element);
	//Places an element into the Stringlog.
	
	boolean isFull();
	//returns true is the StringLog is full, or returns false if not.
	
	int size();
	//returns the number of Strings in Stringlog.
	
	boolean contains(String element);
	//returns true if element is in Stringlog.
	//otherwise will return false.
	
	void clear();
	//makes Stringlog empty.
	
	String getName();
	//returns the name of this Stringlog.
	
	String toString();
	//returns a custom formatted string representing this Stringlog.

	int howMany(String string);

	boolean uniqInsert(String string);

	String smallest();
}

