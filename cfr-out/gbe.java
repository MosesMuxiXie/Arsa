/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gbe {
    static final Logger a = LogUtils.getLogger();
    private static final String b = "notificationUuid";
    private static final String c = "dismissable";
    private static final String d = "seen";
    private static final String e = "type";
    private static final String f = "visitUrl";
    private static final String g = "infoPopup";
    static final yh h = yh.c("mco.notification.visitUrl.buttonText.default");
    final UUID i;
    final boolean j;
    final boolean k;
    final String l;

    gbe(UUID $$0, boolean $$1, boolean $$2, String $$3) {
        this.i = $$0;
        this.j = $$1;
        this.k = $$2;
        this.l = $$3;
    }

    public boolean a() {
        return this.k;
    }

    public boolean b() {
        return this.j;
    }

    public UUID c() {
        return this.i;
    }

    public static List<gbe> a(String $$0) {
        ArrayList<gbe> $$1 = new ArrayList<gbe>();
        try {
            JsonArray $$2 = bge.a($$0).getAsJsonObject().get("notifications").getAsJsonArray();
            for (JsonElement $$3 : $$2) {
                $$1.add(gbe.a($$3.getAsJsonObject()));
            }
        }
        catch (Exception $$4) {
            a.error("Could not parse list of RealmsNotifications", (Throwable)$$4);
        }
        return $$1;
    }

    private static gbe a(JsonObject $$0) {
        UUID $$1 = gdw.a(b, $$0, null);
        if ($$1 == null) {
            throw new IllegalStateException("Missing required property notificationUuid");
        }
        boolean $$2 = gdw.a(c, $$0, true);
        boolean $$3 = gdw.a(d, $$0, false);
        String $$4 = gdw.a(e, $$0);
        gbe $$5 = new gbe($$1, $$2, $$3, $$4);
        return switch ($$4) {
            case f -> gbe$c.a($$5, $$0);
            case g -> gbe$a.a($$5, $$0);
            default -> $$5;
        };
    }

    public static class c
    extends gbe {
        private static final String a = "url";
        private static final String b = "buttonText";
        private static final String c = "message";
        private final String d;
        private final gbm e;
        private final gbm f;

        private c(gbe $$0, String $$1, gbm $$2, gbm $$3) {
            super($$0.i, $$0.j, $$0.k, $$0.l);
            this.d = $$1;
            this.e = $$2;
            this.f = $$3;
        }

        public static c a(gbe $$0, JsonObject $$1) {
            String $$2 = gdw.a(a, $$1);
            gbm $$3 = gdw.a(b, $$1, gbm::a);
            gbm $$4 = gdw.a(c, $$1, gbm::a);
            return new c($$0, $$2, $$3, $$4);
        }

        public yh d() {
            return this.f.a(yh.c("mco.notification.visitUrl.message.default"));
        }

        public gje a(gsb $$0) {
            yh $$1 = this.e.a(h);
            return gje.a($$1, gqz.b($$0, this.d)).a();
        }
    }

    public static class a
    extends gbe {
        private static final String a = "title";
        private static final String b = "message";
        private static final String c = "image";
        private static final String d = "urlButton";
        private final gbm e;
        private final gbm f;
        private final amo g;
        private final @Nullable b h;

        private a(gbe $$0, gbm $$1, gbm $$2, amo $$3, @Nullable b $$4) {
            super($$0.i, $$0.j, $$0.k, $$0.l);
            this.e = $$1;
            this.f = $$2;
            this.g = $$3;
            this.h = $$4;
        }

        public static a a(gbe $$0, JsonObject $$1) {
            gbm $$2 = gdw.a(a, $$1, gbm::a);
            gbm $$3 = gdw.a(b, $$1, gbm::a);
            amo $$4 = amo.a(gdw.a(c, $$1));
            b $$5 = gdw.b(d, $$1, b::a);
            return new a($$0, $$2, $$3, $$4, $$5);
        }

        public @Nullable gkh a(gsb $$0, Consumer<UUID> $$12) {
            yh $$22 = this.e.a();
            if ($$22 == null) {
                a.warn("Realms info popup had title with no available translation: {}", (Object)this.e);
                return null;
            }
            gkh.a $$3 = new gkh.a($$0, $$22).a(this.g).a(this.f.a(yg.a));
            if (this.h != null) {
                $$3.a(this.h.b.a(h), (gkh $$2) -> {
                    gfj $$32 = gfj.V();
                    $$32.a(new gqz($$3 -> {
                        if ($$3) {
                            bhs.n().a(this.h.a);
                            $$32.a($$0);
                        } else {
                            $$32.a((gsb)$$2);
                        }
                    }, this.h.a, true));
                    $$12.accept(this.c());
                });
            }
            $$3.a(yg.h, (gkh $$1) -> {
                $$1.aX_();
                $$12.accept(this.c());
            });
            $$3.a(() -> $$12.accept(this.c()));
            return $$3.a();
        }
    }

    static final class b
    extends Record {
        final String a;
        final gbm b;
        private static final String c = "url";
        private static final String d = "urlText";

        private b(String $$0, gbm $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public static b a(JsonObject $$0) {
            String $$1 = gdw.a(c, $$0);
            gbm $$2 = gdw.a(d, $$0, gbm::a);
            return new b($$1, $$2);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "url;urlText", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "url;urlText", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "url;urlText", "a", "b"}, this, $$0);
        }

        public String a() {
            return this.a;
        }

        public gbm b() {
            return this.b;
        }
    }
}

