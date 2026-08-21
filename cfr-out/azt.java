/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.ProviderMismatchException;
import java.nio.file.ReadOnlyFileSystemException;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

class azt
implements Path {
    private static final BasicFileAttributes a = new azr(){

        @Override
        public boolean isRegularFile() {
            return false;
        }

        @Override
        public boolean isDirectory() {
            return true;
        }
    };
    private static final BasicFileAttributes b = new azr(){

        @Override
        public boolean isRegularFile() {
            return true;
        }

        @Override
        public boolean isDirectory() {
            return false;
        }
    };
    private static final Comparator<azt> c = Comparator.comparing(azt::n);
    private final String d;
    private final azv e;
    private final @Nullable azt f;
    private @Nullable List<String> g;
    private @Nullable String h;
    private final azw i;

    public azt(azv $$0, String $$1, @Nullable azt $$2, azw $$3) {
        this.e = $$0;
        this.d = $$1;
        this.f = $$2;
        this.i = $$3;
    }

    private azt a(@Nullable azt $$0, String $$1) {
        return new azt(this.e, $$1, $$0, azw.b);
    }

    public azv a() {
        return this.e;
    }

    @Override
    public boolean isAbsolute() {
        return this.i != azw.b;
    }

    @Override
    public File toFile() {
        azw azw2 = this.i;
        if (azw2 instanceof azw.b) {
            azw.b $$0 = (azw.b)azw2;
            return $$0.a().toFile();
        }
        throw new UnsupportedOperationException("Path " + this.n() + " does not represent file");
    }

    public @Nullable azt b() {
        if (this.isAbsolute()) {
            return this.e.b();
        }
        return null;
    }

    public azt c() {
        return this.a(null, this.d);
    }

    public @Nullable azt d() {
        return this.f;
    }

    @Override
    public int getNameCount() {
        return this.l().size();
    }

    private List<String> l() {
        if (this.d.isEmpty()) {
            return List.of();
        }
        if (this.g == null) {
            ImmutableList.Builder $$0 = ImmutableList.builder();
            if (this.f != null) {
                $$0.addAll(this.f.l());
            }
            $$0.add((Object)this.d);
            this.g = $$0.build();
        }
        return this.g;
    }

    public azt a(int $$0) {
        List<String> $$1 = this.l();
        if ($$0 < 0 || $$0 >= $$1.size()) {
            throw new IllegalArgumentException("Invalid index: " + $$0);
        }
        return this.a(null, $$1.get($$0));
    }

    public azt a(int $$0, int $$1) {
        List<String> $$2 = this.l();
        if ($$0 < 0 || $$1 > $$2.size() || $$0 >= $$1) {
            throw new IllegalArgumentException();
        }
        azt $$3 = null;
        for (int $$4 = $$0; $$4 < $$1; ++$$4) {
            $$3 = this.a($$3, $$2.get($$4));
        }
        return $$3;
    }

    @Override
    public boolean startsWith(Path $$0) {
        if ($$0.isAbsolute() != this.isAbsolute()) {
            return false;
        }
        if ($$0 instanceof azt) {
            azt $$1 = (azt)$$0;
            if ($$1.e != this.e) {
                return false;
            }
            List<String> $$2 = this.l();
            List<String> $$3 = $$1.l();
            int $$4 = $$3.size();
            if ($$4 > $$2.size()) {
                return false;
            }
            for (int $$5 = 0; $$5 < $$4; ++$$5) {
                if ($$3.get($$5).equals($$2.get($$5))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean endsWith(Path $$0) {
        if ($$0.isAbsolute() && !this.isAbsolute()) {
            return false;
        }
        if ($$0 instanceof azt) {
            azt $$1 = (azt)$$0;
            if ($$1.e != this.e) {
                return false;
            }
            List<String> $$2 = this.l();
            List<String> $$3 = $$1.l();
            int $$4 = $$3.size();
            int $$5 = $$2.size() - $$4;
            if ($$5 < 0) {
                return false;
            }
            for (int $$6 = $$4 - 1; $$6 >= 0; --$$6) {
                if ($$3.get($$6).equals($$2.get($$5 + $$6))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public azt e() {
        return this;
    }

    public azt a(Path $$0) {
        azt $$1 = this.c($$0);
        if ($$0.isAbsolute()) {
            return $$1;
        }
        return this.a($$1.l());
    }

    private azt a(List<String> $$0) {
        azt $$1 = this;
        for (String $$2 : $$0) {
            $$1 = $$1.a($$2);
        }
        return $$1;
    }

    azt a(String $$0) {
        if (azt.a(this.i)) {
            return new azt(this.e, $$0, this, this.i);
        }
        azw azw2 = this.i;
        if (azw2 instanceof azw.a) {
            azw.a $$1 = (azw.a)azw2;
            azt $$2 = $$1.a().get($$0);
            return $$2 != null ? $$2 : new azt(this.e, $$0, this, azw.a);
        }
        if (this.i instanceof azw.b) {
            return new azt(this.e, $$0, this, azw.a);
        }
        throw new AssertionError((Object)"All content types should be already handled");
    }

    private static boolean a(azw $$0) {
        return $$0 == azw.a || $$0 == azw.b;
    }

    public azt b(Path $$0) {
        azt $$1 = this.c($$0);
        if (this.isAbsolute() != $$1.isAbsolute()) {
            throw new IllegalArgumentException("absolute mismatch");
        }
        List<String> $$2 = this.l();
        List<String> $$3 = $$1.l();
        if ($$2.size() >= $$3.size()) {
            throw new IllegalArgumentException();
        }
        for (int $$4 = 0; $$4 < $$2.size(); ++$$4) {
            if ($$2.get($$4).equals($$3.get($$4))) continue;
            throw new IllegalArgumentException();
        }
        return $$1.a($$2.size(), $$3.size());
    }

    @Override
    public URI toUri() {
        try {
            return new URI("x-mc-link", this.e.a().name(), this.n(), null);
        }
        catch (URISyntaxException $$0) {
            throw new AssertionError("Failed to create URI", $$0);
        }
    }

    public azt f() {
        if (this.isAbsolute()) {
            return this;
        }
        return this.e.b().a(this);
    }

    public azt a(LinkOption ... $$0) {
        return this.f();
    }

    @Override
    public WatchKey register(WatchService $$0, WatchEvent.Kind<?>[] $$1, WatchEvent.Modifier ... $$2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(Path $$0) {
        azt $$1 = this.c($$0);
        return c.compare(this, $$1);
    }

    @Override
    public boolean equals(Object $$0) {
        if ($$0 == this) {
            return true;
        }
        if ($$0 instanceof azt) {
            azt $$1 = (azt)$$0;
            if (this.e != $$1.e) {
                return false;
            }
            boolean $$2 = this.m();
            if ($$2 != $$1.m()) {
                return false;
            }
            if ($$2) {
                return this.i == $$1.i;
            }
            return Objects.equals(this.f, $$1.f) && Objects.equals(this.d, $$1.d);
        }
        return false;
    }

    private boolean m() {
        return !azt.a(this.i);
    }

    @Override
    public int hashCode() {
        return this.m() ? this.i.hashCode() : this.d.hashCode();
    }

    @Override
    public String toString() {
        return this.n();
    }

    private String n() {
        if (this.h == null) {
            StringBuilder $$0 = new StringBuilder();
            if (this.isAbsolute()) {
                $$0.append("/");
            }
            Joiner.on((String)"/").appendTo($$0, this.l());
            this.h = $$0.toString();
        }
        return this.h;
    }

    private azt c(@Nullable Path $$0) {
        if ($$0 == null) {
            throw new NullPointerException();
        }
        if ($$0 instanceof azt) {
            azt $$1 = (azt)$$0;
            if ($$1.e == this.e) {
                return $$1;
            }
        }
        throw new ProviderMismatchException();
    }

    public boolean g() {
        return this.m();
    }

    public @Nullable Path h() {
        Path path;
        azw azw2 = this.i;
        if (azw2 instanceof azw.b) {
            azw.b $$0 = (azw.b)azw2;
            path = $$0.a();
        } else {
            path = null;
        }
        return path;
    }

    public @Nullable azw.a i() {
        azw.a $$0;
        azw azw2 = this.i;
        return azw2 instanceof azw.a ? ($$0 = (azw.a)azw2) : null;
    }

    public BasicFileAttributeView j() {
        return new BasicFileAttributeView(){

            @Override
            public String name() {
                return "basic";
            }

            @Override
            public BasicFileAttributes readAttributes() throws IOException {
                return azt.this.k();
            }

            @Override
            public void setTimes(FileTime $$0, FileTime $$1, FileTime $$2) {
                throw new ReadOnlyFileSystemException();
            }
        };
    }

    public BasicFileAttributes k() throws IOException {
        if (this.i instanceof azw.a) {
            return a;
        }
        if (this.i instanceof azw.b) {
            return b;
        }
        throw new NoSuchFileException(this.n());
    }

    @Override
    public /* synthetic */ Path toRealPath(LinkOption[] linkOptionArray) throws IOException {
        return this.a(linkOptionArray);
    }

    @Override
    public /* synthetic */ Path toAbsolutePath() {
        return this.f();
    }

    @Override
    public /* synthetic */ Path relativize(Path path) {
        return this.b(path);
    }

    @Override
    public /* synthetic */ Path resolve(Path path) {
        return this.a(path);
    }

    @Override
    public /* synthetic */ Path normalize() {
        return this.e();
    }

    @Override
    public /* synthetic */ Path subpath(int n2, int n3) {
        return this.a(n2, n3);
    }

    @Override
    public /* synthetic */ Path getName(int n2) {
        return this.a(n2);
    }

    @Override
    public /* synthetic */ @Nullable Path getParent() {
        return this.d();
    }

    @Override
    public /* synthetic */ Path getFileName() {
        return this.c();
    }

    @Override
    public /* synthetic */ @Nullable Path getRoot() {
        return this.b();
    }

    @Override
    public /* synthetic */ FileSystem getFileSystem() {
        return this.a();
    }
}

