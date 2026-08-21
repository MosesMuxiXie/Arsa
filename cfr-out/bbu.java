/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class bbu
implements bci {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 1000;
    private static final int c = 1;
    private boolean d = true;
    private final Map<String, a> e = new ConcurrentHashMap<String, a>();
    private final Map<UUID, a> f = new ConcurrentHashMap<UUID, a>();
    private final GameProfileRepository g;
    private final Gson h = new GsonBuilder().create();
    private final File i;
    private final AtomicLong j = new AtomicLong();

    public bbu(GameProfileRepository $$0, File $$1) {
        this.g = $$0;
        this.i = $$1;
        Lists.reverse(this.d()).forEach(this::a);
    }

    private void a(a $$0) {
        bbx $$1 = $$0.a();
        $$0.a(this.b());
        this.e.put($$1.b().toLowerCase(Locale.ROOT), $$0);
        this.f.put($$1.a(), $$0);
    }

    private Optional<bbx> a(GameProfileRepository $$0, String $$1) {
        if (!bhi.f($$1)) {
            return this.b($$1);
        }
        Optional<bbx> $$2 = $$0.findProfileByName($$1).map(bbx::new);
        if ($$2.isEmpty()) {
            return this.b($$1);
        }
        return $$2;
    }

    private Optional<bbx> b(String $$0) {
        if (this.d) {
            return Optional.of(bbx.a($$0));
        }
        return Optional.empty();
    }

    @Override
    public void a(boolean $$0) {
        this.d = $$0;
    }

    @Override
    public void a(bbx $$0) {
        this.b($$0);
    }

    private a b(bbx $$0) {
        Calendar $$1 = Calendar.getInstance(TimeZone.getDefault(), Locale.ROOT);
        $$1.setTime(new Date());
        $$1.add(2, 1);
        Date $$2 = $$1.getTime();
        a $$3 = new a($$0, $$2);
        this.a($$3);
        this.a();
        return $$3;
    }

    private long b() {
        return this.j.incrementAndGet();
    }

    @Override
    public Optional<bbx> a(String $$0) {
        Optional<bbx> $$7;
        String $$1 = $$0.toLowerCase(Locale.ROOT);
        a $$2 = this.e.get($$1);
        boolean $$3 = false;
        if ($$2 != null && new Date().getTime() >= $$2.b.getTime()) {
            this.f.remove($$2.a().a());
            this.e.remove($$2.a().b().toLowerCase(Locale.ROOT));
            $$3 = true;
            $$2 = null;
        }
        if ($$2 != null) {
            $$2.a(this.b());
            Optional<bbx> $$4 = Optional.of($$2.a());
        } else {
            Optional<bbx> $$5 = this.a(this.g, $$1);
            if ($$5.isPresent()) {
                Optional<bbx> $$6 = Optional.of(this.b($$5.get()).a());
                $$3 = false;
            } else {
                $$7 = Optional.empty();
            }
        }
        if ($$3) {
            this.a();
        }
        return $$7;
    }

    @Override
    public Optional<bbx> a(UUID $$0) {
        a $$1 = this.f.get($$0);
        if ($$1 == null) {
            return Optional.empty();
        }
        $$1.a(this.b());
        return Optional.of($$1.a());
    }

    private static DateFormat c() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", Locale.ROOT);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private List<a> d() {
        ArrayList $$0 = Lists.newArrayList();
        try (BufferedReader $$12222 = Files.newReader((File)this.i, (Charset)StandardCharsets.UTF_8);){
            JsonArray $$22 = (JsonArray)this.h.fromJson((Reader)$$12222, JsonArray.class);
            if ($$22 == null) {
                ArrayList arrayList = $$0;
                return arrayList;
            }
            DateFormat $$3 = bbu.c();
            $$22.forEach($$2 -> bbu.a($$2, $$3).ifPresent($$0::add));
            return $$0;
        }
        catch (FileNotFoundException $$12222) {
            return $$0;
        }
        catch (JsonParseException | IOException $$4) {
            a.warn("Failed to load profile cache {}", (Object)this.i, (Object)$$4);
        }
        return $$0;
    }

    @Override
    public void a() {
        JsonArray $$0 = new JsonArray();
        DateFormat $$1 = bbu.c();
        this.a(1000).forEach($$2 -> $$0.add(bbu.a($$2, $$1)));
        String $$22 = this.h.toJson((JsonElement)$$0);
        try (BufferedWriter $$3 = Files.newWriter((File)this.i, (Charset)StandardCharsets.UTF_8);){
            $$3.write($$22);
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    private Stream<a> a(int $$0) {
        return ImmutableList.copyOf(this.f.values()).stream().sorted(Comparator.comparing(a::c).reversed()).limit($$0);
    }

    private static JsonElement a(a $$0, DateFormat $$1) {
        JsonObject $$2 = new JsonObject();
        $$0.a().b($$2);
        $$2.addProperty("expiresOn", $$1.format($$0.b()));
        return $$2;
    }

    private static Optional<a> a(JsonElement $$0, DateFormat $$1) {
        JsonElement $$4;
        JsonObject $$2;
        bbx $$3;
        if ($$0.isJsonObject() && ($$3 = bbx.a($$2 = $$0.getAsJsonObject())) != null && ($$4 = $$2.get("expiresOn")) != null) {
            String $$5 = $$4.getAsString();
            try {
                Date $$6 = $$1.parse($$5);
                return Optional.of(new a($$3, $$6));
            }
            catch (ParseException $$7) {
                a.warn("Failed to parse date {}", (Object)$$5, (Object)$$7);
            }
        }
        return Optional.empty();
    }

    static class a {
        private final bbx a;
        final Date b;
        private volatile long c;

        a(bbx $$0, Date $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public bbx a() {
            return this.a;
        }

        public Date b() {
            return this.b;
        }

        public void a(long $$0) {
            this.c = $$0;
        }

        public long c() {
            return this.c;
        }
    }
}

