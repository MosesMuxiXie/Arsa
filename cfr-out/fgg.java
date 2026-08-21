/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class fgg
implements fft {
    private final List<ffs> a = Lists.newArrayList();

    @Override
    public void a(ffs $$0) {
        this.a.add($$0);
    }

    @Override
    public @Nullable ffs a(ffg $$0) {
        return ffs.a(this.a, $$0);
    }

    @Deprecated
    public void a(int $$0) {
        for (ffs $$1 : this.a) {
            $$1.a(0, $$0, 0);
        }
    }

    @Deprecated
    public int a(int $$0, int $$1, bgr $$2, int $$3) {
        int $$4 = $$0 - $$3;
        ffg $$5 = this.d();
        int $$6 = $$5.e() + $$1 + 1;
        if ($$6 < $$4) {
            $$6 += $$2.a($$4 - $$6);
        }
        int $$7 = $$6 - $$5.l();
        this.a($$7);
        return $$7;
    }

    public void a(bgr $$0, int $$1, int $$2) {
        int $$6;
        ffg $$3 = this.d();
        int $$4 = $$2 - $$1 + 1 - $$3.e();
        if ($$4 > 1) {
            int $$5 = $$1 + $$0.a($$4);
        } else {
            $$6 = $$1;
        }
        int $$7 = $$6 - $$3.i();
        this.a($$7);
    }

    public fgd a() {
        return new fgd(this.a);
    }

    public void b() {
        this.a.clear();
    }

    public boolean c() {
        return this.a.isEmpty();
    }

    public ffg d() {
        return ffs.a(this.a.stream());
    }
}

