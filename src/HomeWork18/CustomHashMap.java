package HomeWork18;

import java.util.List;
import java.util.Map;

public class CustomHashMap<K,V> implements CustomMap<K,V> {
    private static final int DEFAULT_SIZE = 10;
    List<CustomEntry<K, V>>[] buckets = new List[DEFAULT_SIZE];
    private int size;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean containsKey(Object key) {
        return get(key)!=null;
    }

    @Override
    public boolean containsValue(Object value) {
        for (int i = 0; i <buckets.length ; i++) {
            for (int j = 0; j <buckets[i].size() ; j++) {
               if (buckets[i].get(j).equals(value)){
                   return true;
               }
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        int hashCode =key.hashCode();
        int bucketIndex =buckets.length%hashCode;
        List<CustomEntry<K,V>> list = buckets[bucketIndex];
        for (int i = 0; i <list.size() ; i++) {
            CustomEntry<K,V> customEntry = list.get(i);
            if ( customEntry.key.equals(key)){
                return customEntry.value;
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        int hashCode =key.hashCode();
        int bucketIndex =buckets.length%hashCode;
        List<CustomEntry<K,V>> list = buckets[bucketIndex];
        CustomEntry<K,V> kvCustomEntry=new CustomEntry<>(key,value);
        for (int i = 0; i <list.size() ; i++) {
            CustomEntry<K,V> customEntry = list.get(i);
            if ( customEntry.key.equals(key)){
                V v = customEntry.value;
                customEntry.value =value;
                return v;
            }
        }size++;
          list.add(kvCustomEntry);
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {
     size =0;
    }

    @Override
    public V remove(Object key) {
        for (int i = 0; i <buckets.length ; i++) {
            if (buckets[i].equals(key)){

            }
        }
        return null;
    }
/*
    public  keySet
*/

    class CustomEntry<K, V> {
        K key;
        V value;

        public CustomEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

    }
}
