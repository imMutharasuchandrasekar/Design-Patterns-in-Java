package StructuralDesignPatterns.Adapter;

public class WeightMachineAdaptorImpl implements WeightMachineAdaptor {

    private WeightConvert _instance;

    private double _grams;


    public WeightMachineAdaptorImpl( double wtInGrams, WeightConvert instance ) {
        _instance = instance;
        _grams = wtInGrams;
    }

    @Override
    public double getWeightInKg() {
        double wt = _instance.getWeight( _grams );
        if( _instance instanceof ConvertWeightToPounds ){
            return wt * 0.453592;
        }
        return 0;
    }
}
