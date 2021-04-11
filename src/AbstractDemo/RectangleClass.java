package AbstractDemo;

public class RectangleClass extends ShapeAbstractClass{
    int height;
    int width;
    public RectangleClass(){
        height=0;
        width=0;
    }
    public RectangleClass(int Height,int Width){
        this.height=Height;
        this.width=Width;
    }
    @Override
    double getArea() {
        return height*width;
    }

    @Override
    double getPremeter() {
        return 2*(height+width);
    }
}
