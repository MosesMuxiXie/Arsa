/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface frm
extends fob,
Predicate<fnz> {
    public static final Codec<frm> d = mi.F.q().dispatch("condition", frm::a, frn::a);
    public static final Codec<frm> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, fqz.b));
    public static final Codec<jd<frm>> f = amq.a(mj.bI, e);

    public frn a();

    @FunctionalInterface
    public static interface a {
        public frm build();

        default public a invert() {
            return frj.a(this);
        }

        default public fra.a or(a $$0) {
            return fra.a(this, $$0);
        }

        default public fqz.a and(a $$0) {
            return fqz.a(this, $$0);
        }
    }
}

