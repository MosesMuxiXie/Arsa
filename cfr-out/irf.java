/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.time.Duration;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class irf {
    private final UUID a = UUID.randomUUID();
    private final ira b;
    private final irj c;
    private final irl d = new irl();
    private final iri e;
    private final irk f;

    public irf(ira $$02, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
        this.c = new irj($$3);
        this.e = new iri();
        this.f = new irk($$1, $$2);
        this.b = $$02.decorate($$0 -> {
            this.c.a((ire.a)$$0);
            $$0.a(ird.i, this.a);
        });
    }

    public void a() {
        this.e.a(this.b);
    }

    public void a(dwl $$0, boolean $$1) {
        this.c.a($$0, $$1);
        this.d.a();
        this.b();
    }

    public void a(String $$0) {
        this.c.a($$0);
        this.b();
    }

    public void a(long $$0) {
        this.d.a($$0);
    }

    public void b() {
        if (this.c.a(this.b)) {
            this.f.a(this.b);
            this.e.a();
        }
    }

    public void c() {
        this.c.a(this.b);
        this.e.d();
        this.d.a(this.b);
    }

    public void a(dwo $$0, ac $$1) {
        amo $$22 = $$1.a();
        if ($$1.b().g() && "minecraft".equals($$22.b())) {
            long $$3 = $$0.au();
            this.b.send(irb.f, $$2 -> {
                $$2.a(ird.D, $$22.toString());
                $$2.a(ird.E, $$3);
            });
        }
    }
}

