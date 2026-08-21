/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class fqm
extends fpq {
    private static final Logger b = LogUtils.getLogger();
    public static final MapCodec<fqm> a = RecordCodecBuilder.mapCodec($$02 -> fqm.a($$02).and($$02.group((App)yj.a.optionalFieldOf("name").forGetter($$0 -> $$0.c), (App)fnz.c.g.optionalFieldOf("entity").forGetter($$0 -> $$0.d), (App)fqm$a.c.optionalFieldOf("target", (Object)fqm$a.a).forGetter($$0 -> $$0.e))).apply((Applicative)$$02, fqm::new));
    private final Optional<yh> c;
    private final Optional<fnz.c> d;
    private final a e;

    private fqm(List<frm> $$0, Optional<yh> $$1, Optional<fnz.c> $$2, a $$3) {
        super($$0);
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    public fps<fqm> a() {
        return fpt.p;
    }

    @Override
    public Set<bhv<?>> b() {
        return this.d.map($$0 -> Set.of($$0.a())).orElse(Set.of());
    }

    public static UnaryOperator<yh> a(fnz $$02, @Nullable fnz.c $$1) {
        cgk $$22;
        if ($$1 != null && ($$22 = $$02.c($$1.a())) != null) {
            ed $$3 = $$22.d($$02.d()).a(bbh.c);
            return $$2 -> {
                try {
                    return yk.a($$3, $$2, $$22, 0);
                }
                catch (CommandSyntaxException $$3) {
                    b.warn("Failed to resolve text component", (Throwable)$$3);
                    return $$2;
                }
            };
        }
        return $$0 -> $$0;
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        this.c.ifPresent($$2 -> $$0.b(this.e.a(), (yh)fqm.a($$1, this.d.orElse(null)).apply((yh)$$2)));
        return $$0;
    }

    public static fpq.a<?> a(yh $$0, a $$1) {
        return fqm.a((List<frm> $$2) -> new fqm((List<frm>)$$2, Optional.of($$0), Optional.empty(), $$1));
    }

    public static fpq.a<?> a(yh $$0, a $$1, fnz.c $$2) {
        return fqm.a((List<frm> $$3) -> new fqm((List<frm>)$$3, Optional.of($$0), Optional.of($$2), $$1));
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("custom_name");
        public static final /* enum */ a b = new a("item_name");
        public static final Codec<a> c;
        private final String d;
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.d = $$0;
        }

        @Override
        public String c() {
            return this.d;
        }

        public kh<yh> a() {
            return switch (this.ordinal()) {
                default -> throw new MatchException(null, null);
                case 1 -> ki.k;
                case 0 -> ki.h;
            };
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b};
        }

        static {
            e = fqm$a.b();
            c = bhh.a(a::values);
        }
    }
}

