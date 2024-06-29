public class QUIZ {
    public static void main(String[] args) {
        int arr[]={1,2,4,4,9,8,0};

        int len = arr.length;
        int temp[]=new int [arr.length];
        int j = 0;
        for (int i=0; i < len-1; i++){
            if (arr[i]!= arr[i+1]){
                temp[j++]=arr[i];

            }
        }
        temp[j++]=arr[len-1];

        for(int k=0;k<j;k++){
            System.out.println(temp[k]);
        }
        // Name: HAMDA AHMED DIIRIYE
        //ID: c1220386

}}