/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;

public interface dwp
extends dwa,
dwr,
dxd {
    public long I_();

    @Override
    default public <T> fve<T> a(is $$0, T $$1, int $$2, fvi $$3) {
        return new fve<T>($$1, $$0, this.au() + (long)$$2, $$3, this.I_());
    }

    @Override
    default public <T> fve<T> a(is $$0, T $$1, int $$2) {
        return new fve<T>($$1, $$0, this.au() + (long)$$2, this.I_());
    }

    public fne D_();

    default public long au() {
        return this.D_().b();
    }

    public @Nullable MinecraftServer s();

    default public ccz av() {
        return this.D_().p();
    }

    public eqj ac();

    @Override
    default public boolean b(int $$0, int $$1) {
        return this.ac().b($$0, $$1);
    }

    public bgr G_();

    default public void a(is $$0, dzq $$1) {
    }

    default public void a(iz $$0, is $$1, is $$2, eoh $$3, @dzq.b int $$4, int $$5) {
        fmi.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
    }

    default public void a(@Nullable cgk $$0, is $$1, bcz $$2, bdb $$3) {
        this.a($$0, $$1, $$2, $$3, 1.0f, 1.0f);
    }

    public void a(@Nullable cgk var1, is var2, bcz var3, bdb var4, float var5, float var6);

    public void a(lw var1, double var2, double var4, double var6, double var8, double var10, double var12);

    public void a(@Nullable cgk var1, int var2, is var3, int var4);

    default public void c(int $$0, is $$1, int $$2) {
        this.a(null, $$0, $$1, $$2);
    }

    public void a(jd<etk> var1, ftm var2, etk.a var3);

    default public void a(@Nullable cgk $$0, jd<etk> $$1, ftm $$2) {
        this.a($$1, $$2, new etk.a($$0, null));
    }

    default public void a(@Nullable cgk $$0, jd<etk> $$1, is $$2) {
        this.a($$1, $$2, new etk.a($$0, null));
    }

    default public void a(jd<etk> $$0, is $$1, etk.a $$2) {
        this.a($$0, ftm.b($$1), $$2);
    }

    default public void a(amt<etk> $$0, is $$1, etk.a $$2) {
        this.a((jd<etk>)this.J_().f(mj.N).b($$0), $$1, $$2);
    }
}

