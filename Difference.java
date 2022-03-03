public class Difference {
    private int elements[];
    public int maximum_difference;
    Difference(int a[]){
        this.elements=a;
    }
    public void computeDifference(){
        int max=elements[0],min=elements[0];
        for(int i=0;i<elements.length;i++)
        {
            if(elements[i]<min)
                min=elements[i];
            if(elements[i]>max)
                max=elements[i];
        }
        maximum_difference=max-min;

    }
}
