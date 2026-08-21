/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jspecify.annotations.Nullable;

public class zq
implements yi {
    public static final Object[] a = new Object[0];
    private static final Codec<Object> c = bfm.b.validate(zq::b);
    private static final Codec<Object> d = Codec.either(c, yj.a).xmap($$02 -> $$02.map($$0 -> $$0, $$0 -> Objects.requireNonNullElse($$0.d(), $$0)), $$0 -> {
        Either either;
        if ($$0 instanceof yh) {
            yh $$1 = (yh)$$0;
            either = Either.right((Object)$$1);
        } else {
            either = Either.left((Object)$$0);
        }
        return either;
    });
    public static final MapCodec<zq> b = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.STRING.fieldOf("translate").forGetter($$0 -> $$0.g), (App)Codec.STRING.lenientOptionalFieldOf("fallback").forGetter($$0 -> Optional.ofNullable($$0.h)), (App)d.listOf().optionalFieldOf("with").forGetter($$0 -> zq.a($$0.i))).apply((Applicative)$$02, zq::a));
    private static final yn e = yn.e("%");
    private static final yn f = yn.e("null");
    private final String g;
    private final @Nullable String h;
    private final Object[] i;
    private @Nullable uu j;
    private List<yn> k = ImmutableList.of();
    private static final Pattern l = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");

    private static DataResult<Object> b(@Nullable Object $$0) {
        if (!zq.a($$0)) {
            return DataResult.error(() -> "This value needs to be parsed as component");
        }
        return DataResult.success((Object)$$0);
    }

    public static boolean a(@Nullable Object $$0) {
        return $$0 instanceof Number || $$0 instanceof Boolean || $$0 instanceof String;
    }

    private static Optional<List<Object>> a(Object[] $$0) {
        return $$0.length == 0 ? Optional.empty() : Optional.of(Arrays.asList($$0));
    }

    private static Object[] a(Optional<List<Object>> $$02) {
        return $$02.map($$0 -> $$0.isEmpty() ? a : $$0.toArray()).orElse(a);
    }

    private static zq a(String $$0, Optional<String> $$1, Optional<List<Object>> $$2) {
        return new zq($$0, $$1.orElse(null), zq.a($$2));
    }

    public zq(String $$0, @Nullable String $$1, Object[] $$2) {
        this.g = $$0;
        this.h = $$1;
        this.i = $$2;
    }

    public MapCodec<zq> a() {
        return b;
    }

    private void e() {
        uu $$0 = uu.a();
        if ($$0 == this.j) {
            return;
        }
        this.j = $$0;
        String $$1 = this.h != null ? $$0.a(this.g, this.h) : $$0.a(this.g);
        try {
            ImmutableList.Builder $$2 = ImmutableList.builder();
            this.a($$1, arg_0 -> ((ImmutableList.Builder)$$2).add(arg_0));
            this.k = $$2.build();
        }
        catch (zr $$3) {
            this.k = ImmutableList.of((Object)yn.e($$1));
        }
    }

    private void a(String $$0, Consumer<yn> $$1) {
        Matcher $$2 = l.matcher($$0);
        try {
            int $$3 = 0;
            int $$4 = 0;
            while ($$2.find($$4)) {
                int $$5 = $$2.start();
                int $$6 = $$2.end();
                if ($$5 > $$4) {
                    String $$7 = $$0.substring($$4, $$5);
                    if ($$7.indexOf(37) != -1) {
                        throw new IllegalArgumentException();
                    }
                    $$1.accept(yn.e($$7));
                }
                String $$8 = $$2.group(2);
                String $$9 = $$0.substring($$5, $$6);
                if ("%".equals($$8) && "%%".equals($$9)) {
                    $$1.accept(e);
                } else if ("s".equals($$8)) {
                    String $$10 = $$2.group(1);
                    int $$11 = $$10 != null ? Integer.parseInt($$10) - 1 : $$3++;
                    $$1.accept(this.a($$11));
                } else {
                    throw new zr(this, "Unsupported format: '" + $$9 + "'");
                }
                $$4 = $$6;
            }
            if ($$4 < $$0.length()) {
                String $$12 = $$0.substring($$4);
                if ($$12.indexOf(37) != -1) {
                    throw new IllegalArgumentException();
                }
                $$1.accept(yn.e($$12));
            }
        }
        catch (IllegalArgumentException $$13) {
            throw new zr(this, (Throwable)$$13);
        }
    }

    private yn a(int $$0) {
        if ($$0 < 0 || $$0 >= this.i.length) {
            throw new zr(this, $$0);
        }
        Object $$1 = this.i[$$0];
        if ($$1 instanceof yh) {
            yh $$2 = (yh)$$1;
            return $$2;
        }
        return $$1 == null ? f : yn.e($$1.toString());
    }

    @Override
    public <T> Optional<T> a(yn.b<T> $$0, zf $$1) {
        this.e();
        for (yn $$2 : this.k) {
            Optional<T> $$3 = $$2.a($$0, $$1);
            if (!$$3.isPresent()) continue;
            return $$3;
        }
        return Optional.empty();
    }

    @Override
    public <T> Optional<T> a(yn.a<T> $$0) {
        this.e();
        for (yn $$1 : this.k) {
            Optional<T> $$2 = $$1.a($$0);
            if (!$$2.isPresent()) continue;
            return $$2;
        }
        return Optional.empty();
    }

    @Override
    public yw a(@Nullable ed $$0, @Nullable cgk $$1, int $$2) throws CommandSyntaxException {
        Object[] $$3 = new Object[this.i.length];
        for (int $$4 = 0; $$4 < $$3.length; ++$$4) {
            Object $$5 = this.i[$$4];
            if ($$5 instanceof yh) {
                yh $$6 = (yh)$$5;
                $$3[$$4] = yk.a($$0, $$6, $$1, $$2);
                continue;
            }
            $$3[$$4] = $$5;
        }
        return yw.a(new zq(this.g, this.h, $$3));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof zq)) return false;
        zq $$1 = (zq)$$0;
        if (!Objects.equals(this.g, $$1.g)) return false;
        if (!Objects.equals(this.h, $$1.h)) return false;
        if (!Arrays.equals(this.i, $$1.i)) return false;
        return true;
    }

    public int hashCode() {
        int $$0 = Objects.hashCode(this.g);
        $$0 = 31 * $$0 + Objects.hashCode(this.h);
        $$0 = 31 * $$0 + Arrays.hashCode(this.i);
        return $$0;
    }

    public String toString() {
        return "translation{key='" + this.g + "'" + (String)(this.h != null ? ", fallback='" + this.h + "'" : "") + ", args=" + Arrays.toString(this.i) + "}";
    }

    public String b() {
        return this.g;
    }

    public @Nullable String c() {
        return this.h;
    }

    public Object[] d() {
        return this.i;
    }
}

