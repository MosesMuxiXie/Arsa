/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeg
extends dyj {
    public static final MapCodec<eeg> d = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)dxo.c.d.fieldOf("precipitation").forGetter($$0 -> $$0.R), (App)ka.b.fieldOf("interactions").forGetter($$0 -> $$0.c), eeg.x()).apply((Applicative)$$02, eeg::new));
    public static final int e = 1;
    public static final int f = 3;
    public static final eph g = eox.aO;
    private static final int h = 6;
    private static final double i = 3.0;
    private static final fug[] D = bhs.a(() -> dzq.a(2, (int $$0) -> fud.a(dyj.b, dzq.b(12.0, 4.0, eeg.b($$0 + 1)))));
    private final dxo.c R;

    public MapCodec<eeg> a() {
        return d;
    }

    public eeg(dxo.c $$0, ka.a $$1, eog.d $$2) {
        super($$2, $$1);
        this.R = $$0;
        this.l((eoh)((eoh)this.C.b()).b(g, 1));
    }

    @Override
    public boolean d(eoh $$0) {
        return $$0.c(g) == 3;
    }

    @Override
    protected boolean a(fla $$0) {
        return $$0 == flc.c && this.R == dxo.c.b;
    }

    @Override
    protected double b(eoh $$0) {
        return eeg.b($$0.c(g)) / 16.0;
    }

    private static double b(int $$0) {
        return 6.0 + (double)$$0 * 3.0;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, cgk $$3) {
        return D[$$0.c(g) - 1];
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$42, boolean $$5) {
        if ($$1 instanceof axf) {
            axf $$6 = (axf)$$1;
            is $$7 = $$2.j();
            $$42.a(chd.e, (cgk $$4) -> {
                if ($$4.cp() && $$4.c($$6, $$7)) {
                    this.d($$0, $$1, $$7);
                }
            });
        }
        $$42.a(chd.e);
    }

    private void d(eoh $$0, dwo $$1, is $$2) {
        if (this.R == dxo.c.c) {
            eeg.c((eoh)dzs.gj.m().b(g, $$0.c(g)), $$1, $$2);
        } else {
            eeg.c($$0, $$1, $$2);
        }
    }

    public static void c(eoh $$0, dwo $$1, is $$2) {
        int $$3 = $$0.c(g) - 1;
        eoh $$4 = $$3 == 0 ? dzs.gi.m() : (eoh)$$0.b(g, $$3);
        $$1.c($$2, $$4);
        $$1.a(etk.c, $$2, etk.a.a($$4));
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, dxo.c $$3) {
        if (!ean.a($$1, $$3) || $$0.c(g) == 3 || $$3 != this.R) {
            return;
        }
        eoh $$4 = (eoh)$$0.a(g);
        $$1.c($$2, $$4);
        $$1.a(etk.c, $$2, etk.a.a($$4));
    }

    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        return $$0.c(g);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{g});
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, fla $$3) {
        if (this.d($$0)) {
            return;
        }
        eoh $$4 = (eoh)$$0.b(g, $$0.c(g) + 1);
        $$1.c($$2, $$4);
        $$1.a(etk.c, $$2, etk.a.a($$4));
        $$1.c(1047, $$2, 0);
    }
}

