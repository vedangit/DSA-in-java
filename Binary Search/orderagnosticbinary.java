public class orderagnosticbinary {
    public static void main(String[] args) {
        int[] ascarr = {2, 4, 7, 9, 12, 23, 45, 56, 67, 78};
        int[] descarr = {78, 67, 45, 23, 12, 9, 7, 4, 2};
        
        System.out.println("ascending order array");
        for(int i = 0; i< ascarr.length; i++){
        System.out.print(ascarr[i] + "\t");}

        System.out.println("descending order array");
        for(int j = 0; j< descarr.length; j++){
        System.out.print(descarr[j] + "\t");}

       

        int target = 45;

        int ans = agnosticbinary(ascarr, target);
        int ans1 = agnosticbinary(descarr, target);
        System.out.println("asc array " + ans);
        System.out.println("desc array " + ans1);



    }

    static int agnosticbinary(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        // finding whether the array is sorted in ascending or descding order
        // boolean isacs;
        // if(arr[start]<arr[end]){
        //     isacs = true;

        // }
        // else{
        //     isacs = false;
        // }

        boolean isacs = arr[start]<arr[end];
        int mid;
        while(start<=end){
            mid = start + ((end - start)/2);
            if(arr[mid]==target){
                return mid;
            }
        

        if(isacs){         
    
             if(target< arr[mid]){
                end = mid-1;
             }
             else if(target>arr[mid]){
                start = mid + 1;
            }
        }
        else{
            if(target> arr[mid]){
                end = mid-1;
             }
             else if(target<arr[mid]){
                start = mid + 1;
            }
        }
    }
        return -1;
    }
}