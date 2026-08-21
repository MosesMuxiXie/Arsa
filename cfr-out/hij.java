/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class hij
implements ei {
    private final hig a;
    private final gfj b;
    private int d = -1;
    private @Nullable CompletableFuture<Suggestions> e;
    private final Set<String> f = new HashSet<String>();
    private final bbn g;

    public hij(hig $$0, gfj $$1, bbn $$2) {
        this.a = $$0;
        this.b = $$1;
        this.g = $$2;
    }

    @Override
    public Collection<String> r() {
        ArrayList $$0 = Lists.newArrayList();
        for (hiq $$1 : this.a.o()) {
            $$0.add($$1.a().name());
        }
        return $$0;
    }

    @Override
    public Collection<String> z() {
        if (this.f.isEmpty()) {
            return this.r();
        }
        HashSet<String> $$0 = new HashSet<String>(this.r());
        $$0.addAll(this.f);
        return $$0;
    }

    @Override
    public Collection<String> A() {
        if (this.b.u != null && this.b.u.d() == ftk.a.c) {
            return Collections.singleton(((ftj)this.b.u).a().cZ());
        }
        return Collections.emptyList();
    }

    @Override
    public Collection<String> s() {
        return this.a.C().e();
    }

    @Override
    public Stream<amo> t() {
        return this.b.ap().c().stream();
    }

    @Override
    public bbn d() {
        return this.g;
    }

    @Override
    public CompletableFuture<Suggestions> a(amt<? extends jq<?>> $$0, ei.a $$1, SuggestionsBuilder $$22, CommandContext<?> $$3) {
        return this.v().a($$0).map($$2 -> {
            this.a((jf<?>)$$2, $$1, $$22);
            return $$22.buildFuture();
        }).orElseGet(() -> this.a($$3));
    }

    @Override
    public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
        if (this.e != null) {
            this.e.cancel(false);
        }
        this.e = new CompletableFuture();
        int $$1 = ++this.d;
        this.a.b(new aip($$1, $$0.getInput()));
        return this.e;
    }

    private static String a(double $$0) {
        return String.format(Locale.ROOT, "%.2f", $$0);
    }

    private static String a(int $$0) {
        return Integer.toString($$0);
    }

    @Override
    public Collection<ei.b> B() {
        ftk $$0 = this.b.u;
        if ($$0 == null || $$0.d() != ftk.a.b) {
            return ei.super.B();
        }
        is $$1 = ((fti)$$0).b();
        return Collections.singleton(new ei.b(hij.a($$1.u()), hij.a($$1.v()), hij.a($$1.w())));
    }

    @Override
    public Collection<ei.b> C() {
        ftk $$0 = this.b.u;
        if ($$0 == null || $$0.d() != ftk.a.b) {
            return ei.super.C();
        }
        ftm $$1 = $$0.g();
        return Collections.singleton(new ei.b(hij.a($$1.g), hij.a($$1.h), hij.a($$1.i)));
    }

    @Override
    public Set<amt<dwo>> u() {
        return this.a.x();
    }

    @Override
    public jr v() {
        return this.a.y();
    }

    @Override
    public dgz w() {
        return this.a.B();
    }

    public void a(int $$0, Suggestions $$1) {
        if ($$0 == this.d) {
            this.e.complete($$1);
            this.e = null;
            this.d = -1;
        }
    }

    public void a(adz.a $$0, List<String> $$1) {
        switch ($$0) {
            case a: {
                this.f.addAll($$1);
                break;
            }
            case b: {
                $$1.forEach(this.f::remove);
                break;
            }
            case c: {
                this.f.clear();
                this.f.addAll($$1);
            }
        }
    }
}

