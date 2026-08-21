/*
 * Decompiled with CFR 0.152.
 */
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class hiw {
    private static final a a = new a();
    private static final a b = new a();
    private static final a c = new a();
    private CompletableFuture<ipw<dlt>> d = CompletableFuture.completedFuture(ipw.empty());
    private CompletableFuture<ipw<dlt>> e = CompletableFuture.completedFuture(ipw.empty());
    private CompletableFuture<ipw<gwz>> f = CompletableFuture.completedFuture(ipw.empty());
    private final Map<a, Runnable> g = new IdentityHashMap<a, Runnable>();

    private void a(a $$0, Runnable $$1) {
        $$1.run();
        this.g.put($$0, $$1);
    }

    public void a() {
        for (Runnable $$0 : this.g.values()) {
            $$0.run();
        }
    }

    private static Stream<String> a(Stream<dlt> $$02, dlp.b $$1, dnj $$22) {
        return $$02.flatMap($$2 -> $$2.a($$1, null, $$22).stream()).map($$0 -> l.a($$0.getString()).trim()).filter($$0 -> !$$0.isEmpty());
    }

    public void a(geu $$0, dwo $$1) {
        this.a(a, () -> {
            List<gwz> $$2 = $$0.d();
            jr $$3 = $$1.J_();
            jq<dlp> $$4 = $$3.f(mj.R);
            dlp.b $$5 = dlp.b.a($$3);
            bhx $$6 = dsf.a($$1);
            dnj.a $$7 = dnj.a.a;
            CompletableFuture<ipw<gwz>> $$8 = this.f;
            this.f = CompletableFuture.supplyAsync(() -> new ipr<gwz>($$3 -> hiw.a($$3.c().stream().flatMap($$1 -> $$1.a($$6).stream()), $$5, $$7), $$2 -> $$2.c().stream().flatMap($$1 -> $$1.a($$6).stream()).map($$1 -> $$4.b($$1.h())), $$2), bhs.h());
            $$8.cancel(true);
        });
    }

    public ipw<gwz> b() {
        return this.f.join();
    }

    public void a(List<dlt> $$0) {
        this.a(c, () -> {
            CompletableFuture<ipw<dlt>> $$1 = this.e;
            this.e = CompletableFuture.supplyAsync(() -> new ips<dlt>($$0 -> $$0.j().map(bef::b), $$0), bhs.h());
            $$1.cancel(true);
        });
    }

    public ipw<dlt> c() {
        return this.e.join();
    }

    public void a(jf.a $$0, List<dlt> $$1) {
        this.a(b, () -> {
            dlp.b $$2 = dlp.b.a($$0);
            dnj.a $$3 = dnj.a.a.c();
            CompletableFuture<ipw<dlt>> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(() -> new ipr<dlt>($$2 -> hiw.a(Stream.of($$2), $$2, $$3), $$0 -> $$0.i().e().map(amt::a).stream(), $$1), bhs.h());
            $$4.cancel(true);
        });
    }

    public ipw<dlt> d() {
        return this.d.join();
    }

    static class a {
        a() {
        }
    }
}

