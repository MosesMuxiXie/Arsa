/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import org.joml.Quaternionf;
import org.jspecify.annotations.Nullable;

public interface hop {
    public void a(fzm var1, float var2, List<idf.b> var3);

    public void a(fzm var1, @Nullable ftm var2, int var3, yh var4, boolean var5, int var6, double var7, ikp var9);

    public void a(fzm var1, float var2, float var3, bfr var4, boolean var5, gio.a var6, int var7, int var8, int var9, int var10);

    public void a(fzm var1, idf var2, Quaternionf var3);

    public void a(fzm var1, idf.a var2);

    public <S> void a(gzp<? super S> var1, S var2, fzm var3, ijs var4, int var5, int var6, int var7, @Nullable ilp var8, int var9, @Nullable igi.a var10);

    default public <S> void a(gzp<? super S> $$0, S $$1, fzm $$2, ijs $$3, int $$4, int $$5, int $$6, @Nullable igi.a $$7) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, -1, null, $$6, $$7);
    }

    default public void a(hdg $$0, fzm $$1, ijs $$2, int $$3, int $$4, @Nullable ilp $$5) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, false, false, -1, null, 0);
    }

    default public void a(hdg $$0, fzm $$1, ijs $$2, int $$3, int $$4, @Nullable ilp $$5, int $$6, @Nullable igi.a $$7) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, false, false, $$6, $$7, 0);
    }

    default public void a(hdg $$0, fzm $$1, ijs $$2, int $$3, int $$4, @Nullable ilp $$5, boolean $$6, boolean $$7) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, -1, null, 0);
    }

    public void a(hdg var1, fzm var2, ijs var3, int var4, int var5, @Nullable ilp var6, boolean var7, boolean var8, int var9, @Nullable igi.a var10, int var11);

    public void a(fzm var1, eoh var2, int var3, int var4, int var5);

    public void a(fzm var1, hpz var2);

    public void a(fzm var1, ijs var2, hqh var3, float var4, float var5, float var6, int var7, int var8, int var9);

    public void a(fzm var1, dlr var2, int var3, int var4, int var5, int[] var6, List<hqa> var7, ijs var8, ihm.a var9);

    public void a(fzm var1, ijs var2, hpo.a var3);

    public void a(hpo.b var1);
}

