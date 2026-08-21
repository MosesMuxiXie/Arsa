/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class zl
implements yi {
    private static final Logger c = LogUtils.getLogger();
    public static final MapCodec<zl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.STRING.fieldOf("nbt").forGetter(zl::b), (App)Codec.BOOL.lenientOptionalFieldOf("interpret", (Object)false).forGetter(zl::c), (App)yj.a.lenientOptionalFieldOf("separator").forGetter(zl::d), (App)zu.a.forGetter(zl::e)).apply((Applicative)$$0, zl::new));
    private final boolean d;
    private final Optional<yh> e;
    private final String f;
    private final zt g;
    protected final @Nullable ex.g b;

    public zl(String $$0, boolean $$1, Optional<yh> $$2, zt $$3) {
        this($$0, zl.a($$0), $$1, $$2, $$3);
    }

    private zl(String $$0, @Nullable ex.g $$1, boolean $$2, Optional<yh> $$3, zt $$4) {
        this.f = $$0;
        this.b = $$1;
        this.d = $$2;
        this.e = $$3;
        this.g = $$4;
    }

    private static @Nullable ex.g a(String $$0) {
        try {
            return new ex().a(new StringReader($$0));
        }
        catch (CommandSyntaxException $$1) {
            return null;
        }
    }

    public String b() {
        return this.f;
    }

    public boolean c() {
        return this.d;
    }

    public Optional<yh> d() {
        return this.e;
    }

    public zt e() {
        return this.g;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof zl)) return false;
        zl $$1 = (zl)$$0;
        if (!this.g.equals($$1.g)) return false;
        if (!this.e.equals($$1.e)) return false;
        if (this.d != $$1.d) return false;
        if (!this.f.equals($$1.f)) return false;
        return true;
    }

    public int hashCode() {
        int $$0 = this.d ? 1 : 0;
        $$0 = 31 * $$0 + this.e.hashCode();
        $$0 = 31 * $$0 + this.f.hashCode();
        $$0 = 31 * $$0 + this.g.hashCode();
        return $$0;
    }

    public String toString() {
        return "nbt{" + String.valueOf(this.g) + ", interpreting=" + this.d + ", separator=" + String.valueOf(this.e) + "}";
    }

    @Override
    public yw a(@Nullable ed $$02, @Nullable cgk $$13, int $$22) throws CommandSyntaxException {
        if ($$02 == null || this.b == null) {
            return yh.i();
        }
        Stream<String> $$3 = this.g.a($$02).flatMap($$0 -> {
            try {
                return this.b.a((vz)$$0).stream();
            }
            catch (CommandSyntaxException $$1) {
                return Stream.empty();
            }
        });
        if (this.d) {
            ams<vz> $$42 = $$02.v().a(vn.a);
            yh $$5 = (yh)DataFixUtils.orElse(yk.a($$02, this.e, $$13, $$22), (Object)yk.c);
            return $$3.flatMap($$4 -> {
                try {
                    yh $$5 = (yh)yj.a.parse((DynamicOps)$$42, $$4).getOrThrow();
                    return Stream.of(yk.a($$02, $$5, $$13, $$22));
                }
                catch (Exception $$6) {
                    c.warn("Failed to parse component: {}", $$4, (Object)$$6);
                    return Stream.of(new yw[0]);
                }
            }).reduce(($$1, $$2) -> $$1.b($$5).b((yh)$$2)).orElseGet(yh::i);
        }
        Stream<String> $$6 = $$3.map(zl::a);
        return yk.a($$02, this.e, $$13, $$22).map($$12 -> $$6.map(yh::b).reduce(($$1, $$2) -> $$1.b((yh)$$12).b((yh)$$2)).orElseGet(yh::i)).orElseGet(() -> yh.b($$6.collect(Collectors.joining(", "))));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String a(vz $$0) {
        if (!($$0 instanceof vx)) return $$0.toString();
        vx vx2 = (vx)$$0;
        try {
            String string = vx2.k();
            return string;
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
    }

    public MapCodec<zl> a() {
        return a;
    }
}

