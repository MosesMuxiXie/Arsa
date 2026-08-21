/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.MoreObjects;
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.logging.LogUtils;
import java.nio.file.Path;
import java.util.Locale;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gfi {
    private static final Logger b = LogUtils.getLogger();
    public static final int a = 10000;
    private final gfj c;
    private final fxx d = new fxx();
    private long e = -1L;
    private long f = -1L;
    private long g = -1L;
    private boolean h;

    public gfi(gfj $$0) {
        this.c = $$0;
    }

    private boolean a(gzb $$0) {
        switch ($$0.t()) {
            case 69: {
                if (this.c.s == null) {
                    return false;
                }
                boolean $$1 = this.c.m.c(glx.z);
                this.b("SectionPath: " + ($$1 ? "shown" : "hidden"));
                return true;
            }
            case 76: {
                this.c.z = !this.c.z;
                this.a("SmartCull: ", this.c.z);
                return true;
            }
            case 79: {
                if (this.c.s == null) {
                    return false;
                }
                boolean $$2 = this.c.m.c(glx.C);
                this.a("Frustum culling Octree: ", $$2);
                return true;
            }
            case 70: {
                boolean $$3 = igq.b();
                this.a("Fog: ", $$3);
                return true;
            }
            case 85: {
                if ($$0.m()) {
                    this.c.e.n();
                    this.b("Killed frustum");
                } else {
                    this.c.e.m();
                    this.b("Captured frustum");
                }
                return true;
            }
            case 86: {
                if (this.c.s == null) {
                    return false;
                }
                boolean $$4 = this.c.m.c(glx.M);
                this.a("SectionVisibility: ", $$4);
                return true;
            }
            case 87: {
                this.c.y = !this.c.y;
                this.a("WireFrame: ", this.c.y);
                return true;
            }
        }
        return false;
    }

    private void a(String $$0, boolean $$1) {
        this.b($$0 + ($$1 ? "enabled" : "disabled"));
    }

    private void a(yh $$0) {
        this.c.j.e().a($$0);
        this.c.aZ().c($$0);
    }

    private static yh a(l $$0, yh $$1) {
        return yh.i().b(yh.c("debug.prefix").a($$0, l.r)).b(yg.x).b($$1);
    }

    private void b(yh $$0) {
        this.a(gfi.a(l.m, $$0));
    }

    private void c(yh $$0) {
        this.a(gfi.a(l.o, $$0));
    }

    private void a(String $$0, Object ... $$1) {
        this.c(yh.a($$0, $$1));
    }

    private void b(String $$0) {
        this.c(yh.b($$0));
    }

    private boolean b(gzb $$0) {
        if (this.e > 0L && this.e < bhs.c() - 100L) {
            return true;
        }
        if (w.v && this.a($$0)) {
            return true;
        }
        if (w.aP) {
            switch ($$0.t()) {
                case 82: {
                    exy.a();
                    return true;
                }
                case 76: {
                    exy.b();
                    return true;
                }
            }
        }
        gfo $$12 = this.c.k;
        boolean $$2 = false;
        if ($$12.Z.a($$0)) {
            this.c.e.d();
            this.a("debug.reload_chunks.message", new Object[0]);
            $$2 = true;
        }
        if ($$12.aa.a($$0) && this.c.s != null && !this.c.s.hb()) {
            boolean $$3 = this.c.m.c(glx.w);
            this.a($$3 ? "debug.show_hitboxes.on" : "debug.show_hitboxes.off", new Object[0]);
            $$2 = true;
        }
        if ($$12.ab.a($$0)) {
            this.c.j.e().a(false);
            $$2 = true;
        }
        if ($$12.ac.a($$0) && this.c.s != null && !this.c.s.hb()) {
            boolean $$4 = this.c.m.c(glx.x);
            this.a($$4 ? "debug.chunk_boundaries.on" : "debug.chunk_boundaries.off", new Object[0]);
            $$2 = true;
        }
        if ($$12.ad.a($$0)) {
            $$12.k = !$$12.k;
            this.a($$12.k ? "debug.advanced_tooltips.on" : "debug.advanced_tooltips.off", new Object[0]);
            $$12.aQ();
            $$2 = true;
        }
        if ($$12.ae.a($$0)) {
            if (this.c.s != null && !this.c.s.hb()) {
                this.a(this.c.s.I().hasPermission(bbr.b), !$$0.m());
            }
            $$2 = true;
        }
        if ($$12.af.a($$0)) {
            if (this.c.s == null || !ape.a.a(this.c.s.I())) {
                this.a("debug.creative_spectator.error", new Object[0]);
            } else if (!this.c.s.au()) {
                this.c.s.b.b(new aig(dwl.d));
            } else {
                dwl $$5 = (dwl)MoreObjects.firstNonNull((Object)this.c.q.h(), (Object)dwl.b);
                this.c.s.b.b(new aig($$5));
            }
            $$2 = true;
        }
        if ($$12.ag.a($$0) && this.c.r != null && this.c.x == null) {
            if (this.c.Q() && ape.a.a(this.c.s.I())) {
                this.c.a(new gso());
            } else {
                this.a("debug.gamemodes.error", new Object[0]);
            }
            $$2 = true;
        }
        if ($$12.ah.a($$0)) {
            if (this.c.x instanceof gsn) {
                this.c.x.aX_();
            } else if (this.c.bi()) {
                if (this.c.x != null) {
                    this.c.x.aX_();
                }
                this.c.a(new gsn());
            }
            $$2 = true;
        }
        if ($$12.ai.a($$0)) {
            $$12.l = !$$12.l;
            $$12.aQ();
            this.a($$12.l ? "debug.pause_focus.on" : "debug.pause_focus.off", new Object[0]);
            $$2 = true;
        }
        if ($$12.aj.a($$0)) {
            Path $$6 = this.c.p.toPath().toAbsolutePath();
            Path $$7 = TextureUtil.getDebugTexturePath($$6);
            this.c.af().a($$7);
            yw $$8 = yh.b($$6.relativize($$7).toString()).a(l.t).a($$1 -> $$1.a(new yf.e($$7)));
            this.c(yh.a("debug.dump_dynamic_textures", $$8));
            $$2 = true;
        }
        if ($$12.ak.a($$0)) {
            this.a("debug.reload_resourcepacks.message", new Object[0]);
            this.c.p();
            $$2 = true;
        }
        if ($$12.al.a($$0)) {
            if (this.c.b(this::c)) {
                this.c(yh.a("debug.profiling.start", 10, $$12.X.n(), $$12.al.n()));
            }
            $$2 = true;
        }
        if ($$12.am.a($$0) && this.c.s != null && !this.c.s.hb()) {
            this.a("debug.copy_location.message", new Object[0]);
            this.a(String.format(Locale.ROOT, "/execute in %s run tp @s %.2f %.2f %.2f %.2f %.2f", this.c.s.ao().aq().a(), this.c.s.dP(), this.c.s.dR(), this.c.s.dV(), Float.valueOf(this.c.s.ec()), Float.valueOf(this.c.s.ee())));
            $$2 = true;
        }
        if ($$12.an.a($$0)) {
            this.a("debug.version.header", new Object[0]);
            ark.a(this::a);
            $$2 = true;
        }
        if ($$12.ao.a($$0)) {
            this.c.aT().h();
            $$2 = true;
        }
        if ($$12.ap.a($$0)) {
            this.c.aT().g();
            $$2 = true;
        }
        if ($$12.aq.a($$0)) {
            this.c.aT().f();
            $$2 = true;
        }
        return $$2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(boolean $$0, boolean $$1) {
        ftk $$22 = this.c.u;
        if ($$22 == null) {
            return;
        }
        switch ($$22.d()) {
            case b: {
                is $$3 = ((fti)$$22).b();
                dwo $$4 = this.c.s.ao();
                eoh $$5 = $$4.a_($$3);
                if (!$$0) {
                    this.a($$5, $$3, null);
                    this.a("debug.inspect.client.block", new Object[0]);
                    return;
                }
                if ($$1) {
                    this.c.s.b.v().a($$3, (uz $$2) -> {
                        this.a($$5, $$3, (uz)$$2);
                        this.a("debug.inspect.server.block", new Object[0]);
                    });
                    return;
                }
                elb $$6 = $$4.c_($$3);
                uz $$7 = $$6 != null ? $$6.c($$4.J_()) : null;
                this.a($$5, $$3, $$7);
                this.a("debug.inspect.client.block", new Object[0]);
                return;
            }
            case c: {
                cgk $$8 = ((ftj)$$22).a();
                amo $$9 = mi.g.b($$8.ay());
                if (!$$0) {
                    this.a($$9, $$8.dI(), null);
                    this.a("debug.inspect.client.entity", new Object[0]);
                    return;
                }
                if ($$1) {
                    this.c.s.b.v().a($$8.aA(), (uz $$2) -> {
                        this.a($$9, $$8.dI(), (uz)$$2);
                        this.a("debug.inspect.server.entity", new Object[0]);
                    });
                    return;
                }
                try (bgp.j $$10 = new bgp.j($$8.es(), b);){
                    fnp $$11 = fnp.a($$10, $$8.eo());
                    $$8.d($$11);
                    this.a($$9, $$8.dI(), $$11.b());
                }
                this.a("debug.inspect.client.entity", new Object[0]);
                return;
            }
        }
    }

    private void a(eoh $$0, is $$1, @Nullable uz $$2) {
        StringBuilder $$3 = new StringBuilder(ga.a($$0));
        if ($$2 != null) {
            $$3.append($$2);
        }
        String $$4 = String.format(Locale.ROOT, "/setblock %d %d %d %s", $$1.u(), $$1.v(), $$1.w(), $$3);
        this.a($$4);
    }

    private void a(amo $$0, ftm $$1, @Nullable uz $$2) {
        String $$5;
        if ($$2 != null) {
            $$2.r("UUID");
            $$2.r("Pos");
            String $$3 = vo.b((vz)$$2).getString();
            String $$4 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f %s", $$0, $$1.g, $$1.h, $$1.i, $$3);
        } else {
            $$5 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f", $$0, $$1.g, $$1.h, $$1.i);
        }
        this.a($$5);
    }

    private void a(long $$02, @gzb.a int $$1, gzb $$2) {
        int $$24;
        grx $$19;
        gsb gsb2;
        boolean $$20;
        gsb $$8;
        boolean $$7;
        fyk $$3 = this.c.aR();
        if ($$02 != $$3.h()) {
            return;
        }
        this.c.aS().d();
        gfo $$4 = this.c.k;
        boolean $$5 = $$4.X.a.b() == $$4.W.a.b();
        boolean $$6 = $$4.X.f();
        boolean bl2 = $$7 = !$$4.Y.m() && fyc.a(this.c.aR(), $$4.Y.a.b());
        if (this.e > 0L) {
            if (!$$7 || !$$6) {
                this.e = -1L;
            }
        } else if ($$7 && $$6) {
            this.h = $$5;
            this.e = bhs.c();
            this.f = bhs.c();
            this.g = 0L;
        }
        if (($$8 = this.c.x) != null) {
            switch ($$2.t()) {
                case 262: 
                case 263: 
                case 264: 
                case 265: {
                    this.c.a(gfg.c);
                    break;
                }
                case 258: {
                    this.c.a(gfg.d);
                }
            }
        }
        if (!($$1 != 1 || this.c.x instanceof gwj && ((gwj)$$8).f > bhs.c() - 20L)) {
            if ($$4.M.a($$2)) {
                $$3.g();
                boolean $$9 = $$3.i();
                $$4.ao().a($$9);
                $$4.aQ();
                gsb gsb3 = this.c.x;
                if (gsb3 instanceof gwg) {
                    gwg $$10 = (gwg)gsb3;
                    $$10.c($$9);
                }
                return;
            }
            if ($$4.J.a($$2)) {
                if ($$2.o() && w.am) {
                    this.a(this.c.a(this.c.p));
                } else {
                    gfs.a(this.c.p, this.c.l(), $$0 -> this.c.execute(() -> this.a((yh)$$0)));
                }
                return;
            }
        }
        if ($$1 != 0) {
            boolean $$11;
            boolean bl3 = $$11 = $$8 == null || !($$8.aO_() instanceof gjn) || !((gjn)$$8.aO_()).d();
            if ($$11) {
                if ($$2.o() && $$2.t() == 66 && this.c.aZ().a() && $$4.C().b().booleanValue()) {
                    boolean $$12 = $$4.aK().b() == gfm.a;
                    $$4.aK().a(gfm.a($$4.aK().b().a() + 1));
                    $$4.aQ();
                    if ($$8 != null) {
                        $$8.e($$12);
                    }
                }
                hnh $$12 = this.c.s;
            }
        }
        if ($$8 != null) {
            try {
                if ($$1 == 1 || $$1 == 2) {
                    $$8.y();
                    if ($$8.a($$2)) {
                        if (this.c.x == null) {
                            fyc.a $$13 = fyc.a($$2);
                            gfh.a($$13, false);
                        }
                        return;
                    }
                } else if ($$1 == 0 && $$8.b($$2)) {
                    if ($$4.X.a($$2)) {
                        this.h = false;
                    }
                    return;
                }
            }
            catch (Throwable $$14) {
                m $$15 = m.a($$14, "keyPressed event handler");
                $$8.a($$15);
                n $$16 = $$15.a("Key");
                $$16.a("Key", $$2.t());
                $$16.a("Scancode", $$2.u());
                $$16.a("Mods", $$2.b());
                throw new v($$15);
            }
        }
        fyc.a $$17 = fyc.a($$2);
        boolean $$18 = this.c.x == null;
        boolean bl4 = $$20 = $$18 || (gsb2 = this.c.x) instanceof grx && !($$19 = (grx)gsb2).o() || this.c.x instanceof gso;
        if ($$5 && $$4.X.a($$2) && $$1 == 0) {
            if (this.h) {
                this.h = false;
            } else {
                this.c.m.c();
            }
        } else if (!$$5 && $$4.W.a($$2) && $$1 == 1) {
            this.c.m.c();
        }
        if ($$1 == 0) {
            gfh.a($$17, false);
            return;
        }
        boolean $$21 = false;
        if ($$20 && $$2.e()) {
            this.c.b($$6);
            $$21 = $$6;
        } else if ($$6) {
            gsn $$22;
            gsn.d $$23;
            $$21 = this.b($$2);
            if ($$21 && $$8 instanceof gsn && ($$23 = ($$22 = (gsn)$$8).o()) != null) {
                $$23.aJ_().forEach(gsn.a::c);
            }
        } else if ($$20 && $$4.P.a($$2)) {
            $$4.au = !$$4.au;
        } else if ($$20 && $$4.Q.a($$2)) {
            this.c.i.h();
        }
        if ($$5) {
            this.h |= $$21;
        }
        if (this.c.aT().c() && !$$6 && ($$24 = $$2.k()) != -1) {
            this.c.aT().l().b($$24);
        }
        if ($$18 || $$17 == $$4.X.a) {
            if ($$21) {
                gfh.a($$17, false);
            } else {
                gfh.a($$17, true);
                gfh.a($$17);
            }
        }
    }

    private void a(long $$0, gyy $$1) {
        if ($$0 != this.c.aR().h()) {
            return;
        }
        gsb $$2 = this.c.x;
        if ($$2 == null || this.c.aP() != null) {
            return;
        }
        try {
            $$2.a($$1);
        }
        catch (Throwable $$3) {
            m $$4 = m.a($$3, "charTyped event handler");
            $$2.a($$4);
            n $$5 = $$4.a("Key");
            $$5.a("Codepoint", $$1.c());
            $$5.a("Mods", $$1.d());
            throw new v($$4);
        }
    }

    public void a(fyk $$02) {
        fyc.a($$02, ($$0, $$1, $$2, $$3, $$4) -> {
            gzb $$5 = new gzb($$1, $$2, $$4);
            this.c.execute(() -> this.a($$0, $$3, $$5));
        }, ($$0, $$1, $$2) -> {
            gyy $$3 = new gyy($$1, $$2);
            this.c.execute(() -> this.a($$0, $$3));
        });
    }

    public String a() {
        return this.d.a(this.c.aR(), ($$0, $$1) -> {
            if ($$0 != 65545) {
                this.c.aR().a($$0, $$1);
            }
        });
    }

    public void a(String $$0) {
        if (!$$0.isEmpty()) {
            this.d.a(this.c.aR(), $$0);
        }
    }

    public void b() {
        if (this.e > 0L) {
            long $$0 = bhs.c();
            long $$1 = 10000L - ($$0 - this.e);
            long $$2 = $$0 - this.f;
            if ($$1 < 0L) {
                if (this.c.d()) {
                    fvz.a();
                }
                String $$3 = "Manually triggered debug crash";
                m $$4 = new m("Manually triggered debug crash", new Throwable("Manually triggered debug crash"));
                n $$5 = $$4.a("Manual crash details");
                bgk.a($$5);
                throw new v($$4);
            }
            if ($$2 >= 1000L) {
                if (this.g == 0L) {
                    this.a("debug.crash.message", this.c.k.X.n().getString(), this.c.k.Y.n().getString());
                } else {
                    this.b(yh.a("debug.crash.warning", bgj.d((float)$$1 / 1000.0f)));
                }
                this.f = $$0;
                ++this.g;
            }
        }
    }
}

