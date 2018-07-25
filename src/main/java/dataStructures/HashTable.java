package dataStructures;

public class HashTable {

   private int initialSize = 16;
   private HashEntry[] hash;

   class HashEntry{
       String key;
       String value;
       HashEntry next;

       HashEntry (String key , String value){
           this.key = key;
           this.value = value;
           this.next = null;
       }

   }

  HashTable(){
       hash = new HashEntry[initialSize];
  }

  public void put (String key, String value){
     int index = getIndex(key);

     HashEntry entry = new HashEntry(key,value);

     if (hash[index] == null){
         hash[index] = entry;
     }
     else{
         HashEntry entries = hash[index];
         while (entries.next!=null){
             entries = entries.next;
         }
         entries.next = entry;
     }
  }

  public int getIndex(String key){
       int hashCode = key.hashCode();
  }
}
