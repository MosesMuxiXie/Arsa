/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class yd
extends Record {
    private final ye l;
    private final ye m;
    public static final Codec<yd> a = RecordCodecBuilder.create($$0 -> $$0.group((App)ye.a.fieldOf("chat").forGetter(yd::a), (App)ye.a.fieldOf("narration").forGetter(yd::b)).apply((Applicative)$$0, yd::new));
    public static final aao<xq, yd> b = aao.a(ye.b, yd::a, ye.b, yd::b, yd::new);
    public static final aao<xq, jd<yd>> c = aam.a(mj.aU, b);
    public static final ye d = ye.a("chat.type.text");
    public static final amt<yd> e = yd.a("chat");
    public static final amt<yd> f = yd.a("say_command");
    public static final amt<yd> g = yd.a("msg_command_incoming");
    public static final amt<yd> h = yd.a("msg_command_outgoing");
    public static final amt<yd> i = yd.a("team_msg_command_incoming");
    public static final amt<yd> j = yd.a("team_msg_command_outgoing");
    public static final amt<yd> k = yd.a("emote_command");

    public yd(ye $$0, ye $$1) {
        this.l = $$0;
        this.m = $$1;
    }

    private static amt<yd> a(String $$0) {
        return amt.a(mj.aU, amo.b($$0));
    }

    public static void a(qr<yd> $$0) {
        $$0.a(e, new yd(d, ye.a("chat.type.text.narrate")));
        $$0.a(f, new yd(ye.a("chat.type.announcement"), ye.a("chat.type.text.narrate")));
        $$0.a(g, new yd(ye.b("commands.message.display.incoming"), ye.a("chat.type.text.narrate")));
        $$0.a(h, new yd(ye.c("commands.message.display.outgoing"), ye.a("chat.type.text.narrate")));
        $$0.a(i, new yd(ye.d("chat.type.team.text"), ye.a("chat.type.text.narrate")));
        $$0.a(j, new yd(ye.d("chat.type.team.sent"), ye.a("chat.type.text.narrate")));
        $$0.a(k, new yd(ye.a("chat.type.emote"), ye.a("chat.type.emote")));
    }

    public static a a(amt<yd> $$0, cgk $$1) {
        return yd.a($$0, $$1.ao().J_(), $$1.R_());
    }

    public static a a(amt<yd> $$0, ed $$1) {
        return yd.a($$0, $$1.v(), $$1.b());
    }

    public static a a(amt<yd> $$0, jr $$1, yh $$2) {
        jq<yd> $$3 = $$1.f(mj.aU);
        return new a($$3.b($$0), $$2);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{yd.class, "chat;narration", "l", "m"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{yd.class, "chat;narration", "l", "m"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{yd.class, "chat;narration", "l", "m"}, this, $$0);
    }

    public ye a() {
        return this.l;
    }

    public ye b() {
        return this.m;
    }

    public static final class a
    extends Record {
        private final jd<yd> b;
        private final yh c;
        private final Optional<yh> d;
        public static final aao<xq, a> a = aao.a(c, a::a, yj.d, a::b, yj.e, a::c, a::new);

        a(jd<yd> $$0, yh $$1) {
            this($$0, $$1, Optional.empty());
        }

        public a(jd<yd> $$0, yh $$1, Optional<yh> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public yh a(yh $$0) {
            return this.b.a().a().a($$0, this);
        }

        public yh b(yh $$0) {
            return this.b.a().b().a($$0, this);
        }

        public a c(yh $$0) {
            return new a(this.b, this.c, Optional.of($$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "chatType;name;targetName", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "chatType;name;targetName", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "chatType;name;targetName", "b", "c", "d"}, this, $$0);
        }

        public jd<yd> a() {
            return this.b;
        }

        public yh b() {
            return this.c;
        }

        public Optional<yh> c() {
            return this.d;
        }
    }
}

