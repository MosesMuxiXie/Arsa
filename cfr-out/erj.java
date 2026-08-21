/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class erj {
    public static final int a = 8;
    private static final EnumSet<euq.a> p = EnumSet.of(euq.a.c, euq.a.a);
    public static final EnumSet<euq.a> b = EnumSet.of(euq.a.d, euq.a.b, euq.a.e, euq.a.f);
    public static final erj c = erj.a("empty", null, p, ern.a);
    public static final erj d = erj.a("structure_starts", c, p, ern.a);
    public static final erj e = erj.a("structure_references", d, p, ern.a);
    public static final erj f = erj.a("biomes", e, p, ern.a);
    public static final erj g = erj.a("noise", f, p, ern.a);
    public static final erj h = erj.a("surface", g, p, ern.a);
    public static final erj i = erj.a("carvers", h, b, ern.a);
    public static final erj j = erj.a("features", i, b, ern.a);
    public static final erj k = erj.a("initialize_light", j, b, ern.a);
    public static final erj l = erj.a("light", k, b, ern.a);
    public static final erj m = erj.a("spawn", l, b, ern.a);
    public static final erj n = erj.a("full", m, b, ern.b);
    public static final Codec<erj> o = mi.m.q();
    private final int q;
    private final erj r;
    private final ern s;
    private final EnumSet<euq.a> t;

    private static erj a(String $$0, @Nullable erj $$1, EnumSet<euq.a> $$2, ern $$3) {
        return jq.a(mi.m, $$0, new erj($$1, $$2, $$3));
    }

    public static List<erj> a() {
        erj $$1;
        ArrayList $$0 = Lists.newArrayList();
        for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
            $$0.add($$1);
        }
        $$0.add($$1);
        Collections.reverse($$0);
        return $$0;
    }

    @VisibleForTesting
    protected erj(@Nullable erj $$0, EnumSet<euq.a> $$1, ern $$2) {
        this.r = $$0 == null ? this : $$0;
        this.s = $$2;
        this.t = $$1;
        this.q = $$0 == null ? 0 : $$0.b() + 1;
    }

    public int b() {
        return this.q;
    }

    public erj c() {
        return this.r;
    }

    public ern d() {
        return this.s;
    }

    public static erj a(String $$0) {
        return mi.m.a(amo.c($$0));
    }

    public EnumSet<euq.a> e() {
        return this.t;
    }

    public boolean a(erj $$0) {
        return this.b() >= $$0.b();
    }

    public boolean b(erj $$0) {
        return this.b() > $$0.b();
    }

    public boolean c(erj $$0) {
        return this.b() <= $$0.b();
    }

    public boolean d(erj $$0) {
        return this.b() < $$0.b();
    }

    public static erj a(erj $$0, erj $$1) {
        return $$0.b($$1) ? $$0 : $$1;
    }

    public String toString() {
        return this.f();
    }

    public String f() {
        return mi.m.b(this).toString();
    }
}

