/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class flo {
    protected flu b;
    protected chn c;
    protected final Int2ObjectMap<fln> d = new Int2ObjectOpenHashMap();
    protected int e;
    protected int f;
    protected int g;
    protected boolean h = true;
    protected boolean i;
    protected boolean j;
    protected boolean k;

    public void a(dxb $$0, chn $$1) {
        this.b = new flu($$0, $$1);
        this.c = $$1;
        this.d.clear();
        this.e = bgj.b($$1.dF() + 1.0f);
        this.f = bgj.b($$1.dG() + 1.0f);
        this.g = bgj.b($$1.dF() + 1.0f);
    }

    public void b() {
        this.b = null;
        this.c = null;
    }

    protected fln b(is $$0) {
        return this.c($$0.u(), $$0.v(), $$0.w());
    }

    protected fln c(int $$0, int $$1, int $$2) {
        return (fln)this.d.computeIfAbsent(fln.b($$0, $$1, $$2), $$3 -> new fln($$0, $$1, $$2));
    }

    public abstract fln a();

    public abstract flw a(double var1, double var3, double var5);

    protected flw b(double $$0, double $$1, double $$2) {
        return new flw(this.c(bgj.c($$0), bgj.c($$1), bgj.c($$2)));
    }

    public abstract int a(fln[] var1, fln var2);

    public abstract fls a(flu var1, int var2, int var3, int var4, chn var5);

    public abstract fls a(flu var1, int var2, int var3, int var4);

    public fls a(chn $$0, is $$1) {
        return this.a(new flu($$0.ao(), $$0), $$1.u(), $$1.v(), $$1.w());
    }

    public void a(boolean $$0) {
        this.h = $$0;
    }

    public void b(boolean $$0) {
        this.i = $$0;
    }

    public void c(boolean $$0) {
        this.j = $$0;
    }

    public void d(boolean $$0) {
        this.k = $$0;
    }

    public boolean d() {
        return this.h;
    }

    public boolean e() {
        return this.i;
    }

    public boolean f() {
        return this.j;
    }

    public boolean g() {
        return this.k;
    }

    public static boolean a(eoh $$0) {
        return $$0.a(bdp.aY) || $$0.a(dzs.K) || $$0.a(dzs.lF) || eag.h($$0) || $$0.a(dzs.gk);
    }
}

