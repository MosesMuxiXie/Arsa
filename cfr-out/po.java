/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public abstract class po
extends pv<dso> {
    public po(ms $$0, CompletableFuture<jf.a> $$1) {
        super($$0, mj.bf, $$1);
    }

    protected void a(jf.a $$0, amt<dso> ... $$12) {
        this.a(bds.a).a($$12);
        Set<amt<dso>> $$2 = Set.of($$12);
        List $$3 = $$0.e(mj.bf).c().filter($$1 -> !$$2.contains($$1.e().get())).map(jd::g).collect(Collectors.toList());
        if (!$$3.isEmpty()) {
            throw new IllegalStateException("Not all enchantments were registered for tooltip ordering. Missing: " + String.join((CharSequence)", ", $$3));
        }
    }
}

