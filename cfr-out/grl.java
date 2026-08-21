/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.Hashing
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.hash.Hashing;
import org.jspecify.annotations.Nullable;

public class grl
implements AutoCloseable {
    private static final amo a = amo.b("textures/misc/unknown_server.png");
    private static final int b = 64;
    private static final int c = 64;
    private final ilr d;
    private final amo e;
    private @Nullable ilc f;
    private boolean g;

    private grl(ilr $$0, amo $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public static grl a(ilr $$0, String $$1) {
        return new grl($$0, amo.b("worlds/" + bhs.a($$1, amo::b) + "/" + String.valueOf(Hashing.sha1().hashUnencodedChars((CharSequence)$$1)) + "/icon"));
    }

    public static grl b(ilr $$0, String $$1) {
        return new grl($$0, amo.b("servers/" + String.valueOf(Hashing.sha1().hashUnencodedChars((CharSequence)$$1)) + "/icon"));
    }

    public void a(fyh $$0) {
        if ($$0.a() != 64 || $$0.b() != 64) {
            $$0.close();
            throw new IllegalArgumentException("Icon must be 64x64, but was " + $$0.a() + "x" + $$0.b());
        }
        try {
            this.d();
            if (this.f == null) {
                this.f = new ilc(() -> "Favicon " + String.valueOf(this.e), $$0);
            } else {
                this.f.a($$0);
                this.f.d();
            }
            this.d.a(this.e, this.f);
        }
        catch (Throwable $$1) {
            $$0.close();
            this.a();
            throw $$1;
        }
    }

    public void a() {
        this.d();
        if (this.f != null) {
            this.d.c(this.e);
            this.f.close();
            this.f = null;
        }
    }

    public amo b() {
        return this.f != null ? this.e : a;
    }

    @Override
    public void close() {
        this.a();
        this.g = true;
    }

    public boolean c() {
        return this.g;
    }

    private void d() {
        if (this.g) {
            throw new IllegalStateException("Icon already closed");
        }
    }
}

