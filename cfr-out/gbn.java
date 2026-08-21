/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  org.jspecify.annotations.Nullable
 */
import com.google.gson.annotations.SerializedName;
import org.jspecify.annotations.Nullable;

public class gbn
extends gbx
implements gbp {
    @SerializedName(value="spawnProtection")
    public int a = 0;
    @SerializedName(value="forceGameMode")
    public boolean b = false;
    @SerializedName(value="difficulty")
    public int c = 2;
    @SerializedName(value="gameMode")
    public int d = 0;
    @SerializedName(value="slotName")
    private String j = "";
    @SerializedName(value="version")
    public String e = "";
    @SerializedName(value="compatibility")
    public gbg.a f = gbg.a.a;
    @SerializedName(value="worldTemplateId")
    public long g = -1L;
    @SerializedName(value="worldTemplateImage")
    public @Nullable String h = null;
    @gar
    public boolean i;

    private gbn() {
    }

    public gbn(int $$0, int $$1, int $$2, boolean $$3, String $$4, String $$5, gbg.a $$6) {
        this.a = $$0;
        this.c = $$1;
        this.d = $$2;
        this.b = $$3;
        this.j = $$4;
        this.e = $$5;
        this.f = $$6;
    }

    public static gbn a() {
        return new gbn();
    }

    public static gbn a(dwl $$0, ccz $$1, boolean $$2, String $$3, String $$4) {
        gbn $$5 = gbn.a();
        $$5.c = $$1.a();
        $$5.d = $$0.a();
        $$5.j = $$4;
        $$5.e = $$3;
        return $$5;
    }

    public static gbn a(dws $$0, String $$1) {
        return gbn.a($$0.b(), $$0.d(), $$0.c(), $$1, $$0.a());
    }

    public static gbn b() {
        gbn $$0 = gbn.a();
        $$0.a(true);
        return $$0;
    }

    public void a(boolean $$0) {
        this.i = $$0;
    }

    public static gbn a(gas $$0, String $$1) {
        gbn $$2 = $$0.a($$1, gbn.class);
        if ($$2 == null) {
            return gbn.a();
        }
        gbn.a($$2);
        return $$2;
    }

    private static void a(gbn $$0) {
        if ($$0.j == null) {
            $$0.j = "";
        }
        if ($$0.e == null) {
            $$0.e = "";
        }
        if ($$0.f == null) {
            $$0.f = gbg.a.a;
        }
    }

    public String a(int $$0) {
        if (bhi.h(this.j)) {
            if (this.i) {
                return imu.a("mco.configure.world.slot.empty", new Object[0]);
            }
            return this.b($$0);
        }
        return this.j;
    }

    public String b(int $$0) {
        return imu.a("mco.configure.world.slot", $$0);
    }

    public gbn c() {
        return new gbn(this.a, this.c, this.d, this.b, this.j, this.e, this.f);
    }
}

