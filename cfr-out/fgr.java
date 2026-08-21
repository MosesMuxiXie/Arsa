/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Map;

public class fgr {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final fgy.a e;

    public fgr(int $$0, int $$1, int $$2, int $$3, fgy.a $$4) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public fgy.a e() {
        return this.e;
    }

    public <T> Dynamic<T> a(DynamicOps<T> $$0) {
        ImmutableMap.Builder $$1 = ImmutableMap.builder();
        $$1.put($$0.createString("source_x"), $$0.createInt(this.a)).put($$0.createString("source_ground_y"), $$0.createInt(this.b)).put($$0.createString("source_z"), $$0.createInt(this.c)).put($$0.createString("delta_y"), $$0.createInt(this.d)).put($$0.createString("dest_proj"), $$0.createString(this.e.a()));
        return new Dynamic($$0, $$0.createMap((Map)$$1.build()));
    }

    public static <T> fgr a(Dynamic<T> $$0) {
        return new fgr($$0.get("source_x").asInt(0), $$0.get("source_ground_y").asInt(0), $$0.get("source_z").asInt(0), $$0.get("delta_y").asInt(0), fgy.a.a($$0.get("dest_proj").asString("")));
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        fgr $$1 = (fgr)$$0;
        if (this.a != $$1.a) {
            return false;
        }
        if (this.c != $$1.c) {
            return false;
        }
        if (this.d != $$1.d) {
            return false;
        }
        return this.e == $$1.e;
    }

    public int hashCode() {
        int $$0 = this.a;
        $$0 = 31 * $$0 + this.b;
        $$0 = 31 * $$0 + this.c;
        $$0 = 31 * $$0 + this.d;
        $$0 = 31 * $$0 + this.e.hashCode();
        return $$0;
    }

    public String toString() {
        return "JigsawJunction{sourceX=" + this.a + ", sourceGroundY=" + this.b + ", sourceZ=" + this.c + ", deltaY=" + this.d + ", destProjection=" + String.valueOf(this.e) + "}";
    }
}

