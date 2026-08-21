/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class cqb<T extends chn>
extends cop {
    private final T a;
    private final dlt b;
    private final Predicate<? super T> c;
    private final @Nullable bcz d;

    public cqb(T $$0, dlt $$1, @Nullable bcz $$2, Predicate<? super T> $$3) {
        this.a = $$0;
        this.b = $$1;
        this.d = $$2;
        this.c = $$3;
    }

    @Override
    public boolean b() {
        return this.c.test(this.a);
    }

    @Override
    public boolean c() {
        return ((chl)this.a).fZ();
    }

    @Override
    public void d() {
        ((chl)this.a).a(cgv.a, this.b.v());
        ((chl)this.a).c(cdb.a);
    }

    @Override
    public void e() {
        ((chl)this.a).a(cgv.a, dlt.l);
        if (this.d != null) {
            ((cgk)this.a).a(this.d, 1.0f, ((cgk)this.a).ep().i() * 0.2f + 0.9f);
        }
    }
}

