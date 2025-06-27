//HashMap  TreeSet   
put(key, value)	Add or update a key-value pair
get(key)	Get the value for a key
remove(key)	Remove key and value
containsKey(key)	Check if key exists
containsValue(value)	Check if value exists
keySet()	Get all keys
values()	Get all values
clear()	Remove all entries
isEmpty()	Check if map is empty
size()	Number of key-value pairs

Feature	      HashMap	                         TreeMap
Order	        No guaranteed order	             Sorted by keys
Null Keys	    Allows one null key	             Does not allow null keys
Performance	  Faster (no sorting)	             Slower (maintains sorted order)  


Feature	      HashMap	                         LinkedHashMap
Order	        No guaranteed order	             Insertion order preserved
Performance	  Faster for random access	       Slightly slower due to ordering
Duplicates	  Keys must be unique	             Keys must be unique  
