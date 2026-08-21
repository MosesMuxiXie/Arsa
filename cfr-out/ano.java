/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.yggdrasil.ServicesKeySet
 *  com.mojang.authlib.yggdrasil.ServicesKeyType
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.ServicesKeySet;
import com.mojang.authlib.yggdrasil.ServicesKeyType;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public record ano(MinecraftSessionService a, ServicesKeySet b, GameProfileRepository c, bci d, bca e) {
    private final MinecraftSessionService a;
    private final ServicesKeySet b;
    private final GameProfileRepository c;
    private final bci d;
    private final bca e;
    private static final String f = "usercache.json";

    public static ano a(YggdrasilAuthenticationService $$0, File $$1) {
        MinecraftSessionService $$2 = $$0.createMinecraftSessionService();
        GameProfileRepository $$3 = $$0.createProfileRepository();
        bbu $$4 = new bbu($$3, new File($$1, f));
        bca.a $$5 = new bca.a($$2, $$4);
        return new ano($$2, $$0.getServicesKeySet(), $$3, $$4, $$5);
    }

    public @Nullable bgw a() {
        return bgw.a(this.b, ServicesKeyType.PROFILE_KEY);
    }

    public boolean b() {
        return !this.b.keys(ServicesKeyType.PROFILE_KEY).isEmpty();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ano.class, "sessionService;servicesKeySet;profileRepository;nameToIdCache;profileResolver", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ano.class, "sessionService;servicesKeySet;profileRepository;nameToIdCache;profileResolver", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ano.class, "sessionService;servicesKeySet;profileRepository;nameToIdCache;profileResolver", "a", "b", "c", "d", "e"}, this, $$0);
    }

    public MinecraftSessionService c() {
        return this.a;
    }

    public ServicesKeySet d() {
        return this.b;
    }

    public GameProfileRepository e() {
        return this.c;
    }

    public bci f() {
        return this.d;
    }

    public bca g() {
        return this.e;
    }
}

