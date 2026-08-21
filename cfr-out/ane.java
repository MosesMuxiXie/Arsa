/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class ane {
    private static final Logger a = LogUtils.getLogger();
    private static final CompletableFuture<bhr> b = CompletableFuture.completedFuture(bhr.a);
    private final and.a c;
    private final ee d;
    private final dqz e;
    private final ang f;
    private final anh g;
    private final List<jq.a<?>> h;

    private ane(jk<anc> $$0, jf.a $$1, dgz $$2, ee.a $$3, List<jq.a<?>> $$4, bbn $$5) {
        this.c = new and.a($$0.a());
        this.h = $$4;
        this.e = new dqz($$1);
        this.d = new ee($$3, dz.a($$1, $$2));
        this.f = new ang($$1);
        this.g = new anh($$5, this.d.a());
    }

    public anh a() {
        return this.g;
    }

    public and.a b() {
        return this.c;
    }

    public dqz c() {
        return this.e;
    }

    public ee d() {
        return this.d;
    }

    public ang e() {
        return this.f;
    }

    public List<bat> f() {
        return List.of(this.e, this.g, this.f);
    }

    public static CompletableFuture<ane> a(baz $$0, jk<anc> $$1, List<jq.a<?>> $$2, dgz $$3, ee.a $$4, bbn $$5, Executor $$6, Executor $$72) {
        return and.a($$1, $$2, $$0, $$6).thenCompose($$7 -> {
            ane $$8 = new ane($$7.a(), $$7.b(), $$3, $$4, $$2, $$5);
            return bbf.a($$0, $$8.f(), $$6, $$72, b, a.isDebugEnabled()).a().thenApply($$1 -> $$8);
        });
    }

    public void g() {
        this.h.forEach(jq.a::d);
    }
}

