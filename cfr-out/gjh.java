/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.context.CommandContextBuilder
 *  com.mojang.brigadier.context.ParsedArgument
 *  com.mojang.brigadier.context.SuggestionContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.Suggestion
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.context.ParsedArgument;
import com.mojang.brigadier.context.SuggestionContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class gjh {
    private static final Pattern a = Pattern.compile("(\\s+)");
    private static final zf b = zf.a.a(l.m);
    private static final zf c = zf.a.a(l.h);
    private static final List<zf> d = (List)Stream.of(l.l, l.o, l.k, l.n, l.g).map(zf.a::a).collect(ImmutableList.toImmutableList());
    final gfj e;
    private final gsb f;
    final gjn g;
    final gio h;
    private final boolean i;
    private final boolean j;
    final int k;
    final int l;
    final boolean m;
    final int n;
    private final List<bfr> o = Lists.newArrayList();
    private int p;
    private int q;
    private @Nullable ParseResults<hij> r;
    private @Nullable CompletableFuture<Suggestions> s;
    private @Nullable a t;
    private boolean u;
    boolean v;
    private boolean w = true;

    public gjh(gfj $$0, gsb $$1, gjn $$2, gio $$3, boolean $$4, boolean $$5, int $$6, int $$7, boolean $$8, int $$9) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
        this.i = $$4;
        this.j = $$5;
        this.k = $$6;
        this.l = $$7;
        this.m = $$8;
        this.n = $$9;
        $$2.a(this::a);
    }

    public void a(boolean $$0) {
        this.u = $$0;
        if (!$$0) {
            this.t = null;
        }
    }

    public void b(boolean $$0) {
        this.w = $$0;
    }

    public boolean a(gzb $$0) {
        boolean $$1;
        boolean bl2 = $$1 = this.t != null;
        if ($$1 && this.t.a($$0)) {
            return true;
        }
        if (this.f.aO_() == this.g && $$0.j() && (!this.w || $$1)) {
            this.c(true);
            return true;
        }
        return false;
    }

    public boolean a(double $$0) {
        return this.t != null && this.t.a(bgj.a($$0, -1.0, 1.0));
    }

    public boolean a(gzc $$0) {
        return this.t != null && this.t.a((int)$$0.u(), (int)$$0.v());
    }

    public void c(boolean $$0) {
        Suggestions $$1;
        if (this.s != null && this.s.isDone() && !($$1 = this.s.join()).isEmpty()) {
            int $$2 = 0;
            for (Suggestion $$3 : $$1.getList()) {
                $$2 = Math.max($$2, this.h.b($$3.getText()));
            }
            int $$4 = bgj.a(this.g.o($$1.getRange().getStart()), 0, this.g.o(0) + this.g.i() - $$2);
            int $$5 = this.m ? this.f.p - 12 : 72;
            this.t = new a($$4, $$5, $$2, this.a($$1), $$0);
        }
    }

    public boolean a() {
        return this.t != null;
    }

    public yh b() {
        if (this.t != null && this.t.h) {
            if (this.w) {
                return yh.c("narration.suggestion.usage.cycle.hidable");
            }
            return yh.c("narration.suggestion.usage.cycle.fixed");
        }
        if (this.w) {
            return yh.c("narration.suggestion.usage.fill.hidable");
        }
        return yh.c("narration.suggestion.usage.fill.fixed");
    }

    public void c() {
        this.t = null;
    }

    private List<Suggestion> a(Suggestions $$0) {
        String $$1 = this.g.a().substring(0, this.g.e());
        int $$2 = gjh.a($$1);
        String $$3 = $$1.substring($$2).toLowerCase(Locale.ROOT);
        ArrayList $$4 = Lists.newArrayList();
        ArrayList $$5 = Lists.newArrayList();
        for (Suggestion $$6 : $$0.getList()) {
            if ($$6.getText().startsWith($$3) || $$6.getText().startsWith("minecraft:" + $$3)) {
                $$4.add($$6);
                continue;
            }
            $$5.add($$6);
        }
        $$4.addAll($$5);
        return $$4;
    }

    public void d() {
        boolean $$2;
        String $$0 = this.g.a();
        if (this.r != null && !this.r.getReader().getString().equals($$0)) {
            this.r = null;
        }
        if (!this.v) {
            this.g.c((String)null);
            this.t = null;
        }
        this.o.clear();
        StringReader $$1 = new StringReader($$0);
        boolean bl2 = $$2 = $$1.canRead() && $$1.peek() == '/';
        if ($$2) {
            $$1.skip();
        }
        boolean $$3 = this.i || $$2;
        int $$4 = this.g.e();
        if ($$3) {
            int $$6;
            CommandDispatcher<hij> $$5 = this.e.s.b.t();
            if (this.r == null) {
                this.r = $$5.parse($$1, (Object)this.e.s.b.i());
            }
            int n2 = $$6 = this.j ? $$1.getCursor() : 1;
            if (!($$4 < $$6 || this.t != null && this.v)) {
                this.s = $$5.getCompletionSuggestions(this.r, $$4);
                this.s.thenRun(() -> {
                    if (!this.s.isDone()) {
                        return;
                    }
                    this.f();
                });
            }
        } else {
            String $$7 = $$0.substring(0, $$4);
            int $$8 = gjh.a($$7);
            Collection<String> $$9 = this.e.s.b.i().z();
            this.s = ei.b($$9, new SuggestionsBuilder($$7, $$8));
        }
    }

    private static int a(String $$0) {
        if (Strings.isNullOrEmpty((String)$$0)) {
            return 0;
        }
        int $$1 = 0;
        Matcher $$2 = a.matcher($$0);
        while ($$2.find()) {
            $$1 = $$2.end();
        }
        return $$1;
    }

    private static bfr a(CommandSyntaxException $$0) {
        yh $$1 = yk.a($$0.getRawMessage());
        String $$2 = $$0.getContext();
        if ($$2 == null) {
            return $$1.g();
        }
        return yh.a("command.context.parse_error", $$1, $$0.getCursor(), $$2).g();
    }

    private void f() {
        boolean $$0 = false;
        if (this.g.e() == this.g.a().length()) {
            if (this.s.join().isEmpty() && !this.r.getExceptions().isEmpty()) {
                int $$1 = 0;
                for (Map.Entry $$2 : this.r.getExceptions().entrySet()) {
                    CommandSyntaxException $$3 = (CommandSyntaxException)$$2.getValue();
                    if ($$3.getType() == CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect()) {
                        ++$$1;
                        continue;
                    }
                    this.o.add(gjh.a($$3));
                }
                if ($$1 > 0) {
                    this.o.add(gjh.a(CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownArgument().createWithContext(this.r.getReader())));
                }
            } else if (this.r.getReader().canRead()) {
                $$0 = true;
            }
        }
        this.p = 0;
        this.q = this.f.o;
        if (this.o.isEmpty() && !this.a(l.h) && $$0) {
            this.o.add(gjh.a(ee.b(this.r)));
        }
        this.t = null;
        if (this.u && this.e.k.W().b().booleanValue()) {
            this.c(false);
        }
    }

    private boolean a(l $$0) {
        CommandContextBuilder $$1 = this.r.getContext();
        SuggestionContext $$2 = $$1.findSuggestionContext(this.g.e());
        Map $$3 = this.e.s.b.t().getSmartUsage($$2.parent, (Object)this.e.s.b.i());
        ArrayList $$4 = Lists.newArrayList();
        int $$5 = 0;
        zf $$6 = zf.a.a($$0);
        for (Map.Entry $$7 : $$3.entrySet()) {
            if ($$7.getKey() instanceof LiteralCommandNode) continue;
            $$4.add(bfr.forward((String)$$7.getValue(), $$6));
            $$5 = Math.max($$5, this.h.b((String)$$7.getValue()));
        }
        if (!$$4.isEmpty()) {
            this.o.addAll($$4);
            this.p = bgj.a(this.g.o($$2.startPos), 0, this.g.o(0) + this.g.i() - $$5);
            this.q = $$5;
            return true;
        }
        return false;
    }

    private @Nullable bfr a(String $$0, int $$1) {
        if (this.r != null) {
            return gjh.a(this.r, $$0, $$1);
        }
        return null;
    }

    static @Nullable String a(String $$0, String $$1) {
        if ($$1.startsWith($$0)) {
            return $$1.substring($$0.length());
        }
        return null;
    }

    private static bfr a(ParseResults<hij> $$0, String $$1, int $$2) {
        int $$10;
        ArrayList $$3 = Lists.newArrayList();
        int $$4 = 0;
        int $$5 = -1;
        CommandContextBuilder $$6 = $$0.getContext().getLastChild();
        for (ParsedArgument $$7 : $$6.getArguments().values()) {
            int $$8;
            if (++$$5 >= d.size()) {
                $$5 = 0;
            }
            if (($$8 = Math.max($$7.getRange().getStart() - $$2, 0)) >= $$1.length()) break;
            int $$9 = Math.min($$7.getRange().getEnd() - $$2, $$1.length());
            if ($$9 <= 0) continue;
            $$3.add(bfr.forward($$1.substring($$4, $$8), c));
            $$3.add(bfr.forward($$1.substring($$8, $$9), d.get($$5)));
            $$4 = $$9;
        }
        if ($$0.getReader().canRead() && ($$10 = Math.max($$0.getReader().getCursor() - $$2, 0)) < $$1.length()) {
            int $$11 = Math.min($$10 + $$0.getReader().getRemainingLength(), $$1.length());
            $$3.add(bfr.forward($$1.substring($$4, $$10), c));
            $$3.add(bfr.forward($$1.substring($$10, $$11), b));
            $$4 = $$11;
        }
        $$3.add(bfr.forward($$1.substring($$4), c));
        return bfr.composite($$3);
    }

    public void a(gir $$0, int $$1, int $$2) {
        if (!this.b($$0, $$1, $$2)) {
            this.a($$0);
        }
    }

    public boolean b(gir $$0, int $$1, int $$2) {
        if (this.t != null) {
            this.t.a($$0, $$1, $$2);
            return true;
        }
        return false;
    }

    public void a(gir $$0) {
        int $$1 = 0;
        for (bfr $$2 : this.o) {
            int $$3 = this.m ? this.f.p - 14 - 13 - 12 * $$1 : 72 + 12 * $$1;
            $$0.a(this.p - 1, $$3, this.p + this.q + 1, $$3 + 12, this.n);
            $$0.b(this.h, $$2, this.p, $$3 + 2, -1);
            ++$$1;
        }
    }

    public yh e() {
        if (this.t != null) {
            return yg.u.f().b(this.t.b());
        }
        return yg.a;
    }

    public class a {
        private final hoy b;
        private final String c;
        private final List<Suggestion> d;
        private int e;
        private int f;
        private ftl g = ftl.a;
        boolean h;
        private int i;

        a(int $$1, int $$2, int $$3, List<Suggestion> $$4, boolean $$5) {
            int $$6 = $$1 - (gjh.this.g.h() ? 0 : 1);
            int $$7 = gjh.this.m ? $$2 - 3 - Math.min($$4.size(), gjh.this.l) * 12 : $$2 - (gjh.this.g.h() ? 1 : 0);
            this.b = new hoy($$6, $$7, $$3 + 1, Math.min($$4.size(), gjh.this.l) * 12);
            this.c = gjh.this.g.a();
            this.i = $$5 ? -1 : 0;
            this.d = $$4;
            this.b(0);
        }

        public void a(gir $$0, int $$1, int $$2) {
            Message $$14;
            boolean $$8;
            int $$3 = Math.min(this.d.size(), gjh.this.l);
            int $$4 = -5592406;
            boolean $$5 = this.e > 0;
            boolean $$6 = this.d.size() > this.e + $$3;
            boolean $$7 = $$5 || $$6;
            boolean bl2 = $$8 = this.g.j != (float)$$1 || this.g.k != (float)$$2;
            if ($$8) {
                this.g = new ftl($$1, $$2);
            }
            if ($$7) {
                $$0.a(this.b.a(), this.b.b() - 1, this.b.a() + this.b.c(), this.b.b(), gjh.this.n);
                $$0.a(this.b.a(), this.b.b() + this.b.d(), this.b.a() + this.b.c(), this.b.b() + this.b.d() + 1, gjh.this.n);
                if ($$5) {
                    for (int $$9 = 0; $$9 < this.b.c(); ++$$9) {
                        if ($$9 % 2 != 0) continue;
                        $$0.a(this.b.a() + $$9, this.b.b() - 1, this.b.a() + $$9 + 1, this.b.b(), -1);
                    }
                }
                if ($$6) {
                    for (int $$10 = 0; $$10 < this.b.c(); ++$$10) {
                        if ($$10 % 2 != 0) continue;
                        $$0.a(this.b.a() + $$10, this.b.b() + this.b.d(), this.b.a() + $$10 + 1, this.b.b() + this.b.d() + 1, -1);
                    }
                }
            }
            boolean $$11 = false;
            for (int $$12 = 0; $$12 < $$3; ++$$12) {
                Suggestion $$13 = this.d.get($$12 + this.e);
                $$0.a(this.b.a(), this.b.b() + 12 * $$12, this.b.a() + this.b.c(), this.b.b() + 12 * $$12 + 12, gjh.this.n);
                if ($$1 > this.b.a() && $$1 < this.b.a() + this.b.c() && $$2 > this.b.b() + 12 * $$12 && $$2 < this.b.b() + 12 * $$12 + 12) {
                    if ($$8) {
                        this.b($$12 + this.e);
                    }
                    $$11 = true;
                }
                $$0.b(gjh.this.h, $$13.getText(), this.b.a() + 1, this.b.b() + 2 + 12 * $$12, $$12 + this.e == this.f ? -256 : -5592406);
            }
            if ($$11 && ($$14 = this.d.get(this.f).getTooltip()) != null) {
                $$0.a(gjh.this.h, yk.a($$14), $$1, $$2);
            }
            if (this.b.b($$1, $$2)) {
                $$0.a(fyn.d);
            }
        }

        public boolean a(int $$0, int $$1) {
            if (!this.b.b($$0, $$1)) {
                return false;
            }
            int $$2 = ($$1 - this.b.b()) / 12 + this.e;
            if ($$2 >= 0 && $$2 < this.d.size()) {
                this.b($$2);
                this.a();
            }
            return true;
        }

        public boolean a(double $$0) {
            int $$2;
            int $$1 = (int)gjh.this.e.n.b(gjh.this.e.aR());
            if (this.b.b($$1, $$2 = (int)gjh.this.e.n.c(gjh.this.e.aR()))) {
                this.e = bgj.a((int)((double)this.e - $$0), 0, Math.max(this.d.size() - gjh.this.l, 0));
                return true;
            }
            return false;
        }

        public boolean a(gzb $$0) {
            if ($$0.h()) {
                this.a(-1);
                this.h = false;
                return true;
            }
            if ($$0.i()) {
                this.a(1);
                this.h = false;
                return true;
            }
            if ($$0.j()) {
                if (this.h) {
                    this.a($$0.m() ? -1 : 1);
                }
                this.a();
                return true;
            }
            if ($$0.e()) {
                gjh.this.c();
                gjh.this.g.c((String)null);
                return true;
            }
            return false;
        }

        public void a(int $$0) {
            this.b(this.f + $$0);
            int $$1 = this.e;
            int $$2 = this.e + gjh.this.l - 1;
            if (this.f < $$1) {
                this.e = bgj.a(this.f, 0, Math.max(this.d.size() - gjh.this.l, 0));
            } else if (this.f > $$2) {
                this.e = bgj.a(this.f + gjh.this.k - gjh.this.l, 0, Math.max(this.d.size() - gjh.this.l, 0));
            }
        }

        public void b(int $$0) {
            this.f = $$0;
            if (this.f < 0) {
                this.f += this.d.size();
            }
            if (this.f >= this.d.size()) {
                this.f -= this.d.size();
            }
            Suggestion $$1 = this.d.get(this.f);
            gjh.this.g.c(gjh.a(gjh.this.g.a(), $$1.apply(this.c)));
            if (this.i != this.f) {
                gjh.this.e.aZ().d(this.b());
            }
        }

        public void a() {
            Suggestion $$0 = this.d.get(this.f);
            gjh.this.v = true;
            gjh.this.g.a($$0.apply(this.c));
            int $$1 = $$0.getRange().getStart() + $$0.getText().length();
            gjh.this.g.j($$1);
            gjh.this.g.n($$1);
            this.b(this.f);
            gjh.this.v = false;
            this.h = true;
        }

        yh b() {
            this.i = this.f;
            Suggestion $$0 = this.d.get(this.f);
            Message $$1 = $$0.getTooltip();
            if ($$1 != null) {
                return yh.a("narration.suggestion.tooltip", this.f + 1, this.d.size(), $$0.getText(), yh.a($$1));
            }
            return yh.a("narration.suggestion", this.f + 1, this.d.size(), $$0.getText());
        }
    }
}

