/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class his {
    private @Nullable a a;
    private @Nullable b b;

    public void a(amt<? extends jq<?>> $$0, List<ju.a> $$1) {
        if (this.a == null) {
            this.a = new a();
        }
        this.a.a($$0, $$1);
    }

    public void a(Map<amt<? extends jq<?>>, beh.a> $$0) {
        if (this.b == null) {
            this.b = new b();
        }
        $$0.forEach(this.b::a);
    }

    private static <T> jq.a<T> a(jr.b $$0, amt<? extends jq<? extends T>> $$1, beh.a $$2) {
        jq $$3 = $$0.f($$1);
        return $$3.a($$2.a($$3));
    }

    /*
     * WARNING - void declaration
     */
    private jr a(bbc $$0, a $$12, boolean $$22) {
        void $$11;
        jk<hii> $$3 = hii.a();
        jr.b $$42 = $$3.b(hii.b);
        HashMap $$52 = new HashMap();
        $$12.a.forEach(($$1, $$2) -> $$52.put((amt<? extends jq<?>>)$$1, new amp.c((List<ju.a>)$$2, beh.a.a)));
        ArrayList $$6 = new ArrayList();
        if (this.b != null) {
            this.b.a((? super amt<? extends jq<?>> $$4, ? super beh.a $$5) -> {
                if ($$5.a()) {
                    return;
                }
                if (ju.a($$4)) {
                    $$52.compute((amt<? extends jq<?>>)$$4, ($$1, $$2) -> {
                        jr.b $$42 = $$2 != null ? $$2.a() : List.of();
                        return new amp.c((List<ju.a>)((Object)$$42), (beh.a)$$5);
                    });
                } else if (!$$22) {
                    $$6.add(his.a($$42, $$4, $$5));
                }
            });
        }
        List<jf.b<?>> $$7 = beg.a($$42, $$6);
        try {
            jr.b $$8 = amp.a($$52, $$0, $$7, amp.c).e();
        }
        catch (Exception $$9) {
            m $$10 = m.a($$9, "Network Registry Load");
            his.a($$10, $$52, $$6);
            throw new v($$10);
        }
        jr.b $$122 = $$3.a(hii.b, new jr.b[]{$$11}).a();
        $$6.forEach(jq.a::d);
        return $$122;
    }

    private static void a(m $$0, Map<amt<? extends jq<?>>, amp.c> $$1, List<jq.a<?>> $$2) {
        n $$3 = $$0.a("Received Elements and Tags");
        $$3.a("Dynamic Registries", () -> $$1.entrySet().stream().sorted(Comparator.comparing($$0 -> ((amt)$$0.getKey()).a())).map($$0 -> String.format(Locale.ROOT, "\n\t\t%s: elements=%d tags=%d", ((amt)$$0.getKey()).a(), ((amp.c)$$0.getValue()).a().size(), ((amp.c)$$0.getValue()).b().b())).collect(Collectors.joining()));
        $$3.a("Static Registries", () -> $$2.stream().sorted(Comparator.comparing($$0 -> $$0.a().a())).map($$0 -> String.format(Locale.ROOT, "\n\t\t%s: tags=%d", $$0.a().a(), $$0.b())).collect(Collectors.joining()));
    }

    private void a(b $$0, jr.b $$1, boolean $$22) {
        $$0.a((? super amt<? extends jq<?>> $$2, ? super beh.a $$3) -> {
            if ($$22 || ju.a($$2)) {
                his.a($$1, $$2, $$3).d();
            }
        });
    }

    public jr.b a(bbc $$0, jr.b $$1, boolean $$2) {
        jr.b $$4;
        if (this.a != null) {
            jr $$3 = this.a($$0, this.a, $$2);
        } else {
            if (this.b != null) {
                this.a(this.b, $$1, !$$2);
            }
            $$4 = $$1;
        }
        return $$4.e();
    }

    static class a {
        final Map<amt<? extends jq<?>>, List<ju.a>> a = new HashMap();

        a() {
        }

        public void a(amt<? extends jq<?>> $$02, List<ju.a> $$1) {
            this.a.computeIfAbsent($$02, $$0 -> new ArrayList()).addAll($$1);
        }
    }

    static class b {
        private final Map<amt<? extends jq<?>>, beh.a> a = new HashMap();

        b() {
        }

        public void a(amt<? extends jq<?>> $$0, beh.a $$1) {
            this.a.put($$0, $$1);
        }

        public void a(BiConsumer<? super amt<? extends jq<?>>, ? super beh.a> $$0) {
            this.a.forEach($$0);
        }
    }
}

