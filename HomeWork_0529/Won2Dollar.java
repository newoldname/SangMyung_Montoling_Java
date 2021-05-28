public class Won2Dollar extends Converter{

    public Won2Dollar(double c){
        super.ratio = c;
    }
    @Override
    protected double convert(double src){
        return src /super.ratio;
    }

    @Override
    protected String getSrcString(){
        return "원";
    }

    @Override
    protected String getDestString(){
        return "달러";
    }
}
