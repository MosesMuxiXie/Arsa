/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public final class zf {
    public static final zf a = new zf(null, null, null, null, null, null, null, null, null, null, null);
    public static final int b = 0;
    final @Nullable zh c;
    final @Nullable Integer d;
    final @Nullable Boolean e;
    final @Nullable Boolean f;
    final @Nullable Boolean g;
    final @Nullable Boolean h;
    final @Nullable Boolean i;
    final @Nullable yf j;
    final @Nullable yo k;
    final @Nullable String l;
    final @Nullable ym m;

    private static zf a(Optional<zh> $$0, Optional<Integer> $$1, Optional<Boolean> $$2, Optional<Boolean> $$3, Optional<Boolean> $$4, Optional<Boolean> $$5, Optional<Boolean> $$6, Optional<yf> $$7, Optional<yo> $$8, Optional<String> $$9, Optional<ym> $$10) {
        zf $$11 = new zf($$0.orElse(null), $$1.orElse(null), $$2.orElse(null), $$3.orElse(null), $$4.orElse(null), $$5.orElse(null), $$6.orElse(null), $$7.orElse(null), $$8.orElse(null), $$9.orElse(null), $$10.orElse(null));
        if ($$11.equals(a)) {
            return a;
        }
        return $$11;
    }

    private zf(@Nullable zh $$0, @Nullable Integer $$1, @Nullable Boolean $$2, @Nullable Boolean $$3, @Nullable Boolean $$4, @Nullable Boolean $$5, @Nullable Boolean $$6, @Nullable yf $$7, @Nullable yo $$8, @Nullable String $$9, @Nullable ym $$10) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
        this.h = $$5;
        this.i = $$6;
        this.j = $$7;
        this.k = $$8;
        this.l = $$9;
        this.m = $$10;
    }

    public @Nullable zh a() {
        return this.c;
    }

    public @Nullable Integer b() {
        return this.d;
    }

    public boolean c() {
        return this.e == Boolean.TRUE;
    }

    public boolean d() {
        return this.f == Boolean.TRUE;
    }

    public boolean e() {
        return this.h == Boolean.TRUE;
    }

    public boolean f() {
        return this.g == Boolean.TRUE;
    }

    public boolean g() {
        return this.i == Boolean.TRUE;
    }

    public boolean h() {
        return this == a;
    }

    public @Nullable yf i() {
        return this.j;
    }

    public @Nullable yo j() {
        return this.k;
    }

    public @Nullable String k() {
        return this.l;
    }

    public ym l() {
        return this.m != null ? this.m : ym.b;
    }

    private static <T> zf a(zf $$0, @Nullable T $$1, @Nullable T $$2) {
        if ($$1 != null && $$2 == null && $$0.equals(a)) {
            return a;
        }
        return $$0;
    }

    public zf a(@Nullable zh $$0) {
        if (Objects.equals(this.c, $$0)) {
            return this;
        }
        return zf.a(new zf($$0, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m), this.c, $$0);
    }

    public zf a(@Nullable l $$0) {
        return this.a($$0 != null ? zh.a($$0) : null);
    }

    public zf a(int $$0) {
        return this.a(zh.a($$0));
    }

    public zf b(int $$0) {
        if (Objects.equals(this.d, $$0)) {
            return this;
        }
        return zf.a(new zf(this.c, $$0, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m), this.d, $$0);
    }

    public zf m() {
        return this.b(0);
    }

    public zf a(@Nullable Boolean $$0) {
        if (Objects.equals(this.e, $$0)) {
            return this;
        }
        return zf.a(new zf(this.c, this.d, $$0, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m), this.e, $$0);
    }

    public zf b(@Nullable Boolean $$0) {
        if (Objects.equals(this.f, $$0)) {
            return this;
        }
        return zf.a(new zf(this.c, this.d, this.e, $$0, this.g, this.h, this.i, this.j, this.k, this.l, this.m), this.f, $$0);
    }

    public zf c(@Nullable Boolean $$0) {
        if (Objects.equals(this.g, $$0)) {
            return this;
        }
        return zf.a(new zf(this.c, this.d, this.e, this.f, $$0, this.h, this.i, this.j, this.k, this.l, this.m), this.g, $$0);
    }

    public zf d(@Nullable Boolean $$0) {
        if (Objects.equals(this.h, $$0)) {
            return this;
        }
        return zf.a(new zf(this.c, this.d, this.e, this.f, this.g, $$0, this.i, this.j, this.k, this.l, this.m), this.h, $$0);
    }

    public zf e(@Nullable Boolean $$0) {
        if (Objects.equals(this.i, $$0)) {
            return this;
        }
        return zf.a(new zf(this.c, this.d, this.e, this.f, this.g, this.h, $$0, this.j, this.k, this.l, this.m), this.i, $$0);
    }

    public zf a(@Nullable yf $$0) {
        if (Objects.equals(this.j, $$0)) {
            return this;
        }
        return zf.a(new zf(this.c, this.d, this.e, this.f, this.g, this.h, this.i, $$0, this.k, this.l, this.m), this.j, $$0);
    }

    public zf a(@Nullable yo $$0) {
        if (Objects.equals(this.k, $$0)) {
            return this;
        }
        return zf.a(new zf(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, $$0, this.l, this.m), this.k, $$0);
    }

    public zf a(@Nullable String $$0) {
        if (Objects.equals(this.l, $$0)) {
            return this;
        }
        return zf.a(new zf(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, $$0, this.m), this.l, $$0);
    }

    public zf a(@Nullable ym $$0) {
        if (Objects.equals(this.m, $$0)) {
            return this;
        }
        return zf.a(new zf(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, $$0), this.m, $$0);
    }

    public zf b(l $$0) {
        zh $$1 = this.c;
        Boolean $$2 = this.e;
        Boolean $$3 = this.f;
        Boolean $$4 = this.h;
        Boolean $$5 = this.g;
        Boolean $$6 = this.i;
        switch ($$0) {
            case q: {
                $$6 = true;
                break;
            }
            case r: {
                $$2 = true;
                break;
            }
            case s: {
                $$4 = true;
                break;
            }
            case t: {
                $$5 = true;
                break;
            }
            case u: {
                $$3 = true;
                break;
            }
            case v: {
                return a;
            }
            default: {
                $$1 = zh.a($$0);
            }
        }
        return new zf($$1, this.d, $$2, $$3, $$5, $$4, $$6, this.j, this.k, this.l, this.m);
    }

    public zf c(l $$0) {
        zh $$1 = this.c;
        Boolean $$2 = this.e;
        Boolean $$3 = this.f;
        Boolean $$4 = this.h;
        Boolean $$5 = this.g;
        Boolean $$6 = this.i;
        switch ($$0) {
            case q: {
                $$6 = true;
                break;
            }
            case r: {
                $$2 = true;
                break;
            }
            case s: {
                $$4 = true;
                break;
            }
            case t: {
                $$5 = true;
                break;
            }
            case u: {
                $$3 = true;
                break;
            }
            case v: {
                return a;
            }
            default: {
                $$6 = false;
                $$2 = false;
                $$4 = false;
                $$5 = false;
                $$3 = false;
                $$1 = zh.a($$0);
            }
        }
        return new zf($$1, this.d, $$2, $$3, $$5, $$4, $$6, this.j, this.k, this.l, this.m);
    }

    public zf a(l ... $$0) {
        zh $$1 = this.c;
        Boolean $$2 = this.e;
        Boolean $$3 = this.f;
        Boolean $$4 = this.h;
        Boolean $$5 = this.g;
        Boolean $$6 = this.i;
        block8: for (l $$7 : $$0) {
            switch ($$7) {
                case q: {
                    $$6 = true;
                    continue block8;
                }
                case r: {
                    $$2 = true;
                    continue block8;
                }
                case s: {
                    $$4 = true;
                    continue block8;
                }
                case t: {
                    $$5 = true;
                    continue block8;
                }
                case u: {
                    $$3 = true;
                    continue block8;
                }
                case v: {
                    return a;
                }
                default: {
                    $$1 = zh.a($$7);
                }
            }
        }
        return new zf($$1, this.d, $$2, $$3, $$5, $$4, $$6, this.j, this.k, this.l, this.m);
    }

    public zf a(zf $$0) {
        if (this == a) {
            return $$0;
        }
        if ($$0 == a) {
            return this;
        }
        return new zf(this.c != null ? this.c : $$0.c, this.d != null ? this.d : $$0.d, this.e != null ? this.e : $$0.e, this.f != null ? this.f : $$0.f, this.g != null ? this.g : $$0.g, this.h != null ? this.h : $$0.h, this.i != null ? this.i : $$0.i, this.j != null ? this.j : $$0.j, this.k != null ? this.k : $$0.k, this.l != null ? this.l : $$0.l, this.m != null ? this.m : $$0.m);
    }

    public String toString() {
        final StringBuilder $$0 = new StringBuilder("{");
        class A {
            private boolean b;

            A() {
            }

            private void a() {
                if (this.b) {
                    $$0.append(',');
                }
                this.b = true;
            }

            void a(String $$02, @Nullable Boolean $$1) {
                if ($$1 != null) {
                    this.a();
                    if (!$$1.booleanValue()) {
                        $$0.append('!');
                    }
                    $$0.append($$02);
                }
            }

            void a(String $$02, @Nullable Object $$1) {
                if ($$1 != null) {
                    this.a();
                    $$0.append($$02);
                    $$0.append('=');
                    $$0.append($$1);
                }
            }
        }
        A $$1 = new A();
        $$1.a("color", this.c);
        $$1.a("shadowColor", this.d);
        $$1.a("bold", this.e);
        $$1.a("italic", this.f);
        $$1.a("underlined", this.g);
        $$1.a("strikethrough", this.h);
        $$1.a("obfuscated", this.i);
        $$1.a("clickEvent", this.j);
        $$1.a("hoverEvent", this.k);
        $$1.a("insertion", this.l);
        $$1.a("font", this.m);
        $$0.append("}");
        return $$0.toString();
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof zf) {
            zf $$1 = (zf)$$0;
            return this.e == $$1.e && Objects.equals(this.a(), $$1.a()) && Objects.equals(this.b(), $$1.b()) && this.f == $$1.f && this.i == $$1.i && this.h == $$1.h && this.g == $$1.g && Objects.equals(this.j, $$1.j) && Objects.equals(this.k, $$1.k) && Objects.equals(this.l, $$1.l) && Objects.equals(this.m, $$1.m);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }

    public static class b {
        public static final MapCodec<zf> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)zh.a.optionalFieldOf("color").forGetter($$0 -> Optional.ofNullable($$0.c)), (App)bfm.m.optionalFieldOf("shadow_color").forGetter($$0 -> Optional.ofNullable($$0.d)), (App)Codec.BOOL.optionalFieldOf("bold").forGetter($$0 -> Optional.ofNullable($$0.e)), (App)Codec.BOOL.optionalFieldOf("italic").forGetter($$0 -> Optional.ofNullable($$0.f)), (App)Codec.BOOL.optionalFieldOf("underlined").forGetter($$0 -> Optional.ofNullable($$0.g)), (App)Codec.BOOL.optionalFieldOf("strikethrough").forGetter($$0 -> Optional.ofNullable($$0.h)), (App)Codec.BOOL.optionalFieldOf("obfuscated").forGetter($$0 -> Optional.ofNullable($$0.i)), (App)yf.a.optionalFieldOf("click_event").forGetter($$0 -> Optional.ofNullable($$0.j)), (App)yo.a.optionalFieldOf("hover_event").forGetter($$0 -> Optional.ofNullable($$0.k)), (App)Codec.STRING.optionalFieldOf("insertion").forGetter($$0 -> Optional.ofNullable($$0.l)), (App)ym.a.optionalFieldOf("font").forGetter($$0 -> Optional.ofNullable($$0.m))).apply((Applicative)$$02, zf::a));
        public static final Codec<zf> b = a.codec();
        public static final aao<xq, zf> c = aam.c(b);
    }
}

