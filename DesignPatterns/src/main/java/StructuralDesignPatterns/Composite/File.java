package StructuralDesignPatterns.Composite;

public class File implements FileSystem {
    private String _fileName;

    public File(String s ) {
        _fileName = s;
    }

    @Override
    public void printName()
    {
        System.out.println( "The file name is - " + _fileName );
    }
}
