package Array;

public class ArrayExample {
    public static void main(String[] args){
        String[] names={"Mohammad","Shahnawaz","Arham","Zamman","Hannan"};
        String[] name1=new String[5];
        String name2[]=new String[5];
        name1[0]="Shahbaj";
        name1[1]="Kalam";
        name1[2]="Azad";
        name1[3]="Naeem";
        name1[4]="Kamaal";

        System.out.println(names[0]);
        for(int i=0; i<names.length;i++){
            System.out.println(names[i]);
        }
        int j=0;
        for(;j<100;++j){
            System.out.println(j);
        }
        System.out.println(j);
        int[] marks={10,15,20,-5,39,45};
        System.out.println("Highet marks is "+getHeighest(marks));
        System.out.println("Lowest marks is "+getLowest(marks));
    }
    public static double getHeighest(int[] array){
        int maxMarks=array[0];
        for(int i=0;i< array.length;i++){
            if(maxMarks<array[i]){
                maxMarks=array[i];
            }
        }
        return maxMarks;
    }
    public static double getLowest(int[] array){
        int lowMarks=array[0];
        for(int j=0;j< array.length;j++){
            if(lowMarks>array[j]){
                lowMarks=array[j];
            }
        }
        return lowMarks;
    }
}
