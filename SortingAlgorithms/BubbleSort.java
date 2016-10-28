/**
 * LOGIC : At the end of the each pass, we fix the position of the largest element.
 */ 
public class BubbleSort{
    int temp;
    public static void main(String args[]){
        int a[] = {5,2,7,4,1,0,8,6,9};
        BubbleSort  bubbleobj = new BubbleSort();
        bubbleobj.sortarray(a);
        System.out.println("\n=============Sorted array=============");
        bubbleobj.printarray(a);
    }
    
    public void sortarray(int[] a){
        int n= a.length ;
        
        //outer loop for passes
        for(int pass=1; pass<=n; pass++){
            //inner loop to compare elements
            for(int current =0; current<n-pass; current++){
                if(a[current] > a[current+1]){
                    //swap the two numbers
                    swap(current,current+1,a);
                }
            }
            System.out.println("\n Printing pass# "+pass);
                 printarray(a);
        }
    }
    
    public void swap(int m,int n,int a[]){
        temp = a[m];
        a[m] = a[n];
        a[n] = temp;
    }
    
    public void printarray(int a[]){
        for (int data:a) System.out.print(data+" ");
         System.out.println();
    }
}