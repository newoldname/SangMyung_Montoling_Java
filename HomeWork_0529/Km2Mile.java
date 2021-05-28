public class Km2Mile extends Converter{

    public Km2Mile(double c){
        super.ratio = c;
    }
    @Override
    protected double convert(double src){
        return src /super.ratio;
    }

    @Override
    protected String getSrcString(){
        return "Km";
    }

    @Override
    protected String getDestString(){
        return "mile";
    }
}
