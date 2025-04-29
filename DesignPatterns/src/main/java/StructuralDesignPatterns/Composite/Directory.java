package StructuralDesignPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    List<FileSystem> fileSystemList = new ArrayList<>();
    private String _directoryName;

    public Directory(String s ) {
        _directoryName = s;
    }

    @Override
    public void printName() {
        for( FileSystem ele : fileSystemList ) {
            ele.printName();
        }
        System.out.println("All the items in the directory " + _directoryName + " is printed");
    }
}
