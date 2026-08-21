/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Optional;

public interface eat<T extends Enum<T>> {
    public static final int z_ = 4;

    public Optional<eoh> k_(eoh var1);

    public float aw_();

    default public void a_(eoh $$0, axf $$1, is $$22, bgr $$3) {
        float $$4 = 0.05688889f;
        if ($$3.i() < 0.05688889f) {
            this.c($$0, $$1, $$22, $$3).ifPresent($$2 -> $$1.c($$22, (eoh)$$2));
        }
    }

    public T c();

    default public Optional<eoh> c(eoh $$0, axf $$1, is $$2, bgr $$3) {
        is $$7;
        int $$8;
        int $$4 = ((Enum)this.c()).ordinal();
        int $$5 = 0;
        int $$6 = 0;
        Iterator<is> iterator = is.a($$2, 4, 4, 4).iterator();
        while (iterator.hasNext() && ($$8 = ($$7 = iterator.next()).k($$2)) <= 4) {
            dzq dzq2;
            if ($$7.equals($$2) || !((dzq2 = $$1.a_($$7).b()) instanceof eat)) continue;
            eat $$9 = (eat)((Object)dzq2);
            T $$10 = $$9.c();
            if (this.c().getClass() != $$10.getClass()) continue;
            int $$11 = ((Enum)$$10).ordinal();
            if ($$11 < $$4) {
                return Optional.empty();
            }
            if ($$11 > $$4) {
                ++$$6;
                continue;
            }
            ++$$5;
        }
        float $$12 = (float)($$6 + 1) / (float)($$6 + $$5 + 1);
        float $$13 = $$12 * $$12 * this.aw_();
        if ($$3.i() < $$13) {
            return this.k_($$0);
        }
        return Optional.empty();
    }
}

