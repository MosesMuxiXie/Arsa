/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.time.Duration;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

public abstract class irg {
    private static final int a = 60000;
    private static final int b = 10;
    private int c;
    private boolean d = false;
    private @Nullable Instant e;

    public void a() {
        this.d = true;
        this.e = Instant.now();
        this.c = 0;
    }

    public void a(ira $$0) {
        if (this.b()) {
            this.f();
            ++this.c;
            this.e = Instant.now();
        }
        if (this.c()) {
            this.b($$0);
            this.c = 0;
        }
    }

    public boolean b() {
        return this.d && this.e != null && Duration.between(this.e, Instant.now()).toMillis() > 60000L;
    }

    public boolean c() {
        return this.c >= 10;
    }

    public void d() {
        this.d = false;
    }

    protected int e() {
        return this.c;
    }

    public abstract void f();

    public abstract void b(ira var1);
}

