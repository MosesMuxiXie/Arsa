/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class sn
extends tx {
    public static final amt<Consumer<sz>> a = sn.a("always_pass");
    public static final Consumer<sz> b = sz::d;

    private static amt<Consumer<sz>> a(String $$0) {
        return amt.a(mj.aG, amo.b($$0));
    }

    public static Consumer<sz> a(jq<Consumer<sz>> $$0) {
        sn.a(new sn());
        sn.b($$0);
        return b;
    }

    @Override
    public void a(BiConsumer<amt<Consumer<sz>>, Consumer<sz>> $$0) {
        $$0.accept(a, b);
    }
}

