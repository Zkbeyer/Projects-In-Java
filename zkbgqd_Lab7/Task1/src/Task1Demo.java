public class Task1Demo {
    public static void main(String[] args)
    {
       ProductionWorker workerOne = new ProductionWorker("John Smith", "123-A", "11-15-2005", 1, 16.5);
       ProductionWorker workerTwo = new ProductionWorker("Joan Jones", "222-L", "12-12-2005", 2, 18.5);
       System.out.println("The first production worker");
       System.out.println(workerOne);
       System.out.println(" ");
       System.out.println("The second production worker");
       System.out.println(workerTwo);
    }
}