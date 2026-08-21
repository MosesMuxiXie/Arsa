/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.reflect.TypeToken
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class iqr
extends bbe<a> {
    public static final amo a = amo.b("empty");
    public static final ipj b = new ipj(a, ccd.a(1.0f), ccd.a(1.0f), 1, ipj.a.a, false, false, 16);
    public static final amo c = amo.b("intentionally_empty");
    public static final iqt d = new iqt(c, null);
    public static final ipj e = new ipj(c, ccd.a(1.0f), ccd.a(1.0f), 1, ipj.a.a, false, false, 16);
    static final Logger f = LogUtils.getLogger();
    private static final String g = "sounds.json";
    private static final Gson h = new GsonBuilder().registerTypeAdapter(ipk.class, (Object)new ipl()).create();
    private static final TypeToken<Map<String, ipk>> i = new TypeToken<Map<String, ipk>>(){};
    private final Map<amo, iqt> j = Maps.newHashMap();
    private final iqo k;
    private final Map<amo, bax> l = new HashMap<amo, bax>();

    public iqr(gfo $$0) {
        this.k = new iqo(this, $$0, bbc.fromMap(this.l));
    }

    protected a a(baz $$0, bzm $$1) {
        a $$2 = new a();
        try (bzr $$3 = $$1.d("list");){
            $$2.a($$0);
        }
        for (String $$4 : $$0.a()) {
            try {
                bzr $$5 = $$1.d($$4);
                try {
                    List<bax> $$6 = $$0.a(amo.a($$4, g));
                    for (bax $$7 : $$6) {
                        $$1.a($$7.b());
                        try (BufferedReader $$8 = $$7.e();){
                            $$1.a("parse");
                            Map<String, ipk> $$9 = bfv.b(h, $$8, i);
                            $$1.b("register");
                            for (Map.Entry<String, ipk> $$10 : $$9.entrySet()) {
                                $$2.a(amo.a($$4, $$10.getKey()), $$10.getValue());
                            }
                            $$1.c();
                        }
                        catch (RuntimeException $$11) {
                            f.warn("Invalid {} in resourcepack: '{}'", new Object[]{g, $$7.b(), $$11});
                        }
                        $$1.c();
                    }
                }
                finally {
                    if ($$5 == null) continue;
                    $$5.close();
                }
            }
            catch (IOException iOException) {}
        }
        return $$2;
    }

    @Override
    protected void a(a $$0, baz $$1, bzm $$2) {
        $$0.a(this.j, this.l, this.k);
        if (w.aX) {
            for (amo $$3 : this.j.keySet()) {
                iqt $$4 = this.j.get($$3);
                if (yk.b($$4.a()) || !mi.b.d($$3)) continue;
                f.error("Missing subtitle {} for sound event: {}", (Object)$$4.a(), (Object)$$3);
            }
        }
        if (f.isDebugEnabled()) {
            for (amo $$5 : this.j.keySet()) {
                if (mi.b.d($$5)) continue;
                f.debug("Not having sound event for: {}", (Object)$$5);
            }
        }
        this.k.a();
    }

    public List<String> a() {
        return this.k.g();
    }

    public fwj b() {
        return this.k.h();
    }

    static boolean a(ipj $$0, amo $$1, bbc $$2) {
        amo $$3 = $$0.b();
        if ($$2.getResource($$3).isEmpty()) {
            f.warn("File {} does not exist, cannot add it to event {}", (Object)$$3, (Object)$$1);
            return false;
        }
        return true;
    }

    public @Nullable iqt a(amo $$0) {
        return this.j.get($$0);
    }

    public Collection<amo> c() {
        return this.j.keySet();
    }

    public void a(ipn $$0) {
        this.k.a($$0);
    }

    public iqo.b a(ipm $$0) {
        return this.k.c($$0);
    }

    public void a(ipm $$0, int $$1) {
        this.k.a($$0, $$1);
    }

    public void a(ger $$0) {
        this.k.a($$0);
    }

    public void a(bdb ... $$0) {
        this.k.a($$0);
    }

    public void d() {
        this.k.d();
    }

    public void e() {
        this.k.b();
    }

    public void f() {
        this.k.c();
    }

    public void a(boolean $$0) {
        this.k.a($$0);
    }

    public void g() {
        this.k.e();
    }

    public void a(bdb $$0) {
        this.k.a($$0);
    }

    public void b(ipm $$0) {
        this.k.a($$0);
    }

    public void a(bdb $$0, float $$1) {
        this.k.a($$0, $$1);
    }

    public boolean c(ipm $$0) {
        return this.k.b($$0);
    }

    public void a(iqq $$0) {
        this.k.a($$0);
    }

    public void b(iqq $$0) {
        this.k.b($$0);
    }

    public void a(@Nullable amo $$0, @Nullable bdb $$1) {
        this.k.a($$0, $$1);
    }

    public String h() {
        return this.k.f();
    }

    public void i() {
        this.k.a();
    }

    @Override
    protected /* synthetic */ Object b(baz baz2, bzm bzm2) {
        return this.a(baz2, bzm2);
    }

    protected static class a {
        final Map<amo, iqt> a = Maps.newHashMap();
        private Map<amo, bax> b = Map.of();

        protected a() {
        }

        void a(baz $$0) {
            this.b = ipj.a.a($$0);
        }

        /*
         * WARNING - void declaration
         */
        void a(amo $$0, ipk $$1) {
            boolean $$3;
            iqt $$2 = this.a.get($$0);
            boolean bl2 = $$3 = $$2 == null;
            if ($$3 || $$1.b()) {
                if (!$$3) {
                    f.debug("Replaced sound event location {}", (Object)$$0);
                }
                $$2 = new iqt($$0, $$1.c());
                this.a.put($$0, $$2);
            }
            bbc $$4 = bbc.fromMap(this.b);
            block4: for (final ipj $$5 : $$1.a()) {
                void $$9;
                final amo $$6 = $$5.a();
                switch ($$5.f()) {
                    case a: {
                        if (!iqr.a($$5, $$0, $$4)) continue block4;
                        ipj $$7 = $$5;
                        break;
                    }
                    case b: {
                        iqu<ipj> $$8 = new iqu<ipj>(){

                            @Override
                            public int e() {
                                iqt $$0 = a.get($$6);
                                return $$0 == null ? 0 : $$0.e();
                            }

                            public ipj a(bgr $$0) {
                                iqt $$1 = a.get($$6);
                                if ($$1 == null) {
                                    return iqr.b;
                                }
                                ipj $$2 = $$1.a($$0);
                                return new ipj($$2.a(), new ccj($$2.c(), $$5.c()), new ccj($$2.d(), $$5.d()), $$5.e(), ipj.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                            }

                            @Override
                            public void a(iqo $$0) {
                                iqt $$1 = a.get($$6);
                                if ($$1 == null) {
                                    return;
                                }
                                $$1.a($$0);
                            }

                            @Override
                            public /* synthetic */ Object b(bgr bgr2) {
                                return this.a(bgr2);
                            }
                        };
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Unknown SoundEventRegistration type: " + String.valueOf((Object)$$5.f()));
                    }
                }
                $$2.a((iqu<ipj>)$$9);
            }
        }

        public void a(Map<amo, iqt> $$0, Map<amo, bax> $$1, iqo $$2) {
            $$0.clear();
            $$1.clear();
            $$1.putAll(this.b);
            for (Map.Entry<amo, iqt> $$3 : this.a.entrySet()) {
                $$0.put($$3.getKey(), $$3.getValue());
                $$3.getValue().a($$2);
            }
        }
    }
}

