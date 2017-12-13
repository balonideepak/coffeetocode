package ds.map;

public class MyHashMap {
    int defaultsize=10;
	Entry table[]=new Entry[defaultsize];
	int count=0;

	public static void main(String[] args) {
		MyHashMap map=new MyHashMap();
	    map.put("One", "1");
	    map.put("Two", "2");
	    map.put("Three","3");
	    map.put("Four", "4");
	    map.put("Five", "5");
	    
	    System.out.println("mapsize ::"+map.count);
	    
	    Entry entry=map.get("Two");
	    System.out.println("Get value>>>");
	    System.out.println((null==entry)?null:entry.getValue());
	}
	
	private int size(){
		return count;
	}

	private void put(String key, String value){
		int hashCode = key.hashCode();
		int index=hashCode%defaultsize;
		Entry item=table[index];
		if(null!=item){
			if(key.equals(item.key))
			{
				item.value=value;
			}
			else{
				while(item.next!=null){
					item=item.next;
				}
				item.next=new Entry(key,value);
				count++;
				
				
			}
		}
		else{
			table[index]=new Entry(key, value);
		}
	}
	
	private Entry get(String key){
		int hashCode = key.hashCode();
		int index=hashCode%defaultsize;
		Entry entry = table[index];
		while(entry!=null){
			if(entry.key.equals(key)){
				return entry;
			}
			entry=entry.next;
		}
		return null;
	}


	class Entry{
		String key;
		String value;
		Entry next;
		public Entry(String key, String value) {
			super();
			this.key = key;
			this.value = value;
		}
		/**
		 * @return the key
		 */
		public String getKey() {
			return key;
		}
		/**
		 * @param key the key to set
		 */
		public void setKey(String key) {
			this.key = key;
		}
		/**
		 * @return the value
		 */
		public String getValue() {
			return value;
		}
		/**
		 * @param value the value to set
		 */
		public void setValue(String value) {
			this.value = value;
		}


	}

}
