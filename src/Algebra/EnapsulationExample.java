package Algebra;

public class EnapsulationExample {
    private int height;
    private  int width;
    public EnapsulationExample(){
        height=10;
        width=10;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return  width;
    }
    public EnapsulationExample(int Height,int Width){
        this.height=Height;
        this.width=Width;
    }
    public double Area(){
        return height*width;
    }
    public double Premeter(){
        return  2*(height+width);
    }
}
