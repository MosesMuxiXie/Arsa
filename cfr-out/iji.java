/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ibm.icu.text.DateFormat
 *  com.ibm.icu.text.SimpleDateFormat
 *  com.ibm.icu.util.Calendar
 *  com.ibm.icu.util.TimeZone
 *  com.ibm.icu.util.ULocale
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.TimeZone;
import com.ibm.icu.util.ULocale;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Date;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.jspecify.annotations.Nullable;

public class iji
implements ijl<String> {
    public static final String a = "";
    private static final long d = TimeUnit.SECONDS.toMillis(1L);
    public static final Codec<String> b = Codec.STRING;
    private static final Codec<TimeZone> e = b.comapFlatMap($$0 -> {
        TimeZone $$1 = TimeZone.getTimeZone((String)$$0);
        if ($$1.equals((Object)TimeZone.UNKNOWN_ZONE)) {
            return DataResult.error(() -> "Unknown timezone: " + $$0);
        }
        return DataResult.success((Object)$$1);
    }, TimeZone::getID);
    private static final MapCodec<a> f = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.STRING.fieldOf("pattern").forGetter($$0 -> $$0.a), (App)Codec.STRING.optionalFieldOf("locale", (Object)a).forGetter($$0 -> $$0.b), (App)e.optionalFieldOf("time_zone").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, a::new));
    public static final ijl.a<iji, String> c = ijl.a.a(f.flatXmap(iji::a, $$0 -> DataResult.success((Object)$$0.g)), b);
    private final a g;
    private final DateFormat h;
    private long i;
    private String j = "";

    private iji(a $$0, DateFormat $$1) {
        this.g = $$0;
        this.h = $$1;
    }

    public static iji a(String $$02, String $$1, Optional<TimeZone> $$2) {
        return (iji)iji.a(new a($$02, $$1, $$2)).getOrThrow($$0 -> new IllegalStateException("Failed to validate format: " + $$0));
    }

    private static DataResult<iji> a(a $$0) {
        ULocale $$12 = new ULocale($$0.b);
        Calendar $$2 = $$0.c.map($$1 -> Calendar.getInstance((TimeZone)$$1, (ULocale)$$12)).orElseGet(() -> Calendar.getInstance((ULocale)$$12));
        SimpleDateFormat $$3 = new SimpleDateFormat($$0.a, $$12);
        $$3.setCalendar($$2);
        try {
            $$3.format(new Date());
        }
        catch (Exception $$4) {
            return DataResult.error(() -> "Invalid time format '" + String.valueOf($$3) + "': " + $$4.getMessage());
        }
        return DataResult.success((Object)new iji($$0, (DateFormat)$$3));
    }

    public @Nullable String a(dlt $$0, @Nullable hif $$1, @Nullable chl $$2, int $$3, dlr $$4) {
        long $$5 = bhs.c();
        if ($$5 > this.i) {
            this.j = this.c();
            this.i = $$5 + d;
        }
        return this.j;
    }

    private String c() {
        return this.h.format(new Date());
    }

    @Override
    public ijl.a<iji, String> a() {
        return c;
    }

    @Override
    public Codec<String> b() {
        return b;
    }

    @Override
    public /* synthetic */ @Nullable Object b(dlt dlt2, @Nullable hif hif2, @Nullable chl chl2, int n2, dlr dlr2) {
        return this.a(dlt2, hif2, chl2, n2, dlr2);
    }

    static final class a
    extends Record {
        final String a;
        final String b;
        final Optional<TimeZone> c;

        a(String $$0, String $$1, Optional<TimeZone> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "format;localeId;timeZone", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "format;localeId;timeZone", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "format;localeId;timeZone", "a", "b", "c"}, this, $$0);
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public Optional<TimeZone> c() {
            return this.c;
        }
    }
}

