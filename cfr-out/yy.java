/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.primitives.Ints;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.security.SignatureException;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public record yy(zd d, @Nullable yu e, zb f, @Nullable yh g, yl h) {
    private final zd d;
    private final @Nullable yu e;
    private final zb f;
    private final @Nullable yh g;
    private final yl h;
    public static final MapCodec<yy> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)zd.a.fieldOf("link").forGetter(yy::k), (App)yu.a.optionalFieldOf("signature").forGetter($$0 -> Optional.ofNullable($$0.e)), (App)zb.a.forGetter(yy::m), (App)yj.a.optionalFieldOf("unsigned_content").forGetter($$0 -> Optional.ofNullable($$0.g)), (App)yl.a.optionalFieldOf("filter_mask", (Object)yl.c).forGetter(yy::o)).apply((Applicative)$$02, ($$0, $$1, $$2, $$3, $$4) -> new yy((zd)$$0, $$1.orElse(null), (zb)$$2, $$3.orElse(null), (yl)$$4)));
    private static final UUID i = bhs.e;
    public static final Duration b = Duration.ofMinutes(5L);
    public static final Duration c = b.plus(Duration.ofMinutes(2L));

    public static yy a(String $$0) {
        return yy.a(i, $$0);
    }

    public static yy a(UUID $$0, String $$1) {
        zb $$2 = zb.a($$1);
        zd $$3 = zd.a($$0);
        return new yy($$3, null, $$2, null, yl.c);
    }

    public yy a(yh $$0) {
        yh $$1 = !$$0.equals(yh.b(this.c())) ? $$0 : null;
        return new yy(this.d, this.e, this.f, $$1, this.h);
    }

    public yy a() {
        if (this.g != null) {
            return new yy(this.d, this.e, this.f, null, this.h);
        }
        return this;
    }

    public yy a(yl $$0) {
        if (this.h.equals($$0)) {
            return this;
        }
        return new yy(this.d, this.e, this.f, this.g, $$0);
    }

    public yy a(boolean $$0) {
        return this.a($$0 ? this.h : yl.c);
    }

    public yy b() {
        zb $$0 = zb.a(this.c());
        zd $$1 = zd.a(this.g());
        return new yy($$1, null, $$0, this.g, this.h);
    }

    public static void a(bgv.a $$0, zd $$1, zb $$2) throws SignatureException {
        $$0.update(Ints.toByteArray((int)1));
        $$1.a($$0);
        $$2.a($$0);
    }

    public boolean a(bgw $$02) {
        return this.e != null && this.e.a($$02, $$0 -> yy.a($$0, this.d, this.f));
    }

    public String c() {
        return this.f.a();
    }

    public yh d() {
        return Objects.requireNonNullElseGet(this.g, () -> yh.b(this.c()));
    }

    public Instant e() {
        return this.f.b();
    }

    public long f() {
        return this.f.c();
    }

    public boolean a(Instant $$0) {
        return $$0.isAfter(this.e().plus(b));
    }

    public boolean b(Instant $$0) {
        return $$0.isAfter(this.e().plus(c));
    }

    public UUID g() {
        return this.d.c();
    }

    public boolean h() {
        return this.g().equals(i);
    }

    public boolean i() {
        return this.e != null;
    }

    public boolean a(UUID $$0) {
        return this.i() && this.d.c().equals($$0);
    }

    public boolean j() {
        return this.h.b();
    }

    public static String a(yy $$02) {
        return "'" + $$02.f.a() + "' @ " + String.valueOf($$02.f.b()) + "\n - From: " + String.valueOf($$02.d.c()) + "/" + String.valueOf($$02.d.d()) + ", message #" + $$02.d.b() + "\n - Salt: " + $$02.f.c() + "\n - Signature: " + yu.a($$02.e) + "\n - Last Seen: [\n" + $$02.f.d().b().stream().map($$0 -> "     " + yu.a($$0) + "\n").collect(Collectors.joining()) + " ]\n";
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{yy.class, "link;signature;signedBody;unsignedContent;filterMask", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{yy.class, "link;signature;signedBody;unsignedContent;filterMask", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{yy.class, "link;signature;signedBody;unsignedContent;filterMask", "d", "e", "f", "g", "h"}, this, $$0);
    }

    public zd k() {
        return this.d;
    }

    public @Nullable yu l() {
        return this.e;
    }

    public zb m() {
        return this.f;
    }

    public @Nullable yh n() {
        return this.g;
    }

    public yl o() {
        return this.h;
    }
}

