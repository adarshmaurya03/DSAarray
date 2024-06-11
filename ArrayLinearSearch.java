package DSAarray;
public class ArrayLinearSearch {
   public static int search(int search[],int key){
    for(int i=0;i<search.length;i++){
        if(search[i]==key){
            return i;
        }
    }
    return -1;
   } 
   public static void main(String[] args) {
    int search[]={10,20,30,40,50,60,70,80,90,100};
    int key=430;
    int index=search(search,key);
    if(index==-1){
        System.out.println("NOT FOUND");
    }
    else{
        System.out.println("element found at index : "+(index+1));
    }
   }
}
