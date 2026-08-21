/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public interface cig {
    public static final cif a = ($$0, $$1, $$2) -> true;
    public static final cif b = ($$0, $$1, $$2) -> {
        if ($$2 == null || !$$0.w().a($$1)) {
            return false;
        }
        is $$3 = $$1.d();
        return $$0.b_($$1).a(bdv.a) && !$$0.a_($$3).d($$0, $$3);
    };
    public static final cif c = ($$0, $$1, $$2) -> {
        if ($$2 == null || !$$0.w().a($$1)) {
            return false;
        }
        return $$0.b_($$1).a(bdv.b);
    };
    public static final cif d = new cif(){

        @Override
        public boolean isSpawnPositionOk(dwr $$0, is $$1, @Nullable cgu<?> $$2) {
            if ($$2 == null || !$$0.w().a($$1)) {
                return false;
            }
            is $$3 = $$1.d();
            is $$4 = $$1.e();
            eoh $$5 = $$0.a_($$4);
            if (!$$5.a((dvt)$$0, $$4, $$2)) {
                return false;
            }
            return this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
        }

        private boolean a(dwr $$0, is $$1, cgu<?> $$2) {
            eoh $$3 = $$0.a_($$1);
            return dwz.a($$0, $$1, $$3, $$3.y(), $$2);
        }

        @Override
        public is a(dwr $$0, is $$1) {
            is $$2 = $$1.e();
            if ($$0.a_($$2).a(flq.a)) {
                return $$2;
            }
            return $$1;
        }
    };
}

