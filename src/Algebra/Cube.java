package Algebra;

public class Cube extends Rectangle{
int depth;
public Cube(int Height,int Width, int Depth){
    this.height=Height;
    this.width=Width;
    this.depth=Depth;
}
public double Volume(){
    return  height*width*depth;
}
}
