package StructuralDesignPatterns.Adapter;

public class ConvertWeightToPounds implements WeightConvert{

    public double getWeight( double _grams ) {
        return _grams * 0.00220462;
    }
}
