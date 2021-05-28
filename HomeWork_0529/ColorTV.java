public class ColorTV extends TV{
    int colorNum;
    public ColorTV(int inch, int num){
        super(inch);
        this.colorNum = num;
    }

    public void printProperty(){
        System.out.println("" + super.getSize() + " 인치 " + colorNum + " 컬러");
    }

}
