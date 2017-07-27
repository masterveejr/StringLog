
public class ArrayStringLog implements StringLogInterface
{

	protected String name;
	protected String[] log;
	protected int lastIndex = -1;
	
	public ArrayStringLog(String name, int maxsize){
		log = new String[maxsize];
		this.name = name;
	}
	public ArrayStringLog(String name){
		log = new String[100];
		this.name = name;
	}
	
	@Override
	public void insert(String element) {
		// TODO Auto-generated method stub
		lastIndex++;
		log[lastIndex] = element;	}

	@Override
	public boolean isFull() {
		if (lastIndex == (log.length-1))
			return true;
		else 
			return false;
	}

	@Override
	public int size() {
		return (lastIndex+1);
	}

	@Override
	public boolean contains(String element) {
		  boolean moreToSearch;
		  int location = 0;
		  boolean found = false;
		  moreToSearch = (location <= lastIndex);
		  while (moreToSearch && !found) 
		  {
		    if (element.equalsIgnoreCase(log[location]))  // if they match
		      found = true;
		    else
		    {
		      location++;
		      moreToSearch = (location <= lastIndex);
		    }
		  }
		  return found;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		lastIndex = -1;
	}

	@Override
	public String getName() {
		return name;
	}
	@Override
	public String toString(){
		String logString = "LOg: " + name + "\n\n";
		for(int b=0;b <=lastIndex;b++)
			logString = logString + (b+1) + "."+ log[b]+ "\n";
		return logString;
	}
	public int howMany(String element){
		int count=0;
		for(int b= 0;b<=lastIndex;b++){
			if(log[b].equals(element))
				count++;
		}
		return count;
		}
		public boolean uniqInsert(String element){
			if(this.contains(element))
				return false;
			else{
				this.insert(element);
				return true;
			}
		}
		public String smallest(){
			String small = log[0];
			for(int b = 0; b < lastIndex;b++){
				if(log[b].compareTo(small)<0)
					small = log[b];
			}
			return small;
			
		}
	}


