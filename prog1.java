import java.util.Scanner;
class ArraytoMethod{
public int max(int[] array){
int max=array[0];
for(int i=0;i<array.length;i++){
if(array[i]>max){ max=array[i]; }
}
return max;
}
public int min(int[] array){
int min=array[0];
for(int i=0;i<array.length;i++){
if(array[i]<min){   min=array[i];   }
}
return min;
}
public static void main(String args[]){
Scanner  sc=new Scanner(System.in);
System.out.println("Enter the size of the array that is to be stored::");
int size=sc.nextInt();
int[] myArray=new int[size];
System.out.println("Enter the elements of the array::");
for(int i=0;i<size;i++){myArray[i]=sc.nextInt();}
ArraytoMethod m=new ArraytoMethod();
System.out.println("Maximum value in the array is::"+m.max(myArray));
System.out.println("Minimum value in the array is:"+m.min(myArray));
}
}
                                                                                                                                                                             