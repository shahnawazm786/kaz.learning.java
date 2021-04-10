package SerializationExample;
import java.io.*;
public class Persist {
public static void main(String[] args){
    try{
        Student s=new Student(110,"Mohammad Shahnawaz");
        FileOutputStream fileOutputStream=new FileOutputStream("F:/student.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(s);
        objectOutputStream.flush();
        objectOutputStream.close();
        System.out.println("Successfully serialized");
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
