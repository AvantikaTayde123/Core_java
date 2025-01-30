class Main {
    public static void missingElement(int[] arr, int range){
        boolean present[]=new boolean [range+1];
        for(int num:arr){
            if(num<=range){
                present[num]=true;
            }
        }
        
        System.out.println("Missing elements");
        for(int i=1;i<=range;i++){
            if(!present[i]){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={2,3,5,6,7,9};
        int range=10;
        missingElement(arr,range);
    }
}
