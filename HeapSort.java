
import java.util.Arrays;

public class HeapSort 	{    
    private static int logical_size;
    private int[] values;
    
    public HeapSort(int[] val)	{
        values = new int[val.length];
        values = Arrays.copyOf(val,val.length);
        
        Build();
    }
    public HeapSort(int alpha)	{
        values = new int[alpha];
        Arrays.fill(values, -999);
        
        Build();
    }
    
    public void Add(int delta)	{
        for (int i=0;i<values.length;++i)	{
            if (values[i] == -999)	{
                values[i] = delta;
                break;
            }
        }
    }
    
    public void Build()	{
        logical_size = values.length-1;
        for (int i = logical_size/2; i >= 0; --i)
            Swap_max(i);
    }
    
    public void Swap_max(int i)	{ 
        int x = 2*i;
        int y = 2*i+1;
        int m = i;
        if (x <= logical_size && values[x] > values[i])
            m = x;
        if (y <= logical_size && values[y] > values[m])        
            m = y;
        
        if (m != i)
        {
            Swap(i, m);
            Swap_max( m);
        }
    }    

    public void Swap(int i, int j)	{
        int t = values[i];
        values[i] = values[j];
        values[j] = t;
    }
    
    public int[] Sort()	{
        for (int i = logical_size; i > 0; --i)	{
            Swap(0, i);
            --logical_size;
            Swap_max(0);
        }
        
        return values;
    }
}
