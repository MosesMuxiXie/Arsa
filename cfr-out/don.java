/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  org.apache.commons.lang3.function.TriConsumer
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import org.apache.commons.lang3.function.TriConsumer;
import org.jspecify.annotations.Nullable;

public final class don
extends Record {
    private final List<c> e;
    public static final don a = new don(List.of());
    public static final Codec<don> b = don$c.a.listOf().xmap(don::new, don::b);
    public static final aao<xq, don> c = aao.a(don$c.b.a(aam.a()), don::b, don::new);
    public static final DecimalFormat d = new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.ROOT));

    public don(List<c> $$0) {
        this.e = $$0;
    }

    public static a a() {
        return new a();
    }

    public don a(jd<cin> $$0, ciq $$1, cgw $$2) {
        ImmutableList.Builder $$3 = ImmutableList.builderWithExpectedSize((int)(this.e.size() + 1));
        for (c $$4 : this.e) {
            if ($$4.a($$0, $$1.a())) continue;
            $$3.add((Object)$$4);
        }
        $$3.add((Object)new c($$0, $$1, $$2));
        return new don((List<c>)$$3.build());
    }

    public void a(cgw $$0, TriConsumer<jd<cin>, ciq, b> $$1) {
        for (c $$2 : this.e) {
            if (!$$2.e.equals($$0)) continue;
            $$1.accept($$2.c, (Object)$$2.d, (Object)$$2.f);
        }
    }

    public void a(cgw $$0, BiConsumer<jd<cin>, ciq> $$1) {
        for (c $$2 : this.e) {
            if (!$$2.e.equals($$0)) continue;
            $$1.accept($$2.c, $$2.d);
        }
    }

    public void a(cgv $$0, BiConsumer<jd<cin>, ciq> $$1) {
        for (c $$2 : this.e) {
            if (!$$2.e.b($$0)) continue;
            $$1.accept($$2.c, $$2.d);
        }
    }

    public double a(jd<cin> $$0, double $$1, cgv $$2) {
        double $$3 = $$1;
        for (c $$4 : this.e) {
            if (!$$4.e.b($$2) || $$4.c != $$0) continue;
            double $$5 = $$4.d.b();
            $$3 += (switch ($$4.d.c()) {
                default -> throw new MatchException(null, null);
                case ciq.a.a -> $$5;
                case ciq.a.b -> $$5 * $$1;
                case ciq.a.c -> $$5 * $$3;
            });
        }
        return $$3;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{don.class, "modifiers", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{don.class, "modifiers", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{don.class, "modifiers", "e"}, this, $$0);
    }

    public List<c> b() {
        return this.e;
    }

    public static class a {
        private final ImmutableList.Builder<c> a = ImmutableList.builder();

        a() {
        }

        public a a(jd<cin> $$0, ciq $$1, cgw $$2) {
            this.a.add((Object)new c($$0, $$1, $$2));
            return this;
        }

        public a a(jd<cin> $$0, ciq $$1, cgw $$2, b $$3) {
            this.a.add((Object)new c($$0, $$1, $$2, $$3));
            return this;
        }

        public don a() {
            return new don((List<c>)this.a.build());
        }
    }

    public static final class c
    extends Record {
        final jd<cin> c;
        final ciq d;
        final cgw e;
        final b f;
        public static final Codec<c> a = RecordCodecBuilder.create($$0 -> $$0.group((App)cin.a.fieldOf("type").forGetter(c::a), (App)ciq.a.forGetter(c::b), (App)cgw.m.optionalFieldOf("slot", (Object)cgw.a).forGetter(c::c), (App)don$b.a.optionalFieldOf("display", (Object)b.a.c).forGetter(c::d)).apply((Applicative)$$0, c::new));
        public static final aao<xq, c> b = aao.a(cin.b, c::a, ciq.c, c::b, cgw.n, c::c, don$b.b, c::d, c::new);

        public c(jd<cin> $$0, ciq $$1, cgw $$2) {
            this($$0, $$1, $$2, don$b.a());
        }

        public c(jd<cin> $$0, ciq $$1, cgw $$2, b $$3) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
            this.f = $$3;
        }

        public boolean a(jd<cin> $$0, amo $$1) {
            return $$0.equals(this.c) && this.d.a($$1);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "attribute;modifier;slot;display", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "attribute;modifier;slot;display", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "attribute;modifier;slot;display", "c", "d", "e", "f"}, this, $$0);
        }

        public jd<cin> a() {
            return this.c;
        }

        public ciq b() {
            return this.d;
        }

        public cgw c() {
            return this.e;
        }

        public b d() {
            return this.f;
        }
    }

    public static interface don$b {
        public static final Codec<don$b> a = d.d.dispatch("type", don$b::c, $$0 -> $$0.i);
        public static final aao<xq, don$b> b = d.f.a().b(don$b::c, d::b);

        public static don$b a() {
            return a.c;
        }

        public static don$b b() {
            return b.c;
        }

        public static don$b a(yh $$0) {
            return new c($$0);
        }

        public d c();

        public void a(Consumer<yh> var1, @Nullable ddm var2, jd<cin> var3, ciq var4);

        public record a() implements don$b
        {
            static final a c = new a();
            static final MapCodec<a> d = MapCodec.unit((Object)c);
            static final aao<xq, a> e = aao.a(c);

            @Override
            public d c() {
                return don$b$d.a;
            }

            @Override
            public void a(Consumer<yh> $$0, @Nullable ddm $$1, jd<cin> $$2, ciq $$3) {
                double $$8;
                double $$4 = $$3.b();
                boolean $$5 = false;
                if ($$1 != null) {
                    if ($$3.a(dlp.h)) {
                        $$4 += $$1.j(cis.d);
                        $$5 = true;
                    } else if ($$3.a(dlp.i)) {
                        $$4 += $$1.j(cis.f);
                        $$5 = true;
                    }
                }
                if ($$3.c() == ciq.a.b || $$3.c() == ciq.a.c) {
                    double $$6 = $$4 * 100.0;
                } else if ($$2.a(cis.r)) {
                    double $$7 = $$4 * 10.0;
                } else {
                    $$8 = $$4;
                }
                if ($$5) {
                    $$0.accept(yg.a().b(yh.a("attribute.modifier.equals." + $$3.c().a(), new Object[]{d.format($$8), yh.c($$2.a().c())})).a(l.c));
                } else if ($$4 > 0.0) {
                    $$0.accept(yh.a("attribute.modifier.plus." + $$3.c().a(), new Object[]{d.format($$8), yh.c($$2.a().c())}).a($$2.a().b(true)));
                } else if ($$4 < 0.0) {
                    $$0.accept(yh.a("attribute.modifier.take." + $$3.c().a(), new Object[]{d.format(-$$8), yh.c($$2.a().c())}).a($$2.a().b(false)));
                }
            }
        }

        public record b() implements don$b
        {
            static final b c = new b();
            static final MapCodec<b> d = MapCodec.unit((Object)c);
            static final aao<xq, b> e = aao.a(c);

            @Override
            public d c() {
                return don$b$d.b;
            }

            @Override
            public void a(Consumer<yh> $$0, @Nullable ddm $$1, jd<cin> $$2, ciq $$3) {
            }
        }

        public record c(yh c) implements don$b
        {
            private final yh c;
            static final MapCodec<c> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)yj.a.fieldOf("value").forGetter(c::d)).apply((Applicative)$$0, c::new));
            static final aao<xq, c> e = aao.a(yj.b, c::d, c::new);

            @Override
            public d c() {
                return don$b$d.c;
            }

            @Override
            public void a(Consumer<yh> $$0, @Nullable ddm $$1, jd<cin> $$2, ciq $$3) {
                $$0.accept(this.c);
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "component", "c"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "component", "c"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "component", "c"}, this, $$0);
            }

            public yh d() {
                return this.c;
            }
        }

        public static final class d
        extends Enum<d>
        implements bhh {
            public static final /* enum */ d a = new d("default", 0, don$b$a.d, don$b$a.e);
            public static final /* enum */ d b = new d("hidden", 1, don$b$b.d, don$b$b.e);
            public static final /* enum */ d c = new d("override", 2, don$b$c.d, don$b$c.e);
            static final Codec<d> d;
            private static final IntFunction<d> e;
            static final aao<ByteBuf, d> f;
            private final String g;
            private final int h;
            final MapCodec<? extends don$b> i;
            private final aao<xq, ? extends don$b> j;
            private static final /* synthetic */ d[] k;

            public static d[] values() {
                return (d[])k.clone();
            }

            public static d valueOf(String $$0) {
                return Enum.valueOf(d.class, $$0);
            }

            private d(String $$0, int $$1, MapCodec<? extends don$b> $$2, aao<xq, ? extends don$b> $$3) {
                this.g = $$0;
                this.h = $$1;
                this.i = $$2;
                this.j = $$3;
            }

            @Override
            public String c() {
                return this.g;
            }

            private int a() {
                return this.h;
            }

            private aao<xq, ? extends don$b> b() {
                return this.j;
            }

            private static /* synthetic */ d[] d() {
                return new d[]{a, b, c};
            }

            static {
                k = don$b$d.d();
                d = bhh.a(d::values);
                e = beu.a(d::a, don$b$d.values(), beu.a.a);
                f = aam.a(e, d::a);
            }
        }
    }
}

