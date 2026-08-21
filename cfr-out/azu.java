/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.io.IOException;
import java.net.URI;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessDeniedException;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.NotDirectoryException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.ProviderMismatchException;
import java.nio.file.ReadOnlyFileSystemException;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jspecify.annotations.Nullable;

class azu
extends FileSystemProvider {
    public static final String a = "x-mc-link";

    azu() {
    }

    @Override
    public String getScheme() {
        return a;
    }

    @Override
    public FileSystem newFileSystem(URI $$0, Map<String, ?> $$1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public FileSystem getFileSystem(URI $$0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Path getPath(URI $$0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SeekableByteChannel newByteChannel(Path $$0, Set<? extends OpenOption> $$1, FileAttribute<?> ... $$2) throws IOException {
        if ($$1.contains(StandardOpenOption.CREATE_NEW) || $$1.contains(StandardOpenOption.CREATE) || $$1.contains(StandardOpenOption.APPEND) || $$1.contains(StandardOpenOption.WRITE)) {
            throw new UnsupportedOperationException();
        }
        Path $$3 = azu.a($$0).f().h();
        if ($$3 == null) {
            throw new NoSuchFileException($$0.toString());
        }
        return Files.newByteChannel($$3, $$1, $$2);
    }

    @Override
    public DirectoryStream<Path> newDirectoryStream(Path $$0, final DirectoryStream.Filter<? super Path> $$1) throws IOException {
        final azw.a $$2 = azu.a($$0).f().i();
        if ($$2 == null) {
            throw new NotDirectoryException($$0.toString());
        }
        return new DirectoryStream<Path>(this){

            @Override
            public Iterator<Path> iterator() {
                return $$2.a().values().stream().filter($$1 -> {
                    try {
                        return $$1.accept($$1);
                    }
                    catch (IOException $$22) {
                        throw new DirectoryIteratorException($$22);
                    }
                }).map($$0 -> $$0).iterator();
            }

            @Override
            public void close() {
            }
        };
    }

    @Override
    public void createDirectory(Path $$0, FileAttribute<?> ... $$1) {
        throw new ReadOnlyFileSystemException();
    }

    @Override
    public void delete(Path $$0) {
        throw new ReadOnlyFileSystemException();
    }

    @Override
    public void copy(Path $$0, Path $$1, CopyOption ... $$2) {
        throw new ReadOnlyFileSystemException();
    }

    @Override
    public void move(Path $$0, Path $$1, CopyOption ... $$2) {
        throw new ReadOnlyFileSystemException();
    }

    @Override
    public boolean isSameFile(Path $$0, Path $$1) {
        return $$0 instanceof azt && $$1 instanceof azt && $$0.equals($$1);
    }

    @Override
    public boolean isHidden(Path $$0) {
        return false;
    }

    @Override
    public FileStore getFileStore(Path $$0) {
        return azu.a($$0).a().a();
    }

    @Override
    public void checkAccess(Path $$0, AccessMode ... $$1) throws IOException {
        if ($$1.length == 0 && !azu.a($$0).g()) {
            throw new NoSuchFileException($$0.toString());
        }
        block4: for (AccessMode $$2 : $$1) {
            switch ($$2) {
                case READ: {
                    if (azu.a($$0).g()) continue block4;
                    throw new NoSuchFileException($$0.toString());
                }
                case EXECUTE: 
                case WRITE: {
                    throw new AccessDeniedException($$2.toString());
                }
            }
        }
    }

    @Override
    public <V extends FileAttributeView> @Nullable V getFileAttributeView(Path $$0, Class<V> $$1, LinkOption ... $$2) {
        azt $$3 = azu.a($$0);
        if ($$1 == BasicFileAttributeView.class) {
            return (V)$$3.j();
        }
        return null;
    }

    @Override
    public <A extends BasicFileAttributes> A readAttributes(Path $$0, Class<A> $$1, LinkOption ... $$2) throws IOException {
        azt $$3 = azu.a($$0).f();
        if ($$1 == BasicFileAttributes.class) {
            return (A)$$3.k();
        }
        throw new UnsupportedOperationException("Attributes of type " + $$1.getName() + " not supported");
    }

    @Override
    public Map<String, Object> readAttributes(Path $$0, String $$1, LinkOption ... $$2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setAttribute(Path $$0, String $$1, Object $$2, LinkOption ... $$3) {
        throw new ReadOnlyFileSystemException();
    }

    private static azt a(@Nullable Path $$0) {
        if ($$0 == null) {
            throw new NullPointerException();
        }
        if ($$0 instanceof azt) {
            azt $$1 = (azt)$$0;
            return $$1;
        }
        throw new ProviderMismatchException();
    }
}

