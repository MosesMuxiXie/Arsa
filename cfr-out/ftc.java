/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class ftc {
    private final PathMatcher a;

    public ftc(PathMatcher $$0) {
        this.a = $$0;
    }

    public void a(Path $$0, List<ftd> $$1) throws IOException {
        Path $$2 = Files.readSymbolicLink($$0);
        if (!this.a.matches($$2)) {
            $$1.add(new ftd($$0, $$2));
        }
    }

    public List<ftd> a(Path $$0) throws IOException {
        ArrayList<ftd> $$1 = new ArrayList<ftd>();
        this.a($$0, $$1);
        return $$1;
    }

    /*
     * WARNING - void declaration
     */
    public List<ftd> a(Path $$0, boolean $$1) throws IOException {
        void $$5;
        ArrayList<ftd> $$2 = new ArrayList<ftd>();
        try {
            BasicFileAttributes $$3 = Files.readAttributes($$0, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
        }
        catch (NoSuchFileException $$4) {
            return $$2;
        }
        if ($$5.isRegularFile()) {
            throw new IOException("Path " + String.valueOf($$0) + " is not a directory");
        }
        if ($$5.isSymbolicLink()) {
            if ($$1) {
                $$0 = Files.readSymbolicLink($$0);
            } else {
                this.a($$0, $$2);
                return $$2;
            }
        }
        this.b($$0, $$2);
        return $$2;
    }

    public void b(Path $$0, final List<ftd> $$1) throws IOException {
        Files.walkFileTree($$0, (FileVisitor<? super Path>)new SimpleFileVisitor<Path>(){

            private void c(Path $$0, BasicFileAttributes $$12) throws IOException {
                if ($$12.isSymbolicLink()) {
                    ftc.this.a($$0, $$1);
                }
            }

            public FileVisitResult a(Path $$0, BasicFileAttributes $$12) throws IOException {
                this.c($$0, $$12);
                return super.preVisitDirectory($$0, $$12);
            }

            public FileVisitResult b(Path $$0, BasicFileAttributes $$12) throws IOException {
                this.c($$0, $$12);
                return super.visitFile($$0, $$12);
            }

            @Override
            public /* synthetic */ FileVisitResult visitFile(Object object, BasicFileAttributes basicFileAttributes) throws IOException {
                return this.b((Path)object, basicFileAttributes);
            }

            @Override
            public /* synthetic */ FileVisitResult preVisitDirectory(Object object, BasicFileAttributes basicFileAttributes) throws IOException {
                return this.a((Path)object, basicFileAttributes);
            }
        });
    }
}

