/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Doubles
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.primitives.Doubles;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class gw {
    public static final char a = '@';
    private static final char o = '[';
    private static final char p = ']';
    public static final char b = '=';
    private static final char q = ',';
    public static final char c = '!';
    public static final char d = '#';
    private static final char r = 'p';
    private static final char s = 'a';
    private static final char t = 'r';
    private static final char u = 's';
    private static final char v = 'e';
    private static final char w = 'n';
    public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)yh.c("argument.entity.invalid"));
    public static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> yh.b("argument.entity.selector.unknown", $$0));
    public static final SimpleCommandExceptionType g = new SimpleCommandExceptionType((Message)yh.c("argument.entity.selector.not_allowed"));
    public static final SimpleCommandExceptionType h = new SimpleCommandExceptionType((Message)yh.c("argument.entity.selector.missing"));
    public static final SimpleCommandExceptionType i = new SimpleCommandExceptionType((Message)yh.c("argument.entity.options.unterminated"));
    public static final DynamicCommandExceptionType j = new DynamicCommandExceptionType($$0 -> yh.b("argument.entity.options.valueless", $$0));
    public static final BiConsumer<ftm, List<? extends cgk>> k = ($$0, $$12) -> $$12.sort(($$1, $$2) -> Doubles.compare((double)$$1.g((ftm)$$0), (double)$$2.g((ftm)$$0)));
    public static final BiConsumer<ftm, List<? extends cgk>> l = ($$0, $$12) -> $$12.sort(($$1, $$2) -> Doubles.compare((double)$$2.g((ftm)$$0), (double)$$1.g((ftm)$$0)));
    public static final BiConsumer<ftm, List<? extends cgk>> m = ($$0, $$1) -> Collections.shuffle($$1);
    public static final BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> n = ($$0, $$1) -> $$0.buildFuture();
    private final StringReader x;
    private final boolean y;
    private int z;
    private boolean A;
    private boolean B;
    private @Nullable cq.b C;
    private @Nullable cq.d D;
    private @Nullable Double E;
    private @Nullable Double F;
    private @Nullable Double G;
    private @Nullable Double H;
    private @Nullable Double I;
    private @Nullable Double J;
    private @Nullable cq.c K;
    private @Nullable cq.c L;
    private final List<Predicate<cgk>> M = new ArrayList<Predicate<cgk>>();
    private BiConsumer<ftm, List<? extends cgk>> N = gv.b;
    private boolean O;
    private @Nullable String P;
    private int Q;
    private @Nullable UUID R;
    private BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> S = n;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private boolean aa;
    private @Nullable cgu<?> ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private boolean af;

    public gw(StringReader $$0, boolean $$1) {
        this.x = $$0;
        this.y = $$1;
    }

    public static <S> boolean a(S $$0) {
        bbo $$1;
        return $$0 instanceof bbo && ($$1 = (bbo)$$0).d().hasPermission(bbr.e);
    }

    @Deprecated
    public static boolean a(bbo $$0) {
        return $$0.d().hasPermission(bbr.e);
    }

    public gv a() {
        Function<ftm, ftm> $$5;
        fth $$3;
        if (this.H != null || this.I != null || this.J != null) {
            fth $$02 = this.a(this.H == null ? 0.0 : this.H, this.I == null ? 0.0 : this.I, this.J == null ? 0.0 : this.J);
        } else if (this.C != null && this.C.c().isPresent()) {
            double $$1 = (Double)this.C.c().get();
            fth $$2 = new fth(-$$1, -$$1, -$$1, $$1 + 1.0, $$1 + 1.0, $$1 + 1.0);
        } else {
            $$3 = null;
        }
        if (this.E == null && this.F == null && this.G == null) {
            Function<ftm, ftm> $$4 = $$0 -> $$0;
        } else {
            $$5 = $$0 -> new ftm(this.E == null ? $$0.g : this.E, this.F == null ? $$0.h : this.F, this.G == null ? $$0.i : this.G);
        }
        return new gv(this.z, this.A, this.B, List.copyOf(this.M), this.C, $$5, $$3, this.N, this.O, this.P, this.R, this.ab, this.af);
    }

    private fth a(double $$0, double $$1, double $$2) {
        boolean $$3 = $$0 < 0.0;
        boolean $$4 = $$1 < 0.0;
        boolean $$5 = $$2 < 0.0;
        double $$6 = $$3 ? $$0 : 0.0;
        double $$7 = $$4 ? $$1 : 0.0;
        double $$8 = $$5 ? $$2 : 0.0;
        double $$9 = ($$3 ? 0.0 : $$0) + 1.0;
        double $$10 = ($$4 ? 0.0 : $$1) + 1.0;
        double $$11 = ($$5 ? 0.0 : $$2) + 1.0;
        return new fth($$6, $$7, $$8, $$9, $$10, $$11);
    }

    private void I() {
        if (this.K != null) {
            this.M.add(this.a(this.K, cgk::ee));
        }
        if (this.L != null) {
            this.M.add(this.a(this.L, cgk::ec));
        }
        if (this.D != null) {
            this.M.add($$0 -> {
                if (!($$0 instanceof axg)) return false;
                axg $$1 = (axg)$$0;
                if (!this.D.d($$1.cs)) return false;
                return true;
            });
        }
    }

    private Predicate<cgk> a(cq.c $$0, bho<cgk> $$1) {
        float $$2 = bgj.f($$0.b().orElse(Float.valueOf(0.0f)).floatValue());
        float $$32 = bgj.f($$0.c().orElse(Float.valueOf(359.0f)).floatValue());
        return $$3 -> {
            float $$4 = bgj.f($$1.applyAsFloat((cgk)$$3));
            if ($$2 > $$32) {
                return $$4 >= $$2 || $$4 <= $$32;
            }
            return $$4 >= $$2 && $$4 <= $$32;
        };
    }

    /*
     * WARNING - void declaration
     */
    protected void b() throws CommandSyntaxException {
        void $$8;
        this.af = true;
        this.S = this::d;
        if (!this.x.canRead()) {
            throw h.createWithContext((ImmutableStringReader)this.x);
        }
        int $$0 = this.x.getCursor();
        char $$1 = this.x.read();
        switch ($$1) {
            case 'p': {
                this.z = 1;
                this.A = false;
                this.N = k;
                this.a(cgu.cb);
                boolean $$2 = false;
                break;
            }
            case 'a': {
                this.z = Integer.MAX_VALUE;
                this.A = false;
                this.N = gv.b;
                this.a(cgu.cb);
                boolean $$3 = false;
                break;
            }
            case 'r': {
                this.z = 1;
                this.A = false;
                this.N = m;
                this.a(cgu.cb);
                boolean $$4 = false;
                break;
            }
            case 's': {
                this.z = 1;
                this.A = true;
                this.O = true;
                boolean $$5 = false;
                break;
            }
            case 'e': {
                this.z = Integer.MAX_VALUE;
                this.A = true;
                this.N = gv.b;
                boolean $$6 = true;
                break;
            }
            case 'n': {
                this.z = 1;
                this.A = true;
                this.N = k;
                boolean $$7 = true;
                break;
            }
            default: {
                this.x.setCursor($$0);
                throw f.createWithContext((ImmutableStringReader)this.x, (Object)("@" + String.valueOf($$1)));
            }
        }
        if ($$8 != false) {
            this.M.add(cgk::cb);
        }
        this.S = this::e;
        if (this.x.canRead() && this.x.peek() == '[') {
            this.x.skip();
            this.S = this::f;
            this.d();
        }
    }

    protected void c() throws CommandSyntaxException {
        if (this.x.canRead()) {
            this.S = this::c;
        }
        int $$0 = this.x.getCursor();
        String $$1 = this.x.readString();
        try {
            this.R = UUID.fromString($$1);
            this.A = true;
        }
        catch (IllegalArgumentException $$2) {
            if ($$1.isEmpty() || $$1.length() > 16) {
                this.x.setCursor($$0);
                throw e.createWithContext((ImmutableStringReader)this.x);
            }
            this.A = false;
            this.P = $$1;
        }
        this.z = 1;
    }

    protected void d() throws CommandSyntaxException {
        this.S = this::g;
        this.x.skipWhitespace();
        while (this.x.canRead() && this.x.peek() != ']') {
            this.x.skipWhitespace();
            int $$0 = this.x.getCursor();
            String $$1 = this.x.readString();
            gy.a $$2 = gy.a(this, $$1, $$0);
            this.x.skipWhitespace();
            if (!this.x.canRead() || this.x.peek() != '=') {
                this.x.setCursor($$0);
                throw j.createWithContext((ImmutableStringReader)this.x, (Object)$$1);
            }
            this.x.skip();
            this.x.skipWhitespace();
            this.S = n;
            $$2.handle(this);
            this.x.skipWhitespace();
            this.S = this::h;
            if (!this.x.canRead()) continue;
            if (this.x.peek() == ',') {
                this.x.skip();
                this.S = this::g;
                continue;
            }
            if (this.x.peek() == ']') break;
            throw i.createWithContext((ImmutableStringReader)this.x);
        }
        if (!this.x.canRead()) {
            throw i.createWithContext((ImmutableStringReader)this.x);
        }
        this.x.skip();
        this.S = n;
    }

    public boolean e() {
        this.x.skipWhitespace();
        if (this.x.canRead() && this.x.peek() == '!') {
            this.x.skip();
            this.x.skipWhitespace();
            return true;
        }
        return false;
    }

    public boolean f() {
        this.x.skipWhitespace();
        if (this.x.canRead() && this.x.peek() == '#') {
            this.x.skip();
            this.x.skipWhitespace();
            return true;
        }
        return false;
    }

    public StringReader g() {
        return this.x;
    }

    public void a(Predicate<cgk> $$0) {
        this.M.add($$0);
    }

    public void h() {
        this.B = true;
    }

    public @Nullable cq.b i() {
        return this.C;
    }

    public void a(cq.b $$0) {
        this.C = $$0;
    }

    public @Nullable cq.d j() {
        return this.D;
    }

    public void a(cq.d $$0) {
        this.D = $$0;
    }

    public @Nullable cq.c k() {
        return this.K;
    }

    public void a(cq.c $$0) {
        this.K = $$0;
    }

    public @Nullable cq.c l() {
        return this.L;
    }

    public void b(cq.c $$0) {
        this.L = $$0;
    }

    public @Nullable Double m() {
        return this.E;
    }

    public @Nullable Double n() {
        return this.F;
    }

    public @Nullable Double o() {
        return this.G;
    }

    public void a(double $$0) {
        this.E = $$0;
    }

    public void b(double $$0) {
        this.F = $$0;
    }

    public void c(double $$0) {
        this.G = $$0;
    }

    public void d(double $$0) {
        this.H = $$0;
    }

    public void e(double $$0) {
        this.I = $$0;
    }

    public void f(double $$0) {
        this.J = $$0;
    }

    public @Nullable Double p() {
        return this.H;
    }

    public @Nullable Double q() {
        return this.I;
    }

    public @Nullable Double r() {
        return this.J;
    }

    public void a(int $$0) {
        this.z = $$0;
    }

    public void a(boolean $$0) {
        this.A = $$0;
    }

    public BiConsumer<ftm, List<? extends cgk>> s() {
        return this.N;
    }

    public void a(BiConsumer<ftm, List<? extends cgk>> $$0) {
        this.N = $$0;
    }

    public gv t() throws CommandSyntaxException {
        this.Q = this.x.getCursor();
        this.S = this::b;
        if (this.x.canRead() && this.x.peek() == '@') {
            if (!this.y) {
                throw g.createWithContext((ImmutableStringReader)this.x);
            }
            this.x.skip();
            this.b();
        } else {
            this.c();
        }
        this.I();
        return this.a();
    }

    private static void a(SuggestionsBuilder $$0) {
        $$0.suggest("@p", (Message)yh.c("argument.entity.selector.nearestPlayer"));
        $$0.suggest("@a", (Message)yh.c("argument.entity.selector.allPlayers"));
        $$0.suggest("@r", (Message)yh.c("argument.entity.selector.randomPlayer"));
        $$0.suggest("@s", (Message)yh.c("argument.entity.selector.self"));
        $$0.suggest("@e", (Message)yh.c("argument.entity.selector.allEntities"));
        $$0.suggest("@n", (Message)yh.c("argument.entity.selector.nearestEntity"));
    }

    private CompletableFuture<Suggestions> b(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
        $$1.accept($$0);
        if (this.y) {
            gw.a($$0);
        }
        return $$0.buildFuture();
    }

    private CompletableFuture<Suggestions> c(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
        SuggestionsBuilder $$2 = $$0.createOffset(this.Q);
        $$1.accept($$2);
        return $$0.add($$2).buildFuture();
    }

    private CompletableFuture<Suggestions> d(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
        SuggestionsBuilder $$2 = $$0.createOffset($$0.getStart() - 1);
        gw.a($$2);
        $$0.add($$2);
        return $$0.buildFuture();
    }

    private CompletableFuture<Suggestions> e(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
        $$0.suggest(String.valueOf('['));
        return $$0.buildFuture();
    }

    private CompletableFuture<Suggestions> f(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
        $$0.suggest(String.valueOf(']'));
        gy.a(this, $$0);
        return $$0.buildFuture();
    }

    private CompletableFuture<Suggestions> g(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
        gy.a(this, $$0);
        return $$0.buildFuture();
    }

    private CompletableFuture<Suggestions> h(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
        $$0.suggest(String.valueOf(','));
        $$0.suggest(String.valueOf(']'));
        return $$0.buildFuture();
    }

    private CompletableFuture<Suggestions> i(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
        $$0.suggest(String.valueOf('='));
        return $$0.buildFuture();
    }

    public boolean u() {
        return this.O;
    }

    public void a(BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> $$0) {
        this.S = $$0;
    }

    public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
        return this.S.apply($$0.createOffset(this.x.getCursor()), $$1);
    }

    public boolean v() {
        return this.T;
    }

    public void b(boolean $$0) {
        this.T = $$0;
    }

    public boolean w() {
        return this.U;
    }

    public void c(boolean $$0) {
        this.U = $$0;
    }

    public boolean x() {
        return this.V;
    }

    public void d(boolean $$0) {
        this.V = $$0;
    }

    public boolean y() {
        return this.W;
    }

    public void e(boolean $$0) {
        this.W = $$0;
    }

    public boolean z() {
        return this.X;
    }

    public void f(boolean $$0) {
        this.X = $$0;
    }

    public boolean A() {
        return this.Y;
    }

    public void g(boolean $$0) {
        this.Y = $$0;
    }

    public boolean B() {
        return this.Z;
    }

    public void h(boolean $$0) {
        this.Z = $$0;
    }

    public boolean C() {
        return this.aa;
    }

    public void i(boolean $$0) {
        this.aa = $$0;
    }

    public void a(cgu<?> $$0) {
        this.ab = $$0;
    }

    public void D() {
        this.ac = true;
    }

    public boolean E() {
        return this.ab != null;
    }

    public boolean F() {
        return this.ac;
    }

    public boolean G() {
        return this.ad;
    }

    public void j(boolean $$0) {
        this.ad = $$0;
    }

    public boolean H() {
        return this.ae;
    }

    public void k(boolean $$0) {
        this.ae = $$0;
    }
}

