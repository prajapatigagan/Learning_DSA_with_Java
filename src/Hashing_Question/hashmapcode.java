package Hashing_Question;
import java.util.*;

public class hashmapcode {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;

            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;//n-nodes
        private int N;//N-buckets
        private LinkedList<Node> buckets[];//N=buckets.length
        
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }

        private int hashFunction(K key){//0 to n-1
           int bi=key.hashCode(); 
           return Math.abs(bi)%N;
        }

        private int searchInLL(K key,int bi){
            LinkedList<Node> ll=buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key.equals(key)){
                    return i;  //di
                }
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBuckets[]=buckets;
            N=N*2;
            buckets=new LinkedList[N];
            for(int i=0; i<N;i++){
                buckets[i]=new LinkedList<>();
            }
            n=0;
            for(int i=0; i<oldBuckets.length;i++){
                LinkedList<Node> ll=oldBuckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node =ll.get(i);
                    put(node.key,node.value);
                }
            }
        }

        public void put(K key,V values){
            int bi=hashFunction(key);
            int di= searchInLL(key,bi);//di=-1
            if(di==-1){//key does not exist
                buckets[bi].add(new Node(key, values));
                n++;
            }else{//key exists
                Node node=buckets[bi].get(di);
                node.value=values;
            }

            double lambda=(double)n/N;
            if(lambda>2.0){
                //rehashing
                rehash();
            }
        }
        public boolean  containsKey(K key){
            int bi=hashFunction(key);
            int di= searchInLL(key,bi);//di=-1


            if(di==-1){//key does not exist
                return false;
            }else{//key exists
                return true;
            }
        }
        public V remove(K key){
             int bi=hashFunction(key);
            int di= searchInLL(key,bi);//di=-1
            if(di==-1){//key does not exist
                return null;
            }else{//key exists
                Node node=buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }
        public V get (K key){
             int bi=hashFunction(key);
            int di= searchInLL(key,bi);//di=-1
            if(di==-1){//key does not exist
                return null;
            }else{//key exists
                Node node=buckets[bi].get(di);
                return node.value;
            }
        }
        public ArrayList<K> keySet(){
             ArrayList<K> keys=new ArrayList<>();
             for(int i=0; i<buckets.length;i++){
                LinkedList<Node> ll=buckets[i];
                for(int j=0; j<ll.size();j++){
                    Node node=ll.get(j);
                    keys.add(node.key);
                }
             }
            return keys;
        } 
        public boolean isEmpty(){
            return n==0;
        }
    }
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("india",200);
        map.put("usa", 190);
        map.put("pak",180);

        ArrayList<String> keys=map.keySet();
        for(int i=0; i<keys.size(); i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
    }
}