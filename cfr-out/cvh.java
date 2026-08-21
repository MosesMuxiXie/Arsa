/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public abstract class cvh
extends cvg {
    private @Nullable cvh a;
    private int b = 1;

    public cvh(cgu<? extends cvh> $$0, dwo $$1) {
        super((cgu<? extends cvg>)$$0, $$1);
    }

    @Override
    protected void D() {
        super.D();
        this.cs.a(5, new coj(this));
    }

    @Override
    public int aj() {
        return this.gQ();
    }

    public int gQ() {
        return super.aj();
    }

    @Override
    protected boolean p() {
        return !this.gR();
    }

    public boolean gR() {
        return this.a != null && this.a.cb();
    }

    public cvh a(cvh $$0) {
        this.a = $$0;
        $$0.gX();
        return $$0;
    }

    public void gS() {
        this.a.gY();
        this.a = null;
    }

    private void gX() {
        ++this.b;
    }

    private void gY() {
        --this.b;
    }

    public boolean gT() {
        return this.gU() && this.b < this.gQ();
    }

    @Override
    public void g() {
        List<?> $$0;
        super.g();
        if (this.gU() && this.ao().y.a(200) == 1 && ($$0 = this.ao().a(this.getClass(), this.dj().c(8.0, 8.0, 8.0))).size() <= 1) {
            this.b = 1;
        }
    }

    public boolean gU() {
        return this.b > 1;
    }

    public boolean gV() {
        return this.g((cgk)this.a) <= 121.0;
    }

    public void gW() {
        if (this.gR()) {
            this.N().a((cgk)this.a, 1.0);
        }
    }

    public void a(Stream<? extends cvh> $$02) {
        $$02.limit(this.gQ() - this.b).filter($$0 -> $$0 != this).forEach($$0 -> $$0.a(this));
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        super.a($$0, $$1, $$2, $$3);
        if ($$3 == null) {
            $$3 = new a(this);
        } else {
            this.a(((a)$$3).a);
        }
        return $$3;
    }

    public static class a
    implements cie {
        public final cvh a;

        public a(cvh $$0) {
            this.a = $$0;
        }
    }
}

