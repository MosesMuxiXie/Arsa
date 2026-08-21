/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.apache.commons.io.FileUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.lang.runtime.SwitchBootstraps;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.commons.io.FileUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class glz {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 4649;
    private Map<amo, gma> c;
    private final List<amo> d = new ArrayList<amo>();
    private boolean e = false;
    private @Nullable gmb f;
    private final File g;
    private long h;
    private final Codec<a> i;

    public glz(File $$0) {
        this.g = new File($$0, "debug-profile.json");
        this.i = bhz.w.a(glz$a.a, gfj.V().aC(), 4649);
        this.a();
    }

    public void a() {
        try {
            if (!this.g.isFile()) {
                this.h();
                this.e();
                return;
            }
            Dynamic $$02 = new Dynamic((DynamicOps)JsonOps.INSTANCE, (Object)bhf.a(FileUtils.readFileToString((File)this.g, (Charset)StandardCharsets.UTF_8)));
            a $$1 = (a)this.i.parse($$02).getOrThrow($$0 -> new IOException("Could not parse debug profile JSON: " + $$0));
            if ($$1.a().isPresent()) {
                this.a($$1.a().get());
            } else {
                this.c = new HashMap<amo, gma>();
                if ($$1.b().isPresent()) {
                    this.c.putAll($$1.b().get());
                }
                this.f = null;
            }
        }
        catch (JsonSyntaxException | IOException $$2) {
            a.error("Couldn't read debug profile file {}, resetting to default", (Object)this.g, (Object)$$2);
            this.h();
            this.g();
        }
        this.e();
    }

    public void a(gmb $$0) {
        this.f = $$0;
        Map<amo, gma> $$1 = glx.N.get($$0);
        this.c = new HashMap<amo, gma>($$1);
        this.e();
    }

    private void h() {
        this.f = gmb.a;
        this.c = new HashMap<amo, gma>(glx.N.get(gmb.a));
    }

    public gma a(amo $$0) {
        gma $$1 = this.c.get($$0);
        if ($$1 == null) {
            return gma.c;
        }
        return $$1;
    }

    public boolean b(amo $$0) {
        return this.d.contains($$0);
    }

    public void a(amo $$0, gma $$1) {
        this.f = null;
        this.c.put($$0, $$1);
        this.e();
        this.g();
    }

    public boolean c(amo $$0) {
        gma $$1;
        gma gma2 = $$1 = this.c.get($$0);
        int n2 = 0;
        switch (SwitchBootstraps.enumSwitch("enumSwitch", new Object[]{"ALWAYS_ON", "IN_OVERLAY", "NEVER"}, (gma)gma2, n2)) {
            case 0: {
                this.a($$0, gma.c);
                return false;
            }
            case 1: {
                if (this.e) {
                    this.a($$0, gma.c);
                    return false;
                }
                this.a($$0, gma.a);
                return true;
            }
            case 2: {
                if (this.e) {
                    this.a($$0, gma.b);
                } else {
                    this.a($$0, gma.a);
                }
                return true;
            }
        }
        this.a($$0, gma.a);
        return true;
    }

    public Collection<amo> b() {
        return this.d;
    }

    public void c() {
        this.a(!this.e);
    }

    public void a(boolean $$0) {
        if (this.e != $$0) {
            this.e = $$0;
            this.e();
        }
    }

    public boolean d() {
        return this.e;
    }

    public void e() {
        this.d.clear();
        boolean $$0 = gfj.V().aF();
        for (Map.Entry<amo, gma> $$1 : this.c.entrySet()) {
            gly $$2;
            if ($$1.getValue() != gma.a && (!this.e || $$1.getValue() != gma.b) || ($$2 = glx.a($$1.getKey())) == null || !$$2.a($$0)) continue;
            this.d.add($$1.getKey());
        }
        this.d.sort(amo::a);
        ++this.h;
    }

    public long f() {
        return this.h;
    }

    public boolean b(gmb $$0) {
        return this.f == $$0;
    }

    public void g() {
        a $$0 = new a(Optional.ofNullable(this.f), this.f == null ? Optional.of(this.c) : Optional.empty());
        try {
            FileUtils.writeStringToFile((File)this.g, (String)((JsonElement)this.i.encodeStart((DynamicOps)JsonOps.INSTANCE, (Object)$$0).getOrThrow()).toString(), (Charset)StandardCharsets.UTF_8);
        }
        catch (IOException $$1) {
            a.error("Failed to save debug profile file {}", (Object)this.g, (Object)$$1);
        }
    }

    static final class a
    extends Record {
        private final Optional<gmb> b;
        private final Optional<Map<amo, gma>> c;
        private static final Codec<Map<amo, gma>> d = Codec.unboundedMap(amo.a, gma.d);
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)gmb.c.optionalFieldOf("profile").forGetter(a::a), (App)d.optionalFieldOf("custom").forGetter(a::b)).apply((Applicative)$$0, a::new));

        a(Optional<gmb> $$0, Optional<Map<amo, gma>> $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "profile;custom", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "profile;custom", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "profile;custom", "b", "c"}, this, $$0);
        }

        public Optional<gmb> a() {
            return this.b;
        }

        public Optional<Map<amo, gma>> b() {
            return this.c;
        }
    }
}

