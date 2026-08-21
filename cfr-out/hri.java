/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public interface hri<T extends elb, S extends hsm> {
    public S e();

    default public void a(T $$0, S $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hsm.a($$0, $$1, $$4);
    }

    public void a(S var1, fzm var2, hpo var3, ikp var4);

    default public boolean bk_() {
        return false;
    }

    default public int bl_() {
        return 64;
    }

    default public boolean a(T $$0, ftm $$1) {
        return ftm.b(((elb)$$0).aD_()).a((jn)$$1, (double)this.bl_());
    }
}

