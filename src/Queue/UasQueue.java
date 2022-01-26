package Queue;

public class UasQueue {

    public static void main(String[] args) {
        Employee BambangAhmad = new Employee("Bambang", "Ahmad", 123);
        Employee ImamRiki = new Employee("Imam", "Riki", 4567);
        Employee AbdulRifki = new Employee("Abdul", "Riki", 22);
        Employee EgaNanda = new Employee("Ega", "Nanda", 3245);
        Employee KrisnaDilan = new Employee("Krisna", "Dilan", 78);
         
       ArrayQueue queue = new ArrayQueue(10);
        queue.add(BambangAhmad);
        queue.add(ImamRiki);
        queue.add(AbdulRifki);
        queue.add(EgaNanda);
        queue.add(KrisnaDilan);
        //queue.printQueue();
        
        queue.remove();
        queue.remove();
        //queue.printQueue();
        
        //System.out.println(queue.peek());
        queue.remove();
        queue.remove();
        queue.remove();
        //queue.remove();
        
        queue.add(EgaNanda);
        queue.printQueue();
         
    }
    
}
