/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import java.util.Optional;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gux
extends gum<djl> {
    private static final amo D = amo.b("container/smithing/error");
    private static final amo E = amo.b("container/slot/smithing_template_armor_trim");
    private static final amo F = amo.b("container/slot/smithing_template_netherite_upgrade");
    private static final yh G = yh.c("container.upgrade.missing_template_tooltip");
    private static final yh H = yh.c("container.upgrade.error_tooltip");
    private static final List<amo> I = List.of(E, F);
    private static final int J = 44;
    private static final int K = 15;
    private static final int L = 28;
    private static final int M = 21;
    private static final int N = 65;
    private static final int O = 46;
    private static final int P = 115;
    private static final int Q = 210;
    private static final int R = 25;
    private static final Vector3f S = new Vector3f(0.0f, 1.0f, 0.0f);
    private static final Quaternionf T = new Quaternionf().rotationXYZ(0.43633232f, 0.0f, (float)Math.PI);
    private static final int U = 25;
    private static final int V = 121;
    private static final int W = 20;
    private static final int X = 161;
    private static final int Y = 80;
    private final gub Z = new gub(0);
    private final gub aa = new gub(1);
    private final gub ab = new gub(2);
    private final ici ac = new ici();

    public gux(djl $$0, ddl $$1, yh $$2) {
        super($$0, $$1, $$2, amo.b("textures/gui/container/smithing.png"));
        this.f = 44;
        this.t = 15;
        this.ac.H = cgu.h;
        this.ac.o = false;
        this.ac.n = true;
        this.ac.av = 25.0f;
        this.ac.at = 210.0f;
    }

    @Override
    protected void I() {
        this.b(((djl)this.w).b(3).g());
    }

    @Override
    public void p() {
        super.p();
        Optional<dmx> $$0 = this.J();
        this.Z.a(I);
        this.aa.a($$0.map(dmx::c).orElse(List.of()));
        this.ab.a($$0.map(dmx::n).orElse(List.of()));
    }

    private Optional<dmx> J() {
        dlp dlp2;
        dlt $$0 = ((djl)this.w).b(0).g();
        if (!$$0.f() && (dlp2 = $$0.h()) instanceof dmx) {
            dmx $$1 = (dmx)dlp2;
            return Optional.of($$1);
        }
        return Optional.empty();
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.f($$0, $$1, $$2);
    }

    @Override
    protected void a(gir $$0, float $$1, int $$2, int $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.Z.a(this.w, $$0, $$1, this.z, this.A);
        this.aa.a(this.w, $$0, $$1, this.z, this.A);
        this.ab.a(this.w, $$0, $$1, this.z, this.A);
        int $$4 = this.z + 121;
        int $$5 = this.A + 20;
        int $$6 = this.z + 161;
        int $$7 = this.A + 80;
        $$0.a(this.ac, 25.0f, S, T, null, $$4, $$5, $$6, $$7);
    }

    @Override
    public void a(dhi $$0, int $$1, dlt $$2) {
        if ($$1 == 3) {
            this.b($$2);
        }
    }

    private void b(dlt $$0) {
        this.ac.k = dlt.l;
        this.ac.j.b();
        this.ac.ap = dlt.l;
        this.ac.aL.b();
        this.ac.aq = dlt.l;
        this.ac.ar = dlt.l;
        this.ac.as = dlt.l;
        if (!$$0.f()) {
            dun $$1 = $$0.a(ki.H);
            cgv $$2 = $$1 != null ? $$1.b() : null;
            ihk $$3 = this.n.bh();
            cgv cgv2 = $$2;
            int n2 = 0;
            switch (SwitchBootstraps.enumSwitch("enumSwitch", new Object[]{"HEAD", "CHEST", "LEGS", "FEET"}, (cgv)cgv2, n2)) {
                case 0: {
                    if (iay.a($$0, cgv.f)) {
                        this.ac.ap = $$0.v();
                        break;
                    }
                    $$3.a(this.ac.aL, $$0, dlr.f, null, null, 0);
                    break;
                }
                case 1: {
                    this.ac.aq = $$0.v();
                    break;
                }
                case 2: {
                    this.ac.ar = $$0.v();
                    break;
                }
                case 3: {
                    this.ac.as = $$0.v();
                    break;
                }
                default: {
                    this.ac.k = $$0.v();
                    $$3.a(this.ac.j, $$0, dlr.b, null, null, 0);
                }
            }
        }
    }

    @Override
    protected void e(gir $$0, int $$1, int $$2) {
        if (this.K()) {
            $$0.a(hpa.at, D, $$1 + 65, $$2 + 46, 28, 21);
        }
    }

    private void f(gir $$0, int $$1, int $$2) {
        Optional<yh> $$32 = Optional.empty();
        if (this.K() && this.a(65, 46, 28, 21, $$1, $$2)) {
            $$32 = Optional.of(H);
        }
        if (this.y != null) {
            dlt $$4 = ((djl)this.w).b(0).g();
            dlt $$5 = this.y.g();
            if ($$4.f()) {
                if (this.y.d == 0) {
                    $$32 = Optional.of(G);
                }
            } else {
                dlp dlp2 = $$4.h();
                if (dlp2 instanceof dmx) {
                    dmx $$6 = (dmx)dlp2;
                    if ($$5.f()) {
                        if (this.y.d == 1) {
                            $$32 = Optional.of($$6.a());
                        } else if (this.y.d == 2) {
                            $$32 = Optional.of($$6.b());
                        }
                    }
                }
            }
        }
        $$32.ifPresent($$3 -> $$0.b(this.q, this.q.c((yn)$$3, 115), $$1, $$2));
    }

    private boolean K() {
        return ((djl)this.w).m();
    }
}

