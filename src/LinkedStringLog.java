
public class LinkedStringLog implements StringLogInterface{
	protected LLStringNode log;
	protected String name;
	
	public LinkedStringLog(String name)
	{
		log = null;
		this.name=name;
	}
	

	@Override
	public void insert(String element) {
		LLStringNode newNode = new LLStringNode(element);
		newNode.setLink(log);
		log = newNode;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int size() {
		int count = 0;
		LLStringNode node;
		node = log;
		while (node != null){
			count = count +1;
			node = node.getLink();
		}
		return count;
	}

	@Override
	public boolean contains(String element) {
		LLStringNode node;
		node = log;
		boolean found = false;
		boolean moreToSearch;
		moreToSearch = (node!=null);
		while(moreToSearch && !found){
			if(element.equalsIgnoreCase(node.getInfo()))
				found = true;
			else{
				node = node.getLink();
				moreToSearch = (node!=null);
			}
		}
		return found;
	}

	@Override
	public void clear() {
		log = null;
	}

	@Override
	public String getName() {
		return name;
	}
	public int howMany(String element){ 
		int count=0;
		  LLStringNode node = log; 
		  while(node != null){ 
			  if(node.getInfo() == element)
			  {
				  count++;
			  }
			  node = node.getLink(); 
		  }  
		  return count; 
	 }
	@Override
	public String toString(){
		{
			  String logString = "Log: " + name + "\n\n";
			  LLStringNode node;
			  node = log;
			  int count = 0;
			  while (node != null)
			        {
			               count = count + 1;
			               logString = logString + count + ". " + node.getInfo() + "\n";
			               node = node.getLink();
			         }
			    return logString;
		}
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
		LLStringNode node = log;
		String small = node.getInfo();
		while (node != null){
			if (node.getInfo().compareTo(small)<0){
				small = node.getInfo();
				}
			node = node.getLink();
			}
		return small;
			}
		
	}
		


