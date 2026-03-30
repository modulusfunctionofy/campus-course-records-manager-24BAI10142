package edu.ccrm.util;

import java.nio.file.*;import java.io.*;

/** Recursive Utils (Author: Aryan Mauryakant) */
public class RecursiveUtils {
    public static long folderSize(Path root)throws IOException{
        final long[] size={0};
        Files.walk(root).filter(Files::isRegularFile).forEach(p->{try{size[0]+=Files.size(p);}catch(IOException e){} });
        return size[0];
    }
}
