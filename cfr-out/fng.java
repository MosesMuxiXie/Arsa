/*
 * Decompiled with CFR 0.152.
 */
public class fng {
    public static final fng a = new fng("advancements");
    public static final fng b = new fng("stats");
    public static final fng c = new fng("playerdata");
    public static final fng d = new fng("players");
    public static final fng e = new fng("level.dat");
    public static final fng f = new fng("level.dat_old");
    public static final fng g = new fng("icon.png");
    public static final fng h = new fng("session.lock");
    public static final fng i = new fng("generated");
    public static final fng j = new fng("datapacks");
    public static final fng k = new fng("resources.zip");
    public static final fng l = new fng(".");
    private final String m;

    private fng(String $$0) {
        this.m = $$0;
    }

    public String a() {
        return this.m;
    }

    public String toString() {
        return "/" + this.m;
    }
}

