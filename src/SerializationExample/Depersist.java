package SerializationExample;
import java.io.*;
public class Depersist {
    public static void main(String[] args){
        try{
            ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("F:/student.txt"));
            Student student=(Student) objectInputStream.readObject();
            System.out.println(student.id);
            System.out.println(student.name);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
