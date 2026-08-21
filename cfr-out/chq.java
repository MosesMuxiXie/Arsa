/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public interface chq {
    public static final String g_ = "anger_end_time";
    public static final String h_ = "angry_at";
    public static final long i_ = -1L;

    public long a();

    default public void a(long $$0) {
        this.b(this.ao().au() + $$0);
    }

    public void b(long var1);

    public @Nullable cgr<chl> b();

    public void a(@Nullable cgr<chl> var1);

    public void c();

    public dwo ao();

    default public void b_(fns $$0) {
        $$0.a(g_, this.a());
        $$0.b(h_, cgr.a(), this.b());
    }

    default public void a(dwo $$0, fnq $$1) {
        Optional<Long> $$2 = $$1.f(g_);
        if ($$2.isPresent()) {
            this.b($$2.get());
        } else {
            Optional<Integer> $$3 = $$1.e("AngerTime");
            if ($$3.isPresent()) {
                this.a($$3.get().intValue());
            } else {
                this.b(-1L);
            }
        }
        if (!($$0 instanceof axf)) {
            return;
        }
        this.a(cgr.a($$1, h_));
        this.g(cgr.b(this.b(), $$0));
    }

    default public void a(axf $$0, boolean $$1) {
        chl $$2 = this.ag_();
        cgr<chl> $$3 = this.b();
        if ($$2 != null && $$2.fa() && $$3 != null && $$3.b($$2) && $$2 instanceof chn) {
            this.i();
            return;
        }
        if ($$2 != null) {
            if ($$3 == null || !$$3.b($$2)) {
                this.a(cgr.a($$2));
            }
            this.c();
        }
        if (!($$3 == null || this.ab_() || $$2 != null && chq.b($$2) && $$1)) {
            this.i();
        }
    }

    private static boolean b(chl $$0) {
        ddm $$1;
        return $$0 instanceof ddm && !($$1 = (ddm)$$0).ha() && !$$1.au();
    }

    default public boolean a(chl $$0, axf $$1) {
        if (!this.c($$0)) {
            return false;
        }
        if (chq.b($$0) && this.a_($$1)) {
            return true;
        }
        cgr<chl> $$2 = this.b();
        return $$2 != null && $$2.b($$0);
    }

    default public boolean a_(axf $$0) {
        return $$0.U().a(eua.af) != false && this.ab_() && this.b() == null;
    }

    default public boolean ab_() {
        long $$0 = this.a();
        if ($$0 > 0L) {
            long $$1 = $$0 - this.ao().au();
            return $$1 > 0L;
        }
        return false;
    }

    default public void a_(axf $$0, ddm $$1) {
        if (!$$0.U().a(eua.o).booleanValue()) {
            return;
        }
        cgr<chl> $$2 = this.b();
        if ($$2 == null || !$$2.b($$1)) {
            return;
        }
        this.i();
    }

    default public void ac_() {
        this.i();
        this.c();
    }

    default public void i() {
        this.a((chl)null);
        this.a((cgr<chl>)null);
        this.g(null);
        this.b(-1L);
    }

    public @Nullable chl eK();

    public void a(@Nullable chl var1);

    public void g(@Nullable chl var1);

    public boolean c(chl var1);

    public @Nullable chl ag_();
}

