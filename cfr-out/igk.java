/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class igk {
    public void a(hpn $$0, hon.a $$1, gio $$2) {
        a $$3 = $$0.c();
        $$3.a.sort(Comparator.comparing(hpp.j::h).reversed());
        for (hpp.j $$4 : $$3.a) {
            $$2.a($$4.d(), $$4.b(), $$4.c(), $$4.f(), false, $$4.a(), (hon)$$1, gio.a.b, $$4.g(), $$4.e());
        }
        for (hpp.j $$5 : $$3.b) {
            $$2.a($$5.d(), $$5.b(), $$5.c(), $$5.f(), false, $$5.a(), (hon)$$1, gio.a.a, $$5.g(), $$5.e());
        }
    }

    public static class a {
        final List<hpp.j> a = new ArrayList<hpp.j>();
        final List<hpp.j> b = new ArrayList<hpp.j>();

        public void a(fzm $$0, @Nullable ftm $$1, int $$2, yh $$3, boolean $$4, int $$5, double $$6, ikp $$7) {
            if ($$1 == null) {
                return;
            }
            gfj $$8 = gfj.V();
            $$0.a();
            $$0.a($$1.g, $$1.h + 0.5, $$1.i);
            $$0.a((Quaternionfc)$$7.e);
            $$0.b(0.025f, -0.025f, 0.025f);
            Matrix4f $$9 = new Matrix4f((Matrix4fc)$$0.c().a());
            float $$10 = (float)(-$$8.g.a($$3)) / 2.0f;
            int $$11 = (int)($$8.k.a(0.25f) * 255.0f) << 24;
            if ($$4) {
                this.b.add(new hpp.j($$9, $$10, $$2, $$3, hoj.b($$5, 2), -1, 0, $$6));
                this.a.add(new hpp.j($$9, $$10, $$2, $$3, $$5, -2130706433, $$11, $$6));
            } else {
                this.b.add(new hpp.j($$9, $$10, $$2, $$3, $$5, -2130706433, $$11, $$6));
            }
            $$0.b();
        }

        public void a() {
            this.b.clear();
            this.a.clear();
        }
    }
}

