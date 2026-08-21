/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.UnaryOperator;

public interface bal {
    public static final UnaryOperator<yh> a = UnaryOperator.identity();
    public static final bal b = bal.a(a, true);
    public static final bal c = bal.a(bal.a("pack.source.builtin"), true);
    public static final bal d = bal.a(bal.a("pack.source.feature"), false);
    public static final bal e = bal.a(bal.a("pack.source.world"), true);
    public static final bal f = bal.a(bal.a("pack.source.server"), true);

    public yh a(yh var1);

    public boolean a();

    public static bal a(final UnaryOperator<yh> $$0, final boolean $$1) {
        return new bal(){

            @Override
            public yh a(yh $$02) {
                return (yh)$$0.apply($$02);
            }

            @Override
            public boolean a() {
                return $$1;
            }
        };
    }

    private static UnaryOperator<yh> a(String $$0) {
        yw $$12 = yh.c($$0);
        return $$1 -> yh.a("pack.nameAndSource", $$1, $$12).a(l.h);
    }
}

