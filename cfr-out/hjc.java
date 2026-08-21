/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface hjc
extends hjb {
    public static a a(GameProfile $$0, yy $$1, hja $$2) {
        return new a($$0, $$1, $$2);
    }

    public static b a(yh $$0, Instant $$1) {
        return new b($$0, $$1);
    }

    public yh b();

    default public yh c() {
        return this.b();
    }

    public boolean a(UUID var1);

    public record a(GameProfile c, yy d, hja e) implements hjc
    {
        private final GameProfile c;
        private final yy d;
        private final hja e;
        public static final MapCodec<a> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.K.fieldOf("profile").forGetter(a::f), (App)yy.a.forGetter(a::g), (App)hja.d.optionalFieldOf("trust_level", (Object)hja.a).forGetter(a::h)).apply((Applicative)$$0, a::new));
        private static final DateTimeFormatter f = bhs.a(FormatStyle.SHORT);

        @Override
        public yh b() {
            if (!this.d.o().a()) {
                yh $$0 = this.d.o().b(this.d.c());
                return $$0 != null ? $$0 : yh.i();
            }
            return this.d.d();
        }

        @Override
        public yh c() {
            yh $$0 = this.b();
            yh $$1 = this.i();
            return yh.a("gui.chatSelection.message.narrate", new Object[]{this.c.name(), $$0, $$1});
        }

        public yh d() {
            yh $$0 = this.i();
            return yh.a("gui.chatSelection.heading", new Object[]{this.c.name(), $$0});
        }

        private yh i() {
            ZonedDateTime $$0 = ZonedDateTime.ofInstant(this.d.e(), ZoneId.systemDefault());
            return yh.b($$0.format(f)).a(l.u, l.h);
        }

        @Override
        public boolean a(UUID $$0) {
            return this.d.a($$0);
        }

        public UUID e() {
            return this.c.id();
        }

        @Override
        public hjb.a a() {
            return hjb.a.a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "profile;message;trustLevel", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "profile;message;trustLevel", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "profile;message;trustLevel", "c", "d", "e"}, this, $$0);
        }

        public GameProfile f() {
            return this.c;
        }

        public yy g() {
            return this.d;
        }

        public hja h() {
            return this.e;
        }
    }

    public static final class b
    extends Record
    implements hjc {
        private final yh c;
        private final Instant d;
        public static final MapCodec<b> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)yj.a.fieldOf("message").forGetter(b::d), (App)bfm.x.fieldOf("time_stamp").forGetter(b::e)).apply((Applicative)$$0, b::new));

        public b(yh $$0, Instant $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        @Override
        public yh b() {
            return this.c;
        }

        @Override
        public boolean a(UUID $$0) {
            return false;
        }

        @Override
        public hjb.a a() {
            return hjb.a.b;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "message;timeStamp", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "message;timeStamp", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "message;timeStamp", "c", "d"}, this, $$0);
        }

        public yh d() {
            return this.c;
        }

        public Instant e() {
            return this.d;
        }
    }
}

