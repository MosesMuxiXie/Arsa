/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gij
extends cze
implements gih {
    private static final Logger f = LogUtils.getLogger();
    public static final ddq e = imh.a(cze.c.b());
    private final gii g = new gii();
    private @Nullable CompletableFuture<Optional<ddq>> h;
    private ddq i = e;
    private final hou j;

    public static void a(hou $$0) {
        cze.d = ($$1, $$2) -> $$2 instanceof hif ? new gij($$2, $$0) : new cze($$1, $$2);
    }

    public gij(dwo $$0, hou $$1) {
        super($$0);
        this.j = $$1;
    }

    @Override
    public void g() {
        super.g();
        this.g.a(this.dI(), this.dN());
        if (this.h != null && this.h.isDone()) {
            try {
                this.h.get().ifPresent(this::a);
                this.h = null;
            }
            catch (Exception $$0) {
                f.error("Error when trying to look up skin", (Throwable)$$0);
            }
        }
    }

    @Override
    public void a(alw<?> $$0) {
        super.a($$0);
        if ($$0.equals(a)) {
            this.a();
        }
    }

    private void a() {
        if (this.h != null) {
            CompletableFuture<Optional<ddq>> $$02 = this.h;
            this.h = null;
            $$02.cancel(false);
        }
        this.h = this.j.c(this.k()).thenApply($$0 -> $$0.map(hou.a::b));
    }

    @Override
    public gii b() {
        return this.g;
    }

    @Override
    public ddq c() {
        return this.i;
    }

    private void a(ddq $$0) {
        this.i = $$0;
    }

    @Override
    public @Nullable yh d() {
        return this.m();
    }

    @Override
    public @Nullable cwy.b a(boolean $$0) {
        return null;
    }

    @Override
    public boolean e() {
        return false;
    }
}

