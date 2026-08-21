/*
 * Decompiled with CFR 0.152.
 */
public class dfl {
    public static final dfl a = dfl.a("core");
    public static final dfl b = dfl.a("idle");
    public static final dfl c = dfl.a("work");
    public static final dfl d = dfl.a("play");
    public static final dfl e = dfl.a("rest");
    public static final dfl f = dfl.a("meet");
    public static final dfl g = dfl.a("panic");
    public static final dfl h = dfl.a("raid");
    public static final dfl i = dfl.a("pre_raid");
    public static final dfl j = dfl.a("hide");
    public static final dfl k = dfl.a("fight");
    public static final dfl l = dfl.a("celebrate");
    public static final dfl m = dfl.a("admire_item");
    public static final dfl n = dfl.a("avoid");
    public static final dfl o = dfl.a("ride");
    public static final dfl p = dfl.a("play_dead");
    public static final dfl q = dfl.a("long_jump");
    public static final dfl r = dfl.a("ram");
    public static final dfl s = dfl.a("tongue");
    public static final dfl t = dfl.a("swim");
    public static final dfl u = dfl.a("lay_spawn");
    public static final dfl v = dfl.a("sniff");
    public static final dfl w = dfl.a("investigate");
    public static final dfl x = dfl.a("roar");
    public static final dfl y = dfl.a("emerge");
    public static final dfl z = dfl.a("dig");
    private final String A;
    private final int B;

    private dfl(String $$0) {
        this.A = $$0;
        this.B = $$0.hashCode();
    }

    public String a() {
        return this.A;
    }

    private static dfl a(String $$0) {
        return jq.a(mi.C, $$0, new dfl($$0));
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        dfl $$1 = (dfl)$$0;
        return this.A.equals($$1.A);
    }

    public int hashCode() {
        return this.B;
    }

    public String toString() {
        return this.a();
    }
}

