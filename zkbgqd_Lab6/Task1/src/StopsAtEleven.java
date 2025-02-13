import java.util.Scanner;

public class StopsAtEleven {
    public static void main(String[] args)
    {
        //new scanner object
        Scanner scanner = new Scanner(System.in);

        //initilize variables
        int n = 0;
        int length =0;

        //While loop to get inputs
        while (n != 11){

            //use a try catch statement to make sure inputs are valid
            try{
                n = scanner.nextInt();
                if(n<0){
                    System.out.println("need positive input");
                    continue;
                }
            } catch (Exception e){
                System.out.println(e);
                scanner.next();
                continue;
            }
            //only increasing length for numbers that arent 11
            if (n != 11) {
                length++;
            }


            }
        //print length
        System.out.println(length);
    }

}