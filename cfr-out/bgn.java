/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JavaOps
 *  com.mojang.serialization.Lifecycle
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.Lifecycle;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class bgn
implements je.a {
    final jf.a a;
    final a b = new a();
    final Map<amt<Object>, jd.c<Object>> c = new HashMap<amt<Object>, jd.c<Object>>();
    final Map<bef<Object>, jh.c<Object>> d = new HashMap<bef<Object>, jh.c<Object>>();

    public bgn(jf.a $$0) {
        this.a = $$0;
    }

    @Override
    public <T> Optional<? extends je<T>> a(amt<? extends jq<? extends T>> $$0) {
        return Optional.of(this.b.a());
    }

    public <V> ams<V> a(DynamicOps<V> $$0) {
        return ams.a($$0, new ams.c(){

            @Override
            public <T> Optional<ams.b<T>> a(amt<? extends jq<? extends T>> $$0) {
                return bgn.this.a.a($$0).map(ams.b::a).or(() -> Optional.of(new ams.b(bgn.this.b.b(), bgn.this.b.a(), Lifecycle.experimental())));
            }
        });
    }

    public bgs a() {
        return new bgs(){

            @Override
            public <T> DataResult<T> a(Codec<T> $$0, T $$1, jf.a $$22) {
                return $$0.encodeStart(bgn.this.a(JavaOps.INSTANCE), $$1).flatMap($$2 -> $$0.parse($$22.a(JavaOps.INSTANCE), $$2));
            }
        };
    }

    public boolean b() {
        return !this.c.isEmpty() || !this.d.isEmpty();
    }

    class a
    implements je<Object>,
    jg<Object> {
        a() {
        }

        @Override
        public Optional<jd.c<Object>> a(amt<Object> $$0) {
            return Optional.of(this.c($$0));
        }

        @Override
        public jd.c<Object> b(amt<Object> $$0) {
            return this.c($$0);
        }

        private jd.c<Object> c(amt<Object> $$02) {
            return bgn.this.c.computeIfAbsent($$02, $$0 -> jd.c.a(this, $$0));
        }

        @Override
        public Optional<jh.c<Object>> a(bef<Object> $$0) {
            return Optional.of(this.c($$0));
        }

        @Override
        public jh.c<Object> b(bef<Object> $$0) {
            return this.c($$0);
        }

        private jh.c<Object> c(bef<Object> $$02) {
            return bgn.this.d.computeIfAbsent($$02, $$0 -> jh.a(this, $$0));
        }

        public <T> je<T> a() {
            return this;
        }

        public <T> jg<T> b() {
            return this;
        }
    }
}

