/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class fmz {
    private static final String a = "command_storage_";
    private final Map<String, a> b = new HashMap<String, a>();
    private final fnc c;

    public fmz(fnc $$0) {
        this.c = $$0;
    }

    public uz a(amo $$0) {
        a $$1 = this.a($$0.b());
        if ($$1 != null) {
            return $$1.b($$0.a());
        }
        return new uz();
    }

    private @Nullable a a(String $$0) {
        a $$1 = this.b.get($$0);
        if ($$1 != null) {
            return $$1;
        }
        a $$2 = this.c.b(fmz$a.a($$0));
        if ($$2 != null) {
            this.b.put($$0, $$2);
        }
        return $$2;
    }

    private a b(String $$0) {
        a $$1 = this.b.get($$0);
        if ($$1 != null) {
            return $$1;
        }
        a $$2 = this.c.a(fmz$a.a($$0));
        this.b.put($$0, $$2);
        return $$2;
    }

    public void a(amo $$0, uz $$1) {
        this.b($$0.b()).a($$0.a(), $$1);
    }

    public Stream<amo> a() {
        return this.b.entrySet().stream().flatMap($$0 -> ((a)$$0.getValue()).c((String)$$0.getKey()));
    }

    static String c(String $$0) {
        return a + $$0;
    }

    static class a
    extends fmn {
        public static final Codec<a> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.unboundedMap(bfm.O, uz.a).fieldOf("contents").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, a::new));
        private final Map<String, uz> b;

        private a(Map<String, uz> $$0) {
            this.b = new HashMap<String, uz>($$0);
        }

        private a() {
            this(new HashMap<String, uz>());
        }

        public static fmo<a> a(String $$0) {
            return new fmo<a>(fmz.c($$0), a::new, a, bhz.i);
        }

        public uz b(String $$0) {
            uz $$1 = this.b.get($$0);
            return $$1 != null ? $$1 : new uz();
        }

        public void a(String $$0, uz $$1) {
            if ($$1.j()) {
                this.b.remove($$0);
            } else {
                this.b.put($$0, $$1);
            }
            this.u();
        }

        public Stream<amo> c(String $$0) {
            return this.b.keySet().stream().map($$1 -> amo.a($$0, $$1));
        }
    }
}

