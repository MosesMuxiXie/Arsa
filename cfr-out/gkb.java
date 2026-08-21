/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class gkb<E extends a<E>>
extends giy<E> {
    private static final yh a = yh.c("narration.selection.usage");

    public gkb(gfj $$0, int $$1, int $$2, int $$3, int $$4) {
        super($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public @Nullable gin a(gpi $$0) {
        if (this.u() == 0) {
            return null;
        }
        if (this.aP_() && $$0 instanceof gpi.a) {
            gpi.a $$1 = (gpi.a)$$0;
            a $$2 = (a)this.a($$1.b());
            if ($$2 != null) {
                return gin.a(this, gin.a($$2));
            }
            this.a((gmm)null);
            this.a(null);
            return null;
        }
        if (!this.aP_()) {
            a $$3 = (a)this.q();
            if ($$3 == null) {
                $$3 = (a)this.a($$0.a());
            }
            if ($$3 == null) {
                return null;
            }
            return gin.a(this, gin.a($$3));
        }
        return null;
    }

    @Override
    public void a(gpd $$0) {
        a $$1 = (a)this.z();
        if ($$1 != null) {
            this.a($$0.a(), $$1);
            $$1.b($$0);
        } else {
            a $$2 = (a)this.q();
            if ($$2 != null) {
                this.a($$0.a(), $$2);
                $$2.b($$0);
            }
        }
        if (this.aP_()) {
            $$0.a(gpc.d, a);
        }
    }

    public static abstract class a<E extends a<E>>
    extends giy.a<E>
    implements gpe {
        public abstract yh a();

        @Override
        public boolean a(gzc $$0, boolean $$1) {
            return true;
        }

        @Override
        public void b(gpd $$0) {
            $$0.a(gpc.a, this.a());
        }
    }
}

