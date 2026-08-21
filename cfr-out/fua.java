/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class fua
extends ftw {
    private @Nullable is a;
    private @Nullable is b;

    protected fua(dgi $$0, boolean $$1) {
        super($$0, $$1, false);
        this.a($$0);
    }

    private void a(dgi $$0) {
        is $$1 = $$0.s();
        eoh $$2 = $$0.ao().a_($$1);
        boolean $$3 = dzf.h($$2);
        if ($$3) {
            this.a = $$1.e();
            epl $$4 = $$2.c(((dzf)$$2.b()).c());
            if ($$4.b()) {
                this.b = switch ($$4) {
                    case epl.c -> $$1.i();
                    case epl.d -> $$1.h();
                    case epl.e -> $$1.f();
                    case epl.f -> $$1.g();
                    default -> null;
                };
            }
        }
    }

    @Override
    public fug a(eoh $$0, dvx $$1, is $$2) {
        if ($$2.equals(this.a) || $$2.equals(this.b)) {
            return fud.a();
        }
        return super.a($$0, $$1, $$2);
    }
}

