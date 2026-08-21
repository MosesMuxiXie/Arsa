/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.math.LongMath
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.Object2BooleanFunction
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.math.LongMath;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2BooleanFunction;
import java.io.BufferedReader;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gfp
extends bbe<Map<String, List<a>>>
implements AutoCloseable {
    private static final Codec<Map<String, List<a>>> a = Codec.unboundedMap((Codec)Codec.STRING, (Codec)RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.LONG.optionalFieldOf("delay", (Object)0L).forGetter(a::a), (App)Codec.LONG.fieldOf("period").forGetter(a::b), (App)Codec.STRING.fieldOf("title").forGetter(a::c), (App)Codec.STRING.fieldOf("message").forGetter(a::d)).apply((Applicative)$$0, a::new)).listOf());
    private static final Logger b = LogUtils.getLogger();
    private final amo c;
    private final Object2BooleanFunction<String> d;
    private @Nullable Timer e;
    private @Nullable b f;

    public gfp(amo $$0, Object2BooleanFunction<String> $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    protected Map<String, List<a>> a(baz $$0, bzm $$1) {
        Map map;
        block8: {
            BufferedReader $$2 = $$0.openAsReader(this.c);
            try {
                map = (Map)a.parse((DynamicOps)JsonOps.INSTANCE, (Object)bhf.a($$2)).result().orElseThrow();
                if ($$2 == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if ($$2 != null) {
                        try {
                            ((Reader)$$2).close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Exception $$3) {
                    b.warn("Failed to load {}", (Object)this.c, (Object)$$3);
                    return ImmutableMap.of();
                }
            }
            ((Reader)$$2).close();
        }
        return map;
    }

    @Override
    protected void a(Map<String, List<a>> $$02, baz $$1, bzm $$2) {
        List<a> $$3 = $$02.entrySet().stream().filter($$0 -> (Boolean)this.d.apply((Object)((String)$$0.getKey()))).map(Map.Entry::getValue).flatMap(Collection::stream).collect(Collectors.toList());
        if ($$3.isEmpty()) {
            this.a();
            return;
        }
        if ($$3.stream().anyMatch($$0 -> $$0.b == 0L)) {
            bhs.b("A periodic notification in " + String.valueOf(this.c) + " has a period of zero minutes");
            this.a();
            return;
        }
        long $$4 = this.a($$3);
        long $$5 = this.a($$3, $$4);
        if (this.e == null) {
            this.e = new Timer();
        }
        this.f = this.f == null ? new b($$3, $$4, $$5) : this.f.a($$3, $$5);
        this.e.scheduleAtFixedRate((TimerTask)this.f, TimeUnit.MINUTES.toMillis($$4), TimeUnit.MINUTES.toMillis($$5));
    }

    @Override
    public void close() {
        this.a();
    }

    private void a() {
        if (this.e != null) {
            this.e.cancel();
        }
    }

    private long a(List<a> $$0, long $$12) {
        return $$0.stream().mapToLong($$1 -> {
            long $$2 = $$1.a - $$12;
            return LongMath.gcd((long)$$2, (long)$$1.b);
        }).reduce(LongMath::gcd).orElseThrow(() -> new IllegalStateException("Empty notifications from: " + String.valueOf(this.c)));
    }

    private long a(List<a> $$02) {
        return $$02.stream().mapToLong($$0 -> $$0.a).min().orElse(0L);
    }

    @Override
    protected /* synthetic */ Object b(baz baz2, bzm bzm2) {
        return this.a(baz2, bzm2);
    }

    static class b
    extends TimerTask {
        private final gfj a = gfj.V();
        private final List<a> b;
        private final long c;
        private final AtomicLong d;

        public b(List<a> $$0, long $$1, long $$2) {
            this.b = $$0;
            this.c = $$2;
            this.d = new AtomicLong($$1);
        }

        public b a(List<a> $$0, long $$1) {
            this.cancel();
            return new b($$0, this.d.get(), $$1);
        }

        @Override
        public void run() {
            long $$0 = this.d.getAndAdd(this.c);
            long $$1 = this.d.get();
            for (a $$2 : this.b) {
                long $$4;
                long $$3;
                if ($$0 < $$2.a || ($$3 = $$0 / $$2.b) == ($$4 = $$1 / $$2.b)) continue;
                this.a.execute(() -> gna.a(gfj.V().aG(), gna.a.g, (yh)yh.a($$0.c, $$3), (yh)yh.a($$0.d, $$3)));
                return;
            }
        }
    }

    public static final class a
    extends Record {
        final long a;
        final long b;
        final String c;
        final String d;

        public a(long $$0, long $$1, String $$2, String $$3) {
            this.a = $$0 != 0L ? $$0 : $$1;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "delay;period;title;message", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "delay;period;title;message", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "delay;period;title;message", "a", "b", "c", "d"}, this, $$0);
        }

        public long a() {
            return this.a;
        }

        public long b() {
            return this.b;
        }

        public String c() {
            return this.c;
        }

        public String d() {
            return this.d;
        }
    }
}

