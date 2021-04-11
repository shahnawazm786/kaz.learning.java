package AbstractDemo;

/**
 * Abstract class example
 */
public class AbstractClassDemo extends MyAbstractClass{
    @Override
    void Show() {
        System.out.print("Hello Abstract Class Extended");
    }
    public static  void main(String[] args){
        MyAbstractClass abstractClass=new AbstractClassDemo();
        abstractClass.Show();
    }
}
