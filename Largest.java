public class Largest {
	public Largest() {}
    public int largest(int[] list){
        int index;
        int max = list[0];
        for (index = 1; index < list.length-1; index++){
            if (list[index] < max) {
                max = list[index];
            }
        }
        return max;
    }

    import static org.junit.Assert.*;
    import org.junit.Test;

    public class TestLargest  {
    	private Largest temp1;

    	public void testPositive(){
            int[] arr = new int[4];
            arr[0] = 11;
            arr[1] = 9;
            arr[2] = 7;
            arr[3] = 10;
            temp1 = new Largest();
            int maxValue = temp1.largest(arr);
    	assertSame("Values are not equal", maxValue, arr[0]);
        }

    
