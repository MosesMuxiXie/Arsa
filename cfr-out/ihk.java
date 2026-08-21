/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class ihk {
    private final Function<amo, ihj> a = $$0::a;
    private final Function<amo, ihf.a> b = $$0::b;

    public ihk(iob $$0) {
    }

    public void a(ihm $$0, dlt $$1, dlr $$2, chl $$3) {
        this.a($$0, $$1, $$2, $$3.ao(), $$3, $$3.aA() + $$2.ordinal());
    }

    public void a(ihm $$0, dlt $$1, dlr $$2, cgk $$3) {
        this.a($$0, $$1, $$2, $$3.ao(), null, $$3.aA());
    }

    public void a(ihm $$0, dlt $$1, dlr $$2, @Nullable dwo $$3, @Nullable chh $$4, int $$5) {
        $$0.b();
        if (!$$1.f()) {
            $$0.a = $$2;
            this.b($$0, $$1, $$2, $$3, $$4, $$5);
        }
    }

    public void b(ihm $$0, dlt $$1, dlr $$2, @Nullable dwo $$3, @Nullable chh $$4, int $$5) {
        hif $$7;
        amo $$6 = $$1.a(ki.l);
        if ($$6 == null) {
            return;
        }
        $$0.a(this.b.apply($$6).b());
        this.a.apply($$6).a($$0, $$1, this, $$2, $$3 instanceof hif ? ($$7 = (hif)$$3) : null, $$4, $$5);
    }

    public boolean a(dlt $$0) {
        amo $$1 = $$0.a(ki.l);
        if ($$1 == null) {
            return true;
        }
        return this.b.apply($$1).a();
    }

    public float b(dlt $$0) {
        amo $$1 = $$0.a(ki.l);
        if ($$1 == null) {
            return 1.0f;
        }
        return this.b.apply($$1).c();
    }
}

