/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.File;
import java.util.function.LongSupplier;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class bzp {
    private static final Logger a = LogUtils.getLogger();
    private final LongSupplier b;
    private final long c;
    private int d;
    private final File e;
    private bzj f = bzi.a;

    public bzp(LongSupplier $$0, String $$1, long $$2) {
        this.b = $$0;
        this.e = new File("debug", $$1);
        this.c = $$2;
    }

    public bzm a() {
        this.f = new bze(this.b, () -> this.d, () -> true);
        ++this.d;
        return this.f;
    }

    public void b() {
        if (this.f == bzi.a) {
            return;
        }
        bzk $$0 = this.f.d();
        this.f = bzi.a;
        if ($$0.g() >= this.c) {
            File $$1 = new File(this.e, "tick-results-" + bhs.f() + ".txt");
            $$0.a($$1.toPath());
            a.info("Recorded long tick -- wrote info to: {}", (Object)$$1.getAbsolutePath());
        }
    }

    public static @Nullable bzp a(String $$0) {
        if (w.V) {
            return new bzp(bhs.c, $$0, w.aS);
        }
        return null;
    }

    public static bzm a(bzm $$0, @Nullable bzp $$1) {
        if ($$1 != null) {
            return bzm.a($$1.a(), $$0);
        }
        return $$0;
    }
}

