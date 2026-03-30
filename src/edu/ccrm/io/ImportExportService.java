package edu.ccrm.io;

import java.nio.file.*;import java.io.*;import java.util.stream.*;import java.util.*;

/** ImportExportService using NIO.2 (Author: Aryan Mauryakant) */
public class ImportExportService {
    public static List<String> readAllLines(Path p)throws IOException{
        try(Stream<String>s=Files.lines(p)){ return s.collect(Collectors.toList()); }
    }
    public static void exportLines(Path p,List<String>lines)throws IOException{
        Files.createDirectories(p.getParent());
        Files.write(p,lines,StandardOpenOption.CREATE,StandardOpenOption.TRUNCATE_EXISTING);
    }
}
