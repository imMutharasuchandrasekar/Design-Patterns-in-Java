package StructuralDesignPatterns.Adapter;

// Client understand weight only in Kilograms.
public class Main {
    private static double _kgs;

    public static void main(String[]args) {
        WeightMachineAdaptorImpl obj = new WeightMachineAdaptorImpl( 3000, new ConvertWeightToPounds() );

        _kgs = obj.getWeightInKg();

        System.out.println( _kgs );
    }
}
