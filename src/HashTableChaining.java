import java.util.LinkedList;

class Table{
    private LinkedList<String>[] table;
    private int size;

    public Table(int size){
        this.size = size;
        table = new LinkedList[size];
        for(int i = 0; i < size; i++){
            table[i] = new LinkedList<>();
        }
    }

    private int hash(String key){
        int sum =0;
        for(char c:key.toCharArray()){
            sum += (int) c;
        }
        return sum % size;
    }

    public void insert(String name){
        int index = hash(name);
        table[index].add(name);
    }

    public void display(){
        for (int i = 0; i < size; i++){
            System.out.print(" Index "+ i +": ");
            if (table[i].isEmpty()){
                System.out.println("-");
            }else{
                for(String name: table[i]){
                    System.out.print(name + " -> ");
                }
                System.out.println("null");
            }
        }
    }
}

public class HashTableChaining {
    public static void main(String[] args) {
        String[] names = {"Andi", "Ingrit", "Dora", "Chris", "Della", "Jeremy", "Jessica", "Bella", "Emma", "Blake"};

        Table hashTable = new Table(10);
        for(String name:names){
            hashTable.insert(name);
        }
        System.out.println(hashTable);
        hashTable.display();
    }
}
