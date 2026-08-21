/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class cqe
extends cop {
    private final cop a;
    private final int b;
    private boolean c;

    public cqe(int $$0, cop $$1) {
        this.b = $$0;
        this.a = $$1;
    }

    public boolean a(cqe $$0) {
        return this.W_() && $$0.i() < this.i();
    }

    @Override
    public boolean b() {
        return this.a.b();
    }

    @Override
    public boolean c() {
        return this.a.c();
    }

    @Override
    public boolean W_() {
        return this.a.W_();
    }

    @Override
    public void d() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.d();
    }

    @Override
    public void e() {
        if (!this.c) {
            return;
        }
        this.c = false;
        this.a.e();
    }

    @Override
    public boolean X_() {
        return this.a.X_();
    }

    @Override
    protected int a(int $$0) {
        return this.a.a($$0);
    }

    @Override
    public void a() {
        this.a.a();
    }

    @Override
    public void a(EnumSet<cop.a> $$0) {
        this.a.a($$0);
    }

    @Override
    public EnumSet<cop.a> j() {
        return this.a.j();
    }

    public boolean h() {
        return this.c;
    }

    public int i() {
        return this.b;
    }

    public cop k() {
        return this.a;
    }

    public boolean equals(@Nullable Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        return this.a.equals(((cqe)$$0).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

