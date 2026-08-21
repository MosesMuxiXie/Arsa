/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class crp
extends csd<chl> {
    private static final int a = 200;
    private static final int b = 599;

    public crp() {
        this(200);
    }

    public crp(int $$0) {
        super($$0);
    }

    @Override
    protected void a(axf $$0, chl $$1) {
        crp.a($$1);
    }

    @Override
    public Set<cqw<?>> a() {
        return ImmutableSet.of(cqw.g);
    }

    public static void a(chl $$02) {
        Optional<List<chl>> $$1 = $$02.ev().c(cqw.g);
        if ($$1.isEmpty()) {
            return;
        }
        boolean $$2 = $$1.get().stream().anyMatch($$0 -> $$0.ay().equals(cgu.au));
        if ($$2) {
            crp.b($$02);
        }
    }

    public static void b(chl $$0) {
        $$0.ev().a(cqw.G, true, 599L);
    }
}

