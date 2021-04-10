package Algebra;

public class Rectangle {
    int height;
    int width;
    public Rectangle(){
        height=10;
        width=20;
    }
    public Rectangle(int Height,int Width){
        this.height=Height;
        this.width=Width;
    }
    public double Area(){
        return height*width;
    }
}
