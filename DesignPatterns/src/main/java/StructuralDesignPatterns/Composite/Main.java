package StructuralDesignPatterns.Composite;

public class Main {
    public static void main(String[]args) {
        Directory d1 = new Directory("Parent Directory");
        File f1 = new File("file 1 in D1");
        File f2 = new File("file 2 in D1");
        d1.fileSystemList.add( f1 );
        d1.fileSystemList.add( f2 );

        Directory d2 = new Directory("Child Directory");
        File f3 = new File( "file 3 in D2 ");
        d2.fileSystemList.add( f3 );

        d1.fileSystemList.add( d2 );

        d1.printName();
    }
}
