/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class hia
implements abg {
    private static final yh l = yh.c("disconnect.lost");
    private static final Logger m = LogUtils.getLogger();
    protected final gfj a;
    protected final wu b;
    protected final @Nullable hit c;
    protected @Nullable String d;
    protected final irf e;
    protected final @Nullable gsb f;
    protected boolean g;
    private final List<b> n = new ArrayList<b>();
    protected final Map<amo, byte[]> h;
    protected Map<String, String> i;
    private anl o;
    protected final Map<UUID, hiq> j;
    protected boolean k;

    protected hia(gfj $$0, wu $$1, hik $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2.g();
        this.d = $$2.f();
        this.e = $$2.c();
        this.f = $$2.h();
        this.h = $$2.i();
        this.i = $$2.k();
        this.o = $$2.l();
        this.j = new HashMap<UUID, hiq>($$2.m());
        this.k = $$2.n();
    }

    public anl a() {
        return this.o;
    }

    @Override
    public void a(aay $$0, Exception $$1) {
        m.error("Failed to handle packet {}, disconnecting", (Object)$$0, (Object)$$1);
        Optional<Path> $$2 = this.a($$0, (Throwable)$$1);
        Optional<URI> $$3 = this.o.a(anl.b.a).map(anl.a::c);
        this.b.a(new ww(yh.c("disconnect.packetError"), $$2, $$3));
    }

    @Override
    public ww a(yh $$0, Throwable $$1) {
        Optional<Path> $$2 = this.a((aay)null, $$1);
        Optional<URI> $$3 = this.o.a(anl.b.a).map(anl.a::c);
        return new ww($$0, $$2, $$3);
    }

    private Optional<Path> a(@Nullable aay $$02, Throwable $$1) {
        m $$2 = m.a($$1, "Packet handling error");
        abb.a($$2, this, $$02);
        Path $$3 = this.a.p.toPath().resolve("debug");
        Path $$4 = $$3.resolve("disconnect-" + bhs.f() + "-client.txt");
        Optional<anl.a> $$5 = this.o.a(anl.b.a);
        List<String> $$6 = $$5.map($$0 -> List.of("Server bug reporting link: " + String.valueOf($$0.c()))).orElse(List.of());
        if ($$2.a($$4, u.d, $$6)) {
            return Optional.of($$4);
        }
        return Optional.empty();
    }

    @Override
    public boolean a(aay<?> $$0) {
        if (abg.super.a($$0)) {
            return true;
        }
        return this.g && ($$0 instanceof abr || $$0 instanceof abs);
    }

    @Override
    public void a(abl $$0) {
        this.a(new abz($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
    }

    @Override
    public void a(abm $$0) {
        abb.a($$0, this, this.a.bk());
        this.b(new aca($$0.b()));
    }

    @Override
    public void a(abi $$0) {
        acd $$1 = $$0.b();
        if ($$1 instanceof ace) {
            return;
        }
        abb.a($$0, this, this.a.bk());
        if ($$1 instanceof acc) {
            acc $$2 = (acc)$$1;
            this.d = $$2.b();
            this.e.a($$2.b());
        } else {
            this.a($$1);
        }
    }

    protected abstract void a(acd var1);

    @Override
    public void a(abo $$0) {
        hit.a $$5;
        abb.a($$0, this, this.a.bk());
        UUID $$1 = $$0.b();
        URL $$2 = hia.a($$0.e());
        if ($$2 == null) {
            this.b.a(new acb($$1, acb.a.f));
            return;
        }
        String $$3 = $$0.f();
        boolean $$4 = $$0.g();
        hit.a a2 = $$5 = this.c != null ? this.c.b() : hit.a.c;
        if ($$5 == hit.a.c || $$4 && $$5 == hit.a.b) {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
        } else {
            this.a.ak().a($$1, $$2, $$3);
        }
    }

    @Override
    public void a(abn $$02) {
        abb.a($$02, this, this.a.bk());
        $$02.b().ifPresentOrElse($$0 -> this.a.ak().a((UUID)$$0), () -> this.a.ak().e());
    }

    static yh a(yh $$0, @Nullable yh $$1) {
        if ($$1 == null) {
            return $$0;
        }
        return yh.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1);
    }

    private static @Nullable URL a(String $$0) {
        try {
            URL $$1 = new URL($$0);
            String $$2 = $$1.getProtocol();
            if ("http".equals($$2) || "https".equals($$2)) {
                return $$1;
            }
        }
        catch (MalformedURLException $$3) {
            return null;
        }
        return null;
    }

    @Override
    public void a(acw $$0) {
        abb.a($$0, this, this.a.bk());
        this.b.a(new acz($$0.b(), this.h.get($$0.b())));
    }

    @Override
    public void a(abr $$0) {
        abb.a($$0, this, this.a.bk());
        this.h.put($$0.b(), $$0.e());
    }

    @Override
    public void a(abj $$0) {
        abb.a($$0, this, this.a.bk());
        this.i = $$0.b();
    }

    @Override
    public void a(abp $$0) {
        abb.a($$0, this, this.a.bk());
        List<anl.c> $$1 = $$0.b();
        ImmutableList.Builder $$2 = ImmutableList.builderWithExpectedSize((int)$$1.size());
        for (anl.c $$3 : $$1) {
            try {
                URI $$4 = bhs.a($$3.b());
                $$2.add((Object)new anl.a($$3.a(), $$4));
            }
            catch (Exception $$5) {
                m.warn("Received invalid link for type {}:{}", new Object[]{$$3.a(), $$3.b(), $$5});
            }
        }
        this.o = new anl((List<anl.a>)$$2.build());
    }

    @Override
    public void a(abq $$0) {
        abb.a($$0, this, this.a.bk());
        this.a($$0.b(), this.a.x);
    }

    protected abstract gsr e();

    public void a(jd<asj> $$0, @Nullable gsb $$1) {
        this.a($$0, this.e(), $$1);
    }

    protected void a(jd<asj> $$0, gsr $$1, @Nullable gsb $$2) {
        gsb $$12;
        if ($$2 instanceof gsu.a) {
            gsb gsb2;
            gsu.a $$3 = (gsu.a)$$2;
            gsb $$4 = $$3.o();
            if ($$4 instanceof gsu) {
                gsu $$5 = (gsu)$$4;
                gsb2 = $$5.F();
            } else {
                gsb2 = $$4;
            }
            gsb $$6 = gsb2;
            gsu<asj> $$7 = gsv.a($$0.a(), $$6, $$1);
            if ($$7 != null) {
                $$3.a($$7);
            } else {
                m.warn("Failed to show dialog for data {}", $$0);
            }
            return;
        }
        if ($$2 instanceof gsu) {
            gsu $$8 = (gsu)$$2;
            gsb $$9 = $$8.F();
        } else if ($$2 instanceof gsz) {
            gsz $$10 = (gsz)$$2;
            gsb $$11 = $$10.o();
        } else {
            $$12 = $$2;
        }
        gsu<asj> $$13 = gsv.a($$0.a(), $$12, $$1);
        if ($$13 != null) {
            this.a.a($$13);
        } else {
            m.warn("Failed to show dialog for data {}", $$0);
        }
    }

    @Override
    public void a(abh $$0) {
        abb.a($$0, this, this.a.bk());
        this.f();
    }

    public void f() {
        gsb gsb2 = this.a.x;
        if (gsb2 instanceof gsu.a) {
            gsu.a $$0 = (gsu.a)gsb2;
            gsb $$1 = $$0.o();
            if ($$1 instanceof gsu) {
                gsu $$2 = (gsu)$$1;
                $$0.a($$2.F());
            }
        } else {
            gsb2 = this.a.x;
            if (gsb2 instanceof gsu) {
                gsu $$3 = (gsu)gsb2;
                this.a.a($$3.F());
            }
        }
    }

    @Override
    public void a(abs $$0) {
        this.g = true;
        abb.a($$0, this, this.a.bk());
        if (this.c == null) {
            throw new IllegalStateException("Cannot transfer to server from singleplayer");
        }
        this.b.a(yh.c("disconnect.transfer"));
        this.b.m();
        this.b.n();
        hjw $$1 = new hjw($$0.b(), $$0.e());
        grb.a(Objects.requireNonNullElseGet(this.f, gsd::new), this.a, $$1, this.c, false, new hix(this.h, this.j, this.k));
    }

    @Override
    public void a(abk $$0) {
        this.b.a($$0.b());
    }

    protected void g() {
        Iterator<b> $$0 = this.n.iterator();
        while ($$0.hasNext()) {
            b $$1 = $$0.next();
            if ($$1.b().getAsBoolean()) {
                this.b($$1.a);
                $$0.remove();
                continue;
            }
            if ($$1.c() > bhs.c()) continue;
            $$0.remove();
        }
    }

    public void b(aay<?> $$0) {
        this.b.a($$0);
    }

    @Override
    public void a(ww $$0) {
        this.e.c();
        this.a.a(this.b($$0), this.g);
        m.warn("Client disconnected with reason: {}", (Object)$$0.a().getString());
    }

    @Override
    public void a(m $$0, n $$1) {
        $$1.a("Is Local", () -> String.valueOf(this.b.e()));
        $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
        $$1.a("Server brand", () -> this.d);
        if (!this.i.isEmpty()) {
            n $$2 = $$0.a("Custom Server Details");
            this.i.forEach($$2::a);
        }
    }

    protected gsb b(ww $$0) {
        gsb $$1 = Objects.requireNonNullElseGet(this.f, () -> this.c != null ? new gvp(new gsd()) : new gsd());
        if (this.c != null && this.c.e()) {
            return new grj($$1, l, $$0, yg.k);
        }
        return new grj($$1, l, $$0);
    }

    public @Nullable String h() {
        return this.d;
    }

    private void a(aay<? extends xr> $$0, BooleanSupplier $$1, Duration $$2) {
        if ($$1.getAsBoolean()) {
            this.b($$0);
        } else {
            this.n.add(new b($$0, $$1, bhs.c() + $$2.toMillis()));
        }
    }

    private gsb a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable yh $$4) {
        gsb $$5 = this.a.x;
        if ($$5 instanceof c) {
            c $$6 = (c)$$5;
            return $$6.a(this.a, $$0, $$1, $$2, $$3, $$4);
        }
        return new c(this.a, $$5, List.of(new c.a($$0, $$1, $$2)), $$3, $$4);
    }

    static final class b
    extends Record {
        final aay<? extends xr> a;
        private final BooleanSupplier b;
        private final long c;

        b(aay<? extends xr> $$0, BooleanSupplier $$1, long $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "packet;sendCondition;expirationTime", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "packet;sendCondition;expirationTime", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "packet;sendCondition;expirationTime", "a", "b", "c"}, this, $$0);
        }

        public aay<? extends xr> a() {
            return this.a;
        }

        public BooleanSupplier b() {
            return this.b;
        }

        public long c() {
            return this.c;
        }
    }

    class c
    extends gra {
        private final List<a> u;
        private final @Nullable gsb v;

        c(@Nullable gfj $$0, gsb $$1, List<a> $$2, @Nullable boolean $$3, yh $$4) {
            super($$5 -> {
                $$0.a($$1);
                iom $$6 = $$0.ak();
                if ($$5) {
                    if ($$4.c != null) {
                        $$4.c.a(hit.a.a);
                    }
                    $$6.g();
                } else {
                    $$6.h();
                    if ($$3) {
                        $$4.b.a(yh.c("multiplayer.requiredTexturePrompt.disconnect"));
                    } else if ($$4.c != null) {
                        $$4.c.a(hit.a.b);
                    }
                }
                for (a $$7 : $$2) {
                    $$6.a($$7.a, $$7.b, $$7.c);
                }
                if ($$4.c != null) {
                    hiu.b($$4.c);
                }
            }, $$3 ? yh.c("multiplayer.requiredTexturePrompt.line1") : yh.c("multiplayer.texturePrompt.line1"), hia.a($$3 ? yh.c("multiplayer.requiredTexturePrompt.line2").a(l.o, l.r) : yh.c("multiplayer.texturePrompt.line2"), $$4), $$3 ? yg.i : yg.f, $$3 ? yg.q : yg.g);
            this.u = $$2;
            this.v = $$1;
        }

        public c a(gfj $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable yh $$5) {
            ImmutableList $$6 = ImmutableList.builderWithExpectedSize((int)(this.u.size() + 1)).addAll(this.u).add((Object)new a($$1, $$2, $$3)).build();
            return new c($$0, this.v, (List<a>)$$6, $$4, $$5);
        }

        static final class a
        extends Record {
            final UUID a;
            final URL b;
            final String c;

            a(UUID $$0, URL $$1, String $$2) {
                this.a = $$0;
                this.b = $$1;
                this.c = $$2;
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "id;url;hash", "a", "b", "c"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "id;url;hash", "a", "b", "c"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "id;url;hash", "a", "b", "c"}, this, $$0);
            }

            public UUID a() {
                return this.a;
            }

            public URL b() {
                return this.b;
            }

            public String c() {
                return this.c;
            }
        }
    }

    protected abstract class a
    implements gsr {
        protected a() {
        }

        @Override
        public void a(yh $$0) {
            hia.this.b.a($$0);
            hia.this.b.n();
        }

        @Override
        public void a(jd<asj> $$0, @Nullable gsb $$1) {
            hia.this.a($$0, this, $$1);
        }

        @Override
        public void a(amo $$0, Optional<vz> $$1) {
            hia.this.b(new abx($$0, $$1));
        }

        @Override
        public anl a() {
            return hia.this.a();
        }
    }
}

