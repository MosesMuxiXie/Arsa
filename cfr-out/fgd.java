/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record fgd(List<ffs> a) {
    private final List<ffs> a;
    private static final Logger b = LogUtils.getLogger();
    private static final amo c = amo.b("jigsaw");
    private static final Map<amo, amo> d = ImmutableMap.builder().put((Object)amo.b("nvi"), (Object)c).put((Object)amo.b("pcp"), (Object)c).put((Object)amo.b("bastionremnant"), (Object)c).put((Object)amo.b("runtime"), (Object)c).build();

    public fgd(List<ffs> $$0) {
        this.a = List.copyOf($$0);
    }

    public boolean a() {
        return this.a.isEmpty();
    }

    public boolean a(is $$0) {
        for (ffs $$1 : this.a) {
            if (!$$1.f().b($$0)) continue;
            return true;
        }
        return false;
    }

    public vz a(fge $$0) {
        vf $$1 = new vf();
        for (ffs $$2 : this.a) {
            $$1.add($$2.a($$0));
        }
        return $$1;
    }

    public static fgd a(vf $$0, fge $$1) {
        ArrayList $$2 = Lists.newArrayList();
        for (int $$3 = 0; $$3 < $$0.size(); ++$$3) {
            uz $$4 = $$0.b($$3);
            String $$5 = $$4.b("id", "").toLowerCase(Locale.ROOT);
            amo $$6 = amo.a($$5);
            amo $$7 = d.getOrDefault($$6, $$6);
            fgf $$8 = mi.Q.a($$7);
            if ($$8 == null) {
                b.error("Unknown structure piece id: {}", (Object)$$7);
                continue;
            }
            try {
                ffs $$9 = $$8.load($$1, $$4);
                $$2.add($$9);
                continue;
            }
            catch (Exception $$10) {
                b.error("Exception loading structure piece with id {}", (Object)$$7, (Object)$$10);
            }
        }
        return new fgd($$2);
    }

    public ffg b() {
        return ffs.a(this.a.stream());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fgd.class, "pieces", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fgd.class, "pieces", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fgd.class, "pieces", "a"}, this, $$0);
    }

    public List<ffs> c() {
        return this.a;
    }
}

