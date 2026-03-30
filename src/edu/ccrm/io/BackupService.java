package edu.ccrm.io;

import java.nio.file.*;import java.io.*;import java.time.*;import java.time.format.*;

/** BackupService (Author: Aryan Mauryakant) */
public class BackupService {
    public static Path createBackupFolder(Path base)throws IOException{
        String stamp=LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        Path dest=base.resolve("backup_"+stamp);
        Files.createDirectories(dest);
        return dest;
    }
}
