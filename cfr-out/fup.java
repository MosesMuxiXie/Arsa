/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public interface fup {
    public int a();

    public void a(int var1);

    default public int b(int $$0) {
        int $$1 = this.a() + $$0;
        this.a($$1);
        return $$1;
    }

    default public int b() {
        return this.b(1);
    }

    default public void c() {
        this.a(0);
    }

    public boolean d();

    public void e();

    public void f();

    public @Nullable yh g();

    public void a(@Nullable yh var1);

    public void a(@Nullable aag var1);
}

