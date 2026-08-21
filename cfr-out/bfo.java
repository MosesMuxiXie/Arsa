/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import org.slf4j.Logger;

public class bfo {
    private static final Logger a = LogUtils.getLogger();

    public static Path a(URI $$0) throws IOException {
        try {
            return Paths.get($$0);
        }
        catch (FileSystemNotFoundException fileSystemNotFoundException) {
        }
        catch (Throwable $$1) {
            a.warn("Unable to get path for: {}", (Object)$$0, (Object)$$1);
        }
        try {
            FileSystems.newFileSystem($$0, Collections.emptyMap());
        }
        catch (FileSystemAlreadyExistsException fileSystemAlreadyExistsException) {
            // empty catch block
        }
        return Paths.get($$0);
    }
}

