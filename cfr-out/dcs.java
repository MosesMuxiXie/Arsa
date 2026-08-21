/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dcs
implements dvk {
    private final ddm a;
    private dvm b = new dvm();
    private int c;

    public dcs(ddm $$0) {
        this.a = $$0;
    }

    @Override
    public ddm a() {
        return this.a;
    }

    @Override
    public void a(@Nullable ddm $$0) {
    }

    @Override
    public dvm b() {
        return this.b;
    }

    @Override
    public void a(dvm $$0) {
        this.b = $$0;
    }

    @Override
    public void a(dvl $$0) {
        $$0.l();
    }

    @Override
    public void a(dlt $$0) {
    }

    @Override
    public boolean c() {
        return this.a.ao().B_();
    }

    @Override
    public boolean b(ddm $$0) {
        return this.a == $$0;
    }

    @Override
    public int d() {
        return this.c;
    }

    @Override
    public void a(int $$0) {
        this.c = $$0;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public bcz f() {
        return bda.Eq;
    }
}

