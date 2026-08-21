/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public class ou {
    private final Function<dqf, dqs<?>> a;

    public ou(Function<dqf, dqs<?>> $$0) {
        this.a = $$0;
    }

    public static ou a(Function<dqf, dqs<?>> $$0) {
        return new ou($$0);
    }

    public void a(om $$0, String $$1) {
        this.a($$0, amt.a(mj.bK, amo.a($$1)));
    }

    public void a(om $$0, amt<dqs<?>> $$1) {
        $$0.a($$1, this.a.apply(dqf.d), null);
    }
}

