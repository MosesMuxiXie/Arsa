/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class cpx
extends cop {
    private final czp a;
    private @Nullable chl b;

    public cpx(czp $$0) {
        this.a = $$0;
        this.a(EnumSet.of(cop.a.a));
    }

    @Override
    public boolean b() {
        chl $$0 = this.a.ag_();
        return this.a.gP() > 0 || $$0 != null && this.a.g((cgk)$$0) < 9.0;
    }

    @Override
    public void d() {
        this.a.N().n();
        this.b = this.a.ag_();
    }

    @Override
    public void e() {
        this.b = null;
    }

    @Override
    public boolean X_() {
        return true;
    }

    @Override
    public void a() {
        if (this.b == null) {
            this.a.a(-1);
            return;
        }
        if (this.a.g((cgk)this.b) > 49.0) {
            this.a.a(-1);
            return;
        }
        if (!this.a.P().a(this.b)) {
            this.a.a(-1);
            return;
        }
        this.a.a(1);
    }
}

