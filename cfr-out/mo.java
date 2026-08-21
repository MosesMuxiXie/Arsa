/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashCode
 */
import com.google.common.hash.HashCode;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;

public interface mo {
    public static final mo a = ($$0, $$1, $$2) -> {
        bfp.c($$0.getParent());
        Files.write($$0, $$1, new OpenOption[0]);
    };

    public void writeIfNeeded(Path var1, byte[] var2, HashCode var3) throws IOException;
}

