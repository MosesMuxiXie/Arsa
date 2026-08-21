/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ghl
implements mq {
    private final ms.a d;
    private final ms.a e;
    private final ms.a f;

    public ghl(ms $$0) {
        this.d = $$0.a(ms.b.b, "blockstates");
        this.e = $$0.a(ms.b.b, "items");
        this.f = $$0.a(ms.b.b, "models");
    }

    @Override
    public CompletableFuture<?> a(mo $$0) {
        b $$1 = new b();
        a $$2 = new a();
        c $$3 = new c();
        new ghh($$2, $$1, $$3).a();
        new ghj($$1, $$3).a();
        $$2.a();
        $$1.a();
        return CompletableFuture.allOf($$2.a($$0, this.d), $$3.a($$0, this.f), $$1.a($$0, this.e));
    }

    @Override
    public final String a() {
        return "Model Definitions";
    }

    static class b
    implements ghk {
        private final Map<dlp, ihf> a = new HashMap<dlp, ihf>();
        private final Map<dlp, dlp> b = new HashMap<dlp, dlp>();

        b() {
        }

        @Override
        public void a(dlp $$0, ihj.b $$1, ihf.a $$2) {
            this.a($$0, new ihf($$1, $$2));
        }

        private void a(dlp $$0, ihf $$1) {
            ihf $$2 = this.a.put($$0, $$1);
            if ($$2 != null) {
                throw new IllegalStateException("Duplicate item model definition for " + String.valueOf($$0));
            }
        }

        @Override
        public void a(dlp $$0, dlp $$1) {
            this.b.put($$1, $$0);
        }

        public void a() {
            mi.h.forEach($$0 -> {
                dkb $$1;
                if (this.b.containsKey($$0)) {
                    return;
                }
                if ($$0 instanceof dkb && !this.a.containsKey($$1 = (dkb)$$0)) {
                    amo $$2 = ghy.a($$1.c());
                    this.a((dlp)$$1, ghw.a($$2));
                }
            });
            this.b.forEach(($$0, $$1) -> {
                ihf $$2 = this.a.get($$1);
                if ($$2 == null) {
                    throw new IllegalStateException("Missing donor: " + String.valueOf($$1) + " -> " + String.valueOf($$0));
                }
                this.a((dlp)$$0, $$2);
            });
            List<amo> $$02 = mi.h.c().filter($$0 -> !this.a.containsKey($$0.a())).map($$0 -> $$0.h().a()).toList();
            if (!$$02.isEmpty()) {
                throw new IllegalStateException("Missing item model definitions for: " + String.valueOf($$02));
            }
        }

        public CompletableFuture<?> a(mo $$0, ms.a $$12) {
            return mq.a($$0, ihf.a, $$1 -> $$12.a($$1.e().h().a()), this.a);
        }
    }

    static class a
    implements Consumer<gho> {
        private final Map<dzq, gho> a = new HashMap<dzq, gho>();

        a() {
        }

        public void a(gho $$0) {
            dzq $$1 = $$0.a();
            gho $$2 = this.a.put($$1, $$0);
            if ($$2 != null) {
                throw new IllegalStateException("Duplicate blockstate definition for " + String.valueOf($$1));
            }
        }

        public void a() {
            Stream<jd.c> $$02 = mi.e.c().filter($$0 -> true);
            List<amo> $$1 = $$02.filter($$0 -> !this.a.containsKey($$0.a())).map($$0 -> $$0.h().a()).toList();
            if (!$$1.isEmpty()) {
                throw new IllegalStateException("Missing blockstate definitions for: " + String.valueOf($$1));
            }
        }

        public CompletableFuture<?> a(mo $$0, ms.a $$12) {
            Map $$2 = Maps.transformValues(this.a, gho::b);
            Function<dzq, Path> $$3 = $$1 -> $$12.a($$1.p().h().a());
            return mq.a($$0, hqf.a, $$3, $$2);
        }

        @Override
        public /* synthetic */ void accept(Object object) {
            this.a((gho)object);
        }
    }

    static class c
    implements BiConsumer<amo, ghx> {
        private final Map<amo, ghx> a = new HashMap<amo, ghx>();

        c() {
        }

        public void a(amo $$0, ghx $$1) {
            Supplier $$2 = this.a.put($$0, $$1);
            if ($$2 != null) {
                throw new IllegalStateException("Duplicate model definition for " + String.valueOf($$0));
            }
        }

        public CompletableFuture<?> a(mo $$0, ms.a $$1) {
            return mq.a($$0, Supplier::get, $$1::a, this.a);
        }

        @Override
        public /* synthetic */ void accept(Object object, Object object2) {
            this.a((amo)object, (ghx)object2);
        }
    }
}

