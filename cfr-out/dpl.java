/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonElement
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public final class dpl
extends Record
implements dny<yh, dpl>,
dpe {
    private final axx<String> k;
    private final String l;
    private final int m;
    private final List<axx<yh>> n;
    private final boolean o;
    public static final dpl a = new dpl(axx.a(""), "", 0, List.of(), true);
    public static final int b = Short.MAX_VALUE;
    public static final int c = 16;
    public static final int d = 32;
    public static final int e = 3;
    public static final int f = 2;
    public static final Codec<yh> g = yj.a(Short.MAX_VALUE);
    public static final Codec<List<axx<yh>>> h = dpl.a(g);
    public static final Codec<dpl> i = RecordCodecBuilder.create($$0 -> $$0.group((App)axx.a(Codec.string((int)0, (int)32)).fieldOf("title").forGetter(dpl::d), (App)Codec.STRING.fieldOf("author").forGetter(dpl::e), (App)bfm.a(0, 3).optionalFieldOf("generation", (Object)0).forGetter(dpl::f), (App)h.optionalFieldOf("pages", List.of()).forGetter(dpl::a), (App)Codec.BOOL.optionalFieldOf("resolved", (Object)false).forGetter(dpl::g)).apply((Applicative)$$0, dpl::new));
    public static final aao<xq, dpl> j = aao.a(axx.a(aam.b(32)), dpl::d, aam.p, dpl::e, aam.h, dpl::f, axx.a(yj.b).a(aam.a()), dpl::a, aam.b, dpl::g, dpl::new);

    public dpl(axx<String> $$0, String $$1, int $$2, List<axx<yh>> $$3, boolean $$4) {
        if ($$2 < 0 || $$2 > 3) {
            throw new IllegalArgumentException("Generation was " + $$2 + ", but must be between 0 and 3");
        }
        this.k = $$0;
        this.l = $$1;
        this.m = $$2;
        this.n = $$3;
        this.o = $$4;
    }

    private static Codec<axx<yh>> b(Codec<yh> $$0) {
        return axx.a($$0);
    }

    public static Codec<List<axx<yh>>> a(Codec<yh> $$0) {
        return dpl.b($$0).listOf();
    }

    public @Nullable dpl b() {
        if (this.m >= 2) {
            return null;
        }
        return new dpl(this.k, this.l, this.m + 1, this.n, this.o);
    }

    public static boolean a(dlt $$0, ed $$1, @Nullable ddm $$2) {
        dpl $$3 = $$0.a(ki.ac);
        if ($$3 != null && !$$3.g()) {
            dpl $$4 = $$3.a($$1, $$2);
            if ($$4 != null) {
                $$0.b(ki.ac, $$4);
                return true;
            }
            $$0.b(ki.ac, $$3.c());
        }
        return false;
    }

    public @Nullable dpl a(ed $$0, @Nullable ddm $$1) {
        if (this.o) {
            return null;
        }
        ImmutableList.Builder $$2 = ImmutableList.builderWithExpectedSize((int)this.n.size());
        for (axx<yh> $$3 : this.n) {
            Optional<axx<yh>> $$4 = dpl.a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
                return null;
            }
            $$2.add($$4.get());
        }
        return new dpl(this.k, this.l, this.m, (List<axx<yh>>)$$2.build(), true);
    }

    public dpl c() {
        return new dpl(this.k, this.l, this.m, this.n, true);
    }

    private static Optional<axx<yh>> a(ed $$0, @Nullable ddm $$1, axx<yh> $$22) {
        return $$22.b((T $$2) -> {
            try {
                yw $$3 = yk.a($$0, $$2, (cgk)$$1, 0);
                if (dpl.a($$3, $$0.v())) {
                    return Optional.empty();
                }
                return Optional.of($$3);
            }
            catch (Exception $$4) {
                return Optional.of($$2);
            }
        });
    }

    private static boolean a(yh $$0, jf.a $$1) {
        DataResult $$2 = yj.a.encodeStart($$1.a(JsonOps.INSTANCE), (Object)$$0);
        return $$2.isSuccess() && bfv.a((JsonElement)$$2.getOrThrow(), Short.MAX_VALUE);
    }

    public List<yh> a(boolean $$0) {
        return Lists.transform(this.n, $$1 -> (yh)$$1.a($$0));
    }

    public dpl b(List<axx<yh>> $$0) {
        return new dpl(this.k, this.l, this.m, $$0, false);
    }

    @Override
    public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
        if (!bhi.h(this.l)) {
            $$1.accept(yh.a("book.byAuthor", new Object[]{this.l}).a(l.h));
        }
        $$1.accept(yh.c("book.generation." + this.m).a(l.h));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dpl.class, "title;author;generation;pages;resolved", "k", "l", "m", "n", "o"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dpl.class, "title;author;generation;pages;resolved", "k", "l", "m", "n", "o"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dpl.class, "title;author;generation;pages;resolved", "k", "l", "m", "n", "o"}, this, $$0);
    }

    public axx<String> d() {
        return this.k;
    }

    public String e() {
        return this.l;
    }

    public int f() {
        return this.m;
    }

    @Override
    public List<axx<yh>> a() {
        return this.n;
    }

    public boolean g() {
        return this.o;
    }

    @Override
    public /* synthetic */ Object a(List list) {
        return this.b(list);
    }
}

