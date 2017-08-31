package Adapter;

public class IndykAdapter implements IKaczka  {
    private IIndyk _indyk;
    public IndykAdapter(IIndyk indyk){
        _indyk = indyk;
    }
    @Override
    public void kwacz() {
        _indyk.gulgocze();
    }

    @Override
    public void lataj() {
        _indyk.lataj();
    }
}
