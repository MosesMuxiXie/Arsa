/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector2i
 */
import org.joml.Vector2i;

public class gim
implements gis {
    private final gfj a;
    private final gft b;

    public gim(gfj $$0) {
        this.a = $$0;
        this.b = new gft();
    }

    @Override
    public boolean a(dji $$0) {
        return $$0.g().a(bdy.cl);
    }

    @Override
    public boolean a(double $$0, double $$1, int $$2, dlt $$3) {
        int $$8;
        int $$7;
        int $$6;
        int $$4 = dki.j($$3);
        if ($$4 == 0) {
            return false;
        }
        Vector2i $$5 = this.b.a($$0, $$1);
        int n2 = $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
        if ($$6 != 0 && ($$7 = dki.h($$3)) != ($$8 = gft.a($$6, $$7, $$4))) {
            this.a($$3, $$2, $$8);
        }
        return true;
    }

    @Override
    public void b(dji $$0) {
        this.a($$0.g(), $$0.d);
    }

    @Override
    public void a(dji $$0, dhu $$1) {
        if ($$1 == dhu.b || $$1 == dhu.c) {
            this.a($$0.g(), $$0.d);
        }
    }

    private void a(dlt $$0, int $$1, int $$2) {
        if (this.a.R() != null && $$2 < dki.j($$0)) {
            hig $$3 = this.a.R();
            dki.a($$0, $$2);
            $$3.b(new ajq($$1, $$2));
        }
    }

    public void a(dlt $$0, int $$1) {
        this.a($$0, $$1, -1);
    }
}

