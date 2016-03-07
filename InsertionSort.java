

import java.util.Arrays;

public class InsertionSort 	{
    private int[] values;
    
    public InsertionSort(int[] val)	{
        values = new int[val.length];
        values = Arrays.copyOf(val,val.length);
        
    }
    public InsertionSort(int alpha)	{
        values = new int[alpha];
        Arrays.fill(values, -999);
        
    }
    
    public void Add(int delta)	{
        for (int i=0;i<values.length;++i)	{
            if (values[i] == -999)	{
                values[i] = delta;
                break;
            }
        }
    }
    
    public int[] Sort()	{
        int[] retval = new int[values.length];
        retval = Arrays.copyOf(values, values.length);

        int n = retval.length;
        for (int i = 1; i < n; i++) 	{
            int t = retval[i];
            int j = i-1;
            
            while ((j >= 0) && (retval[j] > t)) {
                retval[j+1] = retval[j];
                --j;
            }
            retval[j+1] = t;
        }
        return retval;        
    }
}
