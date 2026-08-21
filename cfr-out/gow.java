/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public interface gow {
    public void f(int var1);

    public void g(int var1);

    public int aT_();

    public int aU_();

    public int aS_();

    public int aR_();

    default public gpm aV_() {
        return new gpm(this.aT_(), this.aU_(), this.aS_(), this.aR_());
    }

    default public void c(int $$0, int $$1) {
        this.f($$0);
        this.g($$1);
    }

    public void a(Consumer<gjc> var1);
}

