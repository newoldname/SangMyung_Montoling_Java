public class IPTV extends ColorTV{
    String IP;
    public IPTV(String newIP, int inch, int color){
        super(inch, color);
        this.IP = newIP;
    }

    @Override
    public void printProperty(){
        System.out.println("나의 IPTV는 "+ IP + "주소의 " + super.getSize() + " 인치 " + colorNum + " 컬러");
    }

}
