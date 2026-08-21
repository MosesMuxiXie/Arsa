/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class iqa
extends MinecraftServer {
    private static final Logger n = LogUtils.getLogger();
    private static final int o = 2;
    public static final int m = 8;
    private final gfj p;
    private boolean q = true;
    private int r = -1;
    private @Nullable dwl s;
    private @Nullable iqd t;
    private @Nullable UUID u;
    private int v = 0;
    private volatile List<uq.a> w = new ArrayList<uq.a>();
    private final uq x = new uq();

    public iqa(Thread $$0, gfj $$1, fni.c $$2, bak $$3, ans $$4, ano $$5, axq $$6) {
        super($$0, $$2, $$3, $$4, $$1.ae(), $$1.aC(), $$5, $$6);
        this.a($$1.ad());
        this.d($$1.P());
        this.a(new ipz(this, this.bd(), this.h));
        this.p = $$1;
    }

    @Override
    public boolean e() {
        n.info("Starting integrated minecraft server version {}", (Object)w.b().c());
        this.e(true);
        this.Y();
        this.u_();
        GameProfile $$0 = this.W();
        String $$1 = this.bb().d();
        this.d((String)($$0 != null ? $$0.name() + " - " + $$1 : $$1));
        return true;
    }

    @Override
    public boolean I() {
        return this.q;
    }

    @Override
    public void b(boolean $$0) {
        try (um.a $$1 = um.a(this.x);){
            super.b($$0);
        }
        if (this.aR().i()) {
            this.w = this.x.a();
        }
    }

    @Override
    public void a(BooleanSupplier $$0) {
        int $$4;
        boolean $$1 = this.q;
        this.q = gfj.V().an() || this.aj().t().isEmpty();
        bzm $$2 = bzl.a();
        if (!$$1 && this.q) {
            $$2.a("autoSave");
            n.info("Saving and pausing game...");
            this.b(false, false, false);
            $$2.c();
        }
        if (this.q) {
            this.h();
            return;
        }
        if ($$1) {
            this.L();
        }
        super.a($$0);
        int $$3 = Math.max(2, this.p.k.e().b());
        if ($$3 != this.aj().p()) {
            n.info("Changing view distance to {}, from {}", (Object)$$3, (Object)this.aj().p());
            this.aj().a($$3);
        }
        if (($$4 = Math.max(2, this.p.k.f().b())) != this.v) {
            n.info("Changing simulation distance to {}, from {}", (Object)$$4, (Object)this.v);
            this.aj().b($$4);
            this.v = $$4;
        }
    }

    protected bxn a() {
        return this.p.aT().i();
    }

    @Override
    public boolean g() {
        return true;
    }

    private void h() {
        this.K();
        for (axg $$0 : this.aj().t()) {
            $$0.a(bdk.l);
        }
    }

    @Override
    public boolean m() {
        return true;
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public Path G() {
        return this.p.p.toPath();
    }

    @Override
    public boolean n() {
        return false;
    }

    @Override
    public int o() {
        return 0;
    }

    @Override
    public boolean p() {
        return this.p.k.aU();
    }

    @Override
    public void a(m $$0) {
        this.p.b($$0);
    }

    @Override
    public y a(y $$0) {
        $$0.a("Type", "Integrated Server (map_client.txt)");
        $$0.a("Is Modded", () -> this.T().b());
        $$0.a("Launched Version", this.p::m);
        return $$0;
    }

    @Override
    public bgi T() {
        return gfj.i().a(super.T());
    }

    @Override
    public boolean a(@Nullable dwl $$0, boolean $$1, int $$2) {
        try {
            this.p.aX();
            this.p.R().z();
            this.ak().a(null, $$2);
            n.info("Started serving on {}", (Object)$$2);
            this.r = $$2;
            this.t = new iqd(this.ah(), "" + $$2);
            this.t.start();
            this.s = $$0;
            this.aj().a($$1);
            bbh $$3 = this.b(this.p.s.gJ());
            this.p.s.a($$3);
            for (axg $$4 : this.aj().t()) {
                this.aF().a($$4);
            }
            return true;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    @Override
    public void x() {
        super.x();
        if (this.t != null) {
            this.t.interrupt();
            this.t = null;
        }
    }

    @Override
    public void a(boolean $$0) {
        this.h(() -> {
            ArrayList $$0 = Lists.newArrayList(this.aj().t());
            for (axg $$1 : $$0) {
                if ($$1.cY().equals(this.u)) continue;
                this.aj().b($$1);
            }
        });
        super.a($$0);
        if (this.t != null) {
            this.t.interrupt();
            this.t = null;
        }
    }

    @Override
    public boolean q() {
        return this.r > -1;
    }

    @Override
    public int V() {
        return this.r;
    }

    @Override
    public void a(dwl $$0) {
        super.a($$0);
        this.s = null;
    }

    @Override
    public bbh k() {
        return bbh.c;
    }

    public bbh b() {
        return bbh.c;
    }

    public void a(UUID $$0) {
        this.u = $$0;
    }

    @Override
    public boolean a(bbx $$0) {
        return this.W() != null && $$0.b().equalsIgnoreCase(this.W().name());
    }

    @Override
    public int c(int $$0) {
        return (int)(this.p.k.g().b() * (double)$$0);
    }

    @Override
    public boolean aZ() {
        return this.p.k.aA;
    }

    @Override
    public @Nullable dwl bf() {
        if (this.q() && !this.v_()) {
            return (dwl)MoreObjects.firstNonNull((Object)this.s, (Object)this.k.j());
        }
        return null;
    }

    @Override
    public jc v() {
        uz $$0 = this.k.v();
        if ($$0 == null) {
            return super.v();
        }
        try (bgp.j $$1 = new bgp.j(n);){
            fnq $$2 = fno.a((bgp)$$1, (jf.a)this.bc(), $$0);
            axg.c $$3 = $$2.a(axg.c.a).orElse(axg.c.b);
            if ($$3.a().isPresent() && $$3.b().isPresent()) {
                jc jc2 = new jc($$3.a().get(), is.a($$3.b().get()));
                return jc2;
            }
        }
        return super.v();
    }

    @Override
    public boolean b(boolean $$0, boolean $$1, boolean $$2) {
        boolean $$3 = super.b($$0, $$1, $$2);
        this.j();
        return $$3;
    }

    private void j() {
        if (this.g.b()) {
            this.p.execute(() -> gna.a(this.p));
        }
    }

    @Override
    public void a(Throwable $$0, esa $$1, dvu $$2) {
        super.a($$0, $$1, $$2);
        this.j();
        this.p.execute(() -> gna.a(this.p, $$2));
    }

    @Override
    public void b(Throwable $$0, esa $$1, dvu $$2) {
        super.b($$0, $$1, $$2);
        this.j();
        this.p.execute(() -> gna.b(this.p, $$2));
    }

    @Override
    public int r() {
        return 8;
    }

    public Collection<uq.a> d() {
        return this.w;
    }

    @Override
    public /* synthetic */ bxq f() {
        return this.a();
    }

    @Override
    public /* synthetic */ bbn l() {
        return this.b();
    }
}

