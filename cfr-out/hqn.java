/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3fc
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import org.joml.Vector3fc;

public final class hqn
extends Record
implements ioh {
    private final List<hqb> b;

    public hqn(List<hqb> $$0) {
        this.b = $$0;
    }

    @Override
    public iod bake(hqp $$0, inw $$1, ioc $$2, iny $$3) {
        return hqn.a(this.b, $$0, $$1, $$2, $$3);
    }

    public static iod a(List<hqb> $$0, hqp $$1, inw $$2, ioc $$3, iny $$4) {
        iod.a $$5 = new iod.a();
        for (hqb $$6 : $$0) {
            boolean $$7 = true;
            boolean $$8 = true;
            boolean $$9 = true;
            Vector3fc $$10 = $$6.a();
            Vector3fc $$11 = $$6.b();
            if ($$10.x() == $$11.x()) {
                $$8 = false;
                $$9 = false;
            }
            if ($$10.y() == $$11.y()) {
                $$7 = false;
                $$9 = false;
            }
            if ($$10.z() == $$11.z()) {
                $$7 = false;
                $$8 = false;
            }
            if (!$$7 && !$$8 && !$$9) continue;
            for (Map.Entry<iz, hqc> $$12 : $$6.c().entrySet()) {
                boolean $$15;
                iz $$13 = $$12.getKey();
                hqc $$14 = $$12.getValue();
                if (!($$15 = (switch ($$13.o()) {
                    default -> throw new MatchException(null, null);
                    case iz.a.a -> $$7;
                    case iz.a.b -> $$8;
                    case iz.a.c -> $$9;
                }))) continue;
                ilp $$16 = $$2.b().a($$1, $$14.c(), $$4);
                hqa $$17 = hqi.a($$2.c(), $$10, $$11, $$14, $$16, $$13, $$3, $$6.d(), $$6.e(), $$6.f());
                if ($$14.a() == null) {
                    $$5.a($$17);
                    continue;
                }
                $$5.a(iz.a($$3.a().c(), $$14.a()), $$17);
            }
        }
        return $$5.a();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hqn.class, "elements", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hqn.class, "elements", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hqn.class, "elements", "b"}, this, $$0);
    }

    public List<hqb> a() {
        return this.b;
    }
}

