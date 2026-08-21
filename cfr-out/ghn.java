/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class ghn
implements mq {
    private final ms.a d;

    public ghn(ms $$0) {
        this.d = $$0.a(ms.b.b, "waypoint_style");
    }

    private static void a(BiConsumer<amt<fvv>, imq> $$0) {
        $$0.accept(fvw.b, new imq(128, 332, List.of(amo.b("default_0"), amo.b("default_1"), amo.b("default_2"), amo.b("default_3"))));
        $$0.accept(fvw.c, new imq(64, 332, List.of(amo.b("bowtie"), amo.b("default_0"), amo.b("default_1"), amo.b("default_2"), amo.b("default_3"))));
    }

    @Override
    public CompletableFuture<?> a(mo $$0) {
        HashMap $$12 = new HashMap();
        ghn.a(($$1, $$2) -> {
            if ($$12.putIfAbsent($$1, $$2) != null) {
                throw new IllegalStateException("Tried to register waypoint style twice for id: " + String.valueOf($$1));
            }
        });
        return mq.a($$0, imq.d, this.d::a, $$12);
    }

    @Override
    public String a() {
        return "Waypoint Style Definitions";
    }
}

