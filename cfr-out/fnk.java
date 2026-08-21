/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.OptionalDynamic
 */
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;

public class fnk {
    private final int a;
    private final long b;
    private final String c;
    private final fna d;
    private final boolean e;

    private fnk(int $$0, long $$1, String $$2, int $$3, String $$4, boolean $$5) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = new fna($$3, $$4);
        this.e = $$5;
    }

    public static fnk a(Dynamic<?> $$0) {
        int $$1 = $$0.get("version").asInt(0);
        long $$2 = $$0.get("LastPlayed").asLong(0L);
        OptionalDynamic $$3 = $$0.get("Version");
        if ($$3.result().isPresent()) {
            return new fnk($$1, $$2, $$3.get("Name").asString(w.b().c()), $$3.get("Id").asInt(w.b().a().b()), $$3.get("Series").asString("main"), $$3.get("Snapshot").asBoolean(!w.b().f()));
        }
        return new fnk($$1, $$2, "", 0, "main", false);
    }

    public int a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public fna d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }
}

