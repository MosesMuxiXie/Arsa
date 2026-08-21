/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class dju {
    private static final Logger e = LogUtils.getLogger();
    public static final Codec<dju> a = bfm.c(as.a, bfm.b(as.a.listOf())).xmap(dju::new, $$0 -> $$0.g);
    public static final aao<xq, dju> b = aao.a(as.b.a(aam.a()), (C $$0) -> $$0.g, dju::new);
    public static final yh c = yh.c("item.canBreak").a(l.h);
    public static final yh d = yh.c("item.canPlace").a(l.h);
    private static final yh f = yh.c("item.canUse.unknown").a(l.h);
    private final List<as> g;
    private @Nullable List<yh> h;
    private @Nullable eol i;
    private boolean j;
    private boolean k;

    public dju(List<as> $$0) {
        this.g = $$0;
    }

    private static boolean a(eol $$0, @Nullable eol $$1, boolean $$2) {
        if ($$1 == null || $$0.a() != $$1.a()) {
            return false;
        }
        if (!$$2) {
            return true;
        }
        if ($$0.b() == null && $$1.b() == null) {
            return true;
        }
        if ($$0.b() == null || $$1.b() == null) {
            return false;
        }
        try (bgp.j $$3 = new bgp.j(e);){
            jr $$4 = $$0.c().J_();
            uz $$5 = dju.a($$0.b(), $$4, $$3);
            uz $$6 = dju.a($$1.b(), $$4, $$3);
            boolean bl2 = Objects.equals($$5, $$6);
            return bl2;
        }
    }

    private static uz a(elb $$0, jr $$1, bgp $$2) {
        fnp $$3 = fnp.a($$2.a($$0.v()), $$1);
        $$0.d($$3);
        return $$3.b();
    }

    public boolean a(eol $$0) {
        if (dju.a($$0, this.i, this.k)) {
            return this.j;
        }
        this.i = $$0;
        this.k = false;
        for (as $$1 : this.g) {
            if (!$$1.a($$0)) continue;
            this.k |= $$1.a();
            this.j = true;
            return true;
        }
        this.j = false;
        return false;
    }

    private List<yh> a() {
        if (this.h == null) {
            this.h = dju.a(this.g);
        }
        return this.h;
    }

    public void a(Consumer<yh> $$0) {
        this.a().forEach($$0);
    }

    private static List<yh> a(List<as> $$02) {
        for (as $$1 : $$02) {
            if (!$$1.b().isEmpty()) continue;
            return List.of(f);
        }
        return $$02.stream().flatMap($$0 -> $$0.b().orElseThrow().a()).distinct().map($$0 -> ((dzq)$$0.a()).f().a(l.i)).toList();
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof dju) {
            dju $$1 = (dju)$$0;
            return this.g.equals($$1.g);
        }
        return false;
    }

    public int hashCode() {
        return this.g.hashCode();
    }

    public String toString() {
        return "AdventureModePredicate{predicates=" + String.valueOf(this.g) + "}";
    }
}

