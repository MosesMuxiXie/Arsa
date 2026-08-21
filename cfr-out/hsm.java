/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class hsm {
    public is f = is.c;
    public eoh g = dzs.a.m();
    public eld<?> h = eld.U;
    public int i;
    public @Nullable igi.a j;

    public static void a(elb $$0, hsm $$1, @Nullable igi.a $$2) {
        $$1.f = $$0.aD_();
        $$1.g = $$0.o();
        $$1.h = $$0.s();
        $$1.i = $$0.j() != null ? hoh.a($$0.j(), $$0.aD_()) : 0xF000F0;
        $$1.j = $$2;
    }

    public void a(n $$0) {
        $$0.a("BlockEntityRenderState", this.getClass().getCanonicalName());
        $$0.a("Position", this.f);
        $$0.a("Block state", this.g::toString);
    }
}

