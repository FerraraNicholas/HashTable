/*
 * 
 */
package HashTable;

import static HashTable.HashTable.isVowelP;
import java.util.LinkedList;

/**
 *
 * @author NicholasFerrara
 */
public class HashTableImplementation {

    static private LinkedList<Bucket> hashtable;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new hastable and add ten empty buckets
        hashtable = new LinkedList<Bucket>();
        for (int i = 0; i < 10; i++) {
            hashtable.add(new Bucket());

        }
        add("aardvark");
        add("baboon");
        add("cat");
        add("dog");
        add("elephant");
        add("flamingo");
        add("hawk");
        add("iguana");
        add("jagugar");
        add("kangroo");
        add("leopard");
        add("manatee");
        add("nyala");
        add("oryx");
        add("porcupine");
        add("quoll");
        add("raven");
        add("stork");
        add("tortoise");
        add("urial");
        add("viper");
        add("wolf");
        add("xeme");
        add("yak");
        add("zebra");
        display();

    }

    private static void add(String id) {
        // run through hash table, if the vowels equal the index then add it
        for (int i = 0; i < hashtable.size(); i++) {
            if (hash(id) == i) {
                hashtable.get(i).add(id);

            }

        }

    }

    public static void display() {
        for (int ba = 0; ba < hashtable.size(); ba++) {
            System.out.println(ba + "--->" + hashtable.get(ba).toString());

        }

    }

//    private static int hash(String id) {
//        int numOfVowels = 0;
//        for (int i = 0; i < id.length(); i++) {
//            String ch = id.substring(i, i++);
//            if (isVowelP(ch)) {
//                numOfVowels = numOfVowels + 1;
//
//            }
//
//        }
//        return numOfVowels;
//    }
    
    private static int hash(String id){
        int letterSum = 0;
        for (int i = 0; i < id.length(); i++) {
            String ch = id.substring(i, i+1);
            int letterPosition = aphabeticPositions(ch);
            letterSum = letterSum + letterPosition^2;
            
        }
        return letterSum % hashtable.size();
    }

    private static int aphabeticPositions(String ch) {
        return "abcdefghijklmnopqrstuvwxyz".indexOf(ch.toLowerCase()) + 1;
    }
}
