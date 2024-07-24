package classesandobjects;

public class Recatangle {
    public int length;
    public int width;
    public Recatangle(int length, int width){
        this.length=length;
        this.width=width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int calculatearea(){
        return (length*width);
    }
    public int calculateperimeter(){
        return 2*(length+width);
    }

}
