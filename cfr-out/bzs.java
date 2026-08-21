/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.server.MinecraftServer;

public final class bzs
extends Enum<bzs> {
    public static final /* enum */ bzs a = new bzs("client");
    public static final /* enum */ bzs b = new bzs("server");
    private final String c;
    private static final /* synthetic */ bzs[] d;

    public static bzs[] values() {
        return (bzs[])d.clone();
    }

    public static bzs valueOf(String $$0) {
        return Enum.valueOf(bzs.class, $$0);
    }

    private bzs(String $$0) {
        this.c = $$0;
    }

    public static bzs a(MinecraftServer $$0) {
        return $$0.n() ? b : a;
    }

    public String a() {
        return this.c;
    }

    private static /* synthetic */ bzs[] b() {
        return new bzs[]{a, b};
    }

    static {
        d = bzs.b();
    }
}

