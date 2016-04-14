/*
 *
 */
package HashTable;

import java.util.LinkedList;

/**
 *
 * @author NicholasFerrara
 */
public class HashTable implements HashTableADT {
    private LinkedList<Bucket> table;
    
    public HashTable(){
        table = new LinkedList<Bucket>();
        for (int i = 1; i <= 10; i++) {
            table.add(new Bucket());
        }
        
    }
    

    public void add(String id) {
        int hashAddress = hash(id);
        table.get(hashAddress).add(id);
        
    }
    
    private int hash(String id){
        int numOfVowels = 0;
        for (int i = 0; i < id.length(); i++) {
            String ch = id.substring(i, i++);
            if (isVowelP(ch)) {
                numOfVowels = numOfVowels + 1;
            }
            
        }
        return numOfVowels;
    }

    @Override
    public void display() {
        for (int ba = 0; ba < table.size(); ba++) {
            System.out.println(ba + "-->" + table.get(ba));
        }
    }

    public static boolean isVowelP(String id) {
        return "aeiou".indexOf(id.toLowerCase())>=0;
    }
    
    
}
