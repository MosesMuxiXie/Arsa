/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class ckg<E extends chn>
extends ckh<E> {
    private final bef<dzq> m;
    private final float n;
    private final List<ckh.a> o = new ArrayList<ckh.a>();
    private boolean p;

    public ckg(ccn $$0, int $$1, int $$2, float $$3, Function<E, bcz> $$4, bef<dzq> $$5, float $$6, BiPredicate<E, is> $$7) {
        super($$0, $$1, $$2, $$3, $$4, $$7);
        this.m = $$5;
        this.n = $$6;
    }

    @Override
    protected void a(axf $$0, E $$1, long $$2) {
        super.a($$0, $$1, $$2);
        this.o.clear();
        this.p = ((cgk)$$1).ep().i() < this.n;
    }

    @Override
    protected Optional<ckh.a> a(axf $$0) {
        if (!this.p) {
            return super.a($$0);
        }
        is.a $$1 = new is.a();
        while (!this.h.isEmpty()) {
            Optional<ckh.a> $$2 = super.a($$0);
            if (!$$2.isPresent()) continue;
            ckh.a $$3 = $$2.get();
            if ($$0.a_($$1.a((jy)$$3.a(), iz.a)).a(this.m)) {
                return $$2;
            }
            this.o.add($$3);
        }
        if (!this.o.isEmpty()) {
            return Optional.of(this.o.remove(0));
        }
        return Optional.empty();
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.a(axf2, (E)((chn)chl2), l2);
    }
}

