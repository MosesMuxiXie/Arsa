/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class imh {
    private static final ddq[] a = new ddq[]{imh.a("entity/player/slim/alex", ddp.a), imh.a("entity/player/slim/ari", ddp.a), imh.a("entity/player/slim/efe", ddp.a), imh.a("entity/player/slim/kai", ddp.a), imh.a("entity/player/slim/makena", ddp.a), imh.a("entity/player/slim/noor", ddp.a), imh.a("entity/player/slim/steve", ddp.a), imh.a("entity/player/slim/sunny", ddp.a), imh.a("entity/player/slim/zuri", ddp.a), imh.a("entity/player/wide/alex", ddp.b), imh.a("entity/player/wide/ari", ddp.b), imh.a("entity/player/wide/efe", ddp.b), imh.a("entity/player/wide/kai", ddp.b), imh.a("entity/player/wide/makena", ddp.b), imh.a("entity/player/wide/noor", ddp.b), imh.a("entity/player/wide/steve", ddp.b), imh.a("entity/player/wide/sunny", ddp.b), imh.a("entity/player/wide/zuri", ddp.b)};

    public static amo a() {
        return imh.b().a().b();
    }

    public static ddq b() {
        return a[6];
    }

    public static ddq a(UUID $$0) {
        return a[Math.floorMod($$0.hashCode(), a.length)];
    }

    public static ddq a(GameProfile $$0) {
        return imh.a($$0.id());
    }

    private static ddq a(String $$0, ddp $$1) {
        return new ddq(new iu.b(amo.b($$0)), null, null, $$1, true);
    }
}

