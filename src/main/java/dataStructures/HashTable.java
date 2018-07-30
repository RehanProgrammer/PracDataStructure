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

  public String get(String key){
       int index = getIndex(key);
       HashEntry entries = hash[index];

      if (entries!=null){
          while (!entries.key.equals(key) && entries.next!=null){
              entries = entries.next;
          }
          return entries.value;
      }

      return "There is no entry with that key";
  }
  public int getIndex(String key){
       int hashCode = key.hashCode();
       if (hashCode < 0)
           hashCode = hashCode * -1;
        System.out.println("hashcode= " + hashCode);
       int index = hashCode % initialSize;
      System.out.println("index= " + index);

      if (key.equals("John Smith") || key.equals("Sandra Dee")){
          index = 4;
      }
      return index;
  }
}
