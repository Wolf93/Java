
import java.util.Arrays;

public class BubbleSort 
{
    private int[] values;
    
    public BubbleSort(int[] val)	{
        values = new int[val.length];
        values = Arrays.copyOf(val,val.length);
    }
    public BubbleSort(int alpha)	{
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
        int t = 0;

        for (int i = 0; i < n; ++i) 	{
            for (int j = 1; j < (n-i); ++j) 	{
                if (retval[j-1] > retval[j]) 	{
                    t = retval[j-1];
                    retval[j-1] = retval[j];
                    retval[j] = t;
                }
            }
        }
        
        return retval;
    }
}
