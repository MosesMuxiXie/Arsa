/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Arrays;
import java.util.Optional;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class cze
extends cgc {
    protected static final alw<doy> a = ama.a(cze.class, aly.L);
    private static final alw<Boolean> e = ama.a(cze.class, aly.k);
    private static final alw<Optional<yh>> f = ama.a(cze.class, aly.g);
    private static final byte g = (byte)Arrays.stream(ddo.values()).mapToInt(ddo::a).reduce(0, ($$0, $$1) -> $$0 | $$1);
    private static final Set<chx> h = Set.of(chx.a, chx.f, chx.d, chx.b, chx.c);
    public static final Codec<chx> b = chx.t.validate($$0 -> h.contains($$0) ? DataResult.success((Object)$$0) : DataResult.error(() -> "Invalid pose: " + $$0.c()));
    private static final Codec<Byte> i = ddo.h.listOf().xmap($$02 -> (byte)$$02.stream().mapToInt(ddo::a).reduce(g, ($$0, $$1) -> $$0 & ~$$1), $$0 -> Arrays.stream(ddo.values()).filter($$1 -> ($$0 & $$1.a()) == 0).toList());
    public static final doy c = doy.c.e;
    private static final yh j = yh.c("entity.minecraft.mannequin.label");
    protected static cgu.b<cze> d = cze::new;
    private static final String k = "profile";
    private static final String cc = "hidden_layers";
    private static final String cd = "main_hand";
    private static final String ce = "pose";
    private static final String cf = "immovable";
    private static final String cg = "description";
    private static final String ch = "hide_description";
    private yh ci = j;
    private boolean cj = false;

    public cze(cgu<cze> $$0, dwo $$1) {
        super((cgu<? extends chl>)$$0, $$1);
        this.az.a(t, g);
    }

    protected cze(dwo $$0) {
        this(cgu.aH, $$0);
    }

    public static @Nullable cze a(cgu<cze> $$0, dwo $$1) {
        return d.create($$0, $$1);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(a, c);
        $$0.a(e, false);
        $$0.a(f, Optional.of(j));
    }

    protected doy k() {
        return this.az.a(a);
    }

    private void a(doy $$0) {
        this.az.a(a, $$0);
    }

    private boolean n() {
        return this.az.a(e);
    }

    private void a(boolean $$0) {
        this.az.a(e, $$0);
    }

    protected @Nullable yh m() {
        return this.az.a(f).orElse(null);
    }

    private void a(yh $$0) {
        this.ci = $$0;
        this.p();
    }

    private void b(boolean $$0) {
        this.cj = $$0;
        this.p();
    }

    private void p() {
        this.az.a(f, this.cj ? Optional.empty() : Optional.of(this.ci));
    }

    @Override
    protected boolean fE() {
        return this.n() || super.fE();
    }

    @Override
    public boolean dy() {
        return !this.n() && super.dy();
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a(k, doy.a, this.k());
        $$0.a(cc, i, (Byte)this.az.a(t));
        $$0.a(cd, chb.c, this.at());
        $$0.a(ce, b, this.aF());
        $$0.a(cf, this.n());
        yh $$1 = this.m();
        if ($$1 != null) {
            if (!$$1.equals(j)) {
                $$0.a(cg, yj.a, $$1);
            }
        } else {
            $$0.a(ch, true);
        }
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        $$0.a(k, doy.a).ifPresent(this::a);
        this.az.a(t, $$0.a(cc, i).orElse(g));
        this.a($$0.a(cd, chb.c).orElse(l));
        this.c($$0.a(ce, b).orElse(chx.a));
        this.a($$0.a(cf, false));
        this.b($$0.a(ch, false));
        this.a($$0.a(cg, yj.a).orElse(j));
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.ar) {
            return cze.c($$0, this.k());
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.ar);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.ar) {
            this.a(cze.c(ki.ar, $$1));
            return true;
        }
        return super.b($$0, $$1);
    }
}

