/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class emu
extends elb {
    private static final String a = "profile";
    private static final String b = "note_block_sound";
    private static final String c = "custom_name";
    private @Nullable doy d;
    private @Nullable amo e;
    private int f;
    private boolean g;
    private @Nullable yh h;

    public emu(is $$0, eoh $$1) {
        super(eld.q, $$0, $$1);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.b(a, doy.a, this.d);
        $$0.b(b, amo.a, this.e);
        $$0.b(c, yj.a, this.h);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.d = $$0.a(a, doy.a).orElse(null);
        this.e = $$0.a(b, amo.a).orElse(null);
        this.h = emu.a($$0, c);
    }

    public static void a(dwo $$0, is $$1, eoh $$2, emu $$3) {
        if ($$2.b(ehh.a) && $$2.c(ehh.a).booleanValue()) {
            $$3.g = true;
            ++$$3.f;
        } else {
            $$3.g = false;
        }
    }

    public float a(float $$0) {
        if (this.g) {
            return (float)this.f + $$0;
        }
        return this.f;
    }

    public @Nullable doy a() {
        return this.d;
    }

    public @Nullable amo c() {
        return this.e;
    }

    public adh d() {
        return adh.a(this);
    }

    @Override
    public uz a(jf.a $$0) {
        return this.d($$0);
    }

    @Override
    protected void a(kd $$0) {
        super.a($$0);
        this.d = $$0.a(ki.ar);
        this.e = $$0.a(ki.as);
        this.h = $$0.a(ki.h);
    }

    @Override
    protected void a(kf.a $$0) {
        super.a($$0);
        $$0.a(ki.ar, this.d);
        $$0.a(ki.as, this.e);
        $$0.a(ki.h, this.h);
    }

    @Override
    public void b(fns $$0) {
        super.b($$0);
        $$0.c(a);
        $$0.c(b);
        $$0.c(c);
    }

    public /* synthetic */ aay ax_() {
        return this.d();
    }
}

