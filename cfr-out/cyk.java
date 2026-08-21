/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cyk
extends cyf {
    private @Nullable ftm b;

    public cyk(cyc $$0) {
        super($$0);
    }

    @Override
    public void a(axf $$0) {
        if (this.b == null) {
            this.b = this.a.dI();
        }
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void c() {
        this.b = null;
    }

    @Override
    public float e() {
        return 1.0f;
    }

    @Override
    public @Nullable ftm f() {
        return this.b;
    }

    public cyt<cyk> h() {
        return cyt.k;
    }
}

