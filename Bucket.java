/*
 *
 */
package HashTable;

import java.util.LinkedList;

/**
 *
 * @author NicholasFerrara
 */
public class Bucket implements BucketADT {

    private LinkedList<String> bucket;

    public Bucket() {
        bucket = new LinkedList<String>();
    }

    @Override
    public void add(String id) {
        bucket.add(id);
        

    }
    
    public String toString(){
        String ret = "";
        for (int i = 0; i < bucket.size(); i++) {
            ret += bucket.get(i) + " ";
            
        }
        return ret;
    }

}
