package AbstractDemo;

public class CubeClass extends ShapeAbstractClass{
    int height;
    int width;
    int depth;
    public CubeClass(){
        height=0;
        width=0;
        depth=0;
    }
    public CubeClass(int Height,int Width,int Depth){
        this.height=Height;
        this.width=Width;
        this.depth=Depth;
    }
    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getPremeter() {
        return 0;
    }
}
