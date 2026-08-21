/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandExceptionType
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;

public class ed
implements ef<ed>,
ei {
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("permissions.requires.player"));
    public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("permissions.requires.entity"));
    private final ec d;
    private final ftm e;
    private final axf f;
    private final bbn g;
    private final String h;
    private final yh i;
    private final MinecraftServer j;
    private final boolean k;
    private final @Nullable cgk l;
    private final ea m;
    private final ep.a n;
    private final ftl o;
    private final eb p;
    private final bhj q;

    public ed(ec $$0, ftm $$1, ftl $$2, axf $$3, bbn $$4, String $$5, yh $$6, MinecraftServer $$7, @Nullable cgk $$8) {
        this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, ea.a, ep.a.a, eb.a, bhj.immediate($$7));
    }

    private ed(ec $$0, ftm $$1, ftl $$2, axf $$3, bbn $$4, String $$5, yh $$6, MinecraftServer $$7, @Nullable cgk $$8, boolean $$9, ea $$10, ep.a $$11, eb $$12, bhj $$13) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$3;
        this.k = $$9;
        this.l = $$8;
        this.g = $$4;
        this.h = $$5;
        this.i = $$6;
        this.j = $$7;
        this.m = $$10;
        this.n = $$11;
        this.o = $$2;
        this.p = $$12;
        this.q = $$13;
    }

    public ed a(ec $$0) {
        if (this.d == $$0) {
            return this;
        }
        return new ed($$0, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
    }

    public ed a(cgk $$0) {
        if (this.l == $$0) {
            return this;
        }
        return new ed(this.d, this.e, this.o, this.f, this.g, $$0.aq(), $$0.R_(), this.j, $$0, this.k, this.m, this.n, this.p, this.q);
    }

    public ed a(ftm $$0) {
        if (this.e.equals($$0)) {
            return this;
        }
        return new ed(this.d, $$0, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
    }

    public ed a(ftl $$0) {
        if (this.o.c($$0)) {
            return this;
        }
        return new ed(this.d, this.e, $$0, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
    }

    public ed a(ea $$0) {
        if (Objects.equals(this.m, $$0)) {
            return this;
        }
        return new ed(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, $$0, this.n, this.p, this.q);
    }

    public ed a(ea $$0, BinaryOperator<ea> $$1) {
        ea $$2 = (ea)$$1.apply(this.m, $$0);
        return this.a($$2);
    }

    public ed a() {
        if (this.k || this.d.o_()) {
            return this;
        }
        return new ed(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, true, this.m, this.n, this.p, this.q);
    }

    public ed a(bbn $$0) {
        if ($$0 == this.g) {
            return this;
        }
        return new ed(this.d, this.e, this.o, this.f, $$0, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
    }

    public ed b(bbn $$0) {
        return this.a(this.g.a($$0));
    }

    public ed a(ep.a $$0) {
        if ($$0 == this.n) {
            return this;
        }
        return new ed(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, $$0, this.p, this.q);
    }

    public ed a(axf $$0) {
        if ($$0 == this.f) {
            return this;
        }
        double $$1 = esh.a(this.f.F_(), $$0.F_());
        ftm $$2 = new ftm(this.e.g * $$1, this.e.h, this.e.i * $$1);
        return new ed(this.d, $$2, this.o, $$0, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
    }

    public ed a(cgk $$0, ep.a $$1) {
        return this.b($$1.a($$0));
    }

    public ed b(ftm $$0) {
        ftm $$1 = this.n.a(this);
        double $$2 = $$0.g - $$1.g;
        double $$3 = $$0.h - $$1.h;
        double $$4 = $$0.i - $$1.i;
        double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
        float $$6 = bgj.f((float)(-(bgj.d($$3, $$5) * 57.2957763671875)));
        float $$7 = bgj.f((float)(bgj.d($$4, $$2) * 57.2957763671875) - 90.0f);
        return this.a(new ftl($$6, $$7));
    }

    public ed a(eb $$0, bhj $$1) {
        if ($$0 == this.p && $$1 == this.q) {
            return this;
        }
        return new ed(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, $$0, $$1);
    }

    public yh b() {
        return this.i;
    }

    public String c() {
        return this.h;
    }

    @Override
    public bbn d() {
        return this.g;
    }

    public ftm e() {
        return this.e;
    }

    public axf f() {
        return this.f;
    }

    public @Nullable cgk g() {
        return this.l;
    }

    public cgk h() throws CommandSyntaxException {
        if (this.l == null) {
            throw b.create();
        }
        return this.l;
    }

    public axg i() throws CommandSyntaxException {
        cgk cgk2 = this.l;
        if (cgk2 instanceof axg) {
            axg $$0 = (axg)cgk2;
            return $$0;
        }
        throw a.create();
    }

    public @Nullable axg j() {
        axg $$0;
        cgk cgk2 = this.l;
        return cgk2 instanceof axg ? ($$0 = (axg)cgk2) : null;
    }

    public boolean k() {
        return this.l instanceof axg;
    }

    public ftl l() {
        return this.o;
    }

    public MinecraftServer m() {
        return this.j;
    }

    public ep.a n() {
        return this.n;
    }

    public eb o() {
        return this.p;
    }

    public bhj p() {
        return this.q;
    }

    public boolean a(axg $$0) {
        axg $$1 = this.j();
        if ($$0 == $$1) {
            return false;
        }
        return $$1 != null && $$1.Z() || $$0.Z();
    }

    public void a(yx $$0, boolean $$1, yd.a $$2) {
        if (this.k) {
            return;
        }
        axg $$3 = this.j();
        if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
        } else {
            this.d.a($$2.a($$0.a()));
        }
    }

    public void a(yh $$0) {
        if (this.k) {
            return;
        }
        axg $$1 = this.j();
        if ($$1 != null) {
            $$1.a($$0);
        } else {
            this.d.a($$0);
        }
    }

    public void a(Supplier<yh> $$0, boolean $$1) {
        boolean $$3;
        boolean $$2 = this.d.x_() && !this.k;
        boolean bl2 = $$3 = $$1 && this.d.c() && !this.k;
        if (!$$2 && !$$3) {
            return;
        }
        yh $$4 = $$0.get();
        if ($$2) {
            this.d.a($$4);
        }
        if ($$3) {
            this.c($$4);
        }
    }

    private void c(yh $$0) {
        yw $$1 = yh.a("chat.type.admin", this.b(), $$0).a(l.h, l.u);
        eua $$2 = this.f.U();
        if ($$2.a(eua.R).booleanValue()) {
            for (axg $$3 : this.j.aj().t()) {
                if ($$3.B() == this.d || !this.j.aj().f($$3.gJ())) continue;
                $$3.a($$1);
            }
        }
        if (this.d != this.j && $$2.a(eua.w).booleanValue()) {
            this.j.a($$1);
        }
    }

    public void b(yh $$0) {
        if (this.d.y_() && !this.k) {
            this.d.a(yh.i().b($$0).a(l.m));
        }
    }

    @Override
    public ea q() {
        return this.m;
    }

    @Override
    public Collection<String> r() {
        return Lists.newArrayList((Object[])this.j.S());
    }

    @Override
    public Collection<String> s() {
        return this.j.aK().e();
    }

    @Override
    public Stream<amo> t() {
        return mi.b.s().map(bcz::a);
    }

    @Override
    public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
        return Suggestions.empty();
    }

    @Override
    public CompletableFuture<Suggestions> a(amt<? extends jq<?>> $$02, ei.a $$1, SuggestionsBuilder $$22, CommandContext<?> $$3) {
        if ($$02 == mj.bK) {
            return ei.a(this.j.aJ().d().stream().map($$0 -> $$0.a().a()), $$22);
        }
        if ($$02 == mj.bJ) {
            Collection<ac> $$4 = this.j.aB().b();
            return ei.a($$4.stream().map(ac::a), $$22);
        }
        return this.a($$02).map($$2 -> {
            this.a((jf<?>)$$2, $$1, $$22);
            return $$22.buildFuture();
        }).orElseGet(Suggestions::empty);
    }

    private Optional<? extends jf<?>> a(amt<? extends jq<?>> $$0) {
        Optional $$1 = this.v().a($$0);
        if ($$1.isPresent()) {
            return $$1;
        }
        return this.j.be().a().a($$0);
    }

    @Override
    public Set<amt<dwo>> u() {
        return this.j.O();
    }

    @Override
    public jr v() {
        return this.j.bc();
    }

    @Override
    public dgz w() {
        return this.f.Q();
    }

    @Override
    public CommandDispatcher<ed> x() {
        return this.m().aC().a();
    }

    @Override
    public void a(CommandExceptionType $$0, Message $$1, boolean $$2, @Nullable hj $$3) {
        if ($$3 != null) {
            $$3.a($$1.getString());
        }
        if (!$$2) {
            this.b(yk.a($$1));
        }
    }

    @Override
    public boolean y() {
        return this.k;
    }

    @Override
    public /* synthetic */ ef b(ea ea2) {
        return this.a(ea2);
    }
}

