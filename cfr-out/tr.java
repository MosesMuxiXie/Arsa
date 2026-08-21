/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class tr
implements tf.c {
    private static final int c = 5;
    private static final int d = 6;
    private final int e;
    private int f;
    private fth g;
    private final is.a h;
    private final is i;
    private final boolean j;
    private float k = -1.0f;
    private final Collection<ta> l = new ArrayList<ta>();

    public tr(is $$0, int $$1, boolean $$2) {
        this.e = $$1;
        this.h = $$0.k();
        this.g = new fth(this.h);
        this.i = $$0;
        this.j = $$2;
    }

    @Override
    public void a(axf $$0) {
        if (this.j) {
            this.l.forEach($$1 -> {
                ffg $$2 = $$1.f().d();
                ts.a($$2, $$0);
            });
            this.l.clear();
            this.g = new fth(this.i);
            this.h.g(this.i);
        }
    }

    @Override
    public Optional<ta> spawnStructure(ta $$0) {
        is $$1 = new is(this.h);
        $$0.a($$1);
        ta $$2 = $$0.o();
        if ($$2 == null) {
            return Optional.empty();
        }
        $$2.a(1);
        fth $$3 = $$0.f().f();
        this.g = this.g.b($$3);
        this.h.e((int)$$3.b() + 5, 0, 0);
        if ((float)this.h.u() > this.k) {
            this.k = this.h.u();
        }
        if (++this.f >= this.e) {
            this.f = 0;
            this.h.e(0, 0, (int)this.g.d() + 6);
            this.h.p(this.i.u());
            this.g = new fth(this.h);
        }
        this.l.add($$0);
        return Optional.of($$0);
    }
}

