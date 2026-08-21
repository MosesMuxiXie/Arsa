/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class chw {
    private final efr a;
    private is b;
    private int c;
    private boolean d;

    public chw(efr $$0, is $$1) {
        this.a = $$0;
        this.b = $$1;
        this.d = true;
    }

    public boolean a(axf $$0, cgk $$1, boolean $$2) {
        if (this.d) {
            this.d = false;
            return $$2 && this.c++ >= this.a.a($$0, $$1);
        }
        this.f();
        return false;
    }

    public @Nullable fmb a(axf $$0, cgk $$1) {
        return this.a.a($$0, $$1, this.b);
    }

    public efr.a a() {
        return this.a.b();
    }

    private void f() {
        this.c = Math.max(this.c - 4, 0);
    }

    public boolean b() {
        return this.c <= 0;
    }

    public is c() {
        return this.b;
    }

    public void a(is $$0) {
        this.b = $$0;
    }

    public int d() {
        return this.c;
    }

    public boolean e() {
        return this.d;
    }

    public void a(boolean $$0) {
        this.d = $$0;
    }

    public boolean a(efr $$0) {
        return this.a == $$0;
    }
}

