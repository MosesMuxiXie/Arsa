/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public final class hja
extends Enum<hja>
implements bhh {
    public static final /* enum */ hja a = new hja("secure");
    public static final /* enum */ hja b = new hja("modified");
    public static final /* enum */ hja c = new hja("not_secure");
    public static final Codec<hja> d;
    private final String e;
    private static final /* synthetic */ hja[] f;

    public static hja[] values() {
        return (hja[])f.clone();
    }

    public static hja valueOf(String $$0) {
        return Enum.valueOf(hja.class, $$0);
    }

    private hja(String $$0) {
        this.e = $$0;
    }

    public static hja a(yy $$0, yh $$1, Instant $$2) {
        if (!$$0.i() || $$0.b($$2)) {
            return c;
        }
        if (hja.a($$0, $$1)) {
            return b;
        }
        return a;
    }

    private static boolean a(yy $$0, yh $$1) {
        if (!$$1.getString().contains($$0.c())) {
            return true;
        }
        yh $$2 = $$0.n();
        if ($$2 == null) {
            return false;
        }
        return hja.a($$2);
    }

    private static boolean a(yh $$02) {
        return $$02.a(($$0, $$1) -> {
            if (hja.a($$0)) {
                return Optional.of(true);
            }
            return Optional.empty();
        }, zf.a).orElse(false);
    }

    private static boolean a(zf $$0) {
        return !$$0.l().equals(ym.b);
    }

    public boolean a() {
        return this == c;
    }

    public @Nullable gfd a(yy $$0) {
        return switch (this.ordinal()) {
            case 1 -> gfd.a($$0.c());
            case 2 -> gfd.c();
            default -> null;
        };
    }

    @Override
    public String c() {
        return this.e;
    }

    private static /* synthetic */ hja[] b() {
        return new hja[]{a, b, c};
    }

    static {
        f = hja.b();
        d = bhh.a(hja::values);
    }
}

