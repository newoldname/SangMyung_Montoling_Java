public class ColorPoint extends Point{
    String color;
    public ColorPoint(int x, int y, String col){
        super(x,y);
        this.color = col;
    }

    public ColorPoint(){
        super(0,0);
        this.color = "BLACK";
    }

    public ColorPoint(int x, int y){
        super(x,y);
        this.color = "BLACK";
    }

    public void setXY(int x, int y){
        super.move(x,y);
    }

    public void setColor(String col){
        this.color = col;
    }

    @Override
    public String toString(){
        return this.color + "색의 (" + super.getX()+"," + super.getY() + ")의 점";
    }



}
