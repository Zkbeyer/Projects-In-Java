public class SequenceOperations {

    //returns the total sum of the array
    public double getTotal(double[] array){
        double total = 0;
        for (double v : array) {
            total += v;
        }
        return total;
    }

    //returns the average of the array
    public double getAverage(double[] array){
        double total = getTotal(array);
        return total / array.length;
    }

    //returns the biggest value in the array
    public double getHighest(double[] array){
        double highest = array[0];
        for (double v : array) {
            if (v > highest) {
                highest = v;
            }
        }
        return highest;
    }

    //returns the reversed array
    public double[] getReverse(double[] array){
        double[] reversedArray = new double[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

}

