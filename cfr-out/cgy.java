/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public interface cgy {
    public void a(cgv var1, dlt var2);

    public dlt a(cgv var1);

    public void a(cgv var1, float var2);

    default public void a(cgx $$0, fod $$1) {
        this.a($$0.a(), $$1, $$0.b());
    }

    default public void a(amt<fof> $$0, fod $$1, Map<cgv, Float> $$2) {
        this.a($$0, $$1, 0L, $$2);
    }

    default public void a(amt<fof> $$0, fod $$1, long $$2, Map<cgv, Float> $$3) {
        fof $$4 = $$1.a().s().be().a($$0);
        if ($$4 == fof.f) {
            return;
        }
        ObjectArrayList<dlt> $$5 = $$4.a($$1, $$2);
        ArrayList<cgv> $$6 = new ArrayList<cgv>();
        for (dlt $$7 : $$5) {
            cgv $$8 = this.a($$7, $$6);
            if ($$8 == null) continue;
            dlt $$9 = $$8.a($$7);
            this.a($$8, $$9);
            Float $$10 = $$3.get($$8);
            if ($$10 != null) {
                this.a($$8, $$10.floatValue());
            }
            $$6.add($$8);
        }
    }

    default public @Nullable cgv a(dlt $$0, List<cgv> $$1) {
        if ($$0.f()) {
            return null;
        }
        dun $$2 = $$0.a(ki.H);
        if ($$2 != null) {
            cgv $$3 = $$2.b();
            if (!$$1.contains($$3)) {
                return $$3;
            }
        } else if (!$$1.contains(cgv.a)) {
            return cgv.a;
        }
        return null;
    }
}

