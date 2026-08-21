/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hib
extends hia
implements ach,
xv {
    static final Logger n = LogUtils.getLogger();
    public static final yh l = yh.c("multiplayer.disconnect.code_of_conduct");
    private final hin o;
    private final GameProfile p;
    private dgz q;
    private final jr.b r;
    private final his s = new his();
    private @Nullable hil t;
    protected @Nullable gjf.j m;
    private boolean u;

    public hib(gfj $$0, wu $$1, hik $$2) {
        super($$0, $$1, $$2);
        this.o = $$2.a();
        this.p = $$2.b();
        this.r = $$2.d();
        this.q = $$2.e();
        this.m = $$2.j();
    }

    @Override
    public boolean c() {
        return this.b.i();
    }

    @Override
    protected void a(acd $$0) {
        this.b($$0);
    }

    private void b(acd $$0) {
        n.warn("Unknown custom packet payload: {}", (Object)$$0.a().a());
    }

    @Override
    public void a(ack $$0) {
        abb.a($$0, this, this.a.bk());
        this.s.a($$0.b(), $$0.e());
    }

    @Override
    public void a(abt $$0) {
        abb.a($$0, this, this.a.bk());
        this.s.a($$0.b());
    }

    @Override
    public void a(acn $$0) {
        this.q = dhb.e.a($$0.b());
    }

    @Override
    public void a(acm $$0) {
        abb.a($$0, this, this.a.bk());
        if (this.t == null) {
            this.t = new hil();
        }
        List<bag> $$1 = this.t.a($$0.b());
        this.b(new act($$1));
    }

    @Override
    public void a(acl $$0) {
        this.m = null;
    }

    private <T> T a(Function<bbc, T> $$0) {
        if (this.t == null) {
            return $$0.apply(bbc.b);
        }
        try (bap $$1 = this.t.a();){
            T t2 = $$0.apply($$1);
            return t2;
        }
    }

    @Override
    public void a(aci $$0) {
        abb.a($$0, this, this.a.bk());
        if (this.u) {
            throw new IllegalStateException("Server sent duplicate Code of Conduct");
        }
        this.u = true;
        String $$12 = $$0.b();
        if (this.c != null && this.c.a($$12)) {
            this.b(acr.a);
        } else {
            gsb $$2 = this.a.x;
            this.a.a(new gvo(this.c, $$2, $$12, $$1 -> {
                if ($$1) {
                    this.b(acr.a);
                    this.a.a($$2);
                } else {
                    this.e().a(l);
                }
            }));
        }
    }

    @Override
    public void a(acj $$02) {
        abb.a($$02, this, this.a.bk());
        jr.b $$1 = this.a((bbc $$0) -> this.s.a((bbc)$$0, this.r, this.b.e()));
        this.b.a(aia.c.a(xq.a($$1)), new hig(this.a, this.b, new hik(this.o, this.p, this.e, $$1, this.q, this.d, this.c, this.f, this.h, this.m, this.i, this.a(), this.j, this.k)));
        this.b.a(acs.a);
        this.b.a(aia.b.a(xq.a($$1), new aia.a(this){

            @Override
            public boolean a() {
                return true;
            }
        }));
    }

    @Override
    public void d() {
        this.g();
    }

    @Override
    public void a(ww $$0) {
        super.a($$0);
        this.a.G();
    }

    @Override
    protected gsr e() {
        return new hia.a(this){

            @Override
            public void a(String $$0, @Nullable gsb $$1) {
                n.warn("Commands are not supported in configuration phase, trying to run '{}'", (Object)$$0);
            }
        };
    }
}

