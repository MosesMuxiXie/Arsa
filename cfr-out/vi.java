/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 */
import com.google.common.annotations.VisibleForTesting;

public class vi {
    public static final int a = 0x200000;
    public static final int b = 0x6400000;
    private static final int c = 512;
    private final long d;
    private long e;
    private final int f;
    private int g;

    public vi(long $$0, int $$1) {
        this.d = $$0;
        this.f = $$1;
    }

    public static vi a(long $$0) {
        return new vi($$0, 512);
    }

    public static vi a() {
        return new vi(0x200000L, 512);
    }

    public static vi b() {
        return new vi(0x6400000L, 512);
    }

    public static vi c() {
        return new vi(Long.MAX_VALUE, 512);
    }

    public void a(long $$0, long $$1) {
        this.b($$0 * $$1);
    }

    public void b(long $$0) {
        if ($$0 < 0L) {
            throw new IllegalArgumentException("Tried to account NBT tag with negative size: " + $$0);
        }
        if (this.e + $$0 > this.d) {
            throw new vj("Tried to read NBT tag that was too big; tried to allocate: " + this.e + " + " + $$0 + " bytes where max allowed: " + this.d);
        }
        this.e += $$0;
    }

    public void d() {
        if (this.g >= this.f) {
            throw new vj("Tried to read NBT tag with too high complexity, depth > " + this.f);
        }
        ++this.g;
    }

    public void e() {
        if (this.g <= 0) {
            throw new vj("NBT-Accounter tried to pop stack-depth at top-level");
        }
        --this.g;
    }

    @VisibleForTesting
    public long f() {
        return this.e;
    }

    @VisibleForTesting
    public int g() {
        return this.g;
    }
}

