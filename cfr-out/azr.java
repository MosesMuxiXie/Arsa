/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import org.jspecify.annotations.Nullable;

abstract class azr
implements BasicFileAttributes {
    private static final FileTime a = FileTime.fromMillis(0L);

    azr() {
    }

    @Override
    public FileTime lastModifiedTime() {
        return a;
    }

    @Override
    public FileTime lastAccessTime() {
        return a;
    }

    @Override
    public FileTime creationTime() {
        return a;
    }

    @Override
    public boolean isSymbolicLink() {
        return false;
    }

    @Override
    public boolean isOther() {
        return false;
    }

    @Override
    public long size() {
        return 0L;
    }

    @Override
    public @Nullable Object fileKey() {
        return null;
    }
}

