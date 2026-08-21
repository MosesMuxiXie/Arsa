/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class elh
extends emo {
    public elh(is $$0, eoh $$1) {
        super(eld.K, $$0, $$1);
    }

    @Override
    public ett.d a() {
        return new a(this.aD_());
    }

    protected class a
    extends emo.a {
        public a(is $$1) {
            super(elh.this, $$1);
        }

        @Override
        public int a() {
            return 16;
        }

        @Override
        public boolean a(axf $$0, is $$1, jd<etk> $$2, @Nullable etk.a $$3) {
            int $$4 = this.a($$0, this.c, elh.this.o());
            if ($$4 != 0 && ett.a_($$2) != $$4) {
                return false;
            }
            return super.a($$0, $$1, $$2, $$3);
        }

        private int a(dwo $$0, is $$1, eoh $$2) {
            iz $$3 = $$2.c(eaf.b).g();
            return $$0.c($$1.a($$3), $$3);
        }
    }
}

